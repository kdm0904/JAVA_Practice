package org.day5;

import java.util.Scanner;

public class exKeyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로부터 문장을 입력
		 * 입력받은 문장을 스캐너에 넘기기
		 * q를 입력하면 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램 종료 : q를 입력하세요");
		
		do {
			System.out.print(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그햄 종료");
	}

}
