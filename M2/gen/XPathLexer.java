// Generated from /Users/rickywan/OneDrive/CSE232B/M1/M2/src/XPath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NOT=11, EQUAL=12, IDEQUAL=13, NAME=14, FILE=15, SLASH=16, DOUBLESLASH=17, 
		ASTRID=18, DOT=19, DDOT=20, TEXTFUNC=21, WS=22, QUOTE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NOT", "EQUAL", "IDEQUAL", "NAME", "FILE", "SLASH", "DOUBLESLASH", 
			"ASTRID", "DOT", "DDOT", "TEXTFUNC", "WS", "QUOTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'document'", "'('", "')'", "'@'", "'['", "']'", "','", 
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\5\rY\n\r\3\16\3\16\3\16\3\16\5\16_\n\16\3\17\6\17b\n"+
		"\17\r\17\16\17c\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27|\n\27\r\27"+
		"\16\27}\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\5\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\4\2$$\u201e\u201f\2\u0086"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\65\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rD\3\2"+
		"\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31X\3"+
		"\2\2\2\33^\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%l\3\2\2"+
		"\2\'n\3\2\2\2)p\3\2\2\2+s\3\2\2\2-{\3\2\2\2/\u0081\3\2\2\2\61\62\7f\2"+
		"\2\62\63\7q\2\2\63\64\7e\2\2\64\4\3\2\2\2\65\66\7f\2\2\66\67\7q\2\2\67"+
		"8\7e\2\289\7w\2\29:\7o\2\2:;\7g\2\2;<\7p\2\2<=\7v\2\2=\6\3\2\2\2>?\7*"+
		"\2\2?\b\3\2\2\2@A\7+\2\2A\n\3\2\2\2BC\7B\2\2C\f\3\2\2\2DE\7]\2\2E\16\3"+
		"\2\2\2FG\7_\2\2G\20\3\2\2\2HI\7.\2\2I\22\3\2\2\2JK\7c\2\2KL\7p\2\2LM\7"+
		"f\2\2M\24\3\2\2\2NO\7q\2\2OP\7t\2\2P\26\3\2\2\2QR\7p\2\2RS\7q\2\2ST\7"+
		"v\2\2T\30\3\2\2\2UY\7?\2\2VW\7g\2\2WY\7s\2\2XU\3\2\2\2XV\3\2\2\2Y\32\3"+
		"\2\2\2Z[\7?\2\2[_\7?\2\2\\]\7k\2\2]_\7u\2\2^Z\3\2\2\2^\\\3\2\2\2_\34\3"+
		"\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\36\3\2\2\2e"+
		"f\5\35\17\2f \3\2\2\2gh\7\61\2\2h\"\3\2\2\2ij\7\61\2\2jk\7\61\2\2k$\3"+
		"\2\2\2lm\7,\2\2m&\3\2\2\2no\7\60\2\2o(\3\2\2\2pq\7\60\2\2qr\7\60\2\2r"+
		"*\3\2\2\2st\7v\2\2tu\7g\2\2uv\7z\2\2vw\7v\2\2wx\7*\2\2xy\7+\2\2y,\3\2"+
		"\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\b\27\2\2\u0080.\3\2\2\2\u0081\u0082\t\4\2\2\u0082\60\3\2\2\2\7"+
		"\2X^c}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}