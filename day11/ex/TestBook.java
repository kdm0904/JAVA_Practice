package org.day11.ex;

class Book {
	private String title;
	private int page;
	private String writer;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Book() {
		
	}
	
}

class Magazine extends Book {
	private String release;
	
	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public Magazine() {
		
	}
	public String toString() {
		return "제목 : "+getTitle()+" 페이지 수 : "+getPage()+" 저자 : "+getWriter()+" 발매일 : "+release;
	}	
}

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Magazine m1 = new Magazine();
		
		m1.setTitle("Java");
		m1.getTitle();
		m1.setPage(500);
		m1.getPage();
		m1.setWriter("steave");
		m1.getWriter();
		m1.setRelease("201909");
		m1.getRelease();
		System.out.println(m1);
	}

}
