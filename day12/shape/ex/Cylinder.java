package org.day12.shape.ex;

public class Cylinder extends ThreeDShape {
	private int radius, height;
	private double pi = 3.14;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public void getVolumn() {
		double cylVolumn = pi*radius*radius*height;
		System.out.println("원기둥의 부피 : "+cylVolumn);
	}
	
	public void draw() {
		System.out.println("Cylinder Draw");
	}
	
}
