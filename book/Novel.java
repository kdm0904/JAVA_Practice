package org.proposal.book;

import java.util.Comparator;

public class Novel implements Comparator {
	String genre = "소설";
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
		return "장르 : "+ genre + " | 책 번호 : "+ bookNum+" | 제목 : "+bookTitle+" | 저자 : "+author+" | 재고 : "+stock;
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
