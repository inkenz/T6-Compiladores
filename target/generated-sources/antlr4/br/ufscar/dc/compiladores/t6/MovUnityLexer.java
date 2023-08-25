// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MovUnityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, GAMEOBJECT=2, SIDESCROLLING=3, TOPDOWN=4, VELOCIDADE=5, NUM=6, 
		GRAVIDADE=7, ACELERACAO=8, DESACELERACAO=9, CONTROLES=10, TECLADO=11, 
		MOUSE=12, TEMPLATE=13, MODO=14, WASD=15, FLECHAS=16, CLIQUE=17, SEGUIR=18, 
		BOTAO=19, DIREITO=20, ESQUERDO=21, W=22, ESPACO=23, FLECHA=24, PULOCONTROLE=25, 
		PULOIMPULSO=26, DIAGONAL=27, VERDADEIRO=28, FALSO=29, NOME=30, DOISPONTOS=31, 
		ABREPAR=32, FECHAPAR=33, ABRECHAVE=34, FECHACHAVE=35, COMENTARIO=36, COMENTARIO_NAO_FECHADO=37, 
		ERRO=38, IGNORE=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", 
			"GRAVIDADE", "ACELERACAO", "DESACELERACAO", "CONTROLES", "TECLADO", "MOUSE", 
			"TEMPLATE", "MODO", "WASD", "FLECHAS", "CLIQUE", "SEGUIR", "BOTAO", "DIREITO", 
			"ESQUERDO", "W", "ESPACO", "FLECHA", "PULOCONTROLE", "PULOIMPULSO", "DIAGONAL", 
			"VERDADEIRO", "FALSO", "NOME", "DOISPONTOS", "ABREPAR", "FECHAPAR", "ABRECHAVE", 
			"FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "ERRO", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'SIDE-SCROLLING'", "'TOP-DOWN'", "'velocidade'", 
			null, "'gravidade'", "'aceleracao'", "'desaceleracao'", "'controles'", 
			"'teclado'", "'mouse'", "'template'", "'modo'", "'WASD'", "'FLECHAS'", 
			"'CLIQUE'", "'SEGUIR'", "'botao'", "'DIREITO'", "'ESQUERDO'", "'W'", 
			"'ESPACO'", "'FLECHA'", "'puloControle'", "'puloImpulso'", "'diagonal'", 
			"'VERDADEIRO'", "'FALSO'", null, "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", 
			"GRAVIDADE", "ACELERACAO", "DESACELERACAO", "CONTROLES", "TECLADO", "MOUSE", 
			"TEMPLATE", "MODO", "WASD", "FLECHAS", "CLIQUE", "SEGUIR", "BOTAO", "DIREITO", 
			"ESQUERDO", "W", "ESPACO", "FLECHA", "PULOCONTROLE", "PULOIMPULSO", "DIAGONAL", 
			"VERDADEIRO", "FALSO", "NOME", "DOISPONTOS", "ABREPAR", "FECHAPAR", "ABRECHAVE", 
			"FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "ERRO", "IGNORE"
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


	public MovUnityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MovUnity.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			IGNORE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void IGNORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\'\u0183\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005\u0081\b\u0005\u0001\u0005\u0004\u0005\u0084\b"+
		"\u0005\u000b\u0005\f\u0005\u0085\u0001\u0005\u0001\u0005\u0004\u0005\u008a"+
		"\b\u0005\u000b\u0005\f\u0005\u008b\u0003\u0005\u008e\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0150\b\u001d\n\u001d\f\u001d\u0153"+
		"\t\u001d\u0001\u001d\u0005\u001d\u0156\b\u001d\n\u001d\f\u001d\u0159\t"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u015d\b\u001d\n\u001d\f\u001d"+
		"\u0160\t\u001d\u0003\u001d\u0162\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0005#\u0170\b#\n#\f#\u0173\t#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0005$\u017a\b$\n$\f$\u017d\t$\u0001%\u0001%\u0001&\u0001&\u0001&\u0000"+
		"\u0000\'\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'\u0001\u0000\u0006\u0002\u0000AZaz\u0003\u000009AZaz\u0004"+
		"\u0000\t\n\r\r{{}}\u0004\u0000\t\n\r\r[[]]\u0007\u0000!!$$++@@]]||~~\u0003"+
		"\u0000\t\n\r\r  \u018c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0001O\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005"+
		"\\\u0001\u0000\u0000\u0000\u0007k\u0001\u0000\u0000\u0000\tt\u0001\u0000"+
		"\u0000\u0000\u000b\u0080\u0001\u0000\u0000\u0000\r\u008f\u0001\u0000\u0000"+
		"\u0000\u000f\u0099\u0001\u0000\u0000\u0000\u0011\u00a4\u0001\u0000\u0000"+
		"\u0000\u0013\u00b2\u0001\u0000\u0000\u0000\u0015\u00bc\u0001\u0000\u0000"+
		"\u0000\u0017\u00c4\u0001\u0000\u0000\u0000\u0019\u00ca\u0001\u0000\u0000"+
		"\u0000\u001b\u00d3\u0001\u0000\u0000\u0000\u001d\u00d8\u0001\u0000\u0000"+
		"\u0000\u001f\u00dd\u0001\u0000\u0000\u0000!\u00e5\u0001\u0000\u0000\u0000"+
		"#\u00ec\u0001\u0000\u0000\u0000%\u00f3\u0001\u0000\u0000\u0000\'\u00f9"+
		"\u0001\u0000\u0000\u0000)\u0101\u0001\u0000\u0000\u0000+\u010a\u0001\u0000"+
		"\u0000\u0000-\u010c\u0001\u0000\u0000\u0000/\u0113\u0001\u0000\u0000\u0000"+
		"1\u011a\u0001\u0000\u0000\u00003\u0127\u0001\u0000\u0000\u00005\u0133"+
		"\u0001\u0000\u0000\u00007\u013c\u0001\u0000\u0000\u00009\u0147\u0001\u0000"+
		"\u0000\u0000;\u014d\u0001\u0000\u0000\u0000=\u0163\u0001\u0000\u0000\u0000"+
		"?\u0165\u0001\u0000\u0000\u0000A\u0167\u0001\u0000\u0000\u0000C\u0169"+
		"\u0001\u0000\u0000\u0000E\u016b\u0001\u0000\u0000\u0000G\u016d\u0001\u0000"+
		"\u0000\u0000I\u0177\u0001\u0000\u0000\u0000K\u017e\u0001\u0000\u0000\u0000"+
		"M\u0180\u0001\u0000\u0000\u0000OP\u0005,\u0000\u0000P\u0002\u0001\u0000"+
		"\u0000\u0000QR\u0005G\u0000\u0000RS\u0005a\u0000\u0000ST\u0005m\u0000"+
		"\u0000TU\u0005e\u0000\u0000UV\u0005O\u0000\u0000VW\u0005b\u0000\u0000"+
		"WX\u0005j\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005c\u0000\u0000Z[\u0005"+
		"t\u0000\u0000[\u0004\u0001\u0000\u0000\u0000\\]\u0005S\u0000\u0000]^\u0005"+
		"I\u0000\u0000^_\u0005D\u0000\u0000_`\u0005E\u0000\u0000`a\u0005-\u0000"+
		"\u0000ab\u0005S\u0000\u0000bc\u0005C\u0000\u0000cd\u0005R\u0000\u0000"+
		"de\u0005O\u0000\u0000ef\u0005L\u0000\u0000fg\u0005L\u0000\u0000gh\u0005"+
		"I\u0000\u0000hi\u0005N\u0000\u0000ij\u0005G\u0000\u0000j\u0006\u0001\u0000"+
		"\u0000\u0000kl\u0005T\u0000\u0000lm\u0005O\u0000\u0000mn\u0005P\u0000"+
		"\u0000no\u0005-\u0000\u0000op\u0005D\u0000\u0000pq\u0005O\u0000\u0000"+
		"qr\u0005W\u0000\u0000rs\u0005N\u0000\u0000s\b\u0001\u0000\u0000\u0000"+
		"tu\u0005v\u0000\u0000uv\u0005e\u0000\u0000vw\u0005l\u0000\u0000wx\u0005"+
		"o\u0000\u0000xy\u0005c\u0000\u0000yz\u0005i\u0000\u0000z{\u0005d\u0000"+
		"\u0000{|\u0005a\u0000\u0000|}\u0005d\u0000\u0000}~\u0005e\u0000\u0000"+
		"~\n\u0001\u0000\u0000\u0000\u007f\u0081\u0005-\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u000209\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u008d\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0005.\u0000\u0000\u0088\u008a\u000209\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005g\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092\u0005"+
		"a\u0000\u0000\u0092\u0093\u0005v\u0000\u0000\u0093\u0094\u0005i\u0000"+
		"\u0000\u0094\u0095\u0005d\u0000\u0000\u0095\u0096\u0005a\u0000\u0000\u0096"+
		"\u0097\u0005d\u0000\u0000\u0097\u0098\u0005e\u0000\u0000\u0098\u000e\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005c\u0000"+
		"\u0000\u009b\u009c\u0005e\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d"+
		"\u009e\u0005e\u0000\u0000\u009e\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005"+
		"a\u0000\u0000\u00a0\u00a1\u0005c\u0000\u0000\u00a1\u00a2\u0005a\u0000"+
		"\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u0010\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005d\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7"+
		"\u0005s\u0000\u0000\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005c"+
		"\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005l\u0000\u0000"+
		"\u00ab\u00ac\u0005e\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00ae"+
		"\u0005a\u0000\u0000\u00ae\u00af\u0005c\u0000\u0000\u00af\u00b0\u0005a"+
		"\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u0012\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4"+
		"\u00b5\u0005n\u0000\u0000\u00b5\u00b6\u0005t\u0000\u0000\u00b6\u00b7\u0005"+
		"r\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9\u0005l\u0000"+
		"\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u00bb\u0005s\u0000\u0000\u00bb"+
		"\u0014\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005t\u0000\u0000\u00bd\u00be"+
		"\u0005e\u0000\u0000\u00be\u00bf\u0005c\u0000\u0000\u00bf\u00c0\u0005l"+
		"\u0000\u0000\u00c0\u00c1\u0005a\u0000\u0000\u00c1\u00c2\u0005d\u0000\u0000"+
		"\u00c2\u00c3\u0005o\u0000\u0000\u00c3\u0016\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005m\u0000\u0000\u00c5\u00c6\u0005o\u0000\u0000\u00c6\u00c7\u0005"+
		"u\u0000\u0000\u00c7\u00c8\u0005s\u0000\u0000\u00c8\u00c9\u0005e\u0000"+
		"\u0000\u00c9\u0018\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005t\u0000\u0000"+
		"\u00cb\u00cc\u0005e\u0000\u0000\u00cc\u00cd\u0005m\u0000\u0000\u00cd\u00ce"+
		"\u0005p\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005a"+
		"\u0000\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1\u00d2\u0005e\u0000\u0000"+
		"\u00d2\u001a\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005m\u0000\u0000\u00d4"+
		"\u00d5\u0005o\u0000\u0000\u00d5\u00d6\u0005d\u0000\u0000\u00d6\u00d7\u0005"+
		"o\u0000\u0000\u00d7\u001c\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005W\u0000"+
		"\u0000\u00d9\u00da\u0005A\u0000\u0000\u00da\u00db\u0005S\u0000\u0000\u00db"+
		"\u00dc\u0005D\u0000\u0000\u00dc\u001e\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005F\u0000\u0000\u00de\u00df\u0005L\u0000\u0000\u00df\u00e0\u0005E"+
		"\u0000\u0000\u00e0\u00e1\u0005C\u0000\u0000\u00e1\u00e2\u0005H\u0000\u0000"+
		"\u00e2\u00e3\u0005A\u0000\u0000\u00e3\u00e4\u0005S\u0000\u0000\u00e4 "+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005C\u0000\u0000\u00e6\u00e7\u0005"+
		"L\u0000\u0000\u00e7\u00e8\u0005I\u0000\u0000\u00e8\u00e9\u0005Q\u0000"+
		"\u0000\u00e9\u00ea\u0005U\u0000\u0000\u00ea\u00eb\u0005E\u0000\u0000\u00eb"+
		"\"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005S\u0000\u0000\u00ed\u00ee"+
		"\u0005E\u0000\u0000\u00ee\u00ef\u0005G\u0000\u0000\u00ef\u00f0\u0005U"+
		"\u0000\u0000\u00f0\u00f1\u0005I\u0000\u0000\u00f1\u00f2\u0005R\u0000\u0000"+
		"\u00f2$\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005b\u0000\u0000\u00f4\u00f5"+
		"\u0005o\u0000\u0000\u00f5\u00f6\u0005t\u0000\u0000\u00f6\u00f7\u0005a"+
		"\u0000\u0000\u00f7\u00f8\u0005o\u0000\u0000\u00f8&\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005D\u0000\u0000\u00fa\u00fb\u0005I\u0000\u0000\u00fb\u00fc"+
		"\u0005R\u0000\u0000\u00fc\u00fd\u0005E\u0000\u0000\u00fd\u00fe\u0005I"+
		"\u0000\u0000\u00fe\u00ff\u0005T\u0000\u0000\u00ff\u0100\u0005O\u0000\u0000"+
		"\u0100(\u0001\u0000\u0000\u0000\u0101\u0102\u0005E\u0000\u0000\u0102\u0103"+
		"\u0005S\u0000\u0000\u0103\u0104\u0005Q\u0000\u0000\u0104\u0105\u0005U"+
		"\u0000\u0000\u0105\u0106\u0005E\u0000\u0000\u0106\u0107\u0005R\u0000\u0000"+
		"\u0107\u0108\u0005D\u0000\u0000\u0108\u0109\u0005O\u0000\u0000\u0109*"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0005W\u0000\u0000\u010b,\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005E\u0000\u0000\u010d\u010e\u0005S\u0000\u0000"+
		"\u010e\u010f\u0005P\u0000\u0000\u010f\u0110\u0005A\u0000\u0000\u0110\u0111"+
		"\u0005C\u0000\u0000\u0111\u0112\u0005O\u0000\u0000\u0112.\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005F\u0000\u0000\u0114\u0115\u0005L\u0000\u0000"+
		"\u0115\u0116\u0005E\u0000\u0000\u0116\u0117\u0005C\u0000\u0000\u0117\u0118"+
		"\u0005H\u0000\u0000\u0118\u0119\u0005A\u0000\u0000\u01190\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005p\u0000\u0000\u011b\u011c\u0005u\u0000\u0000"+
		"\u011c\u011d\u0005l\u0000\u0000\u011d\u011e\u0005o\u0000\u0000\u011e\u011f"+
		"\u0005C\u0000\u0000\u011f\u0120\u0005o\u0000\u0000\u0120\u0121\u0005n"+
		"\u0000\u0000\u0121\u0122\u0005t\u0000\u0000\u0122\u0123\u0005r\u0000\u0000"+
		"\u0123\u0124\u0005o\u0000\u0000\u0124\u0125\u0005l\u0000\u0000\u0125\u0126"+
		"\u0005e\u0000\u0000\u01262\u0001\u0000\u0000\u0000\u0127\u0128\u0005p"+
		"\u0000\u0000\u0128\u0129\u0005u\u0000\u0000\u0129\u012a\u0005l\u0000\u0000"+
		"\u012a\u012b\u0005o\u0000\u0000\u012b\u012c\u0005I\u0000\u0000\u012c\u012d"+
		"\u0005m\u0000\u0000\u012d\u012e\u0005p\u0000\u0000\u012e\u012f\u0005u"+
		"\u0000\u0000\u012f\u0130\u0005l\u0000\u0000\u0130\u0131\u0005s\u0000\u0000"+
		"\u0131\u0132\u0005o\u0000\u0000\u01324\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005d\u0000\u0000\u0134\u0135\u0005i\u0000\u0000\u0135\u0136\u0005a"+
		"\u0000\u0000\u0136\u0137\u0005g\u0000\u0000\u0137\u0138\u0005o\u0000\u0000"+
		"\u0138\u0139\u0005n\u0000\u0000\u0139\u013a\u0005a\u0000\u0000\u013a\u013b"+
		"\u0005l\u0000\u0000\u013b6\u0001\u0000\u0000\u0000\u013c\u013d\u0005V"+
		"\u0000\u0000\u013d\u013e\u0005E\u0000\u0000\u013e\u013f\u0005R\u0000\u0000"+
		"\u013f\u0140\u0005D\u0000\u0000\u0140\u0141\u0005A\u0000\u0000\u0141\u0142"+
		"\u0005D\u0000\u0000\u0142\u0143\u0005E\u0000\u0000\u0143\u0144\u0005I"+
		"\u0000\u0000\u0144\u0145\u0005R\u0000\u0000\u0145\u0146\u0005O\u0000\u0000"+
		"\u01468\u0001\u0000\u0000\u0000\u0147\u0148\u0005F\u0000\u0000\u0148\u0149"+
		"\u0005A\u0000\u0000\u0149\u014a\u0005L\u0000\u0000\u014a\u014b\u0005S"+
		"\u0000\u0000\u014b\u014c\u0005O\u0000\u0000\u014c:\u0001\u0000\u0000\u0000"+
		"\u014d\u0161\u0007\u0000\u0000\u0000\u014e\u0150\u0007\u0001\u0000\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0162\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0154\u0156\u0007\u0001\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015e\u0005_\u0000\u0000\u015b"+
		"\u015d\u0007\u0001\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0151\u0001\u0000\u0000\u0000\u0161"+
		"\u0157\u0001\u0000\u0000\u0000\u0162<\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005:\u0000\u0000\u0164>\u0001\u0000\u0000\u0000\u0165\u0166\u0005("+
		"\u0000\u0000\u0166@\u0001\u0000\u0000\u0000\u0167\u0168\u0005)\u0000\u0000"+
		"\u0168B\u0001\u0000\u0000\u0000\u0169\u016a\u0005{\u0000\u0000\u016aD"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0005}\u0000\u0000\u016cF\u0001\u0000"+
		"\u0000\u0000\u016d\u0171\u0005[\u0000\u0000\u016e\u0170\b\u0002\u0000"+
		"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000"+
		"\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005]\u0000\u0000\u0175\u0176\u0006#\u0000\u0000\u0176"+
		"H\u0001\u0000\u0000\u0000\u0177\u017b\u0005[\u0000\u0000\u0178\u017a\b"+
		"\u0003\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017cJ\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0007\u0004\u0000\u0000\u017fL\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0007\u0005\u0000\u0000\u0181\u0182\u0006&\u0001\u0000"+
		"\u0182N\u0001\u0000\u0000\u0000\u000b\u0000\u0080\u0085\u008b\u008d\u0151"+
		"\u0157\u015e\u0161\u0171\u017b\u0002\u0001#\u0000\u0001&\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}