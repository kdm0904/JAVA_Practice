package org.proposal.students;

import java.util.Scanner;

public class InputRecord {
	static void inputRecord() {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		score.Tot();
		score.Avg();
		char grade = 'A';
		
		System.out.println("이름을 입력하시오 : ");
		score.setName(sc.next());
		score.getName();
		System.out.println("학번을 입력하시오 : ");
		score.setStuNum(sc.next());
		score.getStuNum();
		System.out.println("성적을 입력하시오 : ");
		System.out.println("국어 : ");
		score.setKor(sc.nextInt());
		score.getKor();
		System.out.println("영어 : ");
		score.setEng(sc.nextInt());
		score.getEng();
		System.out.println("수학 : ");
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
		System.out.println("학생이름 : "+score.getName()+" | 학번 : "+score.getStuNum()+" | 국어 : "+score.getKor()+" | 영어 : "
				+ score.getEng()+ " | 수학 : "+score.getMath()+" | 총점 : "+score.Tot()+" | 평균 : "+score.Avg()+" | 학점 : "+grade);
		
	}
}
