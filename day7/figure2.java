package org.day7;

import java.util.Scanner;

class calcFigure2 {
	int r;
	double pi = 3.14;
	int w;
	int h;
	
	public double circleArea() {
		double cArea =  (double)r*(double)r*pi;
		return cArea;
	}
	
	public double circleCircum() {
		double cCircum = 2*(double)r*pi;
		return cCircum;
	}
	
	public int squareArea() {
		int sArea = w*h;
		return sArea;
	}
	public int squareCircum() {
		int sCircum = 2*(w+h);
		return sCircum;
	}
}

public class figure2 {

	public static void main(String[] args) throws Exception {
		
		calcFigure c1 = new calcFigure();
		
		
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		int cnt = 1;
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("���α׷� " +cnt+ "�� ����");
			
			if(num < 6) {
				System.out.println("------------------------------------------------------");
				System.out.println("1.���� ���� | 2.���� �ѷ�| 3.�簢���� ���� | 4.�簢���� �ѷ� | 5.����");
				System.out.println("------------------------------------------------------");
				System.out.println("���� : ");
				num = number.nextInt();
			} else {
				System.out.println("���� �Ұ�");
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			
			if(num==1) {
				
				System.out.println("�������� �Է��Ͻÿ� : ");
				c1.r = sc.nextInt();
				System.out.println("���� ���� : " + c1.circleArea());
				
				
				
			} else if (num==2) {
				System.out.println("�������� �Է��Ͻÿ� : ");
				c1.r = sc.nextInt();
				System.out.println("���� �ѷ� : " + c1.circleCircum());
				
				
			} else if (num==3) {
				System.out.println("�غ��� �Է��Ͻÿ� : ");
				c1.w = sc.nextInt();
				System.out.println("���̸� �Է��Ͻÿ� : ");
				c1.h = sc.nextInt();
				System.out.println("�簢���� ���� : " + c1.squareArea());
				
			} else if (num==4) {
				System.out.println("�غ��� �Է��Ͻÿ� : ");
				c1.w = sc.nextInt();
				System.out.println("���̸� �Է��Ͻÿ� : ");
				c1.h = sc.nextInt();
				System.out.println("�簢���� �ѷ� : " + c1.squareCircum());
				
				cnt++;
			} else if (num==5) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
		}
		
	}

}