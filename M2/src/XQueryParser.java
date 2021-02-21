// Generated from XQuery.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NOT=32, EQUAL=33, IDEQUAL=34, TEXTFUNC=35, QUOTE=36, NAME=37, WS=38, STRINGCONSTANT=39;
	public static final int
		RULE_absolutePath = 0, RULE_doc = 1, RULE_filename = 2, RULE_relativePath = 3, 
		RULE_pathFilter = 4, RULE_xq = 5, RULE_var = 6, RULE_forClause = 7, RULE_letClause = 8, 
		RULE_whereClause = 9, RULE_returnClause = 10, RULE_cond = 11, RULE_tagName = 12, 
		RULE_attName = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"absolutePath", "doc", "filename", "relativePath", "pathFilter", "xq", 
			"var", "forClause", "letClause", "whereClause", "returnClause", "cond", 
			"tagName", "attName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'doc(\"'", "'\")'", "'document(\"'", "'.'", "'*'", 
			"'..'", "'@'", "','", "'('", "')'", "'['", "']'", "'and'", "'or'", "'<'", 
			"'>'", "'{'", "'}'", "'</'", "'$'", "'for'", "'in'", "'let'", "':='", 
			"'where'", "'return'", "'empty'", "'some'", "'satisfies'", "'not'", null, 
			null, "'text()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NOT", "EQUAL", "IDEQUAL", 
			"TEXTFUNC", "QUOTE", "NAME", "WS", "STRINGCONSTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AbsolutePathContext extends ParserRuleContext {
		public AbsolutePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolutePath; }
	 
		public AbsolutePathContext() { }
		public void copyFrom(AbsolutePathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsolutePathChildContext extends AbsolutePathContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public AbsolutePathChildContext(AbsolutePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbsolutePathChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbsolutePathChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbsolutePathChild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescendentAbsolutePathContext extends AbsolutePathContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public DescendentAbsolutePathContext(AbsolutePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDescendentAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDescendentAbsolutePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDescendentAbsolutePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsolutePathContext absolutePath() throws RecognitionException {
		AbsolutePathContext _localctx = new AbsolutePathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_absolutePath);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AbsolutePathChildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				doc();
				setState(29);
				match(T__0);
				setState(30);
				relativePath(0);
				}
				break;
			case 2:
				_localctx = new DescendentAbsolutePathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				doc();
				setState(33);
				match(T__1);
				setState(34);
				relativePath(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doc);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__2);
				setState(39);
				filename();
				setState(40);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__4);
				setState(43);
				filename();
				setState(44);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NAME);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(49);
				match(T__5);
				setState(50);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativePathContext extends ParserRuleContext {
		public RelativePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePath; }
	 
		public RelativePathContext() { }
		public void copyFrom(RelativePathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllContext extends RelativePathContext {
		public AllContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentDirectoryContext extends RelativePathContext {
		public ParentDirectoryContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParentDirectory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParentDirectory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParentDirectory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextFunctionContext extends RelativePathContext {
		public TerminalNode TEXTFUNC() { return getToken(XQueryParser.TEXTFUNC, 0); }
		public TextFunctionContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTextFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTextFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequenceOfPathsContext extends RelativePathContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public SequenceOfPathsContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSequenceOfPaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSequenceOfPaths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSequenceOfPaths(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfContext extends RelativePathContext {
		public SelfContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathWithFilterContext extends RelativePathContext {
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public PathFilterContext pathFilter() {
			return getRuleContext(PathFilterContext.class,0);
		}
		public PathWithFilterContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPathWithFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPathWithFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPathWithFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativePathChildrenContext extends RelativePathContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public RelativePathChildrenContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativePathChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativePathChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativePathChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagContext extends RelativePathContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RelativePathContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public AttributeContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathInParenthesisContext extends RelativePathContext {
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public PathInParenthesisContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPathInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPathInParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPathInParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfOrdescendentPathContext extends RelativePathContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public SelfOrdescendentPathContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSelfOrdescendentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSelfOrdescendentPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSelfOrdescendentPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativePathContext relativePath() throws RecognitionException {
		return relativePath(0);
	}

	private RelativePathContext relativePath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelativePathContext _localctx = new RelativePathContext(_ctx, _parentState);
		RelativePathContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_relativePath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				tagName();
				}
				break;
			case T__6:
				{
				_localctx = new AllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(T__6);
				}
				break;
			case T__5:
				{
				_localctx = new SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__5);
				}
				break;
			case T__7:
				{
				_localctx = new ParentDirectoryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(T__7);
				}
				break;
			case TEXTFUNC:
				{
				_localctx = new TextFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(TEXTFUNC);
				}
				break;
			case T__8:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__8);
				setState(60);
				attName();
				}
				break;
			case T__10:
				{
				_localctx = new PathInParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__10);
				setState(62);
				relativePath(0);
				setState(63);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new SequenceOfPathsContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(T__9);
						setState(69);
						relativePath(6);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathChildrenContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(T__0);
						setState(72);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new SelfOrdescendentPathContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(T__1);
						setState(75);
						relativePath(3);
						}
						break;
					case 4:
						{
						_localctx = new PathWithFilterContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(76);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(77);
						match(T__12);
						setState(78);
						pathFilter(0);
						setState(79);
						match(T__13);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PathFilterContext extends ParserRuleContext {
		public PathFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathFilter; }
	 
		public PathFilterContext() { }
		public void copyFrom(PathFilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathTextEqualContext extends PathFilterContext {
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(XQueryParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(XQueryParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public PathTextEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPathTextEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPathTextEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPathTextEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFilterContext extends PathFilterContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public PathFilterContext pathFilter() {
			return getRuleContext(PathFilterContext.class,0);
		}
		public NotFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstFilterContext extends PathFilterContext {
		public PathFilterContext pathFilter() {
			return getRuleContext(PathFilterContext.class,0);
		}
		public FirstFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFirstFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFirstFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFirstFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativePathFilterContext extends PathFilterContext {
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public RelativePathFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativePathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativePathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativePathFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathValueEqualContext extends PathFilterContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public PathValueEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPathValueEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPathValueEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPathValueEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndpathFilterContext extends PathFilterContext {
		public List<PathFilterContext> pathFilter() {
			return getRuleContexts(PathFilterContext.class);
		}
		public PathFilterContext pathFilter(int i) {
			return getRuleContext(PathFilterContext.class,i);
		}
		public AndpathFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAndpathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAndpathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAndpathFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrpathFilterContext extends PathFilterContext {
		public List<PathFilterContext> pathFilter() {
			return getRuleContexts(PathFilterContext.class);
		}
		public PathFilterContext pathFilter(int i) {
			return getRuleContext(PathFilterContext.class,i);
		}
		public OrpathFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOrpathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOrpathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOrpathFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathIdEqualContext extends PathFilterContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public TerminalNode IDEQUAL() { return getToken(XQueryParser.IDEQUAL, 0); }
		public PathIdEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPathIdEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPathIdEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPathIdEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathFilterContext pathFilter() throws RecognitionException {
		return pathFilter(0);
	}

	private PathFilterContext pathFilter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PathFilterContext _localctx = new PathFilterContext(_ctx, _parentState);
		PathFilterContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_pathFilter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new RelativePathFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				relativePath(0);
				}
				break;
			case 2:
				{
				_localctx = new PathValueEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				relativePath(0);
				setState(89);
				match(EQUAL);
				setState(90);
				relativePath(0);
				}
				break;
			case 3:
				{
				_localctx = new PathTextEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				relativePath(0);
				setState(93);
				match(EQUAL);
				setState(94);
				match(QUOTE);
				setState(95);
				match(NAME);
				setState(96);
				match(QUOTE);
				}
				break;
			case 4:
				{
				_localctx = new PathIdEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				relativePath(0);
				setState(99);
				match(IDEQUAL);
				setState(100);
				relativePath(0);
				}
				break;
			case 5:
				{
				_localctx = new FirstFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__10);
				setState(103);
				pathFilter(0);
				setState(104);
				match(T__11);
				}
				break;
			case 6:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(NOT);
				setState(107);
				pathFilter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndpathFilterContext(new PathFilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(T__14);
						setState(112);
						pathFilter(4);
						}
						break;
					case 2:
						{
						_localctx = new OrpathFilterContext(new PathFilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						match(T__15);
						setState(115);
						pathFilter(3);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XQAbsolutePathContext extends XqContext {
		public AbsolutePathContext absolutePath() {
			return getRuleContext(AbsolutePathContext.class,0);
		}
		public XQAbsolutePathContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQAbsolutePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQAbsolutePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQinParenthesisContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQinParenthesisContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQinParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQinParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQinParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQClausesContext extends XqContext {
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XQClausesContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQClauses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstantContext extends XqContext {
		public TerminalNode STRINGCONSTANT() { return getToken(XQueryParser.STRINGCONSTANT, 0); }
		public StringConstantContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCommaContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQCommaContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQComma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQValueContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public XQValueContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQNodeConstructorContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQNodeConstructorContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQNodeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQNodeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQNodeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQChildContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public XQChildContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQChild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQDescendentContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public XQDescendentContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQDescendent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQDescendent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new XQValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				var();
				}
				break;
			case 2:
				{
				_localctx = new StringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(STRINGCONSTANT);
				}
				break;
			case 3:
				{
				_localctx = new XQAbsolutePathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				absolutePath();
				}
				break;
			case 4:
				{
				_localctx = new XQinParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(T__10);
				setState(126);
				xq(0);
				setState(127);
				match(T__11);
				}
				break;
			case 5:
				{
				_localctx = new XQNodeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__16);
				setState(130);
				match(NAME);
				setState(131);
				match(T__17);
				setState(132);
				match(T__18);
				setState(133);
				xq(0);
				setState(134);
				match(T__19);
				setState(135);
				match(T__20);
				setState(136);
				match(NAME);
				setState(137);
				match(T__17);
				}
				break;
			case 6:
				{
				_localctx = new XQClausesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(139);
					forClause();
					}
				}

				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(142);
					letClause();
					}
				}

				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(145);
					whereClause();
					}
				}

				setState(148);
				returnClause();
				}
				break;
			case 7:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				letClause();
				setState(150);
				xq(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new XQCommaContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
						match(T__9);
						setState(156);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XQChildContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158);
						match(T__0);
						setState(159);
						relativePath(0);
						}
						break;
					case 3:
						{
						_localctx = new XQDescendentContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(T__1);
						setState(162);
						relativePath(0);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__21);
			setState(169);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__22);
			setState(172);
			var();
			setState(173);
			match(T__23);
			setState(174);
			xq(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(175);
				match(T__9);
				setState(176);
				var();
				setState(177);
				match(T__23);
				setState(178);
				xq(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__24);
			setState(186);
			var();
			setState(187);
			match(T__25);
			setState(188);
			xq(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(189);
				match(T__9);
				setState(190);
				var();
				setState(191);
				match(T__25);
				setState(192);
				xq(0);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__26);
			setState(200);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__27);
			setState(203);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOrContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public XQEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IDEQUAL() { return getToken(XQueryParser.IDEQUAL, 0); }
		public XQIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondInParenthesisContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondInParenthesisContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondInParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondInParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQSatisfyContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XQSatisfyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQSatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQSatisfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQSatisfy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new XQEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				xq(0);
				setState(207);
				match(EQUAL);
				setState(208);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new XQIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				xq(0);
				setState(211);
				match(IDEQUAL);
				setState(212);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new XQEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(T__28);
				setState(215);
				match(T__10);
				setState(216);
				xq(0);
				setState(217);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new XQSatisfyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__29);
				setState(220);
				var();
				setState(221);
				match(T__23);
				setState(222);
				xq(0);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(223);
					match(T__9);
					setState(224);
					var();
					setState(225);
					match(T__23);
					setState(226);
					xq(0);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(T__30);
				setState(234);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondInParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(T__10);
				setState(237);
				cond(0);
				setState(238);
				match(T__11);
				}
				break;
			case 6:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(NOT);
				setState(241);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(244);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(245);
						match(T__14);
						setState(246);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						match(T__15);
						setState(249);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 4:
			return pathFilter_sempred((PathFilterContext)_localctx, predIndex);
		case 5:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 11:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relativePath_sempred(RelativePathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pathFilter_sempred(PathFilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5T\n\5\f\5\16\5"+
		"W\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6w\n\6\f\6"+
		"\16\6z\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\7\5\7\u0092\n\7\3\7\5\7\u0095\n\7\3"+
		"\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a6"+
		"\n\7\f\7\16\7\u00a9\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fd\n\r\f"+
		"\r\16\r\u0100\13\r\3\16\3\16\3\17\3\17\3\17\2\6\b\n\f\30\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\2\2\u0121\2&\3\2\2\2\4\60\3\2\2\2\6\62\3"+
		"\2\2\2\bC\3\2\2\2\nn\3\2\2\2\f\u009a\3\2\2\2\16\u00aa\3\2\2\2\20\u00ad"+
		"\3\2\2\2\22\u00bb\3\2\2\2\24\u00c9\3\2\2\2\26\u00cc\3\2\2\2\30\u00f4\3"+
		"\2\2\2\32\u0101\3\2\2\2\34\u0103\3\2\2\2\36\37\5\4\3\2\37 \7\3\2\2 !\5"+
		"\b\5\2!\'\3\2\2\2\"#\5\4\3\2#$\7\4\2\2$%\5\b\5\2%\'\3\2\2\2&\36\3\2\2"+
		"\2&\"\3\2\2\2\'\3\3\2\2\2()\7\5\2\2)*\5\6\4\2*+\7\6\2\2+\61\3\2\2\2,-"+
		"\7\7\2\2-.\5\6\4\2./\7\6\2\2/\61\3\2\2\2\60(\3\2\2\2\60,\3\2\2\2\61\5"+
		"\3\2\2\2\62\65\7\'\2\2\63\64\7\b\2\2\64\66\7\'\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\7\3\2\2\2\678\b\5\1\28D\5\32\16\29D\7\t\2\2:D\7\b\2\2;D\7"+
		"\n\2\2<D\7%\2\2=>\7\13\2\2>D\5\34\17\2?@\7\r\2\2@A\5\b\5\2AB\7\16\2\2"+
		"BD\3\2\2\2C\67\3\2\2\2C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2"+
		"\2C?\3\2\2\2DU\3\2\2\2EF\f\7\2\2FG\7\f\2\2GT\5\b\5\bHI\f\5\2\2IJ\7\3\2"+
		"\2JT\5\b\5\6KL\f\4\2\2LM\7\4\2\2MT\5\b\5\5NO\f\3\2\2OP\7\17\2\2PQ\5\n"+
		"\6\2QR\7\20\2\2RT\3\2\2\2SE\3\2\2\2SH\3\2\2\2SK\3\2\2\2SN\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2\2\2XY\b\6\1\2Yo\5\b\5\2Z["+
		"\5\b\5\2[\\\7#\2\2\\]\5\b\5\2]o\3\2\2\2^_\5\b\5\2_`\7#\2\2`a\7&\2\2ab"+
		"\7\'\2\2bc\7&\2\2co\3\2\2\2de\5\b\5\2ef\7$\2\2fg\5\b\5\2go\3\2\2\2hi\7"+
		"\r\2\2ij\5\n\6\2jk\7\16\2\2ko\3\2\2\2lm\7\"\2\2mo\5\n\6\3nX\3\2\2\2nZ"+
		"\3\2\2\2n^\3\2\2\2nd\3\2\2\2nh\3\2\2\2nl\3\2\2\2ox\3\2\2\2pq\f\5\2\2q"+
		"r\7\21\2\2rw\5\n\6\6st\f\4\2\2tu\7\22\2\2uw\5\n\6\5vp\3\2\2\2vs\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\13\3\2\2\2zx\3\2\2\2{|\b\7\1\2|\u009b"+
		"\5\16\b\2}\u009b\7)\2\2~\u009b\5\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5"+
		"\f\7\2\u0081\u0082\7\16\2\2\u0082\u009b\3\2\2\2\u0083\u0084\7\23\2\2\u0084"+
		"\u0085\7\'\2\2\u0085\u0086\7\24\2\2\u0086\u0087\7\25\2\2\u0087\u0088\5"+
		"\f\7\2\u0088\u0089\7\26\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\'\2\2\u008b"+
		"\u008c\7\24\2\2\u008c\u009b\3\2\2\2\u008d\u008f\5\20\t\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\5\22\n\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\24"+
		"\13\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u009b\5\26\f\2\u0097\u0098\5\22\n\2\u0098\u0099\5\f\7\3\u0099\u009b\3"+
		"\2\2\2\u009a{\3\2\2\2\u009a}\3\2\2\2\u009a~\3\2\2\2\u009a\177\3\2\2\2"+
		"\u009a\u0083\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u00a7"+
		"\3\2\2\2\u009c\u009d\f\7\2\2\u009d\u009e\7\f\2\2\u009e\u00a6\5\f\7\b\u009f"+
		"\u00a0\f\b\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a6\5\b\5\2\u00a2\u00a3\f\6"+
		"\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a6\5\b\5\2\u00a5\u009c\3\2\2\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\r\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab"+
		"\7\30\2\2\u00ab\u00ac\7\'\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae"+
		"\u00af\5\16\b\2\u00af\u00b0\7\32\2\2\u00b0\u00b8\5\f\7\2\u00b1\u00b2\7"+
		"\f\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\5\f\7\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7\33\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\7\34\2\2\u00be\u00c6\5\f\7"+
		"\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2\7\34\2\2\u00c2"+
		"\u00c3\5\f\7\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00cb\5\30\r\2\u00cb\25\3\2\2\2\u00cc"+
		"\u00cd\7\36\2\2\u00cd\u00ce\5\f\7\2\u00ce\27\3\2\2\2\u00cf\u00d0\b\r\1"+
		"\2\u00d0\u00d1\5\f\7\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\5\f\7\2\u00d3\u00f5"+
		"\3\2\2\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\7$\2\2\u00d6\u00d7\5\f\7\2\u00d7"+
		"\u00f5\3\2\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\5"+
		"\f\7\2\u00db\u00dc\7\16\2\2\u00dc\u00f5\3\2\2\2\u00dd\u00de\7 \2\2\u00de"+
		"\u00df\5\16\b\2\u00df\u00e0\7\32\2\2\u00e0\u00e8\5\f\7\2\u00e1\u00e2\7"+
		"\f\2\2\u00e2\u00e3\5\16\b\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\5\f\7\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7!\2\2\u00ec\u00ed\5\30\r\7\u00ed\u00f5\3\2\2\2\u00ee\u00ef\7\r"+
		"\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1\7\16\2\2\u00f1\u00f5\3\2\2\2\u00f2"+
		"\u00f3\7\"\2\2\u00f3\u00f5\5\30\r\3\u00f4\u00cf\3\2\2\2\u00f4\u00d4\3"+
		"\2\2\2\u00f4\u00d8\3\2\2\2\u00f4\u00dd\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\f\5\2\2\u00f7\u00f8\7\21"+
		"\2\2\u00f8\u00fd\5\30\r\6\u00f9\u00fa\f\4\2\2\u00fa\u00fb\7\22\2\2\u00fb"+
		"\u00fd\5\30\r\5\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\'\2\2\u0102\33\3\2\2\2\u0103\u0104\7\'\2"+
		"\2\u0104\35\3\2\2\2\27&\60\65CSUnvx\u008e\u0091\u0094\u009a\u00a5\u00a7"+
		"\u00b8\u00c6\u00e8\u00f4\u00fc\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}