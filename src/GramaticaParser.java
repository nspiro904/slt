// Generated from Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOUN=1, DETERMINER=2, PROPERNOUN=3, NOUN=4, ADJECTIVE=5, COMMA=6, PERIOD=7, 
		VERB=8, ADVERB=9, AUXILIARY=10, ADPOSITION=11, CCONJUNCTION=12, SCONJUNCTION=13, 
		NUM=14, WHITESPACE=15;
	public static final int
		RULE_text = 0, RULE_sentence_list = 1, RULE_sentence_tail = 2, RULE_sentence = 3, 
		RULE_verbp_l = 4, RULE_verbp_t = 5, RULE_verbp = 6, RULE_verb_clause = 7, 
		RULE_intr_verbp = 8, RULE_adp_intr_verbp = 9, RULE_tra_verbp = 10, RULE_svo_tra_verbp = 11, 
		RULE_sconjp = 12, RULE_noun_sconjp = 13, RULE_nounp = 14, RULE_naked_nounp = 15, 
		RULE_adj_nounp = 16, RULE_adjf_nounp = 17, RULE_adpp = 18, RULE_noun_adpp = 19, 
		RULE_adjective_l = 20, RULE_adjective_t = 21, RULE_adjective = 22, RULE_determiner = 23, 
		RULE_noun = 24, RULE_verb = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "sentence_list", "sentence_tail", "sentence", "verbp_l", "verbp_t", 
			"verbp", "verb_clause", "intr_verbp", "adp_intr_verbp", "tra_verbp", 
			"svo_tra_verbp", "sconjp", "noun_sconjp", "nounp", "naked_nounp", "adj_nounp", 
			"adjf_nounp", "adpp", "noun_adpp", "adjective_l", "adjective_t", "adjective", 
			"determiner", "noun", "verb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRONOUN", "DETERMINER", "PROPERNOUN", "NOUN", "ADJECTIVE", "COMMA", 
			"PERIOD", "VERB", "ADVERB", "AUXILIARY", "ADPOSITION", "CCONJUNCTION", 
			"SCONJUNCTION", "NUM", "WHITESPACE"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public Sentence_listContext sentence_list() {
			return getRuleContext(Sentence_listContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			sentence_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentence_listContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Sentence_tailContext sentence_tail() {
			return getRuleContext(Sentence_tailContext.class,0);
		}
		public Sentence_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentence_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentence_list(this);
		}
	}

	public final Sentence_listContext sentence_list() throws RecognitionException {
		Sentence_listContext _localctx = new Sentence_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			sentence();
			setState(55);
			sentence_tail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentence_tailContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Sentence_tailContext sentence_tail() {
			return getRuleContext(Sentence_tailContext.class,0);
		}
		public Sentence_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentence_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentence_tail(this);
		}
	}

	public final Sentence_tailContext sentence_tail() throws RecognitionException {
		Sentence_tailContext _localctx = new Sentence_tailContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence_tail);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				sentence();
				setState(58);
				sentence_tail();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public Verbp_lContext verbp_l() {
			return getRuleContext(Verbp_lContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(GramaticaParser.PERIOD, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			verbp_l();
			setState(64);
			match(PERIOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Verbp_lContext extends ParserRuleContext {
		public VerbpContext verbp() {
			return getRuleContext(VerbpContext.class,0);
		}
		public Verbp_tContext verbp_t() {
			return getRuleContext(Verbp_tContext.class,0);
		}
		public Verbp_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbp_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerbp_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerbp_l(this);
		}
	}

	public final Verbp_lContext verbp_l() throws RecognitionException {
		Verbp_lContext _localctx = new Verbp_lContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verbp_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			verbp();
			setState(67);
			verbp_t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Verbp_tContext extends ParserRuleContext {
		public VerbpContext verbp() {
			return getRuleContext(VerbpContext.class,0);
		}
		public Verbp_tContext verbp_t() {
			return getRuleContext(Verbp_tContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramaticaParser.COMMA, 0); }
		public Verbp_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbp_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerbp_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerbp_t(this);
		}
	}

	public final Verbp_tContext verbp_t() throws RecognitionException {
		Verbp_tContext _localctx = new Verbp_tContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verbp_t);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				verbp();
				setState(70);
				verbp_t();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(COMMA);
				setState(73);
				verbp();
				setState(74);
				verbp_t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VerbpContext extends ParserRuleContext {
		public Verb_clauseContext verb_clause() {
			return getRuleContext(Verb_clauseContext.class,0);
		}
		public SconjpContext sconjp() {
			return getRuleContext(SconjpContext.class,0);
		}
		public VerbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerbp(this);
		}
	}

	public final VerbpContext verbp() throws RecognitionException {
		VerbpContext _localctx = new VerbpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verbp);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				verb_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				verb_clause();
				setState(80);
				sconjp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Verb_clauseContext extends ParserRuleContext {
		public Intr_verbpContext intr_verbp() {
			return getRuleContext(Intr_verbpContext.class,0);
		}
		public Tra_verbpContext tra_verbp() {
			return getRuleContext(Tra_verbpContext.class,0);
		}
		public Verb_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerb_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerb_clause(this);
		}
	}

	public final Verb_clauseContext verb_clause() throws RecognitionException {
		Verb_clauseContext _localctx = new Verb_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verb_clause);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				intr_verbp();
				}
				break;
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				tra_verbp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Intr_verbpContext extends ParserRuleContext {
		public Adp_intr_verbpContext adp_intr_verbp() {
			return getRuleContext(Adp_intr_verbpContext.class,0);
		}
		public Intr_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intr_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIntr_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIntr_verbp(this);
		}
	}

	public final Intr_verbpContext intr_verbp() throws RecognitionException {
		Intr_verbpContext _localctx = new Intr_verbpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intr_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			adp_intr_verbp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Adp_intr_verbpContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public AdppContext adpp() {
			return getRuleContext(AdppContext.class,0);
		}
		public Adp_intr_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adp_intr_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdp_intr_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdp_intr_verbp(this);
		}
	}

	public final Adp_intr_verbpContext adp_intr_verbp() throws RecognitionException {
		Adp_intr_verbpContext _localctx = new Adp_intr_verbpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_adp_intr_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			verb();
			setState(91);
			adpp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tra_verbpContext extends ParserRuleContext {
		public Svo_tra_verbpContext svo_tra_verbp() {
			return getRuleContext(Svo_tra_verbpContext.class,0);
		}
		public Tra_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tra_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTra_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTra_verbp(this);
		}
	}

	public final Tra_verbpContext tra_verbp() throws RecognitionException {
		Tra_verbpContext _localctx = new Tra_verbpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tra_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			svo_tra_verbp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Svo_tra_verbpContext extends ParserRuleContext {
		public List<NounpContext> nounp() {
			return getRuleContexts(NounpContext.class);
		}
		public NounpContext nounp(int i) {
			return getRuleContext(NounpContext.class,i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Svo_tra_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svo_tra_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSvo_tra_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSvo_tra_verbp(this);
		}
	}

	public final Svo_tra_verbpContext svo_tra_verbp() throws RecognitionException {
		Svo_tra_verbpContext _localctx = new Svo_tra_verbpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_svo_tra_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			nounp();
			setState(96);
			verb();
			setState(97);
			nounp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SconjpContext extends ParserRuleContext {
		public Noun_sconjpContext noun_sconjp() {
			return getRuleContext(Noun_sconjpContext.class,0);
		}
		public SconjpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sconjp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSconjp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSconjp(this);
		}
	}

	public final SconjpContext sconjp() throws RecognitionException {
		SconjpContext _localctx = new SconjpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			noun_sconjp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Noun_sconjpContext extends ParserRuleContext {
		public TerminalNode SCONJUNCTION() { return getToken(GramaticaParser.SCONJUNCTION, 0); }
		public NounpContext nounp() {
			return getRuleContext(NounpContext.class,0);
		}
		public Noun_sconjpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun_sconjp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNoun_sconjp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNoun_sconjp(this);
		}
	}

	public final Noun_sconjpContext noun_sconjp() throws RecognitionException {
		Noun_sconjpContext _localctx = new Noun_sconjpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_noun_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SCONJUNCTION);
			setState(102);
			nounp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NounpContext extends ParserRuleContext {
		public Adj_nounpContext adj_nounp() {
			return getRuleContext(Adj_nounpContext.class,0);
		}
		public Naked_nounpContext naked_nounp() {
			return getRuleContext(Naked_nounpContext.class,0);
		}
		public NounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNounp(this);
		}
	}

	public final NounpContext nounp() throws RecognitionException {
		NounpContext _localctx = new NounpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nounp);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				adj_nounp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				naked_nounp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Naked_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Naked_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naked_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNaked_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNaked_nounp(this);
		}
	}

	public final Naked_nounpContext naked_nounp() throws RecognitionException {
		Naked_nounpContext _localctx = new Naked_nounpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_naked_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			determiner();
			setState(109);
			noun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Adj_nounpContext extends ParserRuleContext {
		public Adjf_nounpContext adjf_nounp() {
			return getRuleContext(Adjf_nounpContext.class,0);
		}
		public Adj_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adj_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdj_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdj_nounp(this);
		}
	}

	public final Adj_nounpContext adj_nounp() throws RecognitionException {
		Adj_nounpContext _localctx = new Adj_nounpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_adj_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			adjf_nounp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Adjf_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Adjective_lContext adjective_l() {
			return getRuleContext(Adjective_lContext.class,0);
		}
		public Adjf_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjf_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdjf_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdjf_nounp(this);
		}
	}

	public final Adjf_nounpContext adjf_nounp() throws RecognitionException {
		Adjf_nounpContext _localctx = new Adjf_nounpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_adjf_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			determiner();
			setState(114);
			noun();
			setState(115);
			adjective_l();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdppContext extends ParserRuleContext {
		public Noun_adppContext noun_adpp() {
			return getRuleContext(Noun_adppContext.class,0);
		}
		public AdppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdpp(this);
		}
	}

	public final AdppContext adpp() throws RecognitionException {
		AdppContext _localctx = new AdppContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			noun_adpp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Noun_adppContext extends ParserRuleContext {
		public TerminalNode ADPOSITION() { return getToken(GramaticaParser.ADPOSITION, 0); }
		public NounpContext nounp() {
			return getRuleContext(NounpContext.class,0);
		}
		public Noun_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNoun_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNoun_adpp(this);
		}
	}

	public final Noun_adppContext noun_adpp() throws RecognitionException {
		Noun_adppContext _localctx = new Noun_adppContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_noun_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ADPOSITION);
			setState(120);
			nounp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Adjective_lContext extends ParserRuleContext {
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public Adjective_tContext adjective_t() {
			return getRuleContext(Adjective_tContext.class,0);
		}
		public Adjective_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdjective_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdjective_l(this);
		}
	}

	public final Adjective_lContext adjective_l() throws RecognitionException {
		Adjective_lContext _localctx = new Adjective_lContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_adjective_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			adjective();
			setState(123);
			adjective_t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Adjective_tContext extends ParserRuleContext {
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public Adjective_tContext adjective_t() {
			return getRuleContext(Adjective_tContext.class,0);
		}
		public Adjective_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdjective_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdjective_t(this);
		}
	}

	public final Adjective_tContext adjective_t() throws RecognitionException {
		Adjective_tContext _localctx = new Adjective_tContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_adjective_t);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
			case ADVERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				adjective();
				setState(126);
				adjective_t();
				}
				break;
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case COMMA:
			case VERB:
			case SCONJUNCTION:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode ADJECTIVE() { return getToken(GramaticaParser.ADJECTIVE, 0); }
		public TerminalNode ADVERB() { return getToken(GramaticaParser.ADVERB, 0); }
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdjective(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_adjective);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ADJECTIVE);
				}
				break;
			case ADVERB:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(ADVERB);
				setState(133);
				match(ADJECTIVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeterminerContext extends ParserRuleContext {
		public TerminalNode DETERMINER() { return getToken(GramaticaParser.DETERMINER, 0); }
		public DeterminerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeterminer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeterminer(this);
		}
	}

	public final DeterminerContext determiner() throws RecognitionException {
		DeterminerContext _localctx = new DeterminerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_determiner);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(DETERMINER);
				}
				break;
			case PROPERNOUN:
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class NounContext extends ParserRuleContext {
		public TerminalNode PROPERNOUN() { return getToken(GramaticaParser.PROPERNOUN, 0); }
		public TerminalNode NOUN() { return getToken(GramaticaParser.NOUN, 0); }
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==PROPERNOUN || _la==NOUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VerbContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(GramaticaParser.VERB, 0); }
		public TerminalNode PRONOUN() { return getToken(GramaticaParser.PRONOUN, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_verb);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(VERB);
				}
				break;
			case PRONOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(PRONOUN);
				setState(144);
				match(VERB);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007W\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000ek\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0082\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0087\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u008b\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0092\b\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0001\u0001\u0000\u0003\u0004\u0082\u00004\u0001"+
		"\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000"+
		"\u0000\u0006?\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nL\u0001"+
		"\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000"+
		"\u0000\u0010X\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014"+
		"]\u0001\u0000\u0000\u0000\u0016_\u0001\u0000\u0000\u0000\u0018c\u0001"+
		"\u0000\u0000\u0000\u001ae\u0001\u0000\u0000\u0000\u001cj\u0001\u0000\u0000"+
		"\u0000\u001el\u0001\u0000\u0000\u0000 o\u0001\u0000\u0000\u0000\"q\u0001"+
		"\u0000\u0000\u0000$u\u0001\u0000\u0000\u0000&w\u0001\u0000\u0000\u0000"+
		"(z\u0001\u0000\u0000\u0000*\u0081\u0001\u0000\u0000\u0000,\u0086\u0001"+
		"\u0000\u0000\u0000.\u008a\u0001\u0000\u0000\u00000\u008c\u0001\u0000\u0000"+
		"\u00002\u0091\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u00005\u0001"+
		"\u0001\u0000\u0000\u000067\u0003\u0006\u0003\u000078\u0003\u0004\u0002"+
		"\u00008\u0003\u0001\u0000\u0000\u00009:\u0003\u0006\u0003\u0000:;\u0003"+
		"\u0004\u0002\u0000;>\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0005\u0001\u0000"+
		"\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005\u0007\u0000\u0000A\u0007\u0001"+
		"\u0000\u0000\u0000BC\u0003\f\u0006\u0000CD\u0003\n\u0005\u0000D\t\u0001"+
		"\u0000\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003\n\u0005\u0000GM\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0003"+
		"\n\u0005\u0000KM\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LH\u0001"+
		"\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NS\u0003\u000e\u0007"+
		"\u0000OP\u0003\u000e\u0007\u0000PQ\u0003\u0018\f\u0000QS\u0001\u0000\u0000"+
		"\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000S\r\u0001\u0000"+
		"\u0000\u0000TW\u0003\u0010\b\u0000UW\u0003\u0014\n\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000W\u000f\u0001\u0000\u0000\u0000"+
		"XY\u0003\u0012\t\u0000Y\u0011\u0001\u0000\u0000\u0000Z[\u00032\u0019\u0000"+
		"[\\\u0003$\u0012\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0003\u0016\u000b"+
		"\u0000^\u0015\u0001\u0000\u0000\u0000_`\u0003\u001c\u000e\u0000`a\u0003"+
		"2\u0019\u0000ab\u0003\u001c\u000e\u0000b\u0017\u0001\u0000\u0000\u0000"+
		"cd\u0003\u001a\r\u0000d\u0019\u0001\u0000\u0000\u0000ef\u0005\r\u0000"+
		"\u0000fg\u0003\u001c\u000e\u0000g\u001b\u0001\u0000\u0000\u0000hk\u0003"+
		" \u0010\u0000ik\u0003\u001e\u000f\u0000jh\u0001\u0000\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000k\u001d\u0001\u0000\u0000\u0000lm\u0003.\u0017\u0000"+
		"mn\u00030\u0018\u0000n\u001f\u0001\u0000\u0000\u0000op\u0003\"\u0011\u0000"+
		"p!\u0001\u0000\u0000\u0000qr\u0003.\u0017\u0000rs\u00030\u0018\u0000s"+
		"t\u0003(\u0014\u0000t#\u0001\u0000\u0000\u0000uv\u0003&\u0013\u0000v%"+
		"\u0001\u0000\u0000\u0000wx\u0005\u000b\u0000\u0000xy\u0003\u001c\u000e"+
		"\u0000y\'\u0001\u0000\u0000\u0000z{\u0003,\u0016\u0000{|\u0003*\u0015"+
		"\u0000|)\u0001\u0000\u0000\u0000}~\u0003,\u0016\u0000~\u007f\u0003*\u0015"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082+\u0001\u0000\u0000\u0000\u0083\u0087\u0005\u0005\u0000\u0000\u0084"+
		"\u0085\u0005\t\u0000\u0000\u0085\u0087\u0005\u0005\u0000\u0000\u0086\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087-\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0005\u0002\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b/\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0000"+
		"\u0000\u0000\u008d1\u0001\u0000\u0000\u0000\u008e\u0092\u0005\b\u0000"+
		"\u0000\u008f\u0090\u0005\u0001\u0000\u0000\u0090\u0092\u0005\b\u0000\u0000"+
		"\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u00923\u0001\u0000\u0000\u0000\t=LRVj\u0081\u0086\u008a\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}