package com.parameterizedTest;

public class StringManip {
	
	private String actual;

	public StringManip(String actual) {
		super();
		this.actual = actual;
	}
	
	public String upperCase(){
		return actual.toUpperCase();
		
	}
	public String stringReverse(){
		StringBuilder sb=new StringBuilder(actual);
		return sb.reverse().toString();
	}

}
