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
			System.out.println("프로그램 " +cnt+ "번 시행");
			
			if(num < 6) {
				System.out.println("------------------------------------------------------");
				System.out.println("1.원의 면적 | 2.원의 둘레| 3.사각형의 면적 | 4.사각형의 둘레 | 5.종료");
				System.out.println("------------------------------------------------------");
				System.out.println("선택 : ");
				num = number.nextInt();
			} else {
				System.out.println("서비스 불가");
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			
			if(num==1) {
				
				System.out.println("반지름을 입력하시오 : ");
				c1.r = sc.nextInt();
				System.out.println("원의 면적 : " + c1.circleArea());
				
				
				
			} else if (num==2) {
				System.out.println("반지름을 입력하시오 : ");
				c1.r = sc.nextInt();
				System.out.println("원의 둘레 : " + c1.circleCircum());
				
				
			} else if (num==3) {
				System.out.println("밑변을 입력하시오 : ");
				c1.w = sc.nextInt();
				System.out.println("높이를 입력하시오 : ");
				c1.h = sc.nextInt();
				System.out.println("사각형의 면적 : " + c1.squareArea());
				
			} else if (num==4) {
				System.out.println("밑변을 입력하시오 : ");
				c1.w = sc.nextInt();
				System.out.println("높이를 입력하시오 : ");
				c1.h = sc.nextInt();
				System.out.println("사각형의 둘레 : " + c1.squareCircum());
				
				cnt++;
			} else if (num==5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}
		
	}

}