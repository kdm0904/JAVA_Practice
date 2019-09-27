class Grade2{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	int tot() {
		return kor+eng+math;
	}
	
	int avg() {
		return (kor+eng+math)/3;
	}
	
	
}


public class GradeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade2 stu2 = new Grade2();
		
		stu2.setName("하지원");
		stu2.setKor(80);
		stu2.setEng(70);
		stu2.setMath(60);
		
		System.out.println("이름 : " + stu2.getName());
		System.out.println("국어 : " + stu2.getKor());
		System.out.println("영어 : " + stu2.getEng());
		System.out.println("수학 : " + stu2.getMath());
		System.out.println("총점 : " + stu2.tot());
		System.out.println("평균 : " + stu2.avg());
		

	}

}
