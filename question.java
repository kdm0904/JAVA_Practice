package org.day6.Method;

class score6 {
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
	
	int tot = kor+eng+math;
	int avg = (kor+eng+math)/3;
	
	public void print() {
		this.tot =  tot;
		this.avg =  avg;
		System.out.println("ÃÑÁ¡ : " +tot);
		System.out.println("Æò±Õ : " +avg);
	}
}
public class question {

	public static void main(String[] args) {
		score6 stu1 = new score6();
		
		stu1.setKor(80);
		stu1.getKor();
		stu1.setEng(85);
		stu1.getEng();
		stu1.setMath(90);
		stu1.getMath();
		
		stu1.print();// TODO Auto-generated method stub

	}

}
