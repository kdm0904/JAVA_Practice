package org.day10.array;

import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS = 5;
	
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		getValues(scores);
		getAverages(scores);
	}
	
	private static void getValues(int [] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i<array.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			array[i] =sc.nextInt();
		}
	}
	
	private static void getAverages(int [] array) {
		int total =0;
		for (int i = 0;i<array.length; i++) {
			total += array[i];
		}
		System.out.println("평균성적은 "+total/array.length+" 입니다.");
	}
}
