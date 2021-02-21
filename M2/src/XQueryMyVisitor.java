import java.io.DataOutput;
import java.io.File;
import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XQueryMyVisitor extends XQueryBaseVisitor<ArrayList<Node>>{
    private Document document = null;
    Document doc;
    private ArrayList<Node> nodes =new ArrayList<>();
    private HashMap<String,ArrayList<Node>> map =  new HashMap<>();
    private Stack<HashMap<String,ArrayList<Node>>> cStack = new Stack<>();
    
    private Node makeText(String textContent){
        return document.createTextNode(textContent);
    }
    private Node makeElem(String name, ArrayList<Node> nodeArrayList){
        Node n=doc.createElement(name);
        for(Node tmp:nodeArrayList){
            if(tmp!=null){
                Node t=doc.importNode(tmp,true);
                n.appendChild(t);
            }
        }
        return n;
    }

    @Override
    public ArrayList<Node> visitAbsolutePathChild(XQueryParser.AbsolutePathChildContext ctx) {
        visit(ctx.doc());
        return visit(ctx.relativePath());
    }

    @Override
    public ArrayList<Node> visitVar(XQueryParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public ArrayList<Node> visitXQAbsolutePath(XQueryParser.XQAbsolutePathContext ctx) {
        return visit(ctx.absolutePath());
    }

    @Override
    public ArrayList<Node> visitXQinParenthesis(XQueryParser.XQinParenthesisContext ctx) {  //lqh
        return visit(ctx.xq());
    }

    private void doClauses(int curVarIndex, XQueryParser.XQClausesContext ctx, ArrayList<Node> result){
        if(curVarIndex==ctx.forClause().var().size()){
            HashMap<String,ArrayList<Node>> vars_cp=new HashMap<>(variables);
            if(ctx.letClause()!=null) visit(ctx.letClause());
            if(ctx.whereClause()!=null){
                visit(ctx.whereClause());
                if(nodes.size()==0){
                    return;
                }
            }
            visit(ctx.returnClause());
            result.addAll(nodes);
            variables=vars_cp;
        }
        else{
            String varName=ctx.forClause().var(curVarIndex).getText();
            ArrayList<Node> tmpNodes = visit(ctx.forClause().xq(curVarIndex));
            for(Node n:tmpNodes){
                ArrayList<Node> tmp=new ArrayList<>();
                tmp.add(n);
                variables.put(varName,tmp);
                doClauses(curVarIndex+1,ctx,result);
            }
        }
    }
    @Override
    public ArrayList<Node> visitXQClauses(XQueryParser.XQClausesContext ctx) {  //lqh
        ArrayList<Node> result=new ArrayList<>();
        HashMap<String,ArrayList<Node>> vars_cp=new HashMap<>(variables);
        doClauses(0,ctx,result);
        variables=vars_cp;
        nodes=result;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitStringConstant(XQueryParser.StringConstantContext ctx) {    //lqh
        String text=ctx.STRINGCONSTANT().getText();
        ArrayList<Node> result=new ArrayList<>();
        result.add(makeText(text.substring(1,text.length()-1)));
        nodes=result;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQLet(XQueryParser.XQLetContext ctx) {  //lqh
        HashMap<String,ArrayList<Node>> vars_cp=new HashMap<>(variables);
        visit(ctx.letClause());
        visit(ctx.xq());
        variables=vars_cp;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQComma(XQueryParser.XQCommaContext ctx) {  //lqh
        ArrayList<Node> nodes_cp=new ArrayList<>();
        visit(ctx.xq(0));
        ArrayList<Node> result=new ArrayList<>(nodes);
        nodes=nodes_cp;
        visit(ctx.xq(1));
        result.addAll(nodes);
        nodes=result;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQValue(XQueryParser.XQValueContext ctx) {  // lqh
        String var=ctx.var().getText();
        nodes=new ArrayList<>();
        if(variables.containsKey(var)) nodes=variables.get(var);
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQNodeConstructor(XQueryParser.XQNodeConstructorContext ctx) {  //lqh
        if(doc==null){
            try {
                doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            }catch (ParserConfigurationException e){
                e.printStackTrace();
            }
        }
        ArrayList<Node> result=new ArrayList<>();
        visit(ctx.xq());
        String name=ctx.NAME(0).getText();
        result.add(makeElem(name,nodes));
        nodes=result;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQChild(XQueryParser.XQChildContext ctx) {  //lqh
        visit(ctx.xq());
        visit(ctx.relativePath());
        return nodes;
    }

    @Override
    public ArrayList<Node> visitXQDescendent(XQueryParser.XQDescendentContext ctx) {    //lqh
        visit(ctx.xq());
        LinkedList<Node> aux=new LinkedList<>(nodes);
        ArrayList<Node> result=new ArrayList<>(nodes);
        while (!aux.isEmpty()){
            Node tmp=aux.poll();
            for(int i=0;i<tmp.getChildNodes().getLength();i++){
                aux.add(tmp.getChildNodes().item(i));
                result.add(tmp.getChildNodes().item(i));
            }
        }
        nodes=result;
        return nodes;
    }

    private ArrayList<Node> ForClauseHelper(int x,XQueryParser.ForClauseContext ctx ){
        ArrayList<Node> ans = new ArrayList<>();
        ArrayList<Node> temp = visit(ctx.xq(x));
        if(ctx.xq().size()==1){
            for(Node N:temp){
                ArrayList<Node> val = new ArrayList<>();
                val.add(N);
                map.put(ctx.var(x).getText(),val);
                ans.add(N);
            }
        }
        else{
            for(Node N:temp) {
                HashMap<String, ArrayList<Node>> prev_ctx = new HashMap<>(map);
                cStack.push(prev_ctx);
                ArrayList<Node> val = new ArrayList<>();
                val.add(N);
                map.put(ctx.var(x).getText(), val);
                ans.addAll(ForClauseHelper(x + 1, ctx));
                map = cStack.pop();
            }
        }
        return ans;
    }
    @Override
    public ArrayList<Node> visitForClause(XQueryParser.ForClauseContext ctx) {
        ArrayList<Node> ans = new ArrayList<>();
        ans.addAll(ForClauseHelper(0,ctx));
        return ans;
    }

    @Override
    public ArrayList<Node> visitLetClause(XQueryParser.LetClauseContext ctx) {
        for(int i =0;i<ctx.var().size();i++){
            map.put(ctx.var(i).getText(),visit(ctx.xq(i)));
        }
        return null;
    }

    @Override
    public ArrayList<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Node> visitCondOr(XQueryParser.CondOrContext ctx) {
        ArrayList<Node> first = visit(ctx.cond(0));
        if(first.isEmpty()){
            ArrayList<Node> second = visit(ctx.cond(1));
            if(!second.isEmpty()) {
                return second;
            }
        }
        else{
            return first;
        }
        return new ArrayList<>();

    }

    @Override
    public ArrayList<Node> visitCondAnd(XQueryParser.CondAndContext ctx) {
        ArrayList<Node> first = new ArrayList<>(visit(ctx.cond(0)));
        ArrayList<Node> second = new ArrayList<>(visit(ctx.cond(1)));
        if(first.isEmpty()||second.isEmpty()){
            return new ArrayList<>();
        }
        return first;
    }

    @Override
    public ArrayList<Node> visitXQEqual(XQueryParser.XQEqualContext ctx) {
        ArrayList<Node> temp = nodes;
        ArrayList<Node> left = visit(ctx.xq(0));
        nodes = temp;
        ArrayList<Node> right = visit(ctx.xq(1));
        nodes = temp;
        ArrayList<Node> ans = new ArrayList<Node>();
        for(Node i:left){
            for(Node j:right){
                if(i.isEqualNode(j)){
                    ans.add(i);
                    return ans;
                }
            }
        }
        return ans;
    }

    @Override
    public ArrayList<Node> visitXQEmpty(XQueryParser.XQEmptyContext ctx) {
        ArrayList<Node> ctxNode = visit(ctx.xq());
        ArrayList<Node> ans = new ArrayList<>();
        if(ctxNode.isEmpty()){
            Node empty = document.createTextNode("T");
            ans.add(empty);
        }
        return ans;
    }

    @Override
    public ArrayList<Node> visitCondNot(XQueryParser.CondNotContext ctx) {
        ArrayList<Node> Not = new ArrayList<>(visit(ctx.cond()));
        ArrayList<Node> ans = new ArrayList<>();
        if(Not.isEmpty()){
            Node temp = document.createTextNode("T");
            ans.add(temp);
        }
        return ans;
    }

    @Override
    public ArrayList<Node> visitXQIs(XQueryParser.XQIsContext ctx) {
        ArrayList<Node> temp = nodes;
        ArrayList<Node> first = visit(ctx.xq(0));
        nodes=temp;
        ArrayList<Node> second = visit(ctx.xq(1));
        nodes = temp;
        ArrayList<Node> ans = new ArrayList<>();
        for(Node i:first){
            for(Node j:second){
                if(i.isSameNode(j)){
                    Node is = document.createTextNode("T");
                    ans.add(is);
                    return ans;
                }
            }
        }
        return ans;
    }

    @Override
    public ArrayList<Node> visitCondInParenthesis(XQueryParser.CondInParenthesisContext ctx) {
        return visit(ctx.cond());
    }
    private boolean XQSatisfyHelper(int x, XQueryParser.XQSatisfyContext ctx){
        int num = ctx.var().size();
        if(x ==num){
            if(visit(ctx.cond()).size()==1){
                return true;
            }
        }
        else{
            String key = ctx.var(x).getText();
            ArrayList<Node> vList = visit(ctx.xq(x));
            for(Node n:vList){
                HashMap<String,ArrayList<Node>> prev_ctx = new HashMap<>(map);
                cStack.push(prev_ctx);
                ArrayList<Node> val = new ArrayList<>();
                val.add(n);
                map.put(key,val);
                if(x+1<=num){
                    if (XQSatisfyHelper(x+1,ctx)) {
                        map = cStack.pop();
                        return true;
                    }
                    map = cStack.pop();

                }

            }
        }
        return false;
    }
    @Override
    public ArrayList<Node> visitXQSatisfy(XQueryParser.XQSatisfyContext ctx) {
        ArrayList<Node> ans = new ArrayList<>();
        if(XQSatisfyHelper(0,ctx)){
            Node node = document.createTextNode("T");
            ans.add(node);
        }
        return ans;
    }

    @Override
    public ArrayList<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
        return visit(ctx.xq());
    }

    @Override
    public ArrayList<Node> visitDoc(XQueryParser.DocContext ctx) {
        File xmlFile = new File(ctx.filename().getText());
        DocumentBuilderFactory docBuildFact = DocumentBuilderFactory.newInstance();
        docBuildFact.setIgnoringElementContentWhitespace(true);
        DocumentBuilder DOC = null;
        try {
            DOC = docBuildFact.newDocumentBuilder();
        } catch (ParserConfigurationException ParserError) {
            ParserError.printStackTrace();
        }

        try {
            if (DOC != null) {
                document = DOC.parse(xmlFile);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        if (document!= null) {
            document.getDocumentElement().normalize();
        }
        ArrayList<Node> docs = new ArrayList<>();
        docs.add(document);
        nodes= docs;
        return docs;

    }
    @Override
    public ArrayList<Node> visitFilename(XQueryParser.FilenameContext ctx) {
        return super.visitFilename(ctx);
    }
    private ArrayList<Node> getNodes(Node n){
        ArrayList<Node> all = new ArrayList<>();
        for(int i =0;i<n.getChildNodes().getLength();i++){
            all.addAll(getNodes(n.getChildNodes().item(i)));
        }
        all.add(n);
        return all;
    }
    private ArrayList<Node> getDescendants(ArrayList<Node> l){
        ArrayList<Node> d = new ArrayList<>();
        for(int i =0;i<l.size();i++){
            if(l.get(i).getChildNodes().getLength()!=0){
                for(int j = 0;j<l.get(i).getChildNodes().getLength();j++){
                    d.addAll(getNodes(l.get(i).getChildNodes().item(j)));
                }
            }
        }
        return d;
    }
    @Override
    public ArrayList<Node> visitDescendentAbsolutePath(XQueryParser.DescendentAbsolutePathContext ctx) {
        visit(ctx.doc());
        ArrayList<Node> desc = getDescendants(nodes);
        nodes.addAll(desc);
        return visit(ctx.relativePath());
    }

    private ArrayList<Node> getChildrenList(Node node) {
        ArrayList<Node> childrenList = new ArrayList<>();
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            childrenList.add(node.getChildNodes().item(i));
        }
        return childrenList;
    }
    @Override
    public ArrayList<Node> visitAll(XQueryParser.AllContext ctx) {
        ArrayList<Node> childList = new ArrayList<>();
        for(Node node : nodes){
            childList.addAll(getChildrenList(node));
        }
        nodes= childList;
        return childList;
    }

    @Override
    public ArrayList<Node> visitParentDirectory(XQueryParser.ParentDirectoryContext ctx) {
        ArrayList<Node> parents = new ArrayList<>();
        for(int i =0;i<nodes.size();i++){
            if(!parents.contains(nodes.get(i).getParentNode())){
                parents.add(nodes.get(i).getParentNode());
            }
        }
        nodes=parents;
        ArrayList<Node> ans = nodes;
        return ans;
    }

    @Override
    public ArrayList<Node> visitTextFunction(XQueryParser.TextFunctionContext ctx) {
        ArrayList<Node> cList = new ArrayList<>();
        for(Node child:nodes){
            cList.addAll(getChildrenList(child));
        }
        nodes = cList;
        return nodes;
    }

    @Override
    public ArrayList<Node> visitSequenceOfPaths(XQueryParser.SequenceOfPathsContext ctx) {
        ArrayList<Node> old = nodes;
        visit(ctx.relativePath(0));
        ArrayList<Node> left = nodes;
        nodes = old;
        visit(ctx.relativePath(1));
        ArrayList<Node> right = nodes;
        left.addAll(right);
        ArrayList<Node> ans = left;
        nodes= ans;
        return ans;
    }

    @Override
    public ArrayList<Node> visitSelf(XQueryParser.SelfContext ctx) {
        return nodes;
    }

    @Override
    public ArrayList<Node> visitPathWithFilter(XQueryParser.PathWithFilterContext ctx) {
        visit(ctx.relativePath());
        nodes=visit(ctx.pathFilter());
        return nodes;
    }

    @Override
    public ArrayList<Node> visitRelativePathChildren(XQueryParser.RelativePathChildrenContext ctx) {
        visit(ctx.relativePath(0));
        return visit(ctx.relativePath(1));
    }

    @Override
    public ArrayList<Node> visitTag(XQueryParser.TagContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitAttribute(XQueryParser.AttributeContext ctx) {
        ArrayList<Node> res=new ArrayList<>();
        String attrName=ctx.attName().getText();
        for(Node node: nodes){
            if(node.getNodeType()==Node.ELEMENT_NODE) {
                Element elm = (Element) node;
                String attr = elm.getAttribute(attrName);
                if (attr.length() != 0) res.add(node);
            }
        }
        nodes=res;
        return res;
    }

    @Override
    public ArrayList<Node> visitPathInParenthesis(XQueryParser.PathInParenthesisContext ctx) {
        return visit(ctx.relativePath());
    }

    @Override
    public ArrayList<Node> visitSelfOrdescendentPath(XQueryParser.SelfOrdescendentPathContext ctx) {
        visit(ctx.relativePath(0));
        ArrayList<Node> desc =getDescendants(nodes);
        nodes.addAll(desc);
        return visit(ctx.relativePath(1));
    }

    @Override
    public ArrayList<Node> visitPathTextEqual(XQueryParser.PathTextEqualContext ctx) {
        HashSet<Node>  res = new HashSet<>();
        ArrayList<Node> copy = nodes;
        for(Node node: copy) {
            ArrayList<Node> origin = new ArrayList<>();
            origin.add(node);
            nodes = origin;
            ArrayList<Node> left = visit(ctx.relativePath());
            String text=ctx.NAME().getText();
            for (Node l : left) {
                String nodeValue=l.getNodeValue();
                if (nodeValue!=null && nodeValue.equals(text)){
                    res.add(node);
                }
            }
        }
        nodes = new ArrayList<>( res);
        return nodes;
    }

    @Override
    public ArrayList<Node> visitNotFilter(XQueryParser.NotFilterContext ctx) {
        HashSet<Node> left = new HashSet<Node>(nodes);
        HashSet<Node> right = new HashSet<Node>(visit(ctx.pathFilter()));
        HashSet<Node> diff = new HashSet<Node>();
        diff.addAll(left);
        diff.removeAll(right);
        ArrayList<Node> res = new ArrayList<Node>(diff);
        return res;
    }

    @Override
    public ArrayList<Node> visitFirstFilter(XQueryParser.FirstFilterContext ctx) {
        return visit(ctx.pathFilter());
    }

    @Override
    public ArrayList<Node> visitRelativePathFilter(XQueryParser.RelativePathFilterContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        for(Node n : nodes){
            ArrayList<Node> tmp = new ArrayList<>();
            tmp.add(n);
            nodes = tmp;
            ArrayList<Node> r = visit(ctx.relativePath());
            if(r.size() > 0)
                res.add(n);
        }
        nodes = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitPathValueEqual(XQueryParser.PathValueEqualContext ctx) {
        HashSet<Node>  res = new HashSet<>();
        ArrayList<Node> copy = nodes;
        for(Node node: copy) {
            ArrayList<Node> origin = new ArrayList<>();
            origin.add(node);
            nodes = origin;
            ArrayList<Node> left = visit(ctx.relativePath(0));
            nodes = origin;
            ArrayList<Node> right = visit(ctx.relativePath(1));
            for (Node l : left) {
                for (Node r : right) {
                    if (l.isEqualNode(r)){
                        res.add(node);
                    }
                }
            }
        }
        nodes = new ArrayList<>( res);
        return nodes;
    }

    @Override
    public ArrayList<Node> visitAndpathFilter(XQueryParser.AndpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        HashSet<Node> intersect = new HashSet<Node>();
        intersect.addAll(f0);
        intersect.retainAll(f1);
        ArrayList<Node> res = new ArrayList<>(intersect);
        return res;
    }

    @Override
    public ArrayList<Node> visitOrpathFilter(XQueryParser.OrpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        HashSet<Node> union = new HashSet<Node>();
        union.addAll(f0);
        union.addAll(f1);
        ArrayList<Node> res = new ArrayList<Node>(union);
        return res;
    }

    @Override
    public ArrayList<Node> visitPathIdEqual(XQueryParser.PathIdEqualContext ctx) {
        ArrayList<Node> origin=nodes;
        ArrayList<Node> left=visit(ctx.relativePath(0));
        nodes=origin;
        ArrayList<Node> right=visit(ctx.relativePath(1));
        nodes=origin;
        for(Node l:left){
            for(Node r:right){
                if(l==r) return nodes;
            }
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitTagName(XQueryParser.TagNameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitAttName(XQueryParser.AttNameContext ctx) {
        return visitChildren(ctx);
    }
}
