package com.parameterizedTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringReverseTest {
	
		
		private String datum;
		private String expected;
		


	public StringReverseTest(String datum, String expected) {
			super();
			this.datum = datum;
			this.expected = expected;
		}

	  @Parameterized.Parameters
	 public static Collection<Object[]> generateReverseData()
	 {
		  Object[][]data1= new Object[][]{
			  {"Mayuri","iruyaM"},
			  {"preeti","iteerp"},
			  {"riya","ayir"},
			  {"sneha","ahens"},
			  {"mini","inim"}
		  };
		return Arrays.asList(data1);
		  
	 }
	 

	
	 
	 @Test
	 public final void testNewData() {
			StringManip sm=new StringManip(this.datum);
			String actualResult1=sm.stringReverse();
			assertEquals(actualResult1,this.expected);
		}

	   
		

	}


