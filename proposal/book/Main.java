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
				System.out.println("�������� ���α׷� ver 1.0");
				System.out.println("************************");
				System.out.println("1. �űԵ��� �Է�");
				System.out.println("2. �������� ����");
				System.out.println("3. ��ü �������� ���");
				System.out.println("4. �Ǹ� ��Ȳ");
				System.out.println("5. ����Ʈ����");
				System.out.println("6. ���α׷�����");
				System.out.println("************************");
				System.out.println("�޴� ���� : ");					
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
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �����ϼ���.");
				
			}
	

		}
	}
}
