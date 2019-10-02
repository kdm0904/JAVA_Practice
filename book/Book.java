package org.proposal.book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Book {
	static ArrayList record = new ArrayList();
	
	public void book() {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("기입할 도서의 종류를 선택하시오 :");
		System.out.println("1. 소설 | 2. 시집 | 3. 참고서 | 4. 과학 | 5. 메인메뉴 돌아가기");
		num = sc.nextInt();
		
		if(num==1) {
			novel();
		} else if (num==2) {
			literature();
		} else if (num==3) {
			textBook();
		} else if (num==4) {
			science();
		} else if (num==5) {
			main.main(null);
		}
		
	}
	
	public void novel() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. 신규도서 입력하기");
		System.out.println("'책 번호, 제목, 저자, 재고'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Novel(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '책 번호, 제목, 저자, 재고'의 순서로 입력하세요.");
            }
        }
	}
	
	public void literature() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. 신규도서 입력하기");
		System.out.println("'책 번호, 제목, 저자, 재고'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Literature(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '책 번호, 제목, 저자, 재고'의 순서로 입력하세요.");
            }
        }
	}
	
	public void textBook() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. 신규도서 입력하기");
		System.out.println("'책 번호, 제목, 저자, 재고'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new TextBook(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '책 번호, 제목, 저자, 재고'의 순서로 입력하세요.");
            }
        }
	}
	
	public void science() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. 신규도서 입력하기");
		System.out.println("'책 번호, 제목, 저자, 재고'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Science(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '책 번호, 제목, 저자, 재고'의 순서로 입력하세요.");
            }
        }
	}
	
}


