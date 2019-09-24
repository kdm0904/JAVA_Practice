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
		System.out.println(id + "¹ø ÇÐ»ý - " + "±¹¾î : " + kor + " ¿µ¾î : " + eng + " ¼öÇÐ : " + math);
	}
}

public class scoreGrade2 {

	public static void main(String[] args) {
		score2 stu1 = new score2(90, 50, 60);
		score2 stu2 = new score2(90, 80, 70);
		score2 stu3 = new score2(90, 90, 90);
		
		int n = score.getNumberOfStudents();
		System.out.println("ÃÑ ÇÐ»ý¼ö :" +n+"¸í");
		stu1.print();
		System.out.println("ÃÑÁ¡ : " + stu1.tot +", Æò±Õ : " + stu1.avg);
		stu2.print();
		System.out.println("ÃÑÁ¡ : " + stu2.tot +", Æò±Õ : " + stu2.avg);
		stu3.print();
		System.out.println("ÃÑÁ¡ : " + stu3.tot +", Æò±Õ : " + stu3.avg);
	}

}
