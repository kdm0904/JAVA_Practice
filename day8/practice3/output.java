package org.day8.practice3;

import java.util.Scanner;


public class output {
	
	public static void main(String[] args) throws Exception {

		point score = new point();
		calc tA = new calc();
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		boolean run = true;
		int keyCode = 0;
		char grade = 'a';
		int i = 1;
		
		while(run) {
			while (i<=3) {
				if (keyCode != 13 && keyCode != 10) {
					System.out.println("************************************");
					System.out.println("1.�����Է� | 2.����, ��� | 3.���� | 4.����");
					System.out.println("************************************");
					System.out.println("���� : ");
					
					
				} keyCode=System.in.read();
				
				
				if (keyCode==49) {
					System.out.println(i+"�� �л��� ����ó��");
					System.out.println("");
					System.out.println("���� : ");
					score.setKor(sc.nextInt());
					score.getKor();
					
					System.out.println("���� : ");
					score.setEng(sc.nextInt());
					score.getEng();
					
					System.out.println("���� : ");
					score.setMath(sc.nextInt());
					score.getMath();
				}
				
				else if (keyCode==50) {
					System.out.println(i+"�� �л��� ����ó��");
					System.out.println("");
					System.out.println("���� : " + tA.tot());
					System.out.println("��� : " + tA.avg());
				}
				
				else if (keyCode==51) {
					System.out.println(i+"�� �л��� ����ó��");
					System.out.println("");
					if (tA.avg() >= 90) {
						grade = 'A';
					} else if (tA.avg() >= 80) {
						grade = 'B'; 
					} else if (tA.avg() >= 70) {
						grade = 'C';
					} else if (tA.avg() >= 60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
					
					System.out.println("���� : "+grade);
					System.out.println("");
					System.out.println(i+"�� �л��� ����ó�� �Ϸ�");
					System.out.println("");
					i++;
					
					if (i>3) {
						System.out.println("��� �л� ����ó�� �Ϸ�");
						System.exit(0);
					}
					
				}
				
				else if (keyCode==52) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
			}
		}
		
		
	}

}
