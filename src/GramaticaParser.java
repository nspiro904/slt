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
		RULE_vo_tra_verbp = 12, RULE_aux_verbp = 13, RULE_van_aux_verbp = 14, 
		RULE_nvv_aux_verbp = 15, RULE_nvp_aux_verbp = 16, RULE_sconjp = 17, RULE_noun_sconjp = 18, 
		RULE_nounp = 19, RULE_nounp_l = 20, RULE_nounp_t = 21, RULE_naked_nounp = 22, 
		RULE_adj_nounp = 23, RULE_f_adj_nounp = 24, RULE_l_adj_nounp = 25, RULE_lf_adj_nounp = 26, 
		RULE_adp_nounp = 27, RULE_adpp = 28, RULE_s_adpp = 29, RULE_noun_adpp = 30, 
		RULE_adv_adpp = 31, RULE_verb_adpp = 32, RULE_l_adpp = 33, RULE_lt_adpp = 34, 
		RULE_adjective_l = 35, RULE_adjective_t = 36, RULE_adjective = 37, RULE_determiner = 38, 
		RULE_noun = 39, RULE_verb = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "sentence_list", "sentence_tail", "sentence", "verbp_l", "verbp_t", 
			"verbp", "verb_clause", "intr_verbp", "adp_intr_verbp", "tra_verbp", 
			"svo_tra_verbp", "vo_tra_verbp", "aux_verbp", "van_aux_verbp", "nvv_aux_verbp", 
			"nvp_aux_verbp", "sconjp", "noun_sconjp", "nounp", "nounp_l", "nounp_t", 
			"naked_nounp", "adj_nounp", "f_adj_nounp", "l_adj_nounp", "lf_adj_nounp", 
			"adp_nounp", "adpp", "s_adpp", "noun_adpp", "adv_adpp", "verb_adpp", 
			"l_adpp", "lt_adpp", "adjective_l", "adjective_t", "adjective", "determiner", 
			"noun", "verb"
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
			setState(82);
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
			setState(84);
			sentence();
			setState(85);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case ADJECTIVE:
			case VERB:
			case ADVERB:
			case AUXILIARY:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				sentence();
				setState(88);
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
			setState(93);
			verbp_l();
			setState(94);
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
			setState(96);
			verbp();
			setState(97);
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
		public TerminalNode CCONJUNCTION() { return getToken(GramaticaParser.CCONJUNCTION, 0); }
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case ADJECTIVE:
			case VERB:
			case ADVERB:
			case AUXILIARY:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				verbp();
				setState(100);
				verbp_t();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(COMMA);
				setState(103);
				verbp();
				setState(104);
				verbp_t();
				}
				break;
			case CCONJUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(CCONJUNCTION);
				setState(107);
				verbp();
				setState(108);
				verbp_t();
				}
				break;
			case PERIOD:
				enterOuterAlt(_localctx, 4);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				verb_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				verb_clause();
				setState(115);
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
		public Aux_verbpContext aux_verbp() {
			return getRuleContext(Aux_verbpContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				intr_verbp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				tra_verbp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				aux_verbp();
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
			setState(124);
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
			setState(126);
			verb();
			setState(127);
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
		public Vo_tra_verbpContext vo_tra_verbp() {
			return getRuleContext(Vo_tra_verbpContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case ADJECTIVE:
			case ADVERB:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				svo_tra_verbp();
				}
				break;
			case PRONOUN:
			case VERB:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				vo_tra_verbp();
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
	public static class Svo_tra_verbpContext extends ParserRuleContext {
		public List<Nounp_lContext> nounp_l() {
			return getRuleContexts(Nounp_lContext.class);
		}
		public Nounp_lContext nounp_l(int i) {
			return getRuleContext(Nounp_lContext.class,i);
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
			setState(133);
			nounp_l();
			setState(134);
			verb();
			setState(135);
			nounp_l();
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
	public static class Vo_tra_verbpContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Nounp_lContext nounp_l() {
			return getRuleContext(Nounp_lContext.class,0);
		}
		public Vo_tra_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vo_tra_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVo_tra_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVo_tra_verbp(this);
		}
	}

	public final Vo_tra_verbpContext vo_tra_verbp() throws RecognitionException {
		Vo_tra_verbpContext _localctx = new Vo_tra_verbpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vo_tra_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			verb();
			setState(138);
			nounp_l();
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
	public static class Aux_verbpContext extends ParserRuleContext {
		public Van_aux_verbpContext van_aux_verbp() {
			return getRuleContext(Van_aux_verbpContext.class,0);
		}
		public Nvv_aux_verbpContext nvv_aux_verbp() {
			return getRuleContext(Nvv_aux_verbpContext.class,0);
		}
		public Nvp_aux_verbpContext nvp_aux_verbp() {
			return getRuleContext(Nvp_aux_verbpContext.class,0);
		}
		public Aux_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAux_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAux_verbp(this);
		}
	}

	public final Aux_verbpContext aux_verbp() throws RecognitionException {
		Aux_verbpContext _localctx = new Aux_verbpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aux_verbp);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				van_aux_verbp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				nvv_aux_verbp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				nvp_aux_verbp();
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
	public static class Van_aux_verbpContext extends ParserRuleContext {
		public TerminalNode AUXILIARY() { return getToken(GramaticaParser.AUXILIARY, 0); }
		public TerminalNode ADJECTIVE() { return getToken(GramaticaParser.ADJECTIVE, 0); }
		public Nounp_lContext nounp_l() {
			return getRuleContext(Nounp_lContext.class,0);
		}
		public Van_aux_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_van_aux_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVan_aux_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVan_aux_verbp(this);
		}
	}

	public final Van_aux_verbpContext van_aux_verbp() throws RecognitionException {
		Van_aux_verbpContext _localctx = new Van_aux_verbpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_van_aux_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(AUXILIARY);
			setState(146);
			match(ADJECTIVE);
			setState(147);
			nounp_l();
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
	public static class Nvv_aux_verbpContext extends ParserRuleContext {
		public TerminalNode ADVERB() { return getToken(GramaticaParser.ADVERB, 0); }
		public Nounp_lContext nounp_l() {
			return getRuleContext(Nounp_lContext.class,0);
		}
		public TerminalNode AUXILIARY() { return getToken(GramaticaParser.AUXILIARY, 0); }
		public TerminalNode VERB() { return getToken(GramaticaParser.VERB, 0); }
		public Nvv_aux_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nvv_aux_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNvv_aux_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNvv_aux_verbp(this);
		}
	}

	public final Nvv_aux_verbpContext nvv_aux_verbp() throws RecognitionException {
		Nvv_aux_verbpContext _localctx = new Nvv_aux_verbpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nvv_aux_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ADVERB);
			setState(150);
			nounp_l();
			setState(151);
			match(AUXILIARY);
			setState(152);
			match(VERB);
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
	public static class Nvp_aux_verbpContext extends ParserRuleContext {
		public Nounp_lContext nounp_l() {
			return getRuleContext(Nounp_lContext.class,0);
		}
		public TerminalNode AUXILIARY() { return getToken(GramaticaParser.AUXILIARY, 0); }
		public AdppContext adpp() {
			return getRuleContext(AdppContext.class,0);
		}
		public Nvp_aux_verbpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nvp_aux_verbp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNvp_aux_verbp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNvp_aux_verbp(this);
		}
	}

	public final Nvp_aux_verbpContext nvp_aux_verbp() throws RecognitionException {
		Nvp_aux_verbpContext _localctx = new Nvp_aux_verbpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nvp_aux_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			nounp_l();
			setState(155);
			match(AUXILIARY);
			setState(156);
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
		enterRule(_localctx, 34, RULE_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public Nounp_lContext nounp_l() {
			return getRuleContext(Nounp_lContext.class,0);
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
		enterRule(_localctx, 36, RULE_noun_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SCONJUNCTION);
			setState(161);
			nounp_l();
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
		public Adp_nounpContext adp_nounp() {
			return getRuleContext(Adp_nounpContext.class,0);
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
		enterRule(_localctx, 38, RULE_nounp);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				adj_nounp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				naked_nounp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				adp_nounp();
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
	public static class Nounp_lContext extends ParserRuleContext {
		public NounpContext nounp() {
			return getRuleContext(NounpContext.class,0);
		}
		public Nounp_tContext nounp_t() {
			return getRuleContext(Nounp_tContext.class,0);
		}
		public Nounp_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounp_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNounp_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNounp_l(this);
		}
	}

	public final Nounp_lContext nounp_l() throws RecognitionException {
		Nounp_lContext _localctx = new Nounp_lContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nounp_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			nounp();
			setState(169);
			nounp_t();
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
	public static class Nounp_tContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GramaticaParser.COMMA, 0); }
		public NounpContext nounp() {
			return getRuleContext(NounpContext.class,0);
		}
		public Nounp_tContext nounp_t() {
			return getRuleContext(Nounp_tContext.class,0);
		}
		public TerminalNode CCONJUNCTION() { return getToken(GramaticaParser.CCONJUNCTION, 0); }
		public Nounp_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounp_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNounp_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNounp_t(this);
		}
	}

	public final Nounp_tContext nounp_t() throws RecognitionException {
		Nounp_tContext _localctx = new Nounp_tContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nounp_t);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(COMMA);
				setState(172);
				nounp();
				setState(173);
				nounp_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(CCONJUNCTION);
				setState(176);
				nounp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		enterRule(_localctx, 44, RULE_naked_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			determiner();
			setState(181);
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
		public F_adj_nounpContext f_adj_nounp() {
			return getRuleContext(F_adj_nounpContext.class,0);
		}
		public L_adj_nounpContext l_adj_nounp() {
			return getRuleContext(L_adj_nounpContext.class,0);
		}
		public Lf_adj_nounpContext lf_adj_nounp() {
			return getRuleContext(Lf_adj_nounpContext.class,0);
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
		enterRule(_localctx, 46, RULE_adj_nounp);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				f_adj_nounp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				l_adj_nounp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				lf_adj_nounp();
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
	public static class F_adj_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Adjective_lContext adjective_l() {
			return getRuleContext(Adjective_lContext.class,0);
		}
		public F_adj_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_adj_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterF_adj_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitF_adj_nounp(this);
		}
	}

	public final F_adj_nounpContext f_adj_nounp() throws RecognitionException {
		F_adj_nounpContext _localctx = new F_adj_nounpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_f_adj_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			determiner();
			setState(189);
			noun();
			setState(190);
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
	public static class L_adj_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public L_adj_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_adj_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterL_adj_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitL_adj_nounp(this);
		}
	}

	public final L_adj_nounpContext l_adj_nounp() throws RecognitionException {
		L_adj_nounpContext _localctx = new L_adj_nounpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_l_adj_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			determiner();
			setState(193);
			adjective();
			setState(194);
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
	public static class Lf_adj_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Adjective_lContext adjective_l() {
			return getRuleContext(Adjective_lContext.class,0);
		}
		public Lf_adj_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lf_adj_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLf_adj_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLf_adj_nounp(this);
		}
	}

	public final Lf_adj_nounpContext lf_adj_nounp() throws RecognitionException {
		Lf_adj_nounpContext _localctx = new Lf_adj_nounpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lf_adj_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			determiner();
			setState(197);
			adjective();
			setState(198);
			noun();
			setState(199);
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
	public static class Adp_nounpContext extends ParserRuleContext {
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public AdppContext adpp() {
			return getRuleContext(AdppContext.class,0);
		}
		public Adp_nounpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adp_nounp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdp_nounp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdp_nounp(this);
		}
	}

	public final Adp_nounpContext adp_nounp() throws RecognitionException {
		Adp_nounpContext _localctx = new Adp_nounpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_adp_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			determiner();
			setState(202);
			noun();
			setState(203);
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
	public static class AdppContext extends ParserRuleContext {
		public S_adppContext s_adpp() {
			return getRuleContext(S_adppContext.class,0);
		}
		public L_adppContext l_adpp() {
			return getRuleContext(L_adppContext.class,0);
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
		enterRule(_localctx, 56, RULE_adpp);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				s_adpp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				l_adpp();
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
	public static class S_adppContext extends ParserRuleContext {
		public Noun_adppContext noun_adpp() {
			return getRuleContext(Noun_adppContext.class,0);
		}
		public Adv_adppContext adv_adpp() {
			return getRuleContext(Adv_adppContext.class,0);
		}
		public Verb_adppContext verb_adpp() {
			return getRuleContext(Verb_adppContext.class,0);
		}
		public S_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterS_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitS_adpp(this);
		}
	}

	public final S_adppContext s_adpp() throws RecognitionException {
		S_adppContext _localctx = new S_adppContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_s_adpp);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				noun_adpp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				adv_adpp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				verb_adpp();
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
	public static class Noun_adppContext extends ParserRuleContext {
		public TerminalNode ADPOSITION() { return getToken(GramaticaParser.ADPOSITION, 0); }
		public Adj_nounpContext adj_nounp() {
			return getRuleContext(Adj_nounpContext.class,0);
		}
		public Naked_nounpContext naked_nounp() {
			return getRuleContext(Naked_nounpContext.class,0);
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
		enterRule(_localctx, 60, RULE_noun_adpp);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ADPOSITION);
				setState(215);
				adj_nounp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ADPOSITION);
				setState(217);
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
	public static class Adv_adppContext extends ParserRuleContext {
		public TerminalNode ADPOSITION() { return getToken(GramaticaParser.ADPOSITION, 0); }
		public TerminalNode ADVERB() { return getToken(GramaticaParser.ADVERB, 0); }
		public Adv_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adv_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAdv_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAdv_adpp(this);
		}
	}

	public final Adv_adppContext adv_adpp() throws RecognitionException {
		Adv_adppContext _localctx = new Adv_adppContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_adv_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ADPOSITION);
			setState(221);
			match(ADVERB);
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
	public static class Verb_adppContext extends ParserRuleContext {
		public TerminalNode ADPOSITION() { return getToken(GramaticaParser.ADPOSITION, 0); }
		public TerminalNode VERB() { return getToken(GramaticaParser.VERB, 0); }
		public Verb_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerb_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerb_adpp(this);
		}
	}

	public final Verb_adppContext verb_adpp() throws RecognitionException {
		Verb_adppContext _localctx = new Verb_adppContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_verb_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ADPOSITION);
			setState(224);
			match(VERB);
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
	public static class L_adppContext extends ParserRuleContext {
		public S_adppContext s_adpp() {
			return getRuleContext(S_adppContext.class,0);
		}
		public Lt_adppContext lt_adpp() {
			return getRuleContext(Lt_adppContext.class,0);
		}
		public L_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterL_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitL_adpp(this);
		}
	}

	public final L_adppContext l_adpp() throws RecognitionException {
		L_adppContext _localctx = new L_adppContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_l_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			s_adpp();
			setState(227);
			lt_adpp();
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
	public static class Lt_adppContext extends ParserRuleContext {
		public S_adppContext s_adpp() {
			return getRuleContext(S_adppContext.class,0);
		}
		public Lt_adppContext lt_adpp() {
			return getRuleContext(Lt_adppContext.class,0);
		}
		public Lt_adppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt_adpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLt_adpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLt_adpp(this);
		}
	}

	public final Lt_adppContext lt_adpp() throws RecognitionException {
		Lt_adppContext _localctx = new Lt_adppContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lt_adpp);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADPOSITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				s_adpp();
				setState(230);
				lt_adpp();
				}
				break;
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case ADJECTIVE:
			case COMMA:
			case PERIOD:
			case VERB:
			case ADVERB:
			case AUXILIARY:
			case CCONJUNCTION:
			case SCONJUNCTION:
			case NUM:
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
		enterRule(_localctx, 70, RULE_adjective_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			adjective();
			setState(236);
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
		enterRule(_localctx, 72, RULE_adjective_t);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				adjective();
				setState(239);
				adjective_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode ADJECTIVE() { return getToken(GramaticaParser.ADJECTIVE, 0); }
		public TerminalNode ADVERB() { return getToken(GramaticaParser.ADVERB, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
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
		enterRule(_localctx, 74, RULE_adjective);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ADJECTIVE);
				}
				break;
			case ADVERB:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(ADVERB);
				setState(246);
				match(ADJECTIVE);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(NUM);
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
		enterRule(_localctx, 76, RULE_determiner);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(DETERMINER);
				}
				break;
			case PROPERNOUN:
			case NOUN:
			case ADJECTIVE:
			case ADVERB:
			case NUM:
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
		enterRule(_localctx, 78, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 80, RULE_verb);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(VERB);
				}
				break;
			case PRONOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(PRONOUN);
				setState(258);
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
		"\u0004\u0001\u000f\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005p\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006v\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007{\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n\u0084\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0090\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00a7\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00b3\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00bb\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u00d0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u00d5\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u00db\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u00ea\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u00f3"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u00f9\b%\u0001&\u0001&\u0003&\u00fd"+
		"\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u0104\b(\u0001(\u0000"+
		"\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0001\u0001\u0000\u0003"+
		"\u0004\u00f6\u0000R\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000"+
		"\u0004[\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\b`\u0001"+
		"\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012~"+
		"\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0085"+
		"\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008f"+
		"\u0001\u0000\u0000\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e\u0095"+
		"\u0001\u0000\u0000\u0000 \u009a\u0001\u0000\u0000\u0000\"\u009e\u0001"+
		"\u0000\u0000\u0000$\u00a0\u0001\u0000\u0000\u0000&\u00a6\u0001\u0000\u0000"+
		"\u0000(\u00a8\u0001\u0000\u0000\u0000*\u00b2\u0001\u0000\u0000\u0000,"+
		"\u00b4\u0001\u0000\u0000\u0000.\u00ba\u0001\u0000\u0000\u00000\u00bc\u0001"+
		"\u0000\u0000\u00002\u00c0\u0001\u0000\u0000\u00004\u00c4\u0001\u0000\u0000"+
		"\u00006\u00c9\u0001\u0000\u0000\u00008\u00cf\u0001\u0000\u0000\u0000:"+
		"\u00d4\u0001\u0000\u0000\u0000<\u00da\u0001\u0000\u0000\u0000>\u00dc\u0001"+
		"\u0000\u0000\u0000@\u00df\u0001\u0000\u0000\u0000B\u00e2\u0001\u0000\u0000"+
		"\u0000D\u00e9\u0001\u0000\u0000\u0000F\u00eb\u0001\u0000\u0000\u0000H"+
		"\u00f2\u0001\u0000\u0000\u0000J\u00f8\u0001\u0000\u0000\u0000L\u00fc\u0001"+
		"\u0000\u0000\u0000N\u00fe\u0001\u0000\u0000\u0000P\u0103\u0001\u0000\u0000"+
		"\u0000RS\u0003\u0002\u0001\u0000S\u0001\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0006\u0003\u0000UV\u0003\u0004\u0002\u0000V\u0003\u0001\u0000\u0000"+
		"\u0000WX\u0003\u0006\u0003\u0000XY\u0003\u0004\u0002\u0000Y\\\u0001\u0000"+
		"\u0000\u0000Z\\\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0003\b\u0004\u0000"+
		"^_\u0005\u0007\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`a\u0003\f\u0006"+
		"\u0000ab\u0003\n\u0005\u0000b\t\u0001\u0000\u0000\u0000cd\u0003\f\u0006"+
		"\u0000de\u0003\n\u0005\u0000ep\u0001\u0000\u0000\u0000fg\u0005\u0006\u0000"+
		"\u0000gh\u0003\f\u0006\u0000hi\u0003\n\u0005\u0000ip\u0001\u0000\u0000"+
		"\u0000jk\u0005\f\u0000\u0000kl\u0003\f\u0006\u0000lm\u0003\n\u0005\u0000"+
		"mp\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000"+
		"\u0000of\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qv\u0003\u000e\u0007\u0000"+
		"rs\u0003\u000e\u0007\u0000st\u0003\"\u0011\u0000tv\u0001\u0000\u0000\u0000"+
		"uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000"+
		"\u0000w{\u0003\u0010\b\u0000x{\u0003\u0014\n\u0000y{\u0003\u001a\r\u0000"+
		"zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0003\u0012\t\u0000}\u0011\u0001"+
		"\u0000\u0000\u0000~\u007f\u0003P(\u0000\u007f\u0080\u00038\u001c\u0000"+
		"\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0084\u0003\u0016\u000b\u0000"+
		"\u0082\u0084\u0003\u0018\f\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0003(\u0014\u0000\u0086\u0087\u0003P(\u0000\u0087\u0088\u0003"+
		"(\u0014\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0003P("+
		"\u0000\u008a\u008b\u0003(\u0014\u0000\u008b\u0019\u0001\u0000\u0000\u0000"+
		"\u008c\u0090\u0003\u001c\u000e\u0000\u008d\u0090\u0003\u001e\u000f\u0000"+
		"\u008e\u0090\u0003 \u0010\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u001b\u0001\u0000\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093"+
		"\u0005\u0005\u0000\u0000\u0093\u0094\u0003(\u0014\u0000\u0094\u001d\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096\u0097\u0003("+
		"\u0014\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098\u0099\u0005\b\u0000"+
		"\u0000\u0099\u001f\u0001\u0000\u0000\u0000\u009a\u009b\u0003(\u0014\u0000"+
		"\u009b\u009c\u0005\n\u0000\u0000\u009c\u009d\u00038\u001c\u0000\u009d"+
		"!\u0001\u0000\u0000\u0000\u009e\u009f\u0003$\u0012\u0000\u009f#\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\r\u0000\u0000\u00a1\u00a2\u0003("+
		"\u0014\u0000\u00a2%\u0001\u0000\u0000\u0000\u00a3\u00a7\u0003.\u0017\u0000"+
		"\u00a4\u00a7\u0003,\u0016\u0000\u00a5\u00a7\u00036\u001b\u0000\u00a6\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\'\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003"+
		"&\u0013\u0000\u00a9\u00aa\u0003*\u0015\u0000\u00aa)\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ad\u0003&\u0013\u0000"+
		"\u00ad\u00ae\u0003*\u0015\u0000\u00ae\u00b3\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\f\u0000\u0000\u00b0\u00b3\u0003&\u0013\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b2\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3+\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0003L&\u0000\u00b5\u00b6\u0003N\'\u0000"+
		"\u00b6-\u0001\u0000\u0000\u0000\u00b7\u00bb\u00030\u0018\u0000\u00b8\u00bb"+
		"\u00032\u0019\u0000\u00b9\u00bb\u00034\u001a\u0000\u00ba\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb/\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003L&\u0000"+
		"\u00bd\u00be\u0003N\'\u0000\u00be\u00bf\u0003F#\u0000\u00bf1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0003L&\u0000\u00c1\u00c2\u0003J%\u0000\u00c2"+
		"\u00c3\u0003N\'\u0000\u00c33\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"L&\u0000\u00c5\u00c6\u0003J%\u0000\u00c6\u00c7\u0003N\'\u0000\u00c7\u00c8"+
		"\u0003F#\u0000\u00c85\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003L&\u0000"+
		"\u00ca\u00cb\u0003N\'\u0000\u00cb\u00cc\u00038\u001c\u0000\u00cc7\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0003:\u001d\u0000\u00ce\u00d0\u0003B!"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d09\u0001\u0000\u0000\u0000\u00d1\u00d5\u0003<\u001e\u0000\u00d2"+
		"\u00d5\u0003>\u001f\u0000\u00d3\u00d5\u0003@ \u0000\u00d4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5;\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u000b"+
		"\u0000\u0000\u00d7\u00db\u0003.\u0017\u0000\u00d8\u00d9\u0005\u000b\u0000"+
		"\u0000\u00d9\u00db\u0003,\u0016\u0000\u00da\u00d6\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db=\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u000b\u0000\u0000\u00dd\u00de\u0005\t\u0000\u0000\u00de?"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u000b\u0000\u0000\u00e0\u00e1"+
		"\u0005\b\u0000\u0000\u00e1A\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		":\u001d\u0000\u00e3\u00e4\u0003D\"\u0000\u00e4C\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0003:\u001d\u0000\u00e6\u00e7\u0003D\"\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00eaE\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0003J%\u0000\u00ec\u00ed\u0003H$\u0000"+
		"\u00edG\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003J%\u0000\u00ef\u00f0"+
		"\u0003H$\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3I\u0001\u0000\u0000\u0000\u00f4\u00f9\u0005\u0005\u0000"+
		"\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f9\u0005\u0005\u0000\u0000"+
		"\u00f7\u00f9\u0005\u000e\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9K\u0001\u0000\u0000\u0000\u00fa\u00fd\u0005\u0002\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fdM\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0007\u0000\u0000\u0000\u00ffO\u0001\u0000\u0000\u0000\u0100\u0104\u0005"+
		"\b\u0000\u0000\u0101\u0102\u0005\u0001\u0000\u0000\u0102\u0104\u0005\b"+
		"\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104Q\u0001\u0000\u0000\u0000\u0011[ouz\u0083\u008f\u00a6"+
		"\u00b2\u00ba\u00cf\u00d4\u00da\u00e9\u00f2\u00f8\u00fc\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}