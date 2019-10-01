package org.day13.exception.ex;

import java.util.Scanner;
/*
 * 사용자가 입력한 값들을 크기가 10인 배열에 저장
 * 이 값들의 평균값을 계산하는 프로그램을 작성
 * 발생할 수 있는 예외
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
				System.out.println("숫자를 입력하시오 : ");
				list[i] = sc.nextInt();
				n += list[i];
				m = n/list.length;
				
			} System.out.println("평균 = "+m);
				
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용할 수 없는 인덱스.");
		}
	}

	public static void main(String[] args) {
		practice p1 = new practice();
	}

}
