package org.opentutorials.javatutorials.array;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] number = {{1,2,3,4,5},{6,7,8,9,10}};
		for (int i=0; i<number.length; i++) {
			System.out.println(i+1+"�� ��");
			for (int j=0; j<number[i].length; j++) {
				System.out.print(number[i][j]);
			}
			System.out.println("");
		}
		
	}

}
