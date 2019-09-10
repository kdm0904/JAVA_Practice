package org.day2;

class allScore {
	
}

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int korScore = 95;
		int engScore = 83;
		int mathScore = 72;
		int totalScore = korScore+engScore+mathScore;
		double avgScore = (double)totalScore/3;
		
		System.out.println("국어 : " + korScore);
		System.out.println("영어 : " + engScore);
		System.out.println("수학 : " + mathScore);
		System.out.println("국어 : " + korScore + ", 영어 : " + engScore);		
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avgScore);
		
		
	}

}
