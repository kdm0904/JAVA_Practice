package org.day5.array;

public class exArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};
		int sum = 0;
		
		System.out.println("scores[0] : " +scores[0]);
		System.out.println("scores[1] : " +scores[1]);
		System.out.println("scores[2] : " +scores[2]);
		
		System.out.println("------------");
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("гу╟Х : " + sum);
	}
	

}
