package org.day10.twoDArray;

	
public class scoreGrade {

	public static void main(String[] args) {
		
		int student[][] = {{80,90,100,0,0}, {100,90,80,0,0}, {100,80,80,0,0}};
		
		for(int i=0;i<student.length;i++) {
			System.out.println("***********");
			System.out.println(i+1+"�� �л� ����ó��");
			for(int r=0; r<student[i].length; r++) {
				student[i][3] = student[i][0]+student[i][1]+student[i][2];
				student[i][4] = student[i][3]/3;
			}
			System.out.println(i+1+"�� �л� ���� - " + "���� : " +student[i][0]+" ���� : "+student[i][1]+" ���� : "+student[i][2]+" ���� : "+student[i][3]+" ��� : "+student[i][4]);

		}
	}
		
}

