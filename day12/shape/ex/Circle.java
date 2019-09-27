package org.day12.shape.ex;

public class Circle extends TwoDShape {
	private int radius;
	private double pi = 3.14;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public void getArea() {
		double cirArea = (double)radius*(double)radius*pi;
		System.out.println("¿øÀÇ ³ÐÀÌ : "+cirArea);
	}
	public void draw() {
		System.out.println("Circle Draw");
	}
}
