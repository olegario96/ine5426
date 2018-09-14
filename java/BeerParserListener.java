// Generated from BeerParser.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by {@link BeerParser#importExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(BeerParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#importExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(BeerParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#initClass}.
	 * @param ctx the parse tree
	 */
	void enterInitClass(BeerParser.InitClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#initClass}.
	 * @param ctx the parse tree
	 */
	void exitInitClass(BeerParser.InitClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(BeerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(BeerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(BeerParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(BeerParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(BeerParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(BeerParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(BeerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(BeerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(BeerParser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(BeerParser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BeerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BeerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BeerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BeerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BeerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BeerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#newObjectInit}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectInit(BeerParser.NewObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#newObjectInit}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectInit(BeerParser.NewObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BeerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BeerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(BeerParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(BeerParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BeerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BeerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(BeerParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(BeerParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(BeerParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(BeerParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BeerParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BeerParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BeerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BeerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(BeerParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(BeerParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(BeerParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(BeerParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(BeerParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(BeerParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(BeerParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(BeerParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpression(BeerParser.DefaultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpression(BeerParser.DefaultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(BeerParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(BeerParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BeerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BeerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(BeerParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(BeerParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(BeerParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(BeerParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#catchExpression}.
	 * @param ctx the parse tree
	 */
	void enterCatchExpression(BeerParser.CatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#catchExpression}.
	 * @param ctx the parse tree
	 */
	void exitCatchExpression(BeerParser.CatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(BeerParser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(BeerParser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeerParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BeerParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeerParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BeerParser.CommentContext ctx);
}