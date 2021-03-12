import java.io.*;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XQueryRewriter {
    public String rewrite(XQueryParser.XQClausesContext ctx){
        String rewritten_out="";

        // for clause
        ArrayList<HashSet<String>> classes=new ArrayList<>();
        ArrayList<String> variables=new ArrayList<>();
        for(int i=0;i<ctx.forClause().var().size();i++){
            String var=ctx.forClause().var(i).getText();
            String xq=ctx.forClause().xq(i).getText();
            String parent=xq.split("/")[0];

            boolean found=false;
            for(int j=0;j<classes.size();j++){
                HashSet<String> curClass=classes.get(j);
                if(curClass.contains(parent)){
                    curClass.add(var);
                    found=true;
                    break;
                }
            }
            if(!found){
                HashSet<String> newClass=new HashSet<>();
                newClass.add(var);
                classes.add(newClass);
                variables.add(var);
            }
        }

        // where clause
        String[] whereClauses =ctx.whereClause().cond().getText().split("and");
        String[][] equals=new String[whereClauses.length][2];
        for(int i=0;i< whereClauses.length;i++){
            equals[i][0]=whereClauses[i].split("eq|=")[0];
            equals[i][1]=whereClauses[i].split("eq|=")[1];
        }

        if(classes.size()==1) return "";

        int[][] relations=new int[equals.length][2];
        for(int i=0; i < equals.length; i++) {
            String eq1 = equals[i][0];
            String eq2 = equals[i][1];
            relations[i][0] = -1;
            relations[i][1] = -1;
            for(int j = 0; j < classes.size();j++) {
                if(classes.get(j).contains(eq1)) {
                    relations[i][0] = j;
                }
                if(classes.get(j).contains(eq2)) {
                    relations[i][1] = j;
                }
            }
        }

        rewritten_out+="for $tuple in";
        for(int i=1;i<classes.size();i++) rewritten_out+=" join (";

        // print for clauses
        for(int i = 0; i < classes.size(); i++) {
            HashSet<String> curClass = classes.get(i);
            String tuples = "";
            boolean first=true;
            for(int k = 0; k < ctx.forClause().var().size(); k++) {
                String var = ctx.forClause().var(k).getText();
                if(curClass.contains(var)){
                    if(first) {
                        String tmpFor = ctx.forClause().xq(k).getText();
                        String[] forReturn = tmpFor.split("return",2);
                        if(!tmpFor.contains("return"))
                            rewritten_out += "for " + var + " in ";
                        rewritten_out += tmpFor;
                        first=false;
                    }else {
                        rewritten_out += ",\n       " + var + " in " + ctx.forClause().xq(k).getText();
                    }
                    if(!tuples.equals("")) {
                        tuples += ",\n";
                    }
                    tuples += " <" + var.substring(1) + "> " + " {" + var + "} " + " </" + var.substring(1) + "> ";

                }
            }
            rewritten_out += "\n";

            boolean firstWhere=true;
            for(int j = 0;j < equals.length;j++) {
                if(relations[j][1] == -1 && curClass.contains(equals[j][0])) {
                    if(firstWhere){
                        firstWhere=false;
                        rewritten_out += "where ";
                    }else {
                        rewritten_out += " and  ";
                    }
                    rewritten_out+=equals[j][0] + " eq " + equals[j][1] +"\n";
                }
            }
            rewritten_out += "return <tuple>" + tuples + "</tuple>, \n";

            if(i != 0) {
                LinkedList<String> left = new LinkedList<>();
                LinkedList<String> right = new LinkedList<>();
                for (int ii = 0; ii < equals.length; ii++) {
                    if (relations[ii][0] == i && (relations[ii][1] >= 0 && relations[ii][1] < i)) {
                        left.add(equals[ii][1].substring(1));
                        right.add(equals[ii][0].substring(1));
                    } else if (relations[ii][1] == i && (relations[ii][0] >= 0 && relations[ii][0] < i)) {
                        left.add(equals[ii][0].substring(1));
                        right.add(equals[ii][1].substring(1));
                    }
                }

                if(!(left.isEmpty() && right.isEmpty())) {
                    rewritten_out += "                 [";
                    for (int l = 0; l < left.size(); l++) {
                        rewritten_out += left.get(l);
                        if (l != left.size() - 1) {
                            rewritten_out += ",";
                        }
                    }
                    rewritten_out += "], [";
                    for (int r = 0; r < right.size(); r++) {
                        rewritten_out += right.get(r);
                        if (r != right.size() - 1) {
                            rewritten_out += ",";
                        }
                    }
                    rewritten_out += "]  ";
                }

                rewritten_out += ")";
                if(i != classes.size() - 1) rewritten_out += ",\n";
            }
        }

        // return clause
        StringBuffer returnClause = new StringBuffer(ctx.returnClause().xq().getText());
        int varIndex=returnClause.indexOf("$");
        while(varIndex!=-1){
            int commaIndex=returnClause.indexOf(",",varIndex);
            if(commaIndex==-1) commaIndex=Integer.MAX_VALUE;

            int slashIndex=returnClause.indexOf("/",varIndex);
            if(slashIndex==-1) slashIndex=Integer.MAX_VALUE;

            int bracketIndex=returnClause.indexOf("}",varIndex);
            if(bracketIndex==-1) bracketIndex=Integer.MAX_VALUE;

            int minIndex=Math.min(commaIndex,slashIndex);
            minIndex=Math.min(bracketIndex,minIndex);
            returnClause.insert(minIndex,"/*");
            returnClause.insert(varIndex+1,"tuple/");
            varIndex=returnClause.indexOf("$",varIndex+1);
        }

        rewritten_out += "return\n" + returnClause.toString()+"\n";
        writeToFile("./rewrite.txt",rewritten_out);
        return rewritten_out;
    }

    private void writeToFile(String filePath, String content){
        try {
            File file=new File(filePath);
            FileOutputStream fos=new FileOutputStream(file);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            Writer w=new BufferedWriter(osw);
            w.write(content);
            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
