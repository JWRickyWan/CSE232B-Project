// Generated from XQuery.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathChild(XQueryParser.AbsolutePathChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathChild(XQueryParser.AbsolutePathChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterDescendentAbsolutePath(XQueryParser.DescendentAbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitDescendentAbsolutePath(XQueryParser.DescendentAbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XQueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code all}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterAll(XQueryParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code all}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitAll(XQueryParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterParentDirectory(XQueryParser.ParentDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitParentDirectory(XQueryParser.ParentDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterTextFunction(XQueryParser.TextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitTextFunction(XQueryParser.TextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequenceOfPaths}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOfPaths(XQueryParser.SequenceOfPathsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequenceOfPaths}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOfPaths(XQueryParser.SequenceOfPathsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSelf(XQueryParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSelf(XQueryParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterPathWithFilter(XQueryParser.PathWithFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitPathWithFilter(XQueryParser.PathWithFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativePathChildren}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathChildren(XQueryParser.RelativePathChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativePathChildren}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathChildren(XQueryParser.RelativePathChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterTag(XQueryParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitTag(XQueryParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathInParenthesis}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterPathInParenthesis(XQueryParser.PathInParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathInParenthesis}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitPathInParenthesis(XQueryParser.PathInParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterSelfOrdescendentPath(XQueryParser.SelfOrdescendentPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitSelfOrdescendentPath(XQueryParser.SelfOrdescendentPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathTextEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathTextEqual(XQueryParser.PathTextEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathTextEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathTextEqual(XQueryParser.PathTextEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterFirstFilter(XQueryParser.FirstFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitFirstFilter(XQueryParser.FirstFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativePathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathFilter(XQueryParser.RelativePathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativePathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathFilter(XQueryParser.RelativePathFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathValueEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathValueEqual(XQueryParser.PathValueEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathValueEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathValueEqual(XQueryParser.PathValueEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterAndpathFilter(XQueryParser.AndpathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitAndpathFilter(XQueryParser.AndpathFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterOrpathFilter(XQueryParser.OrpathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitOrpathFilter(XQueryParser.OrpathFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathIdEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathIdEqual(XQueryParser.PathIdEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathIdEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathIdEqual(XQueryParser.PathIdEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAbsolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAbsolutePath(XQueryParser.XQAbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAbsolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAbsolutePath(XQueryParser.XQAbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQinParenthesis}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQinParenthesis(XQueryParser.XQinParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQinParenthesis}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQinParenthesis(XQueryParser.XQinParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQClauses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQClauses(XQueryParser.XQClausesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQClauses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQClauses(XQueryParser.XQClausesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQComma(XQueryParser.XQCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQComma(XQueryParser.XQCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQValue}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQValue(XQueryParser.XQValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQValue}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQValue(XQueryParser.XQValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQNodeConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQNodeConstructor(XQueryParser.XQNodeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQNodeConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQNodeConstructor(XQueryParser.XQNodeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQChild(XQueryParser.XQChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQChild(XQueryParser.XQChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQDescendent(XQueryParser.XQDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQDescendent(XQueryParser.XQDescendentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQEqual(XQueryParser.XQEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQEqual(XQueryParser.XQEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQEmpty(XQueryParser.XQEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQEmpty(XQueryParser.XQEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(XQueryParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(XQueryParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQIs(XQueryParser.XQIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQIs(XQueryParser.XQIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondInParenthesis}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondInParenthesis(XQueryParser.CondInParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondInParenthesis}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondInParenthesis(XQueryParser.CondInParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQSatisfy(XQueryParser.XQSatisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQSatisfy(XQueryParser.XQSatisfyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XQueryParser.AttNameContext ctx);
}