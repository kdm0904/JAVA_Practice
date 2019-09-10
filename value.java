package org.day2;

class Calculator {	
	int left;
	int right;
	
	public Calculator () {}
	
	public Calculator (int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int factorial(int left, int right) {
		int i = left;
		int n = 1;
		for (i = left; i < right; i++) {
			n *= i;
		}
		return n;
	}
	
}

public class value {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		
		
		System.out.println(c1.factorial(1, 6));
	}

}
