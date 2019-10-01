package org.day13.exception.ex;

import java.util.Scanner;
/*
 * ����ڰ� �Է��� ������ ũ�Ⱑ 10�� �迭�� ����
 * �� ������ ��հ��� ����ϴ� ���α׷��� �ۼ�
 * �߻��� �� �ִ� ����
 * -ArithmeticExcaeption
 * -NegativeArraySizeException
 * -ArrayIndexOutOfBoundsException
 * -NullPointerException
 */
public class practice {
	private int[] list;
	private static final int SIZE = 10;
	
	Scanner sc = new Scanner(System.in);
	
	public practice() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = i;
		}
		writeList();
	}

	private void writeList() {
		int n = 0;
		int m = 0;
		try {
			for (int i = 0; i<SIZE; i++) {
				System.out.println("���ڸ� �Է��Ͻÿ� : ");
				list[i] = sc.nextInt();
				n += list[i];
				m = n/list.length;
				
			} System.out.println("��� = "+m);
				
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �� ���� �ε���.");
		}
	}

	public static void main(String[] args) {
		practice p1 = new practice();
	}

}
