#!/bin/bash

pwd_=`pwd`
alias antlr4='java -jar ${pwd_}/java/antlr-4.7.1-complete.jar'
export CLASSPATH=":${pwd_}/java/antlr-4.7.1-complete.jar:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'

cd grammars;
antlr4 BeerLexer.g4;
antlr4 BeerParser.g4;
cd ../java;
javac Beer*.java;
cp ../grammars/* ./;
grun Beer program -gui;
rm *.g4 *.interp *.tokens *.class;
rm ../grammars/*.java ../grammars/*.interp ../grammars/*.tokens;
