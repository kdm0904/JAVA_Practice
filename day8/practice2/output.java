package org.day8.practice2;

import java.util.Scanner;


public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point score = new point();
		calc tA = new calc();
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		char grade = 'a';
		int i = 1;
		
		
		
		while(run) {
			while (i<=3) {
				if (num < 5) {
					System.out.println("************************************");
					System.out.println("1.성적입력 | 2.총점, 평균 | 3.학점 | 4.종료");
					System.out.println("************************************");
					System.out.println("메뉴 선택 : ");
					num = number.nextInt();
					System.out.println("************************************");
					
					
				} else {
					System.out.println("서비스 불가");
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
				if (num == 1) {
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					System.out.println("국어 : ");
					score.setKor(sc.nextInt());
					score.getKor();
					
					System.out.println("영어 : ");
					score.setEng(sc.nextInt());
					score.getEng();
					
					System.out.println("수학 : ");
					score.setMath(sc.nextInt());
					score.getMath();
				}
				
				else if (num == 2) {
					tA.tot();
					tA.avg();
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					System.out.println("총점 : " + tA.tot());
					System.out.println("평균 : " + tA.avg());
				}
				
				else if (num == 3) {
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					if (tA.avg() >= 90) {
						grade = 'A';
					} else if (tA.avg() >= 80) {
						grade = 'B'; 
					} else if (tA.avg() >= 70) {
						grade = 'C';
					} else if (tA.avg() >= 60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
					
					System.out.println("학점 : "+grade);
					System.out.println("");
					System.out.println(i+"번 학생의 성적처리 완료");
					System.out.println("");
					i++;
					
					if (i>3) {
						System.out.println("모든 학생 성적처리 완료");
						System.exit(0);
					}
					
				}
				
				else if (num == 4) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}
		}
	}


}
