// Generated from java-escape by ANTLR 4.11.1
package Assignment1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ArithmeticParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ArithmeticParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ArithmeticParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ArithmeticParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArithmeticParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArithmeticParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ArithmeticParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ArithmeticParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ArithmeticParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ArithmeticParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(ArithmeticParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(ArithmeticParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(ArithmeticParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(ArithmeticParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE(ArithmeticParser.VARIABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE(ArithmeticParser.VARIABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(ArithmeticParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(ArithmeticParser.ParenContext ctx);
}