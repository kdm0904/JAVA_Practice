package org.day13.exception.ex;

import java.util.Scanner;

public class BackException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int account = 0;
		int deposit;
		int withdraw;
		int keyCode = 0;
		
		while(run) {
			//13 = 줄바꿈
			//10 = 엔터키가 들어옴
			try {
				
			
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
					if (account > withdraw) {
						account -= withdraw;
						System.out.println("출금 완료");
					} else if (account < withdraw) {
						throw new NegativeBalanceException();
					}
					
				} else if(keyCode==51) {
					System.out.println("잔액 : "+ account);
				
				} else if(keyCode==52) {
					run=false;
				} 
			} catch(NegativeBalanceException b) {
				b.Negative();
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
