package eu.hohenegger.clippingsparser.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import eu.hohenegger.clippingsparser.model.Clipping;
import eu.hohenegger.clippingsparser.parser.MyClippingsLexer;
import eu.hohenegger.clippingsparser.parser.MyClippingsParser;

public class ParserHelper {
	private static final String UTF8 = "UTF8";

	static List<Clipping> parse(String file) throws FileNotFoundException,
			IOException, RecognitionException {
		ANTLRReaderStream antlrInputStream = new ANTLRInputStream(
				new FileInputStream(file), UTF8);

		MyClippingsLexer lex = new MyClippingsLexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lex);

		MyClippingsParser parser = new MyClippingsParser(tokens);

		parser.clippings();

		return parser.result;
	}
}
