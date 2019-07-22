package jUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	@Before
	public void setUp() throws Exception {
		System.out.println("About to test the method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test is over");
	}

	@Test
	public final void testAdd() {
		
		Calculator c=new Calculator();
		assertEquals(30,c.add(20, 10));
		
	}
	@Test
	public final void testSub() {
		
		Calculator c=new Calculator();
		assertEquals(10,c.sub(20, 10));
	
	}

}
