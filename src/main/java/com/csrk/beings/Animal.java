package com.csrk.beings;

public abstract class Animal {
	
	private int legs;
	
	private boolean hasTail;
	
	public abstract void print();
	
	public abstract void says();

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}
}
