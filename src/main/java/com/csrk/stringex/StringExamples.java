package com.csrk.stringex;

public class StringExamples {
	
	String exampleString="thisExampleString";
	String anotherString="anotherExampleString";
	String exampleStringWithSpaces=" thisExampleString ";
	
	String exampleStringUpperCase="THISEXAMPLESTRING";
	
	public void runStringExamples(){
		
		System.out.println
		("exampleString equals anotherString: "+ exampleString.equals(anotherString));
		
		System.out.println
		("exampleString equals exampleString: "+ exampleString.equals(exampleString));
		
		System.out.println
		("exampleString compared to anotherString: "+ exampleString.compareTo(anotherString));
		
		System.out.println
		("exampleString compared to exampleString: "+ 
					exampleString.compareTo(exampleString));
		
		System.out.println
		("exampleString compareto exampleStringUppercase: "+ 
					exampleString.compareTo(exampleStringUpperCase));
		
		System.out.println
		("exampleString compareIgnoreCase to exampleStringUppercase: "+ 
					exampleString.compareToIgnoreCase(exampleStringUpperCase));

		System.out.println
		("The length of exampleStringWithSpaces is: "+ exampleStringWithSpaces.length());

		System.out.println
		("after trimming exampleStringWithSpaces the length: "+ exampleStringWithSpaces.trim().length());
		
		System.out.println
		("concat example string and another string: "+ exampleString.concat(" and ").concat(anotherString));
		
		System.out.println
		("Character at  4 in exampleString: "+ exampleString.charAt(4));
		
		System.out.println
		("Character at 11 in exampleString: "+ exampleString.charAt(11));
		
		System.out.println
		("substring of exampleString from 4 to 11: "+ exampleString.substring(4, 11));
	}
}