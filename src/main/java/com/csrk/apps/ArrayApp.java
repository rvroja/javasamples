package com.csrk.apps;

import com.csrk.arrayex.ArrayExample;

public class ArrayApp {

	public static void main(String[] args) {

		int[] numbers = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		try {
			ArrayExample numberArray = new ArrayExample(numbers);

			boolean firstStep = false;
			boolean secondStep = false;
			boolean thirdStep = false;
			
			int i = numberArray.getMember(1);
			if(i==4){
				System.out.println("first step passed");
				firstStep =true;
			}
			i = numberArray.getMember(2);
			if(i==5){
				System.out.println("second step passed");
				secondStep =true;
			}			
			i=numberArray.getMember(4);
			if(i==1){
				System.out.println("third step passed");
				thirdStep =true;
			}
			
			if(firstStep && secondStep && thirdStep){
				System.out.println("Test case passed");
			}else{
				System.out.println("test case failed");
			}
			
			numberArray.showNumbers();

			System.out.println("The index where the number is: " + numberArray.getNumber(3));

			System.out.println("The sorted numbers are: ");
			numberArray.sortNumbers();

		} catch (ArrayIndexOutOfBoundsException exp) {
			System.out.println("Hey buddy you tried to go over the limit ");
		}

	}

}
