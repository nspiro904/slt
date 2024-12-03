// import ANTLR's runtime libraries
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//YOU ARE NOT REQUIRED TO MODIFY THIS CLASS

public class Driver {
	
	public static void main(String[] args) throws Exception {

		ANTLRInputStream input = new ANTLRInputStream(System.in);
		GramaticaLexer lexer = new GramaticaLexer(input);

	}
}
