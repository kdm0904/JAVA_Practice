package org.day5;

import java.util.Scanner;
public class exScore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * -1. ���� �Է�(����/����/����)
		 * -2. ����/ ��� ���
		 * -3. ���� ���(A-F����)
		 * -4. ����
		 * �л����� ��ȣ �ο�
		 * ����ó���� ������� �Է� > �л� 1�� ó�� 		 
		 */
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int kor=0, eng=0, math=0;
		int tot=0, avg=0;
		char grade = 'A';
		int keyCode = 0;
		int cnt = 1;
		
		while(run) {
			
			System.out.println("----------------");
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.���� �Է�(����/����/����) | 2.����/��� | 3.�������(A-F����) | 4.����");
				System.out.println("----------------");
				System.out.println("���� : ");
				cnt++;	
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				
				System.out.println("���� : ");
				kor = sc.nextInt();
				System.out.println("���� : ");
				eng = sc.nextInt();
				System.out.println("���� : ");
				math = sc.nextInt();
				
				
			} else if (keyCode==50) {
				tot = kor+eng+math;
				avg = tot/3;
				System.out.println("���� : " + tot);
				System.out.println("��� : " + avg);
				
				
			} else if (keyCode==51) {
				if (avg>=90) {
					grade='A';
				} else if (avg>=80) {
					grade='B';
				} else if (avg>=70) {
					grade='C';
				} else if (avg>=60) {
					grade='D';
				} else {
					grade='F';
				} System.out.println(grade);

			} else if (keyCode==52) {
				run=false;
			}
			
		}
		System.out.println("���α׷� ����");
	}
	
		

}
