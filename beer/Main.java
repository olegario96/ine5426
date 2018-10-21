package beer;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

import compiler.BeerLexer;
import compiler.BeerParser;
import compiler.BeerSemantic;
import compiler.errors.BeerLexerError;
import compiler.SymbolTable;

public class Main {
    public static void main(String[] args) throws Exception {
        parse(args, null);
    }

    public static SymbolTable parse(String[] args, FileInputStream fileStream) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        if (fileStream != null) {
            input = new ANTLRInputStream(fileStream);
        }

        BeerLexer lexer = new BeerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeerParser parser = new BeerParser(tokens);
        parser.removeErrorListener(new BeerLexerError());
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        BeerSemantic semantic = new BeerSemantic();
        walker.walk(semantic, tree);
        return semantic.table;
    }
}
