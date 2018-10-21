#!/bin/bash

pwd_=`pwd`
#curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
#mkdir -p ${pwd_}/java/
#mv antlr-4.7.1-complete.jar ${pwd_}/java/
alias antlr4='java -jar ${pwd_}/beer/antlr-4.7.1-complete.jar'
export CLASSPATH=".:${pwd_}/beer/antlr-4.7.1-complete.jar:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'

cd grammars;
antlr4 -no-listener -visitor BeerLexer.g4;
antlr4 -no-listener -visitor BeerParser.g4;
cd ../beer/;
cp ../grammars/*.g4 compiler/;
cp ../grammars/*.interp compiler/;
cp ../grammars/*.tokens compiler/;
cp ../grammars/*.ebnf compiler/;
find -name "*.java" > sources.txt;
javac @sources.txt

# grun Beer program -gui < ../examples/testes.bar
rm -rf *.g4 *.interp *.tokens *.ebnf;
rm -rf ../grammars/*.java ../grammars/*.interp ../grammars/*.tokens sources.txt;

