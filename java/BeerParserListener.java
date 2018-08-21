// Generated from BeerParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BeerParser}.
 */
public interface BeerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BeerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BeerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BeerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(BeerParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(BeerParser.SourceElementsContext ctx);
}