import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.misc.IntervalSet;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import error.*;
import symbol.*;

public class Main {

	public static void main(String[] args) throws Exception {
		parse(args, "");
	}

	public static SymbolTable parse(String[] args, String filepath) throws Exception {

		String inputFile = null;
		if ( args.length>0 ) {
			inputFile = filepath + args[0];
			int endIndex = inputFile.lastIndexOf("/");
			if (endIndex != -1) {
        filepath = inputFile.substring(0, endIndex+1);
    	} else {
				filepath = "";
			}
		}

		InputStream is = System.in;
		if ( inputFile!=null ) {
			System.out.println("Compilando arquivo \"" + inputFile + "\"");
			is = new FileInputStream(inputFile);
		}
		ANTLRInputStream input = new ANTLRInputStream(is);

		/* Lexer */
		AMZ_syntLexer lexer = new AMZ_syntLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(new LexerError());
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		/* Parser */
		AMZ_syntParser parser = new AMZ_syntParser(tokens);
		parser.setErrorHandler(new ErrorStrategy());

		/* Parse Tree */
		ParseTree tree = parser.eval(); // begin parsing at eval rule
		// System.out.println(tree.toStringTree(parser)); // print tree as text
		if (Arrays.asList(args).contains("-gui")) {
			treeGui(parser, tree);
		}

		/* Semantic analysis */
        ParseTreeWalker walker = new ParseTreeWalker();
        AMZSemanticListener semanticListener = new AMZSemanticListener(filepath);
        walker.walk(semanticListener, tree);
				return semanticListener.getSymbolTable();

	}

	public static void treeGui(AMZ_syntParser parser, ParseTree tree) {
		JFrame frame = new JFrame("Tree");
		TreeViewer viewr = new TreeViewer(
			Arrays.asList(parser.getRuleNames()), tree
		);
		viewr.setScale(1.5);
		JPanel panel = new JPanel();
		panel.add(viewr);
		JScrollPane jsp = new JScrollPane(panel);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(jsp);
		frame.setSize(5000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
