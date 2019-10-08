package org.opentutorials.javatutorials.array;

public class ArrayEx {

	public static void main(String[] args) {
		int[][] arrays = {{1,2,3,4},{5,6,7,8}};
		for(int i=0; i<arrays.length;i++) {
			System.out.println(i+1+"За ");
			for (int j=0; j<arrays[i].length;j++) {
				int array = arrays[i][j]; 
				System.out.println(j+1+"ї­ : "+array );
			}
		}
	}

}
