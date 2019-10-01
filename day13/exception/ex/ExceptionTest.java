package org.day13.exception.ex;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list;
		int sum=0, count;
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("정수의 개수 : ");
			count = input.nextInt();
			
			list = new int[count];
			
			for (int i=0; i<count; i++) {
				System.out.println("정수를 입력하시오");
				list[i] = input.nextInt();
			}
			
			for(int i=0;i<count;i++) {
				sum+= list[i];
			}
			
			System.out.println("평균 : " +sum/count);
		} catch(ArithmeticException a) {
			System.out.println("정수의 개수 0인 예외발생");
		} catch(NegativeArraySizeException n) {
			System.out.println("배열크기가 0보다 작은 예외발생");
		} catch(ArrayIndexOutOfBoundsException i) {
			System.out.println("배열크기에 넘치는 값이 들어올 경우 예외발생");
		} catch(NullPointerException o) {
			System.out.println("널값일 때 예외발생");
		}
	}

}
