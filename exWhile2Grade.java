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
			System.out.println(i+ "번 학생의 성적처리");
			
			System.out.print("국어 : ");
			kor=sc.nextInt();
			System.out.print("영어 : ");
			eng=sc.nextInt();
			System.out.print("수학 : ");
			math=sc.nextInt();
			
			tot = kor+eng+math;
			avg = tot/3;
			
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
			System.out.println("총점 : "+tot);
			System.out.println("평균 : "+avg);
			
			i++;
		}
		
		
		
		
	}

}
