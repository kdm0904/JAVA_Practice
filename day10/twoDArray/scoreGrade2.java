package org.day10.twoDArray;

import java.util.Scanner;

class score {
	public int kor;
	public int eng;
	public int math;
	public int tot;
	public int avg;
	
	public int Tot() {
		this.tot = kor+math+eng;
		return tot;
	}
	
	public int Avg() {
		this.avg= (kor+math+eng)/3;
		return avg;
	}
	
	public score(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String toString() {
		Tot();
		Avg();
		return "국어 : "+kor+" 영어 : "+eng+" 수학 : " +math+" 총점 : "+tot+" 평균 : "+avg;
	}

}


public class scoreGrade2 {

	public static void main(String[] args) {
		final int Students = 3;
		final int Scores = 1;
		
		score[][] S = new score[Students][Scores];
		
		for(int i=0;i<S.length;i++) {
			System.out.println("***********");
			System.out.println(i+1+"번 학생 성적처리");
			System.out.println("***********");
			for(int r=0;r<S[i].length;r++) {
				S[0][r] = new score(80, 80, 80);
				S[1][r] = new score(90, 90, 90);
				S[2][r] = new score(70, 70, 70);
			
				System.out.println(S[i][r]);
			}
		
		}
		
	}
	
	

}
