// Generated from /Users/joao/Dropbox/ufsc/17.1/compiladores/Cryptolang/src/com/joao/Cryptolang.g4 by ANTLR 4.7
package com.joao;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CryptolangParser}.
 */
public interface CryptolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CryptolangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CryptolangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CryptolangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CryptolangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CryptolangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CryptolangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(CryptolangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(CryptolangParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#func_stat}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stat(CryptolangParser.Func_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#func_stat}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stat(CryptolangParser.Func_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#func_block}.
	 * @param ctx the parse tree
	 */
	void enterFunc_block(CryptolangParser.Func_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#func_block}.
	 * @param ctx the parse tree
	 */
	void exitFunc_block(CryptolangParser.Func_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CryptolangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CryptolangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(CryptolangParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(CryptolangParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(CryptolangParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(CryptolangParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(CryptolangParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(CryptolangParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(CryptolangParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(CryptolangParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#var_stat}.
	 * @param ctx the parse tree
	 */
	void enterVar_stat(CryptolangParser.Var_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#var_stat}.
	 * @param ctx the parse tree
	 */
	void exitVar_stat(CryptolangParser.Var_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stat(CryptolangParser.Assign_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stat(CryptolangParser.Assign_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(CryptolangParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(CryptolangParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CryptolangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CryptolangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void enterCall_stat(CryptolangParser.Call_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void exitCall_stat(CryptolangParser.Call_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(CryptolangParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(CryptolangParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpXor}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpXor(CryptolangParser.ExpXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpXor}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpXor(CryptolangParser.ExpXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpIntv}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpIntv(CryptolangParser.ExpIntvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpIntv}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpIntv(CryptolangParser.ExpIntvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOr}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(CryptolangParser.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOr}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(CryptolangParser.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpAnd}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(CryptolangParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpAnd}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(CryptolangParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpShiftLeft}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpShiftLeft(CryptolangParser.ExpShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpShiftLeft}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpShiftLeft(CryptolangParser.ExpShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpShiftRight}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpShiftRight(CryptolangParser.ExpShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpShiftRight}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpShiftRight(CryptolangParser.ExpShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(CryptolangParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(CryptolangParser.ExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpConcat}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpConcat(CryptolangParser.ExpConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpConcat}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpConcat(CryptolangParser.ExpConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpPower}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPower(CryptolangParser.ExpPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpPower}
	 * labeled alternative in {@link CryptolangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPower(CryptolangParser.ExpPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParen}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpParen(CryptolangParser.ExpParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParen}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpParen(CryptolangParser.ExpParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBin}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpBin(CryptolangParser.ExpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBin}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpBin(CryptolangParser.ExpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpHex}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpHex(CryptolangParser.ExpHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpHex}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpHex(CryptolangParser.ExpHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpId(CryptolangParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpId(CryptolangParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpCall(CryptolangParser.ExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link CryptolangParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpCall(CryptolangParser.ExpCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(CryptolangParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(CryptolangParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptolangParser#intv}.
	 * @param ctx the parse tree
	 */
	void enterIntv(CryptolangParser.IntvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptolangParser#intv}.
	 * @param ctx the parse tree
	 */
	void exitIntv(CryptolangParser.IntvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpSub}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpSub(CryptolangParser.NumberExpSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpSub}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpSub(CryptolangParser.NumberExpSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpNumber}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpNumber(CryptolangParser.NumberExpNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpNumber}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpNumber(CryptolangParser.NumberExpNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpMult}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpMult(CryptolangParser.NumberExpMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpMult}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpMult(CryptolangParser.NumberExpMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpId}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpId(CryptolangParser.NumberExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpId}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpId(CryptolangParser.NumberExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpPlus}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpPlus(CryptolangParser.NumberExpPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpPlus}
	 * labeled alternative in {@link CryptolangParser#number_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpPlus(CryptolangParser.NumberExpPlusContext ctx);
}