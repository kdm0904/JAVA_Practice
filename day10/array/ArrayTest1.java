package org.day10.array;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		final int students = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[students];
		for(int i = 0; i<students; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0; i<students; i++) {
			total += scores[i];
		}	
			System.out.println("��ռ����� "+total/students+" �Դϴ�.");
		
		
	}

}
