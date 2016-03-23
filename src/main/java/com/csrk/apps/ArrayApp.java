package com.csrk.apps;

import com.csrk.arrayex.ArrayExample;

public class ArrayApp {
	
	public static void main(String [] args){
		
		int [] numbers = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		ArrayExample numberArray = new ArrayExample(numbers);
		
		numberArray.showNumbers();
		
		System.out.println("The index where the number is: "+numberArray.getNumber(5));
		
		System.out.println("The sorted numbers are: ");
		numberArray.sortNumbers();
		
	}

}
