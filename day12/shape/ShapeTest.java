package org.day12.shape;


class Shape {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
	
	public void getArea() {
		
	}
	
}

class Rectangle extends Shape {
	private int width, height;
	private double pi = 3.14;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void getArea() {
		double recArea = (double)width*(double)height*pi;
		System.out.println("Å¸¿øÀÇ ³ÐÀÌ : "+recArea);
	}
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	
}

class Triangle extends Shape {
	private int base, height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public void getArea() {
		int triArea = base*height/2;
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : "+triArea);
	}
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
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



public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		init();
		drawAll();
	}
	
	

	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle(2,2);
		arrayOfShapes[1] = new Triangle(6,7);
		arrayOfShapes[2] = new Circle(5);
	}
	
	private static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
			arrayOfShapes[i].getArea();
		}
	}

}