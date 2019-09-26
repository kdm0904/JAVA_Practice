package org.day11.Magazine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Comic c1 = new Comic();
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		int i = 0;
		
		while(run) {
			while(i<10) {
				System.out.println("***********************************************************");
				System.out.println("1.만화정보 입력 | 2.만화정보 출력 | 3. 종료");
				System.out.println("***********************************************************");
				System.out.println("메뉴 선택 : ");
				num = number.nextInt();
				System.out.println("************************************");
				
				if(num==1) {
					System.out.println(i+1+"번째 만화 : ");
					System.out.println("제목 : ");
					c1.setTitle(sc.next());
					c1.getTitle();
					System.out.println("저자 : ");
					c1.setAuthor(sc.next());
					c1.getAuthor();
					System.out.println("지정 페이지 : ");
					c1.setInPage(sc.next());
					c1.getInPage();
					i++;
				}
				if(num==2) {
					System.out.println(c1);
				}
				if(num==3) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}
		}
	}

}
