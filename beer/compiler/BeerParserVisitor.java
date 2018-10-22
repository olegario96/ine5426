package beer.compiler;

// Generated from BeerParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BeerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BeerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BeerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BeerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#importExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpression(BeerParser.ImportExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#initClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitClass(BeerParser.InitClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(BeerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(BeerParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(BeerParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BeerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#simpleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCommand(BeerParser.SimpleCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BeerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(BeerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BeerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#newObjectInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectInit(BeerParser.NewObjectInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BeerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#typeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(BeerParser.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(BeerParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BeerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#initArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArray(BeerParser.InitArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(BeerParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BeerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BeerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(BeerParser.WhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(BeerParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(BeerParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(BeerParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#defaultExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpression(BeerParser.DefaultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(BeerParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BeerParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(BeerParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(BeerParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#catchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchExpression(BeerParser.CatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(BeerParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeerParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(BeerParser.CommentContext ctx);
}
