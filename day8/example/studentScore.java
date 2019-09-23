package org.day8.example;

import java.util.Scanner;

class score {
	
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int tot() {
		int tot = kor+eng+math;
		return tot;
	}

	public int avg() {
		int avg = (kor+eng+math)/3;
		return avg;
	}
	
	
}

public class studentScore {

	public static void main(String[] args) {
		
		score stu = new score();
				
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
					stu.setKor(sc.nextInt());
					stu.getKor();
					System.out.println("영어 : ");
					stu.setEng(sc.nextInt());
					stu.getEng();
					System.out.println("수학 : ");
					stu.setMath(sc.nextInt());
					stu.getMath();
				}
				
				else if (num == 2) {
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					System.out.println("총점 : " + stu.tot());
					System.out.println("평균 : " + stu.avg());
				}
				
				else if (num == 3) {
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					if (stu.avg() >= 90) {
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
