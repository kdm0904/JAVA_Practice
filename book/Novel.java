package org.proposal.book;

import java.util.Comparator;

public class Novel implements Comparator {
	String genre = "�Ҽ�";
	int bookNum = 0;
	String bookTitle = "";
	String author = "";
	int stock = 0;
	String soldOut = "X";
	
	

	public Novel(int bookNum, String bookTitle, String author, int stock) {
		this.genre = genre;
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.author= author;
		this.stock = stock;
	}
	
	public String toString() {
		return "�帣 : "+ genre + " | å ��ȣ : "+ bookNum+" | ���� : "+bookTitle+" | ���� : "+author+" | ��� : "+stock;
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
