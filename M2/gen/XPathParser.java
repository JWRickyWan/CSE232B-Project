// Generated from /Users/rickywan/OneDrive/CSE232B/M1/M2/src/XPath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NOT=11, EQUAL=12, IDEQUAL=13, NAME=14, FILE=15, SLASH=16, DOUBLESLASH=17, 
		ASTRID=18, DOT=19, DDOT=20, TEXTFUNC=21, WS=22, QUOTE=23;
	public static final int
		RULE_doc = 0, RULE_filename = 1, RULE_absolutePath = 2, RULE_relativePath = 3, 
		RULE_pathFilter = 4, RULE_tagName = 5, RULE_attName = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"doc", "filename", "absolutePath", "relativePath", "pathFilter", "tagName", 
			"attName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'document'", "'('", "')'", "'@'", "','", "'['", "']'", 
			"'and'", "'or'", "'not'", null, null, null, null, "'/'", "'//'", "'*'", 
			"'.'", "'..'", "'text()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NOT", 
			"EQUAL", "IDEQUAL", "NAME", "FILE", "SLASH", "DOUBLESLASH", "ASTRID", 
			"DOT", "DDOT", "TEXTFUNC", "WS", "QUOTE"
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
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(XPathParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(XPathParser.QUOTE, i);
		}
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(15);
			match(T__2);
			setState(16);
			match(QUOTE);
			setState(17);
			filename();
			setState(18);
			match(QUOTE);
			setState(19);
			match(T__3);
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
		public List<TerminalNode> NAME() { return getTokens(XPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XPathParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(XPathParser.DOT, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(NAME);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(22);
				match(DOT);
				setState(23);
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
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public AbsolutePathChildContext(AbsolutePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbsolutePathChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbsolutePathChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAbsolutePathChild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescendentAbsolutePathContext extends AbsolutePathContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode DOUBLESLASH() { return getToken(XPathParser.DOUBLESLASH, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public DescendentAbsolutePathContext(AbsolutePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterDescendentAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitDescendentAbsolutePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitDescendentAbsolutePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsolutePathContext absolutePath() throws RecognitionException {
		AbsolutePathContext _localctx = new AbsolutePathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_absolutePath);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AbsolutePathChildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				doc();
				setState(27);
				match(SLASH);
				setState(28);
				relativePath(0);
				}
				break;
			case 2:
				_localctx = new DescendentAbsolutePathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				doc();
				setState(31);
				match(DOUBLESLASH);
				setState(32);
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
		public TerminalNode ASTRID() { return getToken(XPathParser.ASTRID, 0); }
		public AllContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentDirectoryContext extends RelativePathContext {
		public TerminalNode DDOT() { return getToken(XPathParser.DDOT, 0); }
		public ParentDirectoryContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterParentDirectory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitParentDirectory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitParentDirectory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextFunctionContext extends RelativePathContext {
		public TerminalNode TEXTFUNC() { return getToken(XPathParser.TEXTFUNC, 0); }
		public TextFunctionContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterTextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitTextFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitTextFunction(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterSequenceOfPaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitSequenceOfPaths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitSequenceOfPaths(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfContext extends RelativePathContext {
		public TerminalNode DOT() { return getToken(XPathParser.DOT, 0); }
		public SelfContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitSelf(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathWithFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathWithFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitPathWithFilter(this);
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
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public RelativePathChildrenContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativePathChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativePathChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRelativePathChildren(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitTag(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAttribute(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathInParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitPathInParenthesis(this);
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
		public TerminalNode DOUBLESLASH() { return getToken(XPathParser.DOUBLESLASH, 0); }
		public SelfOrdescendentPathContext(RelativePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterSelfOrdescendentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitSelfOrdescendentPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitSelfOrdescendentPath(this);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				tagName();
				}
				break;
			case ASTRID:
				{
				_localctx = new AllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(ASTRID);
				}
				break;
			case DOT:
				{
				_localctx = new SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(DOT);
				}
				break;
			case DDOT:
				{
				_localctx = new ParentDirectoryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(DDOT);
				}
				break;
			case TEXTFUNC:
				{
				_localctx = new TextFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(TEXTFUNC);
				}
				break;
			case T__4:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__4);
				setState(43);
				attName();
				}
				break;
			case T__2:
				{
				_localctx = new PathInParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__2);
				setState(45);
				relativePath(0);
				setState(46);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new SequenceOfPathsContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(50);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(51);
						match(T__5);
						setState(52);
						relativePath(6);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathChildrenContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						match(SLASH);
						setState(55);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new SelfOrdescendentPathContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(DOUBLESLASH);
						setState(58);
						relativePath(3);
						}
						break;
					case 4:
						{
						_localctx = new PathWithFilterContext(new RelativePathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(59);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(60);
						match(T__6);
						setState(61);
						pathFilter(0);
						setState(62);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode EQUAL() { return getToken(XPathParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(XPathParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(XPathParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public PathTextEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathTextEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathTextEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitPathTextEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFilterContext extends PathFilterContext {
		public TerminalNode NOT() { return getToken(XPathParser.NOT, 0); }
		public PathFilterContext pathFilter() {
			return getRuleContext(PathFilterContext.class,0);
		}
		public NotFilterContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitNotFilter(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFirstFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFirstFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFirstFilter(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativePathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativePathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRelativePathFilter(this);
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
		public TerminalNode EQUAL() { return getToken(XPathParser.EQUAL, 0); }
		public PathValueEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathValueEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathValueEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitPathValueEqual(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAndpathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAndpathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAndpathFilter(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterOrpathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitOrpathFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitOrpathFilter(this);
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
		public TerminalNode IDEQUAL() { return getToken(XPathParser.IDEQUAL, 0); }
		public PathIdEqualContext(PathFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathIdEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathIdEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitPathIdEqual(this);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new RelativePathFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				relativePath(0);
				}
				break;
			case 2:
				{
				_localctx = new PathValueEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				relativePath(0);
				setState(72);
				match(EQUAL);
				setState(73);
				relativePath(0);
				}
				break;
			case 3:
				{
				_localctx = new PathTextEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				relativePath(0);
				setState(76);
				match(EQUAL);
				setState(77);
				match(QUOTE);
				setState(78);
				match(NAME);
				setState(79);
				match(QUOTE);
				}
				break;
			case 4:
				{
				_localctx = new PathIdEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				relativePath(0);
				setState(82);
				match(IDEQUAL);
				setState(83);
				relativePath(0);
				}
				break;
			case 5:
				{
				_localctx = new FirstFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__2);
				setState(86);
				pathFilter(0);
				setState(87);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(NOT);
				setState(90);
				pathFilter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndpathFilterContext(new PathFilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(T__8);
						setState(95);
						pathFilter(4);
						}
						break;
					case 2:
						{
						_localctx = new OrpathFilterContext(new PathFilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(T__9);
						setState(98);
						pathFilter(3);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16\5F\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6"+
		"\3\7\3\7\3\b\3\b\3\b\2\4\b\n\t\2\4\6\b\n\f\16\2\3\3\2\3\4\2z\2\20\3\2"+
		"\2\2\4\27\3\2\2\2\6$\3\2\2\2\b\62\3\2\2\2\n]\3\2\2\2\fj\3\2\2\2\16l\3"+
		"\2\2\2\20\21\t\2\2\2\21\22\7\5\2\2\22\23\7\31\2\2\23\24\5\4\3\2\24\25"+
		"\7\31\2\2\25\26\7\6\2\2\26\3\3\2\2\2\27\32\7\20\2\2\30\31\7\25\2\2\31"+
		"\33\7\20\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\35\5\2\2\2\35"+
		"\36\7\22\2\2\36\37\5\b\5\2\37%\3\2\2\2 !\5\2\2\2!\"\7\23\2\2\"#\5\b\5"+
		"\2#%\3\2\2\2$\34\3\2\2\2$ \3\2\2\2%\7\3\2\2\2&\'\b\5\1\2\'\63\5\f\7\2"+
		"(\63\7\24\2\2)\63\7\25\2\2*\63\7\26\2\2+\63\7\27\2\2,-\7\7\2\2-\63\5\16"+
		"\b\2./\7\5\2\2/\60\5\b\5\2\60\61\7\6\2\2\61\63\3\2\2\2\62&\3\2\2\2\62"+
		"(\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62+\3\2\2\2\62,\3\2\2\2\62.\3\2\2\2"+
		"\63D\3\2\2\2\64\65\f\7\2\2\65\66\7\b\2\2\66C\5\b\5\b\678\f\5\2\289\7\22"+
		"\2\29C\5\b\5\6:;\f\4\2\2;<\7\23\2\2<C\5\b\5\5=>\f\3\2\2>?\7\t\2\2?@\5"+
		"\n\6\2@A\7\n\2\2AC\3\2\2\2B\64\3\2\2\2B\67\3\2\2\2B:\3\2\2\2B=\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GH\b\6\1\2H^\5\b\5"+
		"\2IJ\5\b\5\2JK\7\16\2\2KL\5\b\5\2L^\3\2\2\2MN\5\b\5\2NO\7\16\2\2OP\7\31"+
		"\2\2PQ\7\20\2\2QR\7\31\2\2R^\3\2\2\2ST\5\b\5\2TU\7\17\2\2UV\5\b\5\2V^"+
		"\3\2\2\2WX\7\5\2\2XY\5\n\6\2YZ\7\6\2\2Z^\3\2\2\2[\\\7\r\2\2\\^\5\n\6\3"+
		"]G\3\2\2\2]I\3\2\2\2]M\3\2\2\2]S\3\2\2\2]W\3\2\2\2][\3\2\2\2^g\3\2\2\2"+
		"_`\f\5\2\2`a\7\13\2\2af\5\n\6\6bc\f\4\2\2cd\7\f\2\2df\5\n\6\5e_\3\2\2"+
		"\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jk\7\20"+
		"\2\2k\r\3\2\2\2lm\7\20\2\2m\17\3\2\2\2\n\32$\62BD]eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}