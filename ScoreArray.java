package org.opentutorials.javatutorials.array;

import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[3][5];
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1+"번 학생 성적");
			for(int j=0; j<score.length; j++) {
				System.out.println("국어 : ");
				score[i][0] = sc.nextInt();
				System.out.println(score[i][0]);
				System.out.println("영어 : ");
				score[i][1] = sc.nextInt();
				System.out.println(score[i][1]);
				System.out.println("수학 : ");
				score[i][2] = sc.nextInt();
				System.out.println(score[i][2]);
				score[i][3] = score[i][0]+ score[i][1]+ score[i][2];
				System.out.println(score[i][3]);
				score[i][4] = score[i][3]/3;
				System.out.println(score[i][4]);
				System.out.println("총점 : " + score[i][3]+
						" 평균 : " + score[i][4]);
			}
			System.out.println(i+1+"번 학생 성적처리 완료");
		}
	}

}
