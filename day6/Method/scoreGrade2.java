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
		System.out.println(name + " �л� ����");
		System.out.println("���� : " +kor);
		System.out.println("���� : " +eng);
		System.out.println("���� : " +math);
		System.out.println("���� : " +tot());
		System.out.println("��� : " +avg());
		
	}
	
	
	
}


public class scoreGrade2 {

	public static void main(String[] args) {
		score2 stu1 = new score2();
		
		stu1.name = "������";
		stu1.kor = 90;
		stu1.eng = 80;
		stu1.math = 70;
		
		stu1.print();
		

		
	}

}