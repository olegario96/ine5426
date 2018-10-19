grammar AMZ_synt;

import AMZ_lex;

/*
 * ROOT:
 */
eval : import_file* function_block* EOF ;
import_file: IMPORT STRING_LITERAL SEMICO ;

/*
 * COMMON:
 */

declaration : type ID array_position? ; //ok
type : (INT | BOOLEAN | STRING | DOUBLE | VOID | OBJECT) ; //ok
array_position : LSQUARE INTEGER RSQUARE ; //ok

/*
 * EXPRESSION:
 */

// Operator precedence based on c++
unary_arithm_operator : ADD | MINUS ;
unary_bool_operator : NOT ;
arithmetic_binary_op_higher_prec : STAR | SLASH | MOD ;
arithmetic_binary_op_lower_prec : ADD | MINUS ;
comparison_op_higher_prec : GREATER | GREATEREQUAL | LESS | LESSEQUAL ;
comparison_op_lower_prec : EQUAL | NOTEQUAL ;
logic_binary_op_higher_prec : AND ;
logic_binary_op_lower_prec : OR ;

// higher precedence rules come first
expression
  : LPAREN expression RPAREN #ExpParen //ok
  | (value | ID | function_call) array_position? object_id? #ExpExit
  | unary_arithm_operator expression #ExpUnaryArithm //ok
  | unary_bool_operator expression #ExpUnaryBool //ok
  | expression  arithmetic_binary_op_higher_prec   expression #ExpBinArithmH //ok
  | expression  arithmetic_binary_op_lower_prec    expression #ExpBinArithmL //ok
  | expression  comparison_op_higher_prec          expression #ExpBinCompH //ok
  | expression  comparison_op_lower_prec           expression #ExpBinCompL //ok
  | expression  logic_binary_op_higher_prec        expression #ExpBinLogicH //ok
  | expression  logic_binary_op_lower_prec         expression #ExpBinLogicL //ok
  ;


value : DOUBLE_LITERAL | INTEGER | STRING_LITERAL | object_literal | array_literal | boolean_value ; //ok
boolean_value : TRUE | FALSE;
object_id : DOT ID array_position? object_id? ;

function_call : ID (LPAREN arguments RPAREN) ; // ok
arguments : (expression (COMMA expression)*)? ; // ok

object_literal : LCURLY (object_element (COMMA object_element)*)? RCURLY ;
object_element : declaration COLON expression ; //ok

array_literal : LSQUARE (expression (COMMA expression)*)? RSQUARE; //ok

/*
 * COMMANDS:
 */

command : simple_command SEMICO | block_command ;
simple_command
  : expression #CmdExp
  | declaration ASSIGN expression #CmdDeclAttrib
  | declaration #CmdDecl
  | ID array_position? object_id? ASSIGN expression #CmdAttrib
  | BREAK #CmdBreak // ok
  | RETURN expression? #CmdReturn // ok
  ;
block_command : while_block | if_block | for_block | switch_block;
command_block : LCURLY command* RCURLY;

while_block : WHILE LPAREN expression RPAREN command_block ; //ok

for_block : FOR LPAREN simple_command? SEMICO expression? SEMICO simple_command? RPAREN command_block ; //ok

if_block : IF LPAREN expression RPAREN command_block
  (ELSE IF LPAREN expression RPAREN command_block)*
  (ELSE command_block)? ; //ok

switch_block : SWITCH LPAREN expression RPAREN
  LCURLY case_block* default_block RCURLY; //ok
case_block : CASE LPAREN expression RPAREN command_block; //ok
default_block : DEFAULT command_block; //ok

//TODO ver se precisa criar regras em func_command_block;
func_command_block : LCURLY command* (RETURN expression?)? RCURLY;
function_block : declaration LPAREN parameters RPAREN func_command_block ;
parameters : (declaration (COMMA declaration)*)? ;
