package org.day12.shape.ex;

public class Hexahedron extends ThreeDShape {
	private int weight,side,height;
	
	public Hexahedron(int weight, int side, int height) {
		this.weight = weight;
		this.side = side;
		this.height = height;
		
	}
	@Override
	public void getVolumn() {
		int hexVolumn = weight*side*height;
		System.out.println("직육면체의 부피 : "+hexVolumn);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Hexahedron Draw");
	}
	
	
}
