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
javac Beer*.java;
cp ../grammars/* ./;
grun Beer program -gui < ../examples/car.bar
rm *.g4 *.interp *.tokens *.class *.ebnf;
rm ../grammars/*.java ../grammars/*.interp ../grammars/*.tokens;
