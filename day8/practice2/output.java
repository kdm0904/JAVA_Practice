package org.day8.practice2;

import java.util.Scanner;


public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point score = new point();
		calc tA = new calc();
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		char grade = 'a';
		int i = 1;
		
		
		
		while(run) {
			while (i<=3) {
				if (num < 5) {
					System.out.println("************************************");
					System.out.println("1.�����Է� | 2.����, ��� | 3.���� | 4.����");
					System.out.println("************************************");
					System.out.println("�޴� ���� : ");
					num = number.nextInt();
					System.out.println("************************************");
					
					
				} else {
					System.out.println("���� �Ұ�");
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				
				if (num == 1) {
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
				
				else if (num == 2) {
					tA.tot();
					tA.avg();
					System.out.println(i+"�� �л��� ����ó��");
					System.out.println("");
					System.out.println("���� : " + tA.tot());
					System.out.println("��� : " + tA.avg());
				}
				
				else if (num == 3) {
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
				
				else if (num == 4) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
			}
		}
	}


}
