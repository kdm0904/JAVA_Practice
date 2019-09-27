class Grade1{
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
	
	void print() {
		System.out.println("이름: " +name);
		System.out.println("국어: " +kor);
		System.out.println("영어: " +eng);
		System.out.println("수학: " +math);
		System.out.println("총점: " +tot());
		System.out.println("평균: " +avg());

	}
	
}


public class GradeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade1 stu1 = new Grade1();
		
		stu1.name="전지현";
		stu1.kor=90;
		stu1.eng=80;
		stu1.math=70;
		
		stu1.print();
		
	}

}
