package org.day5;

public class breakTest {

	public static void main(String[] args) {
	
		while(true) {
			int num = (int)(Math.random()*6) + 1;
					
			System.out.println("주사위 숫자 : " + num);
					
			if (num==6) {
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
