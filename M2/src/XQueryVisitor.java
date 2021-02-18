// Generated from XQuery.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAbsolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAbsolutePath(XQueryParser.XQAbsolutePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQinParenthesis}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQinParenthesis(XQueryParser.XQinParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQClauses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQClauses(XQueryParser.XQClausesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQComma(XQueryParser.XQCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQValue}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQValue(XQueryParser.XQValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQNodeConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQNodeConstructor(XQueryParser.XQNodeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQChild(XQueryParser.XQChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQDescendent(XQueryParser.XQDescendentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQEqual(XQueryParser.XQEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQEmpty(XQueryParser.XQEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(XQueryParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQIs(XQueryParser.XQIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondInParenthesis}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondInParenthesis(XQueryParser.CondInParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQSatisfy(XQueryParser.XQSatisfyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XQueryParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absolutePathChild}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathChild(XQueryParser.AbsolutePathChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendentAbsolutePath}
	 * labeled alternative in {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendentAbsolutePath(XQueryParser.DescendentAbsolutePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code all}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(XQueryParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentDirectory}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentDirectory(XQueryParser.ParentDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFunction(XQueryParser.TextFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceOfPaths}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOfPaths(XQueryParser.SequenceOfPathsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(XQueryParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathWithFilter}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathWithFilter(XQueryParser.PathWithFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativePathChildren}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathChildren(XQueryParser.RelativePathChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(XQueryParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathInParenthesis}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathInParenthesis(XQueryParser.PathInParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfOrdescendentPath}
	 * labeled alternative in {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfOrdescendentPath(XQueryParser.SelfOrdescendentPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathTextEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathTextEqual(XQueryParser.PathTextEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstFilter(XQueryParser.FirstFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativePathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathFilter(XQueryParser.RelativePathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathValueEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathValueEqual(XQueryParser.PathValueEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndpathFilter(XQueryParser.AndpathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orpathFilter}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrpathFilter(XQueryParser.OrpathFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathIdEqual}
	 * labeled alternative in {@link XQueryParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathIdEqual(XQueryParser.PathIdEqualContext ctx);
}