package org.proposal.book;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		Book book = new Book();
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("도서관리 프로그램 ver 1.0");
				System.out.println("************************");
				System.out.println("1. 신규도서 입력");
				System.out.println("2. 도서정보 삭제");
				System.out.println("3. 전체 도서정보 출력");
				System.out.println("4. 판매 현황");
				System.out.println("5. 베스트셀러");
				System.out.println("6. 프로그램종료");
				System.out.println("************************");
				System.out.println("메뉴 선택 : ");					
				num = number.nextInt();
				
				if (num==1) {
					book.inputBook();
				} else if (num==2) {
					book.deleteBook();
				}
				else if(num==3) {
					book.sortBook();
				}
				
				else if (num==6) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("유효하지 않은 값입니다. 다시 선택하세요.");
				
			}
	

		}
	}
}
