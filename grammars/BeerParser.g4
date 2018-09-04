parser grammar BeerParser;

options {
    tokenVocab=BeerLexer;
    superClass=BeerBaseParser;
}

program
    : import* (initClass | begin)? EOF
    ;

import 
    : Import StringLiteral SemiColon
    ;

initClass 
    : Class Identifier OpenBrace command* CloseBrace
    ;

begin 
    : MainInit command* MainFinish
    ;

command
    : simpleCommand 
    | newObjectDec 
    | newObjectInit 
    | while 
    | if 
    | for 
    | switch 
    | print 
    | read 
    | try
    | function
    | (Break | Return expression | Return value) SemiColon
    ;

simpleCommand
    : expression SemiColon 
    | declaration Assign expression SemiColon 
    | declaration SemiColon
    | Identifier (Assign | MultiplyAssign | DivideAssign | ModulusAssign | PlusAssign | MinusAssign) expression SemiColon
    ;

# PARAMOS AQUI
function
    :  Function (type | typeArray) OpenParent parameters CloseParent OpenBrace command* CloseBrace

parameters
    :  ((declaration',')*declaration)?

declaration
    :  type Identifier 
    |  typeArray Identifier
    ;

newObjectDec
    :  Identifier Identifier

newObjectInit::= Identifier '=' 'nova no mercado' Identifier '(' ((Identifier ',')*Identifier)? ')' 

inicialize
    :  declaration '=' Value ';'

identifier
    :  [a-z]+[a-zA-Z0-9_]*

type
    : Int
    | Float
    | Boolean
    | String
    ;

typeArray
    : Array LessThan type MoreThan
    ;

expression
    : unary OpenBrace expression CloseBrace 
    | Expression Binary Expression 
    | '('Expression')' 
    | FunctionCall 
    | Value 
    | Identifier

unary
    : Not
    ;

Binary
    :  Signal | '*' | '/' | '%' | '>' | '<' | '>=' | '<=' | '==' | '!=' | '&&' | '||'

FunctionCall
    :  Identifier '(' ((Identifier ',')*Identifier)? ')' | Identifier '.' Identifier '(' ((Identifier ',')*Identifier)? ')'

Signal
    :  '+' | '-'

value
    :  DecimalLiteral 
    | BooleanLiteral 
    | StringLiteral
    ;

While
    :  'encher a cara' '(' Expression ')' '{' Command* '}'

For
    :  'tomar todas' '(' SimpleCommand? ';' Expression? ';' SimpleCommand? ')' '{' Command* '}'

Switch
    :  'cardapio' '(' Identifier ')' '{' Case* Default Case* '}'

Case
    :  'opcao' '(' Expression ')' '{' Command* '}'

Default
    :  'brahma' '{' Command* '}'

If
    :  'ta gelada' '(' Expression ')' '?' '{' Command* '}' ('tem certeza' '(' Expression ')' '?' '{' Command* '}')* ( 'ta nao patrao' '{' Command* '}')?

Print
    :  'conta pra gente' '(' StringLiteral ')'

Read
    :  'qual a boa' '(' Identifier ')'

Try
    :  'to cagano de medo' '{' Command* '}' Catch?

Catch
    :  'lei seca' '(' Identifier ')' '{' Command* Throw? '}'

Throw
    :  'deu pt' Expression

Comment 
    :  'fala pa nois' Value* '\n'
