package org.day9.constructor;

class score {
	private int kor;
	private int eng;
	private int math;
	private int id;
	int tot;
	int avg;
	private static int numberOfStudents = 0;
	
	public score(int kor, int eng, int math) {
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
		System.out.println(id + "번 학생 - " + "국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + " 총점 : "+ tot + " 평균 : " +avg);
	}
	
}

public class scoreGrade {

	public static void main(String[] args) {
		score stu1 = new score(90, 50, 60);
		score stu2 = new score(90, 80, 70);
		score stu3 = new score(90, 90, 90);
		
		int n = score.getNumberOfStudents();
		System.out.println("총 학생수 :" +n+"명");
		stu1.print();
		stu2.print();
		stu3.print();
				
	}

}
