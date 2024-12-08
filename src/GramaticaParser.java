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
		RULE_aux_verbp = 12, RULE_van_aux_verbp = 13, RULE_nvv_aux_verbp = 14, 
		RULE_sconjp = 15, RULE_noun_sconjp = 16, RULE_nounp = 17, RULE_nounp_l = 18, 
		RULE_nounp_t = 19, RULE_naked_nounp = 20, RULE_adj_nounp = 21, RULE_adjf_nounp = 22, 
		RULE_adpp = 23, RULE_noun_adpp = 24, RULE_adjective_l = 25, RULE_adjective_t = 26, 
		RULE_adjective = 27, RULE_determiner = 28, RULE_noun = 29, RULE_verb = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "sentence_list", "sentence_tail", "sentence", "verbp_l", "verbp_t", 
			"verbp", "verb_clause", "intr_verbp", "adp_intr_verbp", "tra_verbp", 
			"svo_tra_verbp", "aux_verbp", "van_aux_verbp", "nvv_aux_verbp", "sconjp", 
			"noun_sconjp", "nounp", "nounp_l", "nounp_t", "naked_nounp", "adj_nounp", 
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
			setState(62);
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
			setState(64);
			sentence();
			setState(65);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case VERB:
			case ADVERB:
			case AUXILIARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				sentence();
				setState(68);
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
			setState(73);
			verbp_l();
			setState(74);
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
			setState(76);
			verbp();
			setState(77);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
			case VERB:
			case ADVERB:
			case AUXILIARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				verbp();
				setState(80);
				verbp_t();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(COMMA);
				setState(83);
				verbp();
				setState(84);
				verbp_t();
				}
				break;
			case CCONJUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(CCONJUNCTION);
				setState(87);
				verbp();
				setState(88);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				verb_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				verb_clause();
				setState(95);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				intr_verbp();
				}
				break;
			case DETERMINER:
			case PROPERNOUN:
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				tra_verbp();
				}
				break;
			case ADVERB:
			case AUXILIARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				aux_verbp();
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
			setState(104);
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
			setState(106);
			verb();
			setState(107);
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
			setState(109);
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
			setState(111);
			nounp_l();
			setState(112);
			verb();
			setState(113);
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
		enterRule(_localctx, 24, RULE_aux_verbp);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUXILIARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				van_aux_verbp();
				}
				break;
			case ADVERB:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				nvv_aux_verbp();
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
		enterRule(_localctx, 26, RULE_van_aux_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(AUXILIARY);
			setState(120);
			match(ADJECTIVE);
			setState(121);
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
		enterRule(_localctx, 28, RULE_nvv_aux_verbp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ADVERB);
			setState(124);
			nounp_l();
			setState(125);
			match(AUXILIARY);
			setState(126);
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
		enterRule(_localctx, 30, RULE_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 32, RULE_noun_sconjp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SCONJUNCTION);
			setState(131);
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
		enterRule(_localctx, 34, RULE_nounp);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				adj_nounp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		enterRule(_localctx, 36, RULE_nounp_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			nounp();
			setState(138);
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
		enterRule(_localctx, 38, RULE_nounp_t);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(COMMA);
				setState(141);
				nounp();
				setState(142);
				nounp_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(CCONJUNCTION);
				setState(145);
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
		enterRule(_localctx, 40, RULE_naked_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			determiner();
			setState(150);
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
		enterRule(_localctx, 42, RULE_adj_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 44, RULE_adjf_nounp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			determiner();
			setState(155);
			noun();
			setState(156);
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
		enterRule(_localctx, 46, RULE_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 48, RULE_noun_adpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ADPOSITION);
			setState(161);
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
		enterRule(_localctx, 50, RULE_adjective_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			adjective();
			setState(164);
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
		enterRule(_localctx, 52, RULE_adjective_t);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				adjective();
				setState(167);
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
		enterRule(_localctx, 54, RULE_adjective);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ADJECTIVE);
				}
				break;
			case ADVERB:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(ADVERB);
				setState(174);
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
		enterRule(_localctx, 56, RULE_determiner);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
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
		enterRule(_localctx, 58, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		enterRule(_localctx, 60, RULE_verb);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(VERB);
				}
				break;
			case PRONOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(PRONOUN);
				setState(185);
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
		"\u0004\u0001\u000f\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\fv\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0088\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0094\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00ab\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00b0\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u00b4\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u00bb\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<\u0000\u0001\u0001\u0000\u0003\u0004\u00ac\u0000>\u0001\u0000\u0000"+
		"\u0000\u0002@\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006"+
		"I\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fa\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010"+
		"h\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014m\u0001"+
		"\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018u\u0001\u0000\u0000"+
		"\u0000\u001aw\u0001\u0000\u0000\u0000\u001c{\u0001\u0000\u0000\u0000\u001e"+
		"\u0080\u0001\u0000\u0000\u0000 \u0082\u0001\u0000\u0000\u0000\"\u0087"+
		"\u0001\u0000\u0000\u0000$\u0089\u0001\u0000\u0000\u0000&\u0093\u0001\u0000"+
		"\u0000\u0000(\u0095\u0001\u0000\u0000\u0000*\u0098\u0001\u0000\u0000\u0000"+
		",\u009a\u0001\u0000\u0000\u0000.\u009e\u0001\u0000\u0000\u00000\u00a0"+
		"\u0001\u0000\u0000\u00002\u00a3\u0001\u0000\u0000\u00004\u00aa\u0001\u0000"+
		"\u0000\u00006\u00af\u0001\u0000\u0000\u00008\u00b3\u0001\u0000\u0000\u0000"+
		":\u00b5\u0001\u0000\u0000\u0000<\u00ba\u0001\u0000\u0000\u0000>?\u0003"+
		"\u0002\u0001\u0000?\u0001\u0001\u0000\u0000\u0000@A\u0003\u0006\u0003"+
		"\u0000AB\u0003\u0004\u0002\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0003"+
		"\u0006\u0003\u0000DE\u0003\u0004\u0002\u0000EH\u0001\u0000\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0005\u0007"+
		"\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0003\f\u0006\u0000MN\u0003"+
		"\n\u0005\u0000N\t\u0001\u0000\u0000\u0000OP\u0003\f\u0006\u0000PQ\u0003"+
		"\n\u0005\u0000Q\\\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000ST"+
		"\u0003\f\u0006\u0000TU\u0003\n\u0005\u0000U\\\u0001\u0000\u0000\u0000"+
		"VW\u0005\f\u0000\u0000WX\u0003\f\u0006\u0000XY\u0003\n\u0005\u0000Y\\"+
		"\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[O\u0001\u0000\u0000"+
		"\u0000[R\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]b\u0003\u000e\u0007\u0000"+
		"^_\u0003\u000e\u0007\u0000_`\u0003\u001e\u000f\u0000`b\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000b\r\u0001\u0000"+
		"\u0000\u0000cg\u0003\u0010\b\u0000dg\u0003\u0014\n\u0000eg\u0003\u0018"+
		"\f\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0003\u0012\t\u0000i\u0011"+
		"\u0001\u0000\u0000\u0000jk\u0003<\u001e\u0000kl\u0003.\u0017\u0000l\u0013"+
		"\u0001\u0000\u0000\u0000mn\u0003\u0016\u000b\u0000n\u0015\u0001\u0000"+
		"\u0000\u0000op\u0003$\u0012\u0000pq\u0003<\u001e\u0000qr\u0003$\u0012"+
		"\u0000r\u0017\u0001\u0000\u0000\u0000sv\u0003\u001a\r\u0000tv\u0003\u001c"+
		"\u000e\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0019"+
		"\u0001\u0000\u0000\u0000wx\u0005\n\u0000\u0000xy\u0005\u0005\u0000\u0000"+
		"yz\u0003$\u0012\u0000z\u001b\u0001\u0000\u0000\u0000{|\u0005\t\u0000\u0000"+
		"|}\u0003$\u0012\u0000}~\u0005\n\u0000\u0000~\u007f\u0005\b\u0000\u0000"+
		"\u007f\u001d\u0001\u0000\u0000\u0000\u0080\u0081\u0003 \u0010\u0000\u0081"+
		"\u001f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0084"+
		"\u0003$\u0012\u0000\u0084!\u0001\u0000\u0000\u0000\u0085\u0088\u0003*"+
		"\u0015\u0000\u0086\u0088\u0003(\u0014\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088#\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0003\"\u0011\u0000\u008a\u008b\u0003&\u0013\u0000\u008b"+
		"%\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e"+
		"\u0003\"\u0011\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0094\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0094\u0003\""+
		"\u0011\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\'\u0001\u0000\u0000\u0000\u0095\u0096\u00038\u001c"+
		"\u0000\u0096\u0097\u0003:\u001d\u0000\u0097)\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003,\u0016\u0000\u0099+\u0001\u0000\u0000\u0000\u009a\u009b\u0003"+
		"8\u001c\u0000\u009b\u009c\u0003:\u001d\u0000\u009c\u009d\u00032\u0019"+
		"\u0000\u009d-\u0001\u0000\u0000\u0000\u009e\u009f\u00030\u0018\u0000\u009f"+
		"/\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000\u00a1\u00a2"+
		"\u0003\"\u0011\u0000\u00a21\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003"+
		"6\u001b\u0000\u00a4\u00a5\u00034\u001a\u0000\u00a53\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u00036\u001b\u0000\u00a7\u00a8\u00034\u001a\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"5\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\u0005\u0000\u0000\u00ad\u00ae"+
		"\u0005\t\u0000\u0000\u00ae\u00b0\u0005\u0005\u0000\u0000\u00af\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b07\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0005\u0002\u0000\u0000\u00b2\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b49\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000"+
		"\u0000\u00b6;\u0001\u0000\u0000\u0000\u00b7\u00bb\u0005\b\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00bb\u0005\b\u0000\u0000\u00ba"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"=\u0001\u0000\u0000\u0000\u000bG[afu\u0087\u0093\u00aa\u00af\u00b3\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}