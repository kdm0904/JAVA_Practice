package org.day12.shape.ex;

public class Sphere extends ThreeDShape{
	private int radius;
	private double pi = 3.14;
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	@Override
	public void getVolumn() {
		double sphVolumn = 4/3*pi*(radius*radius*radius);
		System.out.println("구의 부피 : "+sphVolumn);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sphere Draw");
	}
	
}
