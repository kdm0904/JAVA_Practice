package org.proposal.students;

import java.util.Scanner;

public class StudentsScore {

	public static void main(String[] args) {
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		InputRecord IR = new InputRecord();
		DeleteRecord DR = new DeleteRecord();
		SortRecord SR = new SortRecord();
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("1. 학생성적 입력하기");
				System.out.println("2. 학생성적 삭제하기");
				System.out.println("3. 학생성적 정렬하여 보기");
				System.out.println("4. 프로그램 종료");
				System.out.println("************************");
				System.out.println("메뉴 선택 : ");					
				num = number.nextInt();
				
				if (num==1) {
					IR.inputRecord();
				} else if (num==2) {
					DR.deleteRecord();
				} else if (num==3) {
					SR.sortRecord();
				} else if (num==4) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("유효하지 않은 값입니다. 다시 선택하세요.");
				
			}
			
			
			
			
		}

	}
	
	
}
