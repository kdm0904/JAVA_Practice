package org.day7;

import java.util.Scanner;

class score {
	int kor, eng, math;
	
	public int tot() {
		int tot = kor+eng+math;
		return tot;
	}

	public int avg() {
		int avg = (kor+eng+math)/3;
		return avg;
	}
}

public class exScore2 {

	public static void main(String[] args) {
		score stu = new score();
		
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		char grade = 'a';
		boolean run = true;
		
		while(run) {
			
			if(num < 5) {
				System.out.println("------------------------------------------------------------");
				System.out.println("1.���� �Է�(����/����/����) | 2.����/��� | 3.�������(A-F����) | 4.����");
				System.out.println("------------------------------------------------------------");
				System.out.println("�Է� : ");
				num = number.nextInt();
			} else {
				System.out.println("���� �Ұ�");
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			if(num==1) { 
				System.out.println("���� : ");
				stu.kor = sc.nextInt();
				System.out.println("���� : ");
				stu.eng = sc.nextInt();
				System.out.println("���� : ");
				stu.math = sc.nextInt();
				}
			
			else if(num==2) {
				System.out.println("���� : " + stu.tot());
				System.out.println("��� : " + stu.avg());
			}
				
			else if(num==3) {
				if(stu.avg() >= 90) {
					grade = 'A';
				} else if (stu.avg() >= 80) {
					grade = 'B';
				} else if (stu.avg() >= 70) {
					grade = 'C';
				} else if (stu.avg() >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				System.out.println("���� : " + grade);
				System.out.println("");
				cnt++;
				System.out.println(cnt+"�� �л� ����ó�� �Ϸ�");
				
			}
			
			else if(num==4) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
		
		
	}

}
