package org.day5;

import java.util.Scanner;

public class exKeyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ű����κ��� ������ �Է�
		 * �Է¹��� ������ ��ĳ�ʿ� �ѱ��
		 * q�� �Է��ϸ� ���α׷� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷� ���� : q�� �Է��ϼ���");
		
		do {
			System.out.print(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α��� ����");
	}

}
