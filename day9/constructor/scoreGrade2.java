package org.day9.constructor;

class score2 {
	private int kor;
	private int eng;
	private int math;
	private int id;
	int tot;
	int avg;
	private static int numberOfStudents = 0;
	
	public score2(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		id =  ++numberOfStudents;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public int tot1() {
		this.tot = kor+eng+math;
		return tot;
	}
	
	public int avg1() {
		this.avg = (kor+eng+math)/3;
		return avg;
	}
	
	public void print() {
		tot1();
		avg1();
		System.out.println(id + "�� �л� - " + "���� : " + kor + " ���� : " + eng + " ���� : " + math);
	}
}

public class scoreGrade2 {

	public static void main(String[] args) {
		score2 stu1 = new score2(90, 50, 60);
		score2 stu2 = new score2(90, 80, 70);
		score2 stu3 = new score2(90, 90, 90);
		
		int n = score.getNumberOfStudents();
		System.out.println("�� �л��� :" +n+"��");
		stu1.print();
		System.out.println("���� : " + stu1.tot +", ��� : " + stu1.avg);
		stu2.print();
		System.out.println("���� : " + stu2.tot +", ��� : " + stu2.avg);
		stu3.print();
		System.out.println("���� : " + stu3.tot +", ��� : " + stu3.avg);
	}

}
