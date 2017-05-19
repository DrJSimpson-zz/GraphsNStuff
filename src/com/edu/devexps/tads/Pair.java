package com.edu.devexps.tads;

public class Pair<T, U> {
	private T xValue;
	private U yValue;
	
	public T getX() {
		return xValue;
	}
	
	public U getY() {
		return yValue;
	}
	
	public void setX(T xValue) {
		this.xValue = xValue;
	}
	
	public void setY(U yValue) {
		this.yValue = yValue;
	}
	
}
