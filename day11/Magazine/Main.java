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
				System.out.println("1.��ȭ���� �Է� | 2.��ȭ���� ��� | 3. ����");
				System.out.println("***********************************************************");
				System.out.println("�޴� ���� : ");
				num = number.nextInt();
				System.out.println("************************************");
				
				if(num==1) {
					System.out.println(i+1+"��° ��ȭ : ");
					System.out.println("���� : ");
					c1.setTitle(sc.next());
					c1.getTitle();
					System.out.println("���� : ");
					c1.setAuthor(sc.next());
					c1.getAuthor();
					System.out.println("���� ������ : ");
					c1.setInPage(sc.next());
					c1.getInPage();
					i++;
				}
				if(num==2) {
					System.out.println(c1);
				}
				if(num==3) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
			}
		}
	}

}
