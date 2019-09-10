package org.day2;

class calScore {
	public void totalScore (int korScore, int engScore, int mathScore) {
		System.out.println(korScore+engScore+mathScore);
	}
	
	public double avgScore (int korScore, int engScore, int mathScore) {
		double n = ((double)korScore + (double)engScore + (double)mathScore)/3; 
		return n;
	}
}

public class score2 {

	public static void main(String[] args) {
		calScore c4 = new calScore();
		c4.totalScore(77, 63, 52);
		double avgResult = c4.avgScore(53, 71, 39);
		System.out.println(avgResult);
	}

}
