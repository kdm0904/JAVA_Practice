package org.proposal.students;

import java.util.Scanner;

public class InputRecord {
	static void inputRecord() {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		score.Tot();
		score.Avg();
		char grade = 'A';
		
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		score.setName(sc.next());
		score.getName();
		System.out.println("�й��� �Է��Ͻÿ� : ");
		score.setStuNum(sc.next());
		score.getStuNum();
		System.out.println("������ �Է��Ͻÿ� : ");
		System.out.println("���� : ");
		score.setKor(sc.nextInt());
		score.getKor();
		System.out.println("���� : ");
		score.setEng(sc.nextInt());
		score.getEng();
		System.out.println("���� : ");
		score.setMath(sc.nextInt());
		score.getMath();
		if (score.Avg()>=90) {
			grade = 'A';
		} else if (score.Avg()>=80){
			grade = 'B';
		} else if (score.Avg()>=70){
			grade = 'C';
		} else if (score.Avg()>=60){
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("�л��̸� : "+score.getName()+" | �й� : "+score.getStuNum()+" | ���� : "+score.getKor()+" | ���� : "
				+ score.getEng()+ " | ���� : "+score.getMath()+" | ���� : "+score.Tot()+" | ��� : "+score.Avg()+" | ���� : "+grade);
		
	}
}
