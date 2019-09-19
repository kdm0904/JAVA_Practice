package org.day7;

class Calculator2 {

	
	public int add(int x, int y) {
		int add = x+y;
		return add;
	}
	public int sub(int x, int y) {
		int sub = x-y;
		return sub;
	}
	public int mul(int x, int y) {
		int mul = x*y;
		return mul;
	}
	public int div(int x, int y) {
		int div = x/y;
		return div;
	}
	public int modd(int x, int y) {
		int modd = x%y;
		return modd;
	}
	public double add(double x, double y) {
		double add = x+y;
		return add;
	}
	public double sub(double x, double y) {
		double sub = x-y;
		return sub;
	}
	public double mul(double x, double y) {
		double mul = x*y;
		return mul;
	}
	public double div(double x, double y) {
		double div = x/y;
		return div;
	}
	public double modd(double x, double y) {
		double modd = x%y;
		return modd;
	}
	
	
	
}
public class calculatorTest2 {

	public static void main(String[] args) {
		
		Calculator2 cc = new Calculator2();
		
		
		System.out.println("더하기 : " + cc.add(3.5,3));
		System.out.println("빼기 : " + cc.sub(5,3));
		System.out.println("곱하기 : " + cc.mul(2.7,2));
		System.out.println("나누기 : " + cc.div(14.0,6));
		System.out.println("나머지 : " + cc.modd(5,3));
		
	}

}

