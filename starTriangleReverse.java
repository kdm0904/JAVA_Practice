package org.day4;

public class starTriangleReverse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=5; i>0; i--) {
			for (int j=1; j<=5; j++) {
				if (i>j) {
					System.out.print(" ");
				} else System.out.print("*");
			}
		System.out.println("");	
		}
//		for (int i=5; i>0; i--) {
//			for (int j=1; j<i; j++) {
//					System.out.print(" ");
//			}	
//			for (int j=1; j>i; j++)	{
//					System.out.print("*");
//			}
//			
//		System.out.println("");	
//		}
	}
}