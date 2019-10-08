package org.opentutorials.javatutorials.array;

public class ScoreArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = new int[3][5];
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1+"锅 切积 己利");
			for(int j=0; j<score[i].length; j++) {
				score[i][0] = 90;
				score[i][1] = 80;
				score[i][2] = 70;
				score[i][3] = score[i][0]+ score[i][1]+ score[i][2];
				score[i][4] = score[i][3]/3;
				System.out.println(score[i][j]);
			}
			System.out.println(i+1+"锅 切积 己利贸府 肯丰");
		}
	}

}
