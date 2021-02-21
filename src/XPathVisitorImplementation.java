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
        visit(ctx.doc());
        return visit(ctx.relativePath());
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
    public ArrayList<Node> visitDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx) {
        visit(ctx.doc());
        ArrayList<Node> desc = getDescendants(nodes);
        nodes.addAll(desc);
        return visit(ctx.relativePath());
    }

    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {
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
    public ArrayList<Node> visitSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx) {
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
    public ArrayList<Node> visitTextFunction(XPathParser.TextFunctionContext ctx) {
        /*ArrayList<Node> temp = new ArrayList<>();
        for(Node n:nodes){
            for(int i =0;i<n.getChildNodes().getLength();i++){
                Node node=n.getChildNodes().item(i);
                String node_val=n.getChildNodes().item(i).getTextContent();
                short node_type=node.getNodeType();
                boolean isText=node_type==Node.TEXT_NODE;
                if(n.getChildNodes().item(i).getNodeType()== Node.TEXT_NODE&&
                        (!n.getChildNodes().item(i).getTextContent().equals("\n"))){
                    temp.add(n.getChildNodes().item(i));
                }
            }
        }
        return temp;*/
        ArrayList<Node> cList = new ArrayList<>();
        for(Node child:nodes){
            cList.addAll(getChildrenList(child));
        }
        nodes = cList;
        return nodes;
    }
    /*
        @Override
        public ArrayList<Node> visitText(XPathParser.TextContext ctx) {
            ArrayList<Node> temp = new ArrayList<>();
            ArrayList<Node> allNodes=new ArrayList<>(nodes);
            int count=0;
            while(count<allNodes.size()){
                Node node=allNodes.get(count);
                if(node.getNodeType()==Node.TEXT_NODE) count++;
                else{
                    allNodes.remove(count);
                    allNodes.addAll(getChildrenList(node));
                }
            }
            for(Node node:allNodes){
                String node_val="\""+node.getTextContent()+"\"";
                short node_type=node.getNodeType();
                boolean isText=node_type==Node.TEXT_NODE;
                if(node.getNodeType()== Node.TEXT_NODE){
                    String ctxValue=ctx.getText();
                    if (node_val.equals(ctx.getText())) {
                        temp.add(node);
                    }
                }
            }
            return temp;
        }
    */
/*
    @Override
    public ArrayList<Node> visitText(XPathParser.TextContext ctx) {
        ArrayList<Node> temp = new ArrayList<>();
        ArrayList<Node> allNodes=new ArrayList<>(nodes);
        int count=0;
        while(count<allNodes.size()){
            Node node=allNodes.get(count);
            if(node.getNodeType()==Node.TEXT_NODE) count++;
            else{
                allNodes.remove(count);
                allNodes.addAll(getChildrenList(node));
            }
        }
        for(Node node:allNodes){
            String node_val="\""+node.getTextContent()+"\"";
            short node_type=node.getNodeType();
            boolean isText=node_type==Node.TEXT_NODE;
            if(node.getNodeType()== Node.TEXT_NODE){
                String ctxValue=ctx.getText();
                if (node_val.equals(ctx.getText())) {
                    temp.add(node);
                }
            }
        }
        return temp;
    }

*/
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
        ArrayList<Node> cList = new ArrayList<>();
        for(Node node:nodes){
            cList.addAll(getChildrenList(node));
        }
        for(Node node:cList){
            if(node.getNodeType()==Node.ELEMENT_NODE&&node.getNodeName().equals(ctx.getText())){
                res.add(node);
            }
        }
        nodes=res;
        return res;

    }

    @Override public ArrayList<Node> visitAttribute(XPathParser.AttributeContext ctx) {
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

    @Override public ArrayList<Node> visitPathInParenthesis(XPathParser.PathInParenthesisContext ctx) { // ???
        return visit(ctx.relativePath());
    }

    @Override public ArrayList<Node> visitSelfOrdescendentPath(XPathParser.SelfOrdescendentPathContext ctx) {
        visit(ctx.relativePath(0));
        ArrayList<Node> desc =getDescendants(nodes);
        nodes.addAll(desc);
        return visit(ctx.relativePath(1));
    }

    @Override public ArrayList<Node> visitPathTextEqual(XPathParser.PathTextEqualContext ctx) {
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

    @Override public ArrayList<Node> visitNotFilter(XPathParser.NotFilterContext ctx) {
        HashSet<Node> left = new HashSet<Node>(nodes);
        HashSet<Node> right = new HashSet<Node>(visit(ctx.pathFilter()));
        HashSet<Node> diff = new HashSet<Node>();
        diff.addAll(left);
        diff.removeAll(right);
        ArrayList<Node> res = new ArrayList<Node>(diff);
        return res;
    }

    @Override public ArrayList<Node> visitFirstFilter(XPathParser.FirstFilterContext ctx) {
        return visit(ctx.pathFilter());
    }

    @Override public ArrayList<Node> visitPathWithFilter(XPathParser.PathWithFilterContext ctx){ //????
        visit(ctx.relativePath());
        nodes=visit(ctx.pathFilter());
        return nodes;
    }

    @Override public ArrayList<Node> visitPathValueEqual(XPathParser.PathValueEqualContext ctx) {
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

    @Override public ArrayList<Node> visitAndpathFilter(XPathParser.AndpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        HashSet<Node> intersect = new HashSet<Node>();
        intersect.addAll(f0);
        intersect.retainAll(f1);
        ArrayList<Node> res = new ArrayList<>(intersect);
        return res;
    }

    @Override public ArrayList<Node> visitOrpathFilter(XPathParser.OrpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        HashSet<Node> union = new HashSet<Node>();
        union.addAll(f0);
        union.addAll(f1);
        ArrayList<Node> res = new ArrayList<Node>(union);
        return res;
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

    @Override
    public ArrayList<Node> visitRelativePathChildren(XPathParser.RelativePathChildrenContext ctx) {
        visit(ctx.relativePath(0));
        return visit(ctx.relativePath(1));
    }

    @Override
    public ArrayList<Node> visitAttName(XPathParser.AttNameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitTagName(XPathParser.TagNameContext ctx) {
        return visitChildren(ctx);
    }
}

