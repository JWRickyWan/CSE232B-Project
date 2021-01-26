// Generated from XPath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathChild(XPathParser.AbsolutePathChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathChild(XPathParser.AbsolutePathChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitDescendentAbsolutePath(XPathParser.DescendentAbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XPathParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XPathParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code all}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterAll(XPathParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code all}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitAll(XPathParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterParentDirectory(XPathParser.ParentDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitParentDirectory(XPathParser.ParentDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SequenceOfPaths}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SequenceOfPaths}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOfPaths(XPathParser.SequenceOfPathsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterTextFunction(XPathParser.TextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitTextFunction(XPathParser.TextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSelf(XPathParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSelf(XPathParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterPathWithFilter(XPathParser.PathWithFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitPathWithFilter(XPathParser.PathWithFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterTag(XPathParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitTag(XPathParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathInParenthesis}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterPathInParenthesis(XPathParser.PathInParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathInParenthesis}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitPathInParenthesis(XPathParser.PathInParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSelfOrdescendentPath(XPathParser.SelfOrdescendentPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSelfOrdescendentPath(XPathParser.SelfOrdescendentPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathValueEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathValueEqual(XPathParser.PathValueEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathValueEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathValueEqual(XPathParser.PathValueEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathIdEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathIdEqual(XPathParser.PathIdEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathIdEqual}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathIdEqual(XPathParser.PathIdEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterFirstFilter(XPathParser.FirstFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitFirstFilter(XPathParser.FirstFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterAndpathFilter(XPathParser.AndpathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitAndpathFilter(XPathParser.AndpathFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterOrpathFilter(XPathParser.OrpathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XPathParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitOrpathFilter(XPathParser.OrpathFilterContext ctx);
}