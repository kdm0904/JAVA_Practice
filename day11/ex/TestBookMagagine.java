package org.day11.ex;


class Comics {
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

class Onepice extends Comics {
	private String title;
	private String author;
	private String inPage;
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getInPage() {
		return inPage;
	}


	public void setInPage() {
		this.inPage = inPage;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Onepice() {
		title = "원피스";
		author = "오다 에이치로";
		inPage = "1-10";
	}
	
	public String toString() {
		return "발행잡지 : "+getBook()+" | 페이지 수 : "+getPage()+" | 제목 : "+getTitle()+
				" | 저자 : "+getAuthor()+ " | 지정 페이지 : "+getInPage()+" | 발매일 : "+getRelease();
	}	
	
}
public class TestBookMagagine {

	public static void main(String[] args) {
		Onepice o1 = new Onepice();
		System.out.println(o1);

	}

}
