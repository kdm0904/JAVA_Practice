package org.day13.ex;

public class Jimi extends Novel{
	private int manageNum;
	private String title;
	private String author;
	private int notReturn;
	
	public Jimi(int manageNum, String title, String author, int notReturn) {
		this.manageNum = manageNum;
		this.title= title;
		this.author = author;
		this.notReturn = notReturn;
	}


	@Override
	public void getBookData() {
		System.out.println("å ��ȣ : "+manageNum+" | ���� : "+title+" | ���� : "+author+" | �з� : �Ҽ�");
	}
	
	@Override
	public void getlastFees() {
		int lateFee = notReturn*300;
		System.out.println("���� ��ü�� : "+lateFee+"��");
	}


	
}
