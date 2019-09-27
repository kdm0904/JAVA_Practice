package org.day12.shape.ex;

public class Rectangle extends TwoDShape{
	private int width, height;
	private double pi = 3.14;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void getArea() {
		double recArea = (double)width*(double)height*pi;
		System.out.println("타원의 넓이 : "+recArea);
	}
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
