parser grammar BeerParser;

options {
    tokenVocab=BeerLexer;
    superClass=BeerBaseParser;
}

program
    : sourceElements? EOF
    ;

sourceElements
    : OpenBracket
    ;
