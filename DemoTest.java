package proj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTest {
	
	Demo tst;
	
	@BeforeEach
	void setup()
	{
		tst = new Demo();
	}
	
	@Test
	void testEmpty() {
		String actual = tst.dropA("");
		assertEquals("",actual);
	}
	
	@Test
	void testSingleWithA() {
		String actual = tst.dropA("A");
		assertEquals("",actual);
	}
	
	@Test
	void testSingleWithoutA() {
		String actual = tst.dropA("B");
		assertEquals("B",actual);
	}
	
	@Test
	void testSDoubleWithBothA() {
		String actual = tst.dropA("AA");
		assertEquals("",actual);
	}
	
	@Test
	void testDoubleleWithFirstA() {
		String actual = tst.dropA("AB");
		assertEquals("B",actual);
	}
	
	@Test
	void testDoubleleWithSecondA() {
		String actual = tst.dropA("BA");
		assertEquals("B",actual);
	}
	
	@Test
	void testNoAInFirstOrSec() {
		String actual = tst.dropA("BCA");
		assertEquals("BCA",actual);
	}
}
