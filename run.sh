#!/bin/bash

pwd_=`pwd`
#curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
#mkdir -p ${pwd_}/java/
#mv antlr-4.7.1-complete.jar ${pwd_}/java/
alias antlr4='java -jar ${pwd_}/java/antlr-4.7.1-complete.jar'
export CLASSPATH=":${pwd_}/java/antlr-4.7.1-complete.jar:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'

cd grammars;
antlr4 BeerLexer.g4;
antlr4 BeerParser.g4;
cd ../java;
cp ../grammars/*.g4 ./;
cp ../grammars/*.interp ./;
cp ../grammars/*.tokens ./;
cp ../grammars/*.ebnf ./;
find -name "*.java" > sources.txt;
javac @sources.txt

# grun Beer program -gui < ../examples/testes.bar
rm -rf *.g4 *.interp *.tokens *.class *.ebnf;
rm -rf ../grammars/*.java ../grammars/*.interp ../grammars/*.tokens sources.txt;

