package org.day13.ex.prac;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel = new Novel();
		
		novel.setManageNum(1);
		novel.setAuthor("이순신:");
		novel.setTitle("난중일기");
		
		System.out.println("관리번호 : " +novel.getManageNum());
		System.out.println("저자 : "+novel.getAuthor());
		System.out.println("제목 : "+novel.getTitle());
		System.out.println("연체료 : "+novel.getLastFees(3)+"원");
	}

}
