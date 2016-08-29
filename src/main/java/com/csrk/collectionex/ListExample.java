package com.csrk.collectionex;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public void runListExamples(){
		
		List<Integer> exampleList = new ArrayList<Integer>();
		
		exampleList.add(new Integer(5));
		exampleList.add(new Integer(3));
		exampleList.add(new Integer(6));
		exampleList.add(new Integer(2));
		exampleList.add(new Integer(7));
		
		System.out.println("The size of the list is: "+exampleList.size());
		
		System.out.println("The members ");
	}

}
