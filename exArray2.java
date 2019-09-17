package org.day5.array;

public class exArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 입력값 : 국어/영어/수학
		 * 계산 : 총점/평균
		 * 출력값 : 국어/영어/수학/총점/평균
		 * 
		 * 배열사용 :
		 * -score[0] -> 국어
		 * -score[1] -> 영어
		 * -score[2] -> 수학
		 * -score[3] -> 총점
		 * -score[4] -> 평균
		 */
		
		int[][] score = new int[3][5];
		
		score[0][0]=90;
		score[0][1]=80;
		score[0][2]=70;
		score[0][3]=score[0][0]+score[0][1]+score[0][2];
		score[0][4]=score[0][3]/3;
		
		score[1][0]=91;
		score[1][1]=90;
		score[1][2]=98;
		score[1][3]=score[1][0]+score[1][1]+score[1][2];
		score[1][4]=score[1][3]/3;
		
		score[2][0]=78;
		score[2][1]=82;
		score[2][2]=77;
		score[2][3]=score[2][0]+score[2][1]+score[2][2];
		score[2][4]=score[2][3]/3;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1+"번째 학생에 대한 성적처리");
			System.out.println("국어 : " + score[i][0]);
			System.out.println("영어 : " + score[i][1]);
			System.out.println("수학 : " + score[i][2]);
			System.out.println("총점 : " + score[i][3]);
			System.out.println("평균 : " + score[i][4]);
		}
			
	}

}
