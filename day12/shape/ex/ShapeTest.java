package org.day12.shape.ex;


public class ShapeTest {
	private static TwoDShape arrayOf2DShapes[];
	private static ThreeDShape arrayOf3DShapes[];
	
	public static void main(String[] args) {
		init();
		drawAll();
		init2();
		drawAll2();
	}
	
	
	public static void init() {
		arrayOf2DShapes = new TwoDShape[3];
		arrayOf2DShapes[0] = new Rectangle(2,2);
		arrayOf2DShapes[1] = new Triangle(6,7);
		arrayOf2DShapes[2] = new Circle(5);
	}
	
	private static void drawAll() {
		for (int i = 0; i < arrayOf2DShapes.length; i++) {
			arrayOf2DShapes[i].draw();
			arrayOf2DShapes[i].getArea();
		}
	}
	
	private static void init2() {
		// TODO Auto-generated method stub
		arrayOf3DShapes = new ThreeDShape[3];
		arrayOf3DShapes[0] = new Cylinder(5, 7); 
		arrayOf3DShapes[1] = new Sphere(6); 
		arrayOf3DShapes[2] = new Hexahedron(5, 7, 9); 
	}
	private static void drawAll2() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayOf2DShapes.length; i++) {
			arrayOf3DShapes[i].draw();
			arrayOf3DShapes[i].getVolumn();
		}
	}




}
