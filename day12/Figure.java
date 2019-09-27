package org.day12;

abstract class Shape {
	int x, y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw();
};

class Rectangle extends Shape {
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
};

class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
};



public class Figure {

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle();
		Circle c1 =  new Circle();
		t1.move(9, 10);
	}

}
