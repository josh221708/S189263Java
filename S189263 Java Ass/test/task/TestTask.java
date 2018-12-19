package task;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class TestTask {

	@Test
	public void testadd() throws IOException {
		InstuctionHandler handler = new InstuctionHandler();
		String awnser = handler.instuction("add", "10", "20");
		assertEquals("30", awnser);
	}

	@Test
	public void testmultiply() throws IOException {
		InstuctionHandler handler = new InstuctionHandler();
		String awnser = handler.instuction("multiply", "10", "20");
		assertEquals("200", awnser);
	}

	@Test
	public void testconcat() throws IOException {
		InstuctionHandler handler = new InstuctionHandler();
		String awnser = handler.instuction("concat", "10", "20");
		assertEquals("1020", awnser);
	}

	@Test(expected = IOException.class)
	public void testsubtract() throws IOException {
		InstuctionHandler handler = new InstuctionHandler();
		String awnser = handler.instuction("subtract", "10", "20");

	}
	
	
}
