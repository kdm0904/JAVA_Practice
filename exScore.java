package org.day5;

import java.util.Scanner;
public class exScore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * -1. 성적 입력(국어/영어/수학)
		 * -2. 총점/ 평균 출력
		 * -3. 학점 출력(A-F까지)
		 * -4. 종료
		 * 학생에게 번호 부여
		 * 성적처리는 순서대로 입력 > 학생 1명씩 처리 		 
		 */
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int kor=0, eng=0, math=0;
		int tot=0, avg=0;
		char grade = 'A';
		int keyCode = 0;
		int cnt = 1;
		
		while(run) {
			
			System.out.println("----------------");
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.성적 입력(국어/영어/수학) | 2.총점/평균 | 3.학점출력(A-F까지) | 4.종료");
				System.out.println("----------------");
				System.out.println("선택 : ");
				cnt++;	
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				
				System.out.println("국어 : ");
				kor = sc.nextInt();
				System.out.println("영어 : ");
				eng = sc.nextInt();
				System.out.println("수학 : ");
				math = sc.nextInt();
				
				
			} else if (keyCode==50) {
				tot = kor+eng+math;
				avg = tot/3;
				System.out.println("총점 : " + tot);
				System.out.println("평균 : " + avg);
				
				
			} else if (keyCode==51) {
				if (avg>=90) {
					grade='A';
				} else if (avg>=80) {
					grade='B';
				} else if (avg>=70) {
					grade='C';
				} else if (avg>=60) {
					grade='D';
				} else {
					grade='F';
				} System.out.println(grade);

			} else if (keyCode==52) {
				run=false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
		

}
