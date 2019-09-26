package org.day11.Magazine;

public class Comic extends Comics {
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


	public void setInPage(String inPage) {
		this.inPage = inPage;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Comic() {
	}
	
	public String toString() {
		return "발행잡지 : "+getBook()+" | 페이지 수 : "+getPage()+" | 제목 : "+getTitle()+
				" | 저자 : "+getAuthor()+ " | 지정 페이지 : "+getInPage()+" | 발매일 : "+getRelease();
	}	

}
