package org.day11.Magazine;

public class Comics {

	private String book;
	private int page;
	private String release;
	
	
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}
	
	public Comics() {
		book = "소년점프";
		page = 600;
		release = "201909";
	}
}
