package org.day13.ex;

import java.util.Scanner;
public class Payment {
	static Scanner sc = new Scanner(System.in);
	private static Novel arrayOfNovel[];

	public static void main(String[] args) {
		bookData();
		writeAll();
		
	}

	

	private static void bookData() {
		// TODO Auto-generated method stub
		arrayOfNovel = new Novel[2];
		arrayOfNovel[0] = new Hamlet(1, "�ܸ�", "���ͽ��Ǿ�", 3);
		arrayOfNovel[1] = new Jimi(2, "����", "����", 4);
	}

	private static void writeAll() {
		for (int i=0; i<arrayOfNovel.length; i++) {
			arrayOfNovel[i].getBookData();
			arrayOfNovel[i].getlastFees();
			System.out.println("��ü�� �Է� :");
		}
	}
}
