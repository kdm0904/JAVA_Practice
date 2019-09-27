package org.day12.shape.ex;

public class Triangle extends TwoDShape{
	private int base, height;
		
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
		
	public void getArea() {
		int triArea = base*height/2;
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : "+triArea);
	}
		
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
