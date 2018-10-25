package beer;

import beer.compiler.errors.BeerErrors;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import beer.compiler.BeerLexer;
import beer.compiler.BeerParser;
import beer.compiler.BeerSemantic;
import beer.compiler.errors.BeerLexerError;
import beer.compiler.SymbolTable;

public class Main {
    public static String basePath = "";

    public static void main(String[] args) throws Exception {
        parse(args, null);
    }

    public static SymbolTable parse(String[] args, String path) throws Exception {
        InputStream stream;
        CharStream input;

        if (path != null) {
            input = CharStreams.fromFileName(path);
        } else {
            String currentPath = Paths.get("").toAbsolutePath().toString();
            String[] basePath_ = args[0].split("/");
            for (int i = 0; i < basePath_.length - 1; ++i) {
                basePath += basePath_[i] + "/";
            }

            String lines = "";
            String fileName = basePath_[basePath_.length-1];
            basePath = currentPath + "/" + basePath;
            File file = new File(basePath + "/" + fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                lines += " " + sc.next();
            }

            stream = new ByteArrayInputStream(lines.getBytes(StandardCharsets.UTF_8));
            input = CharStreams.fromStream(stream, StandardCharsets.UTF_8);
        }

        BeerLexer lexer = new BeerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeerParser parser = new BeerParser(tokens);
        parser.removeErrorListener(new BeerLexerError());
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        BeerSemantic semantic = new BeerSemantic(new BeerErrors(false));
        semantic.loadRules(parser);
        walker.walk(semantic, tree);
        //System.out.println(tree.toStringTree(parser));

        return semantic.table;
    }
}
