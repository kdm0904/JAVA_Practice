import java.util.Scanner;


class Area{
	Scanner input1 = new Scanner(System.in);
	
	public double circle1() {
		double pi=3.14;
		int r;
		
		System.out.print("반지름 : " );
		r=input1.nextInt();
		
		return pi*r*r;
	}

	public double circle2() {
		double pi=3.14;
		int r;
		
		System.out.print("반지름 : " );
		r=input1.nextInt();
		
		return 2*pi*r;
	}

	public int rect1() {
		int w,h;
		
		System.out.print("밑변 : ");
		w=input1.nextInt();
		
		System.out.print("높이 : ");
		h=input1.nextInt();
		
		return w*h;
	}
	
	public int rect2() {
		int w,h;
		
		System.out.print("밑변 : ");
		w=input1.nextInt();
		
		System.out.print("높이 : ");
		h=input1.nextInt();
		
		return 2*(w+h);
	}

}


public class areaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input2=new Scanner(System.in);
		Area aa = new Area();
		int num=0;
		
		while(true) {
			System.out.println("*********************");
			System.out.println("1. 원의 면적");
			System.out.println("2. 원의 둘레");
			System.out.println("3. 사각형의 면적");
			System.out.println("4. 사각형의 둘레");
			System.out.println("5. 종료");
			System.out.println("*********************");
			System.out.print("번호 입력 > ");
			
			num=input2.nextInt();

			if(num==1) {
				System.out.println("1.원의 면적 : " + aa.circle1());
			}else if(num==2) {
				System.out.println("2.원의 둘레 : " + aa.circle2());
				
			}else if(num==3) {
				System.out.println("3.사각형의 면적 : " + aa.rect1());

			}else if(num==4) {
				System.out.println("4.사각형의 둘레: " + aa.rect2());

			}else if(num==5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}

	}

}
