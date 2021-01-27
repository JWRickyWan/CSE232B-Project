import org.w3c.dom.Node;

import java.util.*;

public class XPathVisitorImplementation extends XPathBaseVisitor<ArrayList<Node>> {


    private ArrayList<Node> getChildrenList(Node n){
        ArrayList<Node> childrenList = new ArrayList<>();
        for(int i =0;i<n.getChildNodes().getLength();i++){
            childrenList.add(n.getChildNodes().item(i));
        }
        return childrenList;
    }

    private ArrayList<Node> getAllDescendents(Node n){
        ArrayList<Node> alldesc = new ArrayList<>();
        for(int i =0;i<n.getChildNodes().getLength();i++){
            alldesc.addAll(getAllDescendents(n.getChildNodes().item(i)));
        }
        alldesc.add(n);
        return alldesc;
    }
    @Override
    public ArrayList<Node> visitAbsolutePathChild(XPathParser.AbsolutePathChildContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx) {
        return super.visitDescendentAbsolutePath(ctx);
    }

    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {
        return super.visitDoc(ctx);
    }


    @Override
    public ArrayList<Node> visitAll(XPathParser.AllContext ctx) {
        return super.visitAll(ctx);
    }

    @Override
    public ArrayList<Node> visitParentDirectory(XPathParser.ParentDirectoryContext ctx) {
        return super.visitParentDirectory(ctx);
    }

    @Override
    public ArrayList<Node> visitSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx) {
        return super.visitSequenceOfPaths(ctx);
    }

    @Override
    public ArrayList<Node> visitTextFunction(XPathParser.TextFunctionContext ctx) {
        return super.visitTextFunction(ctx);
    }

    @Override
    public ArrayList<Node> visitSelf(XPathParser.SelfContext ctx) {
        return super.visitSelf(ctx);
    }

    @Override
    public ArrayList<Node> visitPathWithFilter(XPathParser.PathWithFilterContext ctx) {
        return super.visitPathWithFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitTag(XPathParser.TagContext ctx) {
        return super.visitTag(ctx);
    }
}


