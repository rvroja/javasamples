package com.csrk.arrayex;

import java.util.Arrays;

public class ArrayExample {
	
	int [] numbers;
	
	public ArrayExample(int [] numbers){
		this.numbers = numbers;
	}
	
	public void showNumbers(){
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("By Another method");
		
		for (int i : numbers) {
			System.out.println(i);
		}
	}
	
	public int getNumber(int numberToFind){
		
		int index=Arrays.binarySearch(numbers, numberToFind);
		
		return index;
	}
	
	public void sortNumbers(){
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
