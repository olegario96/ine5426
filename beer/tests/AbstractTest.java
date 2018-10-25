package beer.tests;

import beer.compiler.BeerLexer;
import beer.compiler.BeerParser;
import beer.compiler.BeerSemantic;
import beer.compiler.errors.BeerErrors;
import beer.compiler.errors.BeerLexerError;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

abstract public class AbstractTest {
    protected BeerSemantic walkAndGetBeerSemantic(String code) throws IOException {
        CharStream input = CharStreams.fromString(code);
        BeerLexer lexer = new BeerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeerParser parser = new BeerParser(tokens);
        parser.removeErrorListener(new BeerLexerError());
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        BeerSemantic semantic = new BeerSemantic(new BeerErrors());
        semantic.loadRules(parser);
        parser.addParseListener(semantic);
        walker.walk(semantic, tree);
        return semantic;

//        code = code.concat("\u001a");

//        parser.addErrorListener(new BeerLexerError());
//        parser.addParseListener(semantic);

    }
}
