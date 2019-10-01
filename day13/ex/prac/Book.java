package org.day13.ex.prac;

public class Book {
	private int manageNum;
	public int getManageNum() {
		return manageNum;
	}
	public void setManageNum(int manageNum) {
		this.manageNum = manageNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String title;
	private String author;
	
}

class Novel extends Book {

	public int getLastFees(int i) {
		int pay = i*300;
		return pay;
	}
	
}

class Poet extends Book {
	public int getLastFees(int i) {
		int pay = i*200;
		return pay;
	}
}

class SF extends Book {
	public int getLastFees(int i) {
		int pay = i*600;
		return pay;
	}
}