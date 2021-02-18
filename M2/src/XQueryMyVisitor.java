import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.*;
public class XQueryMyVisitor extends XQueryBaseVisitor<ArrayList<Node>>{
    @Override
    public ArrayList<Node> visitAbsolutePathChild(XQueryParser.AbsolutePathChildContext ctx) {
        return super.visitAbsolutePathChild(ctx);
    }

    @Override
    public ArrayList<Node> visitVar(XQueryParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public ArrayList<Node> visitXQAbsolutePath(XQueryParser.XQAbsolutePathContext ctx) {
        return super.visitXQAbsolutePath(ctx);
    }

    @Override
    public ArrayList<Node> visitXQinParenthesis(XQueryParser.XQinParenthesisContext ctx) {
        return super.visitXQinParenthesis(ctx);
    }

    @Override
    public ArrayList<Node> visitXQClauses(XQueryParser.XQClausesContext ctx) {
        return super.visitXQClauses(ctx);
    }

    @Override
    public ArrayList<Node> visitStringConstant(XQueryParser.StringConstantContext ctx) {
        return super.visitStringConstant(ctx);
    }

    @Override
    public ArrayList<Node> visitXQLet(XQueryParser.XQLetContext ctx) {
        return super.visitXQLet(ctx);
    }

    @Override
    public ArrayList<Node> visitXQComma(XQueryParser.XQCommaContext ctx) {
        return super.visitXQComma(ctx);
    }

    @Override
    public ArrayList<Node> visitXQValue(XQueryParser.XQValueContext ctx) {
        return super.visitXQValue(ctx);
    }

    @Override
    public ArrayList<Node> visitXQNodeConstructor(XQueryParser.XQNodeConstructorContext ctx) {
        return super.visitXQNodeConstructor(ctx);
    }

    @Override
    public ArrayList<Node> visitXQChild(XQueryParser.XQChildContext ctx) {
        return super.visitXQChild(ctx);
    }

    @Override
    public ArrayList<Node> visitXQDescendent(XQueryParser.XQDescendentContext ctx) {
        return super.visitXQDescendent(ctx);
    }

    @Override
    public ArrayList<Node> visitForClause(XQueryParser.ForClauseContext ctx) {
        return super.visitForClause(ctx);
    }

    @Override
    public ArrayList<Node> visitLetClause(XQueryParser.LetClauseContext ctx) {
        return super.visitLetClause(ctx);
    }

    @Override
    public ArrayList<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public ArrayList<Node> visitCondOr(XQueryParser.CondOrContext ctx) {
        return super.visitCondOr(ctx);
    }

    @Override
    public ArrayList<Node> visitCondAnd(XQueryParser.CondAndContext ctx) {
        return super.visitCondAnd(ctx);
    }

    @Override
    public ArrayList<Node> visitXQEqual(XQueryParser.XQEqualContext ctx) {
        return super.visitXQEqual(ctx);
    }

    @Override
    public ArrayList<Node> visitXQEmpty(XQueryParser.XQEmptyContext ctx) {
        return super.visitXQEmpty(ctx);
    }

    @Override
    public ArrayList<Node> visitCondNot(XQueryParser.CondNotContext ctx) {
        return super.visitCondNot(ctx);
    }

    @Override
    public ArrayList<Node> visitXQIs(XQueryParser.XQIsContext ctx) {
        return super.visitXQIs(ctx);
    }

    @Override
    public ArrayList<Node> visitCondInParenthesis(XQueryParser.CondInParenthesisContext ctx) {
        return super.visitCondInParenthesis(ctx);
    }

    @Override
    public ArrayList<Node> visitXQSatisfy(XQueryParser.XQSatisfyContext ctx) {
        return super.visitXQSatisfy(ctx);
    }

    @Override
    public ArrayList<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
        return super.visitReturnClause(ctx);
    }

    @Override
    public ArrayList<Node> visitDoc(XQueryParser.DocContext ctx) {
        return super.visitDoc(ctx);
    }

    @Override
    public ArrayList<Node> visitFilename(XQueryParser.FilenameContext ctx) {
        return super.visitFilename(ctx);
    }

    @Override
    public ArrayList<Node> visitDescendentAbsolutePath(XQueryParser.DescendentAbsolutePathContext ctx) {
        return super.visitDescendentAbsolutePath(ctx);
    }

    @Override
    public ArrayList<Node> visitAll(XQueryParser.AllContext ctx) {
        return super.visitAll(ctx);
    }

    @Override
    public ArrayList<Node> visitParentDirectory(XQueryParser.ParentDirectoryContext ctx) {
        return super.visitParentDirectory(ctx);
    }

    @Override
    public ArrayList<Node> visitTextFunction(XQueryParser.TextFunctionContext ctx) {
        return super.visitTextFunction(ctx);
    }

    @Override
    public ArrayList<Node> visitSequenceOfPaths(XQueryParser.SequenceOfPathsContext ctx) {
        return super.visitSequenceOfPaths(ctx);
    }

    @Override
    public ArrayList<Node> visitSelf(XQueryParser.SelfContext ctx) {
        return super.visitSelf(ctx);
    }

    @Override
    public ArrayList<Node> visitPathWithFilter(XQueryParser.PathWithFilterContext ctx) {
        return super.visitPathWithFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitRelativePathChildren(XQueryParser.RelativePathChildrenContext ctx) {
        return super.visitRelativePathChildren(ctx);
    }

    @Override
    public ArrayList<Node> visitTag(XQueryParser.TagContext ctx) {
        return super.visitTag(ctx);
    }

    @Override
    public ArrayList<Node> visitAttribute(XQueryParser.AttributeContext ctx) {
        return super.visitAttribute(ctx);
    }

    @Override
    public ArrayList<Node> visitPathInParenthesis(XQueryParser.PathInParenthesisContext ctx) {
        return super.visitPathInParenthesis(ctx);
    }

    @Override
    public ArrayList<Node> visitSelfOrdescendentPath(XQueryParser.SelfOrdescendentPathContext ctx) {
        return super.visitSelfOrdescendentPath(ctx);
    }

    @Override
    public ArrayList<Node> visitPathTextEqual(XQueryParser.PathTextEqualContext ctx) {
        return super.visitPathTextEqual(ctx);
    }

    @Override
    public ArrayList<Node> visitNotFilter(XQueryParser.NotFilterContext ctx) {
        return super.visitNotFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitFirstFilter(XQueryParser.FirstFilterContext ctx) {
        return super.visitFirstFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitRelativePathFilter(XQueryParser.RelativePathFilterContext ctx) {
        return super.visitRelativePathFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitPathValueEqual(XQueryParser.PathValueEqualContext ctx) {
        return super.visitPathValueEqual(ctx);
    }

    @Override
    public ArrayList<Node> visitAndpathFilter(XQueryParser.AndpathFilterContext ctx) {
        return super.visitAndpathFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitOrpathFilter(XQueryParser.OrpathFilterContext ctx) {
        return super.visitOrpathFilter(ctx);
    }

    @Override
    public ArrayList<Node> visitPathIdEqual(XQueryParser.PathIdEqualContext ctx) {
        return super.visitPathIdEqual(ctx);
    }
}
