import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import compiler.BeerLexer;
import compiler.BeerParser;
import compiler.errors.BeerLexerError;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("ola");
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        BeerLexer lexer = new BeerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeerParser parser = new BeerParser(tokens);
        parser.removeErrorListener(new BeerLexerError());
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
    }
}
