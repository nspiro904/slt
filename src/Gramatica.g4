grammar Gramatica;

/* RULES
    - No optional rules, other than lists and determiners;
 */

/* Parser Rules */
text: sentence_list;
sentence_list: sentence sentence_tail;
sentence_tail : sentence sentence_tail | ;

sentence: verbp_l PERIOD;
verbp_l: verbp verbp_t;
verbp_t: verbp verbp_t | COMMA verbp verbp_t | CCONJUNCTION verbp verbp_t | ;

/* Verb Phrases */

verbp: verb_clause | verb_clause sconjp;
verb_clause: intr_verbp | tra_verbp | aux_verbp;

//Intransitive verb phrases
intr_verbp: adp_intr_verbp;
adp_intr_verbp: verb adpp;

//Transitive verb phrases
tra_verbp: svo_tra_verbp;
svo_tra_verbp: nounp_l verb nounp_l ;

//Auxiliary verb phrases
aux_verbp: van_aux_verbp | nvv_aux_verbp;
van_aux_verbp: AUXILIARY ADJECTIVE nounp_l;  //van = verb adj noun
nvv_aux_verbp: ADVERB nounp_l AUXILIARY VERB; //I think the tagger must be bugging out labeling 'deliciosa' as a verb, this is to compensate
/* Sub Clauses */
sconjp: noun_sconjp;

noun_sconjp: SCONJUNCTION nounp_l;

/* Noun Phrases */

nounp: adj_nounp | naked_nounp;
nounp_l: nounp nounp_t;
nounp_t: COMMA nounp nounp_t | CCONJUNCTION nounp | ;

naked_nounp: determiner noun;

adj_nounp: adjf_nounp;
adjf_nounp: determiner noun adjective_l;   //adjective final


/* Adpositional Phrases */
adpp: noun_adpp;

noun_adpp: ADPOSITION nounp;


/* Adjective Phrases */
adjective_l: adjective adjective_t;
adjective_t: adjective adjective_t | ;
adjective: ADJECTIVE | ADVERB ADJECTIVE;


//presently determiners are the only things that should be optional
determiner: DETERMINER | ;
noun: PROPERNOUN | NOUN;
verb: VERB | PRONOUN VERB;

/* Lexer Rules */
PRONOUN: [A-Za-zéáíóúüñ]+ [{] 'PRON' [}] ;
DETERMINER:   [A-Za-zéáíóúüñ]+ [{] 'DET' [}];
PROPERNOUN:   [A-Za-zéáíóúüñ]+ [{] 'PROPN' [}];
NOUN:   [A-Za-zéáíóúüñ]+ [{] 'NOUN' [}];
ADJECTIVE: [A-Za-zéáíóúüñ]+ [{] 'ADJ' [}];

COMMA: [,] [{] 'PUNCT' [}];
PERIOD: [.] [{] 'PUNCT' [}];

VERB:  [A-Za-zéáíóúüñ]+ [{] 'VERB' [}];
ADVERB: [A-Za-zéáíóúüñ]+ [{] 'ADV' [}];
AUXILIARY: [A-Za-zéáíóúüñ]+ [{] 'AUX' [}];

ADPOSITION:  [A-Za-zéáíóúüñ]+ [{] 'ADP' [}];
CCONJUNCTION: [A-Za-zéáíóúüñ]+ [{] 'CCONJ' [}];
SCONJUNCTION:  [A-Za-zéáíóúüñ]+ [{] 'SCONJ' [}];

NUM: [A-Za-zéáíóúüñ]+ [{] 'NUM' [}];

WHITESPACE: [\n\t ]+ -> skip;
