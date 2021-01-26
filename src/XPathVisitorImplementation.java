import org.w3c.dom.Node;

import java.util.ArrayList;

public class XPathVisitorImplementation extends XPathBaseVisitor<ArrayList<Node>> {
    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {

        return super.visitDoc(ctx);
    }
}
