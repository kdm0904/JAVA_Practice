package org.day4;

public class starTriangleReverse3 {

//	public static void main(String[] args) {
//		for (int i=5; i>0; i--) {
//			for (int j=5; j>0; j--) {
//				if (i<j) {
//					System.out.print(" ");
//				} else System.out.print("*");
//			}
//		System.out.println("");	
//		}
//	}
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
	        for(int j=1; j<=i; j++) {
	            System.out.print(" ");
	        }
	        for(int j=1; j<=6-i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
		}
	}	

}
