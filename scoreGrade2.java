package org.day6.Method;

class score2 {
	String name;
	int kor; 
	int eng; 
	int math;
	
	int tot() {
		return kor+eng+math;
	}
	
	int avg() {
		return (kor+eng+math)/3;
	}
	
	
	
	public void print() {
		System.out.println(name + " 학생 성적");
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("수학 : " +math);
		System.out.println("총점 : " +tot());
		System.out.println("평균 : " +avg());
		
	}
	
	
	
}


public class scoreGrade2 {

	public static void main(String[] args) {
		score2 stu1 = new score2();
		
		stu1.name = "국동민";
		stu1.kor = 90;
		stu1.eng = 80;
		stu1.math = 70;
		
		stu1.print();
		

		
	}

}