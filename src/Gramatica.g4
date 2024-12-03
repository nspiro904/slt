grammar Gramatica;

/* Parser rules*/
ind_clause: helper* verb_phrase helper*;

helper: noun_phrase | prep_phrase | sub_clause | adverb | pronoun;

/* types of subclauses */
sub_clause:  sub_comma_noun | sub_connector;
sub_connector: CONNECTOR ind_clause;
sub_comma_noun: ',' noun_phrase;


noun_phrase: article adjective* noun adjective*;



verb_phrase: obj_pronoun* verb;



/* Lexer Rules */
CONNECTOR: 'que' | 'y' | 'porque' | 'además' ;