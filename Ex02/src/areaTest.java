import java.util.Scanner;


class Area{
	Scanner input1 = new Scanner(System.in);
	
	public double circle1() {
		double pi=3.14;
		int r;
		
		System.out.print("������ : " );
		r=input1.nextInt();
		
		return pi*r*r;
	}

	public double circle2() {
		double pi=3.14;
		int r;
		
		System.out.print("������ : " );
		r=input1.nextInt();
		
		return 2*pi*r;
	}

	public int rect1() {
		int w,h;
		
		System.out.print("�غ� : ");
		w=input1.nextInt();
		
		System.out.print("���� : ");
		h=input1.nextInt();
		
		return w*h;
	}
	
	public int rect2() {
		int w,h;
		
		System.out.print("�غ� : ");
		w=input1.nextInt();
		
		System.out.print("���� : ");
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
			System.out.println("1. ���� ����");
			System.out.println("2. ���� �ѷ�");
			System.out.println("3. �簢���� ����");
			System.out.println("4. �簢���� �ѷ�");
			System.out.println("5. ����");
			System.out.println("*********************");
			System.out.print("��ȣ �Է� > ");
			
			num=input2.nextInt();

			if(num==1) {
				System.out.println("1.���� ���� : " + aa.circle1());
			}else if(num==2) {
				System.out.println("2.���� �ѷ� : " + aa.circle2());
				
			}else if(num==3) {
				System.out.println("3.�簢���� ���� : " + aa.rect1());

			}else if(num==4) {
				System.out.println("4.�簢���� �ѷ�: " + aa.rect2());

			}else if(num==5) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
		}

	}

}
