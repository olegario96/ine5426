#!/bin/bash

alias antlr4='java -jar ./antlr-4.7.1-complete.jar'
export CLASSPATH=".:/antlr-4.7.1-complete.jar:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'

antlr4 BeerLexer.g4 && antlr4 BeerParser.g4 && javac Beer*.java && grun Beer program -gui;
