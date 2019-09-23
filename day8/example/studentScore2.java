package org.day8.example;

import java.util.Scanner;

class score2 {
	
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

public class studentScore2 {

	public static void main(String[] args) throws Exception {
		
		score stu = new score();
				
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		char grade = 'a';
		int i = 1;
		int keyCode = 0;
		
		while(run) {
			while (i<=3) {
				
				
				
				if (keyCode != 13 && keyCode != 10) {
					System.out.println("************************************");
					System.out.println("1.성적입력 | 2.총점, 평균 | 3.학점 | 4.종료");
					System.out.println("************************************");
					System.out.println("메뉴 선택 : ");
					
				} 
				
				keyCode=System.in.read();
				
				if (keyCode==49) {
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
				
				else if (keyCode==50) {
					System.out.println(i+"번 학생의 성적처리");
					System.out.println("");
					System.out.println("총점 : " + stu.tot());
					System.out.println("평균 : " + stu.avg());
				}
				
				else if (keyCode==51) {
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
						run=false;
					}
					
				}
				
				else if (keyCode==52) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}	
			}
				
		}
	}

}