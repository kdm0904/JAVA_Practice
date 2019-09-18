package org.day6.Method;


class score {
	
	private int kor; 
	private int eng; 
	private int math;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	} 
	
	public void name(String name) {
		System.out.println(name + " 학생 성적");
	}
	
	public void Tot(int tot) {
		tot = kor+eng+math;
		System.out.println("총점 : " + tot);
	}
	
	public void Avg(int avg) {
		avg = (kor+eng+math)/3;
		
		System.out.println("평균 : " + avg);
	}
	
	
}


public class scoreGrade {

	public static void main(String[] args) {

		score student1 = new score();
		
		student1.name("국동민");
		
		student1.setKor(90);
		student1.getKor();
		System.out.println("국어 : " + student1.getKor());
		
		student1.setEng(85);
		student1.getEng();
		System.out.println("영어 : " + student1.getEng());

		student1.setMath(95);
		student1.getMath();
		System.out.println("수학 : " + student1.getMath());

		student1.Tot(0);
		student1.Avg(0);
		

		
	}

}
