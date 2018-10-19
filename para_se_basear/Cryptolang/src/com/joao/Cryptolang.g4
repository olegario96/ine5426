
grammar Cryptolang;

/* SINTÁTICO */

file
 : ( NEWLINE | stat )* EOF
 ;

stat
 : if_stat
 | func_stat
 | while_stat
 | for_stat
 | var_stat
 | assign_stat
 | call_stat
 | return_stat
 | print_stat
 ;

block
 : NEWLINE? '{' ( NEWLINE | stat )* '}'
 ;

if_stat
 : IF exp block ( ELIF exp block )* ( ELSE block )? // gera
 ;

func_stat
 : FUNC ID '(' ( param ( ',' param )* )? ')' size func_block
 ;

func_block
 : NEWLINE? '{' ( NEWLINE | stat )* '}'
 ;

param
 : ID size
 ;

while_stat
 : WHILE exp block
 ;

for_stat
 : FOR for_header for_block
 ;

for_block
 : NEWLINE? '{' ( NEWLINE | stat )* '}'
 ;

for_header
 : ID 'in' intv
 ;

var_stat
 : VAR ID size ('=' exp)?
 ;

assign_stat
 : ID intv? '=' exp
 ;

return_stat
 : RETURN exp?
 ;

call
 : ID '(' ( exp ( ',' exp )* )? ')'
 ;

call_stat
 : call
 ;

print_stat
 : PRINT exp
 ;

/* Expressões */

exp
 : '!' exp # ExpNot
 | exp '^' NUMBER # ExpPower
 | exp '<<' NUMBER # ExpShiftLeft
 | exp '>>' NUMBER # ExpShiftRight
 | exp '.' exp # ExpConcat
 | exp 'x' exp # ExpXor
 | exp '&' exp # ExpAnd
 | exp '|' exp # ExpOr
 | exp2 intv? # ExpIntv
 ;

exp2
 : '(' exp ')' # ExpParen
 | BIN # ExpBin
 | HEX # ExpHex
 | ID # ExpId
 | call # ExpCall
 ;

/* Tamanhos, intervalos e expressões numéricas que são usadas nos intervalos */

size
 : '[' NUMBER ']'
 ;

intv
 : '<' number_exp ( ':' number_exp )? '>'
 ;

number_exp
 : number_exp '*' number_exp # NumberExpMult
 | number_exp '+' number_exp # NumberExpPlus
 | number_exp '-' number_exp # NumberExpSub
 | NUMBER # NumberExpNumber
 | ID # NumberExpId
 ;

/* LÉXICO */

/* Palavras reservadas */
IF : 'if' ;
ELIF : 'else if' ;
ELSE : 'else' ;
FUNC : 'fun' ;
FOR : 'for' ;
WHILE : 'while' ;
VAR : 'var' ;
RETURN : 'return' ;
BREAK : 'break' ;
PRINT : 'print' ;

/* Literais */
BIN : '#' ( '0' | '1' )+ ;
HEX : '0x' [abcdefABCDEF0-9]+ ;
NUMBER : [0-9]+ ;

ID : [a-zA-Z_] [a-zA-Z0-9_]* ;

NEWLINE: ('\r'? '\n' ' '*) ;

/* Comentários */
SKIP_
 : ( SPACES | COMMENT ) -> skip
 ;
fragment SPACES
 : [ \t]+
 ;
fragment COMMENT
 : '//' ~[\r\n]*
 ;