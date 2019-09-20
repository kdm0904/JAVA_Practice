package org.day7;

import java.util.Scanner;

class score {
	int kor, eng, math;
	
	public int tot() {
		int tot = kor+eng+math;
		return tot;
	}

	public int avg() {
		int avg = (kor+eng+math)/3;
		return avg;
	}
}

public class exScore2 {

	public static void main(String[] args) {
		score stu = new score();
		
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		char grade = 'a';
		boolean run = true;
		
		while(run) {
			
			if(num < 5) {
				System.out.println("------------------------------------------------------------");
				System.out.println("1.성적 입력(국어/영어/수학) | 2.총점/평균 | 3.학점출력(A-F까지) | 4.종료");
				System.out.println("------------------------------------------------------------");
				System.out.println("입력 : ");
				num = number.nextInt();
			} else {
				System.out.println("서비스 불가");
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			if(num==1) { 
				System.out.println("국어 : ");
				stu.kor = sc.nextInt();
				System.out.println("영어 : ");
				stu.eng = sc.nextInt();
				System.out.println("수학 : ");
				stu.math = sc.nextInt();
				}
			
			else if(num==2) {
				System.out.println("총점 : " + stu.tot());
				System.out.println("평균 : " + stu.avg());
			}
				
			else if(num==3) {
				if(stu.avg() >= 90) {
					grade = 'A';
				} else if (stu.avg() >= 80) {
					grade = 'B';
				} else if (stu.avg() >= 70) {
					grade = 'C';
				} else if (stu.avg() >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				System.out.println("학점 : " + grade);
				System.out.println("");
				cnt++;
				System.out.println(cnt+"번 학생 성적처리 완료");
				
			}
			
			else if(num==4) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
		
	}

}
