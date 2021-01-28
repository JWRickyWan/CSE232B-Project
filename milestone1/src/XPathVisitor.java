// Generated from XPath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathChild(XPathParser.AbsolutePathChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code all}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(XPathParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentDirectory(XPathParser.ParentDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFunction(XPathParser.TextFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceOfPaths}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(XPathParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathWithFilter(XPathParser.PathWithFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativePathChildren}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathChildren(XPathParser.RelativePathChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(XPathParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathInParenthesis}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathInParenthesis(XPathParser.PathInParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfOrdescendentPath(XPathParser.SelfOrdescendentPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstFilter(XPathParser.FirstFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativePathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathFilter(XPathParser.RelativePathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathValueEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathValueEqual(XPathParser.PathValueEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndpathFilter(XPathParser.AndpathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrpathFilter(XPathParser.OrpathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathIdEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathIdEqual(XPathParser.PathIdEqualContext ctx);
}