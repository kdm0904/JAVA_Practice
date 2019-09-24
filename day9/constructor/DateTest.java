package org.day9.constructor;

class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		year = 2009;
		month = "1월";
		day = 1;
	}
	
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	
	public Date(int year) {
		setDate(year, "1월", 1);
	}
	
	public void setDate(int year, String month, int day) {
		this.year =  year;
		this.month =  month;
		this.day =  day;
	}
	
	public void print() {
		System.out.println("년도 : "+year+" 월 : "+month+" 날짜 : "+day);
	}
	
}

public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date(2010, "1월", 1);
		Date date3 = new Date(2011);
		
		date1.print();
		date2.print();
		date3.print();
	}

}
