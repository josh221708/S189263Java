package parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Parser {

	public List<String> parseArray(String json) throws IOException {
		Lexer2 lexer = new Lexer2(json);
		List<String> list = new ArrayList<>();

		while (true) {
			JsonSymbol symbol = lexer.next();

			if (symbol.symbol == Symbol.STRING) {
				list.add(symbol.value);
			} else if (symbol.symbol == Symbol.CLOSEDSQURE) {
				return list;
			}

			else if (symbol.symbol == Symbol.COMMA) {
				// do nothing		
			} else if (symbol.symbol == Symbol.OPEN_CURLY) {
				// parse object 
			} else if (symbol.symbol == Symbol.OPENSQURE) {
				// parse array
				
			}
			else {
				throw new IOException("not valid json");
			}
		}
	}
		public Map <String,String> parseObject (String json){
			return null;
		}
}
