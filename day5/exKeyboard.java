package org.day5;

public class exKeyboard {
	//throws Exception - 예외처리
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*
 *키보드로 숫자 입력
 *-1. 숫자증가 : 49
 *-2. 숫자감소 : 50
 *-3. 종료 : 51 
 */
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			//13 = 줄바꿈
			//10 = 엔터키가 들어옴
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.증가 | 2.감소 | 3.종료");
				System.out.println("----------------");
				System.out.println("선택 : ");
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				speed++;
				System.out.println("현재 속도 : "+speed);
			} else if(keyCode==50) {
				speed--;
				System.out.println("현재 속도 : "+speed);
			} else if(keyCode==51) {
				run=false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	

}
