// Generated from XPath.g4 by ANTLR 4.9.1
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
		T__9=10, NAME=11, FILE=12, SLASH=13, DOUBLESLASH=14, ASTRID=15, DOT=16, 
		DDOT=17, TEXTFUNC=18, NOT=19, EQUAL=20, IDEQUAL=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NAME", "FILE", "SLASH", "DOUBLESLASH", "ASTRID", "DOT", "DDOT", 
			"TEXTFUNC", "NOT", "EQUAL", "IDEQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc(\"'", "'\")'", "'@'", "'('", "')'", "'['", "']'", "','", 
			"'and'", "'or'", "'[a-zA-Z0-9]+'", null, "'/'", "'//'", "'*'", "'.'", 
			"'..'", "'text()'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NAME", 
			"FILE", "SLASH", "DOUBLESLASH", "ASTRID", "DOT", "DDOT", "TEXTFUNC", 
			"NOT", "EQUAL", "IDEQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\6\rX\n\r\r\r\16\rY\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25{\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u0081\n\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\3\6\2\62;C"+
		"\\aac|\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2"+
		"\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3"+
		"\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31W\3\2\2\2\33"+
		"`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%l\3\2\2\2\'s\3\2"+
		"\2\2)z\3\2\2\2+\u0080\3\2\2\2-.\7f\2\2./\7q\2\2/\60\7e\2\2\60\61\7*\2"+
		"\2\61\62\7$\2\2\62\4\3\2\2\2\63\64\7$\2\2\64\65\7+\2\2\65\6\3\2\2\2\66"+
		"\67\7B\2\2\67\b\3\2\2\289\7*\2\29\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7]\2"+
		"\2=\16\3\2\2\2>?\7_\2\2?\20\3\2\2\2@A\7.\2\2A\22\3\2\2\2BC\7c\2\2CD\7"+
		"p\2\2DE\7f\2\2E\24\3\2\2\2FG\7q\2\2GH\7t\2\2H\26\3\2\2\2IJ\7]\2\2JK\7"+
		"c\2\2KL\7/\2\2LM\7|\2\2MN\7C\2\2NO\7/\2\2OP\7\\\2\2PQ\7\62\2\2QR\7/\2"+
		"\2RS\7;\2\2ST\7_\2\2TU\7-\2\2U\30\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\60\2\2\\]\7z\2\2]^\7o\2\2^_\7n\2"+
		"\2_\32\3\2\2\2`a\7\61\2\2a\34\3\2\2\2bc\7\61\2\2cd\7\61\2\2d\36\3\2\2"+
		"\2ef\7,\2\2f \3\2\2\2gh\7\60\2\2h\"\3\2\2\2ij\7\60\2\2jk\7\60\2\2k$\3"+
		"\2\2\2lm\7v\2\2mn\7g\2\2no\7z\2\2op\7v\2\2pq\7*\2\2qr\7+\2\2r&\3\2\2\2"+
		"st\7p\2\2tu\7q\2\2uv\7v\2\2v(\3\2\2\2w{\7?\2\2xy\7g\2\2y{\7s\2\2zw\3\2"+
		"\2\2zx\3\2\2\2{*\3\2\2\2|}\7?\2\2}\u0081\7?\2\2~\177\7k\2\2\177\u0081"+
		"\7u\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081,\3\2\2\2\6\2Yz\u0080\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}