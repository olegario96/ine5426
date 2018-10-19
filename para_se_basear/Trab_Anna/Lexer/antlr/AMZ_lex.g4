lexer grammar AMZ_lex;

// Binary Operators
GREATER : '>' ;
GREATEREQUAL : '>=' ;
LESS : '<' ;
LESSEQUAL : '<=' ;
EQUAL : '==' ;
NOTEQUAL : '!=' ;


// Arithmetic
ADD : '+' ;
MINUS : '-' ;
STAR : '*' ;
SLASH : '/' ;
MOD : '%' ;


// Logic
NOT : '!' ;
AND : '&&' ;
OR : '||' ;


// Special symbols
LCURLY : '{' ;
RCURLY : '}' ;
LSQUARE : '[' ;
RSQUARE : ']' ;
LPAREN : '(';
RPAREN : ')' ;
EQUALS : '=' ;
SEMICO : ';' ;
DOT : '.';
COMMA : ',';

// Reserved words
WHILE : 'while' ;
FOR : 'for' ;
SWITCH : 'switch' ;
CASE : 'case' ;
DEFAULT: 'default' ;
IF : 'if' ;
ELSE : 'else' ;
BREAK : 'break' ;
RETURN : 'return' ;

// Types
INT : 'int' ;
BOOLEAN : 'boolean' ;
STRING : 'string' ;
DOUBLE : 'double' ;
VOID : 'void' ;
OBJECT: 'object';
TYPE : ( INT | BOOLEAN | STRING | DOUBLE | VOID | OBJECT ) ;


// Skip spaces, tabs, newline, comments
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
SINGLE_LINE_COMMENT : '//' ~[\n]* '\n' -> skip ;
MULTI_LINE_COMMENT : '/*' ( ~'*' | '*'+ ~[*/] )* '*'* '*/' -> skip ;


// Values
fragment DIGIT : [0-9] ;
NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+ ;
TRUE : 'true' ;
FALSE : 'false' ;
STRING_LITERAL : ('"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\' | 'n' | 'r' | 't'))* '"') ;


// Identifiers
fragment LETTER_LOWER : [a-z] ;
fragment LETTER_UPPER : [A-Z] ;
ID : LETTER_LOWER ( LETTER_LOWER | LETTER_UPPER | DIGIT | '_' )* ;


// Used for parsing
ESCAPE_CHAR : '\\' 't' // two char of lookahead needed,
    |   '\\' 'n' ; // due to common left-prefix
