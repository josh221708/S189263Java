package parser;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class TestParser {
@Test
	public void testSingleString () throws IOException {
	Parser parser = new Parser();
	List <String> list = parser.parseArray("[bob]");
	assertEquals (1,list.size());
	assertEquals ("bob",list.get(0));
}
@Test
public void testDoubleString () throws IOException {
Parser parser = new Parser();
List <String> list = parser.parseArray("[bob,abc]");
assertEquals (2,list.size());
assertEquals ("bob",list.get(0));
assertEquals ("abc",list.get(1));
}


}
