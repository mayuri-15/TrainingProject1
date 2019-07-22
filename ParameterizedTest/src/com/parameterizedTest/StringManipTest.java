package com.parameterizedTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringManipTest {
	
	private String datum;
	private String expected;
	
public StringManipTest(String datum, String expected) {
		super();
		this.datum = datum;
		this.expected = expected;
	}


@Parameterized.Parameters
  public static Collection<Object[]> generateData()
  {
	  Object[][]data= new Object[][]{
		  {"Mayuri","MAYURI"},
		  {"mayuri","MAYURI"},
		  {"MAYURI","MAYURI"}
	  };
	return Arrays.asList(data);
	  
  }


  @Test
	public final void testData() {
		StringManip sm=new StringManip(this.datum);
		String actualResult=sm.upperCase();
		assertEquals(actualResult,this.expected);
	}
 

   
	

}
