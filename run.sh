#!/bin/bash

pwd_=`pwd`
#curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
#mkdir -p ${pwd_}/java/
#mv antlr-4.7.1-complete.jar ${pwd_}/java/
alias antlr4='java -jar ${pwd_}/beer/antlr-4.7.1-complete.jar'
export CLASSPATH=".:${pwd_}/beer/antlr-4.7.1-complete.jar:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'

cd grammars;
antlr4 -package beer.compiler BeerLexer.g4;
antlr4 -package beer.compiler BeerParser.g4;
cd ../beer/;
cp ../grammars/*.g4 compiler/;
cp ../grammars/*.interp compiler/;
cp ../grammars/*.tokens compiler/;
cp ../grammars/*.ebnf compiler/;
cp ../grammars/*.java compiler/;
find -name "*.java" > sources.txt;
javac -Xlint @sources.txt

# grun Beer program -gui < ../examples/testes.bar
find . -name *.g4 -delete;
find . -name *.interp -delete;
find . -name *.tokens -delete;
find . -name *.ebnf -delete;
rm -rf ../grammars/*.java;
rm -rf ../grammars/*.interp;
rm -rf ../grammars/*.tokens;
rm -f sources.txt;
