package org.day4;
import java.util.Scanner;
public class exWhile2Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		int tot, avg;
		int i = 1;
		
		while(i<=3) {
			System.out.println(i+ "�� �л��� ����ó��");
			
			System.out.print("���� : ");
			kor=sc.nextInt();
			System.out.print("���� : ");
			eng=sc.nextInt();
			System.out.print("���� : ");
			math=sc.nextInt();
			
			tot = kor+eng+math;
			avg = tot/3;
			
			System.out.println("���� : "+kor);
			System.out.println("���� : "+eng);
			System.out.println("���� : "+math);
			System.out.println("���� : "+tot);
			System.out.println("��� : "+avg);
			
			i++;
		}
		
		
		
		
	}

}
