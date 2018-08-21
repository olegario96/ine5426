parser grammar BeerParser;

options {
    tokenVocab=BeerLexer;
    superClass=BeerBaseParser;
}

program
    : sourceElements+ EOF
    ;

sourceElements
    : MultiLineComment
    | SingleLineComment
    | RegularExpressionLiteral
    | OpenBracket
    | CloseBracket
    | OpenParen
    | CloseParen
    | OpenBrace
    | CloseBrace
    | SemiColon
    | Comma
    | Assign
    | QuestionMark
    | Colon
    | Dot
    | PlusPlus
    | MinusMinus
    | Plus
    | Minus
    | Not
    | Multiply
    | Divide
    | Modulus
    | LessThan
    | MoreThan
    | LessThanEquals
    | GreaterThanEquals
    | Equals_
    | NotEquals
    | And
    | Or
    | MultiplyAssign
    | DivideAssign
    | ModulusAssign
    | PlusAssign
    | MinusAssign
    | NullLiteral
    | BooleanLiteral
    | DecimalLiteral
    | HexIntegerLiteral
    | Break
    | Case
    | Else
    | New
    | Catch
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Function
    | This
    | Default
    | If
    | Throw
    | In
    | Try
    | Class
    | Const
    | Import
    | Static
    | Identifier
    | StringLiteral
    | TemplateStringLiteral
    | WhiteSpaces
    | LineTerminator
    | MainInit
    | MainFinish
    | Int
    | Float
    | Boolean
    | String
    | Array
    | Print
    | Read
    | ElseIf
    | UnexpectedCharacter;
