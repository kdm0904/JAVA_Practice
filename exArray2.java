package org.day5.array;

public class exArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �Է°� : ����/����/����
		 * ��� : ����/���
		 * ��°� : ����/����/����/����/���
		 * 
		 * �迭��� :
		 * -score[0] -> ����
		 * -score[1] -> ����
		 * -score[2] -> ����
		 * -score[3] -> ����
		 * -score[4] -> ���
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
			System.out.println(i+1+"��° �л��� ���� ����ó��");
			System.out.println("���� : " + score[i][0]);
			System.out.println("���� : " + score[i][1]);
			System.out.println("���� : " + score[i][2]);
			System.out.println("���� : " + score[i][3]);
			System.out.println("��� : " + score[i][4]);
		}
			
	}

}
