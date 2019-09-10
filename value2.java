package org.day2;


class secondCalculator extends Calculator {
	public int allSum(int left, int right) {
		int n = 0;
		int i = left;
		for (i = left; i < right; i++) {
			n += i;
		}
		return n;
	}
}

public class value2 {

	public static void main(String[] args) {
		secondCalculator c2 = new secondCalculator();
		
		System.out.println(c2.allSum(1,11));
		System.out.println(c2.factorial(1,6));

	}

}
