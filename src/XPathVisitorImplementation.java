import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.*;

public class XPathVisitorImplementation extends XPathBaseVisitor<ArrayList<Node>> {
    private ArrayList<Node> nodes;
    Document document;
    @Override
    public ArrayList<Node> visitAbsolutePathChild(XPathParser.AbsolutePathChildContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx) {
        visit(ctx.doc());
        ArrayList<Node> temp = new ArrayList<>(nodes);
        LinkedList<Node> tempLinked = new LinkedList<>(nodes);
        while(!tempLinked.isEmpty()){
            Node next = tempLinked.poll();
            temp.addAll(getChildrenList(next));
            tempLinked.addAll(getChildrenList(next));
        }
        nodes = temp;
        return visit(ctx.relativePath());
    }

    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {
        File xmlFile = new File(ctx.filename().getText());
        DocumentBuilderFactory docBuildFact = DocumentBuilderFactory.newInstance();
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
    public ArrayList<Node> visitAll(XPathParser.AllContext ctx) {
        ArrayList<Node> childList = new ArrayList<>();
        for(Node node : nodes){
            childList.addAll(getChildrenList(node));
        }
        nodes= childList;
        return childList;
    }

    private ArrayList<Node> getChildrenList(Node node) {
        ArrayList<Node> childrenList = new ArrayList<>();
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            childrenList.add(node.getChildNodes().item(i));
        }
        return childrenList;
    }

    @Override
    public ArrayList<Node> visitParentDirectory(XPathParser.ParentDirectoryContext ctx) {
        ArrayList<Node> parents = new ArrayList<>();
        for(Node node:nodes){
            if(!parents.contains(node.getParentNode())){
                parents.add(node.getParentNode());
            }
        }
        nodes=parents;
        return parents;
    }

    @Override
    public ArrayList<Node> visitSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx) {
        ArrayList<Node> temp = new ArrayList<>(nodes);
        ArrayList<Node> left = new ArrayList<>(visit(ctx.relativePath(0)));
        nodes= temp;
        ArrayList<Node> right = new ArrayList<>(visit(ctx.relativePath(1)));
        left.addAll(right);
        nodes= left;
        return left;
    }

    @Override
    public ArrayList<Node> visitTextFunction(XPathParser.TextFunctionContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        for(Node n:nodes){
            for(int i =0;i<n.getChildNodes().getLength();i++){
                if(n.getChildNodes().item(i).getNodeType()== Node.TEXT_NODE&&
                        (!n.getChildNodes().item(i).getTextContent().equals("/n"))){
                    temp.add(n.getChildNodes().item(i));
                }
            }
        }
        return temp;
    }

    @Override
    public ArrayList<Node> visitSelf(XPathParser.SelfContext ctx) {
        return nodes;
    }

    /*@Override
    public ArrayList<Node> visitTag(XPathParser.TagContext ctx){
        ArrayList<Node> temp = new ArrayList<>();
        String tag = ctx.getText();
        for(Node node:nodes){
            if((node.getNodeName().equals(tag))){
                temp.addAll(getChildrenList(node));
            }
        }
        nodes = temp;
        return temp;
    }*/
    // Qihong Liu Implementation
    @Override
    public ArrayList<Node> visitTag(XPathParser.TagContext ctx) {
        ArrayList<Node> res=new ArrayList<>();
        String tagName=ctx.NAME().getText();
        for(Node node:nodes){
            ArrayList<Node> tempChildren=getChildrenList(node);
            for(Node child:tempChildren){
                if(child.getNodeName().equals(tagName)) res.add(child);
            }
        }
        nodes=res;
        return nodes;

    }

    @Override public ArrayList<Node> visitAttribute(XPathParser.AttributeContext ctx) {
        ArrayList<Node> res=new ArrayList<>();
        String attrName=ctx.NAME().getText();
        for(Node node: nodes){
            Element elm=(Element) node;
            String attr=elm.getAttribute(attrName);
            if(attr.length()!=0) res.add(node);
        }
        nodes=res;
        return res;
    }

    @Override public ArrayList<Node> visitPathInParenthesis(XPathParser.PathInParenthesisContext ctx) { // ???
        visit(ctx.relativePath());
        return nodes;
    }

    @Override public ArrayList<Node> visitSelfOrdescendentPath(XPathParser.SelfOrdescendentPathContext ctx) {
        visit(ctx.relativePath(0));
        ArrayList<Node> res= new ArrayList<>(nodes);
        ArrayList<Node> aux= new ArrayList<>(nodes);
        while(aux.size()!=0){
            Node tmp=aux.get(0);
            aux.remove(0);
            ArrayList<Node> tmpChildren=getChildrenList(tmp);
            res.addAll(tmpChildren);
            aux.addAll(tmpChildren);
        }
        nodes=res;
        visit(ctx.relativePath(1));
        return nodes;
    }

    @Override public ArrayList<Node> visitNotFilter(XPathParser.NotFilterContext ctx) {
        ArrayList<Node> dele= new ArrayList<>(visit(ctx.pathFilter()));
        for(Node dele_node:dele){
            nodes.remove(dele_node);
        }
        return nodes;
    }

    @Override public ArrayList<Node> visitFirstFilter(XPathParser.FirstFilterContext ctx) {
        visit(ctx.pathFilter());
        return nodes;
    }

    @Override public ArrayList<Node> visitPathWithFilter(XPathParser.PathWithFilterContext ctx){ //????
        nodes = visit(ctx.relativePath());
        nodes=visit(ctx.pathFilter());
        return nodes;
    }

    @Override public ArrayList<Node> visitPathValueEqual(XPathParser.PathValueEqualContext ctx) {
        ArrayList<Node> origin=nodes;
        ArrayList<Node> left=visit(ctx.relativePath(0));
        nodes=origin;
        ArrayList<Node> right=visit(ctx.relativePath(1));
        nodes=origin;
        for(Node l:left){
            for(Node r:right){
                if(l.isEqualNode(r)) return nodes;
            }
        }
        return new ArrayList<Node>();
    }

    @Override public ArrayList<Node> visitAndpathFilter(XPathParser.AndpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        f0.retainAll(f1);
        nodes=new ArrayList<>(f0);
        return nodes;
    }

    @Override public ArrayList<Node> visitOrpathFilter(XPathParser.OrpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        f0.addAll(f1);
        nodes=new ArrayList<>(f0);
        return nodes;
    }

    @Override public ArrayList<Node> visitPathIdEqual(XPathParser.PathIdEqualContext ctx) {
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
    public ArrayList<Node> visitRelativePathFilter(XPathParser.RelativePathFilterContext ctx) {
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

}
