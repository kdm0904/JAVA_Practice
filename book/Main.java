package org.proposal.book;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		Book book = new Book();
		Novel NL = new Novel(num, null, null, num);
		TextBook TB = new TextBook(num, null, null, num);
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("�������� ���α׷� ver 1.0");
				System.out.println("************************");
				System.out.println("1. �űԵ��� �Է�");
				System.out.println("2. �������� ����");
				System.out.println("3. �Ǹ� ��Ȳ");
				System.out.println("4. ��ü �������� ���");
				System.out.println("5. ����Ʈ����");
				System.out.println("6. ���α׷�����");
				System.out.println("************************");
				System.out.println("�޴� ���� : ");					
				num = number.nextInt();
				
				if (num==1) {
					book.book();
				} else if(num==4) {
					NL.toString();
					System.out.println(NL.toString());
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
