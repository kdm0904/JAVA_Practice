package org.day6.Method;

class forTest {
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
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forTest t1 = new forTest();
		
		t1.setKor(90);
		t1.getKor();
		t1.setEng(90);
		t1.getEng();
		t1.setMath(90);
		t1.getMath();
		
		System.out.println(t1.getKor());
		System.out.println(t1.tot);
		System.out.println(t1.avg);
	}

}
