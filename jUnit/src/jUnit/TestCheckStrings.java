package jUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCheckStrings {

	@Before
	public void setUp() throws Exception {
		System.out.println("About to test the method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test is over");
	}

	@Test
	public final void testIsEqual() {
		CheckStrings cs=new CheckStrings();
		assertTrue(cs.isEqual("loop", "loop"));
		assertFalse(cs.isEqual("loop", "file"));
		
	}

	@Test
	public final void testCheckNull() {
		CheckStrings cs=new CheckStrings();
		assertNull(cs.checkNull(null));
		assertNotNull(cs.checkNull("hill"));
		
		
	}

	@Test
	public final void testReverseString() {
		CheckStrings cs=new CheckStrings();
		assertEquals("trop",cs.reverseString("port"));
		
	}

}
