// import ANTLR's runtime libraries
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Arrays;
//YOU ARE NOT REQUIRED TO MODIFY THIS CLASS

public class Driver {
	
	public static void main(String[] args) throws Exception {

		String inputFile = "data/testSentence.txt";

		CoreTagger.tag(inputFile);

		CharStream input = CharStreams.fromFileName("data/out.slt");
		Gramatica lexer = new Gramatica(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		GramaticaParser parser = new GramaticaParser(tokens);

		showTree(parser.text(), parser);
	}

	private static void showTree(ParseTree tree, GramaticaParser parser){

		JFrame frame = new JFrame("Antlr AST");
		JPanel panel = new JPanel();
		TreeViewer viewer = new TreeViewer(Arrays.asList(
				parser.getRuleNames()),tree);
		viewer.setScale(1.5); // Scale a little
		panel.add(viewer);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
