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
        return temp;
    }
<<<<<<< HEAD
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
=======
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
>>>>>>> 46ee878c59c1ceccaf4e9f43f89044b65e424b1b
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
        String tagName=ctx.getText();
        for(Node node:nodes){
            ArrayList<Node> tempChildren=getChildrenList(node);
            for(Node child:tempChildren){
                String nodeValue=child.getNodeName();
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
        nodes = res;
        return res;
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
        nodes=res;

        return res;
    }

    @Override public ArrayList<Node> visitOrpathFilter(XPathParser.OrpathFilterContext ctx) {
        HashSet<Node> f0=new HashSet<>(visit(ctx.pathFilter(0)));
        HashSet<Node> f1=new HashSet<>(visit(ctx.pathFilter(1)));
        HashSet<Node> union = new HashSet<Node>();
        union.addAll(f0);
        union.addAll(f1);
        f0.addAll(f1);
        ArrayList<Node> res = new ArrayList<Node>(union);
        nodes = res;
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

}

