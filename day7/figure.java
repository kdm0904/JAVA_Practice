package org.day7;

import java.util.Scanner;

class calcFigure {
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

public class figure {

	public static void main(String[] args) throws Exception {
		
		calcFigure c1 = new calcFigure();
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int keyCode = 0;
		
		while(run) {
			
			
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("------------------------------------------------------");
				System.out.println("1.���� ���� | 2.���� �ѷ�| 3.�簢���� ���� | 4.�簢���� �ѷ� | 5.����");
				System.out.println("------------------------------------------------------");
				System.out.println("���� : ");
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				
				System.out.println("�������� �Է��Ͻÿ� : ");
				c1.r = sc.nextInt();
				System.out.println("���� ���� : " + c1.circleArea());
				
				
				
			} else if (keyCode==50) {
				System.out.println("�������� �Է��Ͻÿ� : ");
				c1.r = sc.nextInt();
				System.out.println("���� �ѷ� : " + c1.circleCircum());
				
				
			} else if (keyCode==51) {
				System.out.println("�غ��� �Է��Ͻÿ� : ");
				c1.w = sc.nextInt();
				System.out.println("���̸� �Է��Ͻÿ� : ");
				c1.h = sc.nextInt();
				System.out.println("�簢���� ���� : " + c1.squareArea());
				
			} else if (keyCode==52) {
				System.out.println("�غ��� �Է��Ͻÿ� : ");
				c1.w = sc.nextInt();
				System.out.println("���̸� �Է��Ͻÿ� : ");
				c1.h = sc.nextInt();
				System.out.println("�簢���� �ѷ� : " + c1.squareCircum());
			} else if (keyCode==53) {
				run=false;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
