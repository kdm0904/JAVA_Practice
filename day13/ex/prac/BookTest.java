package org.day13.ex.prac;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel = new Novel();
		
		novel.setManageNum(1);
		novel.setAuthor("�̼���:");
		novel.setTitle("�����ϱ�");
		
		System.out.println("������ȣ : " +novel.getManageNum());
		System.out.println("���� : "+novel.getAuthor());
		System.out.println("���� : "+novel.getTitle());
		System.out.println("��ü�� : "+novel.getLastFees(3)+"��");
	}

}
