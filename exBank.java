package org.day5;

import java.util.Scanner;

public class exBank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 메뉴에서 번호를 입력
		 * -1. 예금 : 금액 입금 : 49
		 * -2. 출금 : 금액 출금 : 50
		 * -3. 잔고 : 남은 금액 출력: 51
		 * -4. 종료 : 프로그램 종료: 52
		 * 4. 종료가 입력될 때까지 은행업무 예제 반복
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int account = 0;
		int deposit;
		int withdraw;
		int keyCode = 0;
		
		while(run) {
			//13 = 줄바꿈
			//10 = 엔터키가 들어옴
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("----------------");
				System.out.println("선택 : ");
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				System.out.println("예금액 : ");
				deposit=sc.nextInt();
				account += deposit;
				
			} else if(keyCode==50) {
				System.out.println("출금액 : ");
				withdraw = sc.nextInt();
				account -= withdraw;
				
				
			} else if(keyCode==51) {
				System.out.println("잔액 : "+ account);
			
			} else if(keyCode==52) {
				run=false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
