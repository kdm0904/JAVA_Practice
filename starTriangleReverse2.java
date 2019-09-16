package org.day4;

public class starTriangleReverse2 {

	public static void main(String[] args) {
//		for (int i=1; i<=5; i++) {
//			for (int j=5; j>0; j--) {
//				if (i>j) {
//					System.out.print(" ");
//				} else System.out.print("*");
//			}
//		System.out.println("");	
//		}
		
		for (int i=1; i<=5; i++) {
			for (int j=6; j<i; j--) {
					System.out.print(" ");
				} 
			for (int j=6; j>i; j--) {
				System.out.print("*");
			}
		System.out.println("");	
		}
	}
		
}


