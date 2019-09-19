package org.day7;


class Calculator {
	int x;
	int y;
	
	public int add(int add) {
		add = x+y;
		return add;
	}
	public int sub(int sub) {
		sub = x-y;
		return sub;
	}
	public int mul(int mul) {
		mul = x*y;
		return mul;
	}
	public int div(int div) {
		div = x/y;
		return div;
	}
	public int modd(int modd) {
		modd = x%y;
		return modd;
	}
	public int add(double add) {
		add = (int)x+(int)y;
		return (int) add;
	}
	public int sub(double sub) {
		sub = (int)x-(int)y;
		return (int)sub;
	}
	public int mul(double mul) {
		mul = (int)x*(int)y;
		return (int)mul;
	}
	public int div(double div) {
		div = (int)x/(int)y;
		return (int)div;
	}
	public int modd(double modd) {
		modd = (int)x%(int)y;
		return (int)modd;
	}
	
	
	
}
public class calculatorTest {

	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		cc.x=6;
		cc.y=3;
		
		System.out.println("더하기 : " + cc.add(0));
		System.out.println("빼기 : " + cc.sub(0));
		System.out.println("곱하기 : " + cc.mul(0));
		System.out.println("나누기 : " + cc.div(0));
		System.out.println("나머지 : " + cc.modd(0));
		
	}

}
