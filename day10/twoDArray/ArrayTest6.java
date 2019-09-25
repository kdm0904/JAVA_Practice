package org.day10.twoDArray;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[][] array = { {90,90,90,270,90}, {80,80,80,240,80}, {70,70,70,210,70}};
		for (int r=0; r<array.length; r++) {
			for (int c=0; c<array[r].length; c++) {
				System.out.println(r+"За "+c+"ї­ : " + array[r][c]);
			}
		}
	}

}
