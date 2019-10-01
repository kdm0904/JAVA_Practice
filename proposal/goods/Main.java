package org.proposal.goods;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		InputRecord IR = new InputRecord();
		DeleteRecord DR = new DeleteRecord();
		SaledRecord SR = new SaledRecord();
		BestRecord BR = new BestRecord();
		
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("1. 상품 입력하기");
				System.out.println("2. 상품 삭제하기");
				System.out.println("3. 판매된 상품 보기");
				System.out.println("4. 베스트 셀러");
				System.out.println("5. 프로그램 종료");
				System.out.println("************************");
				System.out.println("메뉴 선택 : ");					
				num = number.nextInt();
				
				if (num==1) {
					IR.inputRecord();
				} else if (num==2) {
					DR.deleteRecord();
				} else if (num==3) {
					SR.saledRecord();
				} else if (num==4) {
					BR.bestRecord();
				} else if (num==5) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("유효하지 않은 값입니다. 다시 선택하세요.");
				
			}
			
			
			
			
		}
	}

}
