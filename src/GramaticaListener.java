// Generated from Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(GramaticaParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(GramaticaParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentence_list}.
	 * @param ctx the parse tree
	 */
	void enterSentence_list(GramaticaParser.Sentence_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentence_list}.
	 * @param ctx the parse tree
	 */
	void exitSentence_list(GramaticaParser.Sentence_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentence_tail}.
	 * @param ctx the parse tree
	 */
	void enterSentence_tail(GramaticaParser.Sentence_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentence_tail}.
	 * @param ctx the parse tree
	 */
	void exitSentence_tail(GramaticaParser.Sentence_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verbp_l}.
	 * @param ctx the parse tree
	 */
	void enterVerbp_l(GramaticaParser.Verbp_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verbp_l}.
	 * @param ctx the parse tree
	 */
	void exitVerbp_l(GramaticaParser.Verbp_lContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verbp_t}.
	 * @param ctx the parse tree
	 */
	void enterVerbp_t(GramaticaParser.Verbp_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verbp_t}.
	 * @param ctx the parse tree
	 */
	void exitVerbp_t(GramaticaParser.Verbp_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verbp}.
	 * @param ctx the parse tree
	 */
	void enterVerbp(GramaticaParser.VerbpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verbp}.
	 * @param ctx the parse tree
	 */
	void exitVerbp(GramaticaParser.VerbpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verb_clause}.
	 * @param ctx the parse tree
	 */
	void enterVerb_clause(GramaticaParser.Verb_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verb_clause}.
	 * @param ctx the parse tree
	 */
	void exitVerb_clause(GramaticaParser.Verb_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#intr_verbp}.
	 * @param ctx the parse tree
	 */
	void enterIntr_verbp(GramaticaParser.Intr_verbpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#intr_verbp}.
	 * @param ctx the parse tree
	 */
	void exitIntr_verbp(GramaticaParser.Intr_verbpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adp_intr_verbp}.
	 * @param ctx the parse tree
	 */
	void enterAdp_intr_verbp(GramaticaParser.Adp_intr_verbpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adp_intr_verbp}.
	 * @param ctx the parse tree
	 */
	void exitAdp_intr_verbp(GramaticaParser.Adp_intr_verbpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tra_verbp}.
	 * @param ctx the parse tree
	 */
	void enterTra_verbp(GramaticaParser.Tra_verbpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tra_verbp}.
	 * @param ctx the parse tree
	 */
	void exitTra_verbp(GramaticaParser.Tra_verbpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#svo_tra_verbp}.
	 * @param ctx the parse tree
	 */
	void enterSvo_tra_verbp(GramaticaParser.Svo_tra_verbpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#svo_tra_verbp}.
	 * @param ctx the parse tree
	 */
	void exitSvo_tra_verbp(GramaticaParser.Svo_tra_verbpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sconjp}.
	 * @param ctx the parse tree
	 */
	void enterSconjp(GramaticaParser.SconjpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sconjp}.
	 * @param ctx the parse tree
	 */
	void exitSconjp(GramaticaParser.SconjpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#noun_sconjp}.
	 * @param ctx the parse tree
	 */
	void enterNoun_sconjp(GramaticaParser.Noun_sconjpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#noun_sconjp}.
	 * @param ctx the parse tree
	 */
	void exitNoun_sconjp(GramaticaParser.Noun_sconjpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nounp}.
	 * @param ctx the parse tree
	 */
	void enterNounp(GramaticaParser.NounpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nounp}.
	 * @param ctx the parse tree
	 */
	void exitNounp(GramaticaParser.NounpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#naked_nounp}.
	 * @param ctx the parse tree
	 */
	void enterNaked_nounp(GramaticaParser.Naked_nounpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#naked_nounp}.
	 * @param ctx the parse tree
	 */
	void exitNaked_nounp(GramaticaParser.Naked_nounpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adj_nounp}.
	 * @param ctx the parse tree
	 */
	void enterAdj_nounp(GramaticaParser.Adj_nounpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adj_nounp}.
	 * @param ctx the parse tree
	 */
	void exitAdj_nounp(GramaticaParser.Adj_nounpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adjf_nounp}.
	 * @param ctx the parse tree
	 */
	void enterAdjf_nounp(GramaticaParser.Adjf_nounpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adjf_nounp}.
	 * @param ctx the parse tree
	 */
	void exitAdjf_nounp(GramaticaParser.Adjf_nounpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adpp}.
	 * @param ctx the parse tree
	 */
	void enterAdpp(GramaticaParser.AdppContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adpp}.
	 * @param ctx the parse tree
	 */
	void exitAdpp(GramaticaParser.AdppContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#noun_adpp}.
	 * @param ctx the parse tree
	 */
	void enterNoun_adpp(GramaticaParser.Noun_adppContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#noun_adpp}.
	 * @param ctx the parse tree
	 */
	void exitNoun_adpp(GramaticaParser.Noun_adppContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adjective_l}.
	 * @param ctx the parse tree
	 */
	void enterAdjective_l(GramaticaParser.Adjective_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adjective_l}.
	 * @param ctx the parse tree
	 */
	void exitAdjective_l(GramaticaParser.Adjective_lContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adjective_t}.
	 * @param ctx the parse tree
	 */
	void enterAdjective_t(GramaticaParser.Adjective_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adjective_t}.
	 * @param ctx the parse tree
	 */
	void exitAdjective_t(GramaticaParser.Adjective_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(GramaticaParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(GramaticaParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#determiner}.
	 * @param ctx the parse tree
	 */
	void enterDeterminer(GramaticaParser.DeterminerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#determiner}.
	 * @param ctx the parse tree
	 */
	void exitDeterminer(GramaticaParser.DeterminerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(GramaticaParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(GramaticaParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(GramaticaParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(GramaticaParser.VerbContext ctx);
}