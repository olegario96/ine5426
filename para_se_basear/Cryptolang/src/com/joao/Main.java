package com.joao;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

class Main {

    public static void main(String[] args) {
        try {
            // le o arquivo ou stdin
            String inputFile = null;
            if (args.length > 0) inputFile = args[0];
            InputStream is = System.in;
            if (inputFile != null) {
                is = new FileInputStream(inputFile);
            }

            // inicializar as classes criadas pelo antlr
            ANTLRInputStream input = new ANTLRInputStream(is);
            CryptolangLexer lexer = new CryptolangLexer(input); // analisador léxico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CryptolangParser parser = new CryptolangParser(tokens); // analisador sintático

//            System.out.println("Análise léxica:");
//            for (Token token : lexer.getAllTokens()) {
//                if (token instanceof CommonToken) {
//                    System.out.println(((CommonToken)token).toString(lexer));
//                } else {
//                    System.out.println(token.toString());
//                }
//            }
//            System.out.println();

            System.out.println("Análise sintática:");
            parser.setBuildParseTree(true); // controi a árvore sintática
            ParseTree tree = parser.file(); // parsa

            // mostra a árvore em formato de texto
            System.out.println("Árvore:");
            System.out.println(tree.toStringTree(parser));
            System.out.println();

            // analisador semântico
            System.out.println("Análise semântica:");
            ParseTreeWalker walker = new ParseTreeWalker();
            CryptolangSemanticListener semantic_listener = new CryptolangSemanticListener(); // analisador semântico
            walker.walk(semantic_listener, tree);
            System.out.println();

            // gerador de código
            System.out.println("LLVM:");
            System.out.println(semantic_listener.getGeneratedCode());

        } catch (Exception e) {
            System.err.println("EXCEÇÃO: " + e.getStackTrace()[0].getClassName() + " - " + e.getStackTrace()[0].getLineNumber());
        }
    }
}
