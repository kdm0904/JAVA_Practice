package org.day13.exception.ex;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list;
		int sum=0, count;
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("������ ���� : ");
			count = input.nextInt();
			
			list = new int[count];
			
			for (int i=0; i<count; i++) {
				System.out.println("������ �Է��Ͻÿ�");
				list[i] = input.nextInt();
			}
			
			for(int i=0;i<count;i++) {
				sum+= list[i];
			}
			
			System.out.println("��� : " +sum/count);
		} catch(ArithmeticException a) {
			System.out.println("������ ���� 0�� ���ܹ߻�");
		} catch(NegativeArraySizeException n) {
			System.out.println("�迭ũ�Ⱑ 0���� ���� ���ܹ߻�");
		} catch(ArrayIndexOutOfBoundsException i) {
			System.out.println("�迭ũ�⿡ ��ġ�� ���� ���� ��� ���ܹ߻�");
		} catch(NullPointerException o) {
			System.out.println("�ΰ��� �� ���ܹ߻�");
		}
	}

}
