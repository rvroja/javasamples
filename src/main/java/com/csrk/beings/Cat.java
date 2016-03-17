package com.csrk.beings;

public class Cat extends Animal implements Pet{
	
	@Override
	public void print(){
		System.out.println("I'm a Cat");
	}

	@Override
	public void says() {
		System.out.println("Meow");
	}

	@Override
	public void tamable() {
		System.out.println("I'm tamable");
		
	}

}
