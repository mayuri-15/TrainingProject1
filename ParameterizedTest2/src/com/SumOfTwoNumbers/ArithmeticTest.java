package com.SumOfTwoNumbers;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class ArithmeticTest {
	
	private int a;
	private int b;
	private int expected;
	public ArithmeticTest(int expected, int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.expected=expected;
	}
	
	@Parameterized.Parameters

	  public static Collection<Object[]> generateData()
	  {
		  Object[][]data= new Object[][]{
			  {8,3,5},
			  {3,1,2},
			  {4,2,2}
		  };
		return Arrays.asList(data);
		  
	  }
	  
@Test
public final void testData() {
	Arithmetic ar=new Arithmetic();
	assertEquals(expected,ar.sum(a, b));
}
}
