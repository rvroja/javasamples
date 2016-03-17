package com.csrk.beings;

public class Dog extends Animal implements Pet{
	
	@Override
	public void print(){
		System.out.println("I'm a Dog");
	}

	@Override
	public void says() {
		System.out.println("Woof");
	}

	@Override
	public void tamable() {
		System.out.println("I'm tamable");
	}

	
}
