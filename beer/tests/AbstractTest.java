import beer.compiler.BeerLexer;
import beer.compiler.BeerParser;
import beer.compiler.BeerSemantic;
import beer.compiler.errors.BeerLexerError;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

abstract public class AbstractTest {
    protected BeerSemantic walkAndGetBeerSemantic(String code) throws IOException {
        ParseTree tree = getParseTree(code);
        ParseTreeWalker walker = new ParseTreeWalker();
        BeerSemantic semantic = new BeerSemantic();
        walker.walk(semantic, tree);
        return semantic;
    }

    protected ParseTree getParseTree(String code) throws IOException {
        InputStream stream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream input = new ANTLRInputStream(stream);

        BeerLexer lexer = new BeerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeerParser parser = new BeerParser(tokens);
        parser.removeErrorListener(new BeerLexerError());
        ParseTree tree = parser.program();

        return tree;
    }
}
