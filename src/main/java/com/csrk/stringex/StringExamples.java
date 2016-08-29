package com.csrk.stringex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringExamples {
	
	public static final Logger LOG = LoggerFactory.getLogger(StringExamples.class);
	String exampleString="thisExampleString";
	String anotherString="anotherExampleString";
	String exampleStringWithSpaces=" thisExampleString ";
	
	String exampleStringUpperCase="THISEXAMPLESTRING";
	
	public void runStringExamples(){
		
		LOG.debug
		("exampleString equals anotherString: "+ exampleString.equals(anotherString));
		
		LOG.debug
		("exampleString equals exampleString: "+ exampleString.equals(exampleString));
		
		LOG.debug
		("exampleString compared to anotherString: "+ exampleString.compareTo(anotherString));
		
		LOG.debug
		("exampleString compared to exampleString: "+ 
					exampleString.compareTo(exampleString));
		
		LOG.debug
		("exampleString compareto exampleStringUppercase: "+ 
					exampleString.compareTo(exampleStringUpperCase));
		
		LOG.debug
		("exampleString compareIgnoreCase to exampleStringUppercase: "+ 
					exampleString.compareToIgnoreCase(exampleStringUpperCase));

		LOG.debug
		("The length of exampleStringWithSpaces is: "+ exampleStringWithSpaces.length());

		LOG.debug
		("after trimming exampleStringWithSpaces the length: "+ exampleStringWithSpaces.trim().length());
		
		LOG.debug
		("concat example string and another string: "+ exampleString.concat(" and ").concat(anotherString));
		
		LOG.debug
		("Character at  4 in exampleString: "+ exampleString.charAt(4));
		
		LOG.debug
		("Character at 11 in exampleString: "+ exampleString.charAt(11));
		
		LOG.debug
		("substring of exampleString from 4 to 11: "+ exampleString.substring(4, 11));
	}
}