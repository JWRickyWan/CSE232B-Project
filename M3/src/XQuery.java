import java.io.*;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XQuery {
    public static void main(String[] args) throws IOException {
        String inputFile = "./src/main/java/input2.xml";
        StringBuilder sb = new StringBuilder();
        InputStream is = System.in;
        if (inputFile!=null) is = new FileInputStream(inputFile);
        CharStream charStream = CharStreams.fromStream(is);
        //System.out.println(charStream.toString());
        XQueryLexer lexer = new XQueryLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        ParseTree tree = parser.xq();
        XQueryMyVisitor eval = new XQueryMyVisitor();
        ArrayList<Node> result = eval.visit(tree);

        //ArrayList<Node> finalResult = makeElem(eval.doc, "result", result);
        writeToFile(result, "XQuery_output.xml");

        System.out.println("finalResult size: " + result.size());

    }

    public static ArrayList<Node> evalRewrite(String rewrittenInput){
        try {
            CharStream input = CharStreams.fromString(rewrittenInput);
            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();

            XQueryMyVisitor rewriteVisitor = new XQueryMyVisitor();
            rewriteVisitor.needRewrite = false;
            ArrayList<Node> results = rewriteVisitor.visit(tree);
            return results;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error in xquery.evalRewrite: " + e.getMessage());
        }
        return null;
    }

    private static void writeToFile(ArrayList<Node> result, String filePath) {
        for(int i=0;i<result.size();i++) {
            Document outputDoc = null;
            DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder docB = null;
            try {
                docB = docBF.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
            outputDoc = docB.newDocument();

            Node newNode = outputDoc.importNode(result.get(i), true);
            outputDoc.appendChild(newNode);

            try {
                TransformerFactory factory = TransformerFactory.newInstance();
                Transformer transformer = factory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                DOMSource source = new DOMSource(outputDoc);
                StreamResult res = new StreamResult(filePath);
                transformer.transform(source, res);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private static ArrayList<Node> makeElem(Document doc, String tag, ArrayList<Node> list){
        Node result = doc.createElement(tag);
        for (Node node : list) {
            if (node != null) {
                Node newNode = doc.importNode(node, true);
                result.appendChild(newNode);
            }
        }
        ArrayList<Node> results = new ArrayList<>();
        results.add(result);
        return results;
    }
}

