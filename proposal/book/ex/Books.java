package org.proposal.book.ex;

import java.util.Comparator;
import java.util.Scanner;

public class Books implements Comparator {
	final static int LEFT = 0;
    final static int CENTER = 1;
    final static int RIGHT = 2;
    final static int ZERO = 0;
	
	String genre = "";
	int bookNum = 0;
	String bookTitle = "";
	String author = "";
	int stock = 0;
	String soldOut = "X";
	
	

	public Books() {
		Scanner sc = new Scanner(System.in);
		this.genre = genre;
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.author= author;
		this.stock = stock;
		genre = sc.next();
		bookNum = sc.nextInt();
		bookTitle =  sc.next();
		author = sc.next();
		stock = sc.nextInt();
	}
	
	public String toString() {
		return "장르 : "+ genre + " | 책 번호 : "+ bookNum+" | 제목 : "+bookTitle+" | 저자 : "+author+" | 재고 : "+stock;
	}
	
	static String format(String str, int length, int alignment) {
        int diff = length - str.length();
        if (diff < 0)
            return str.substring(0, length);
 
        char[] source = str.toCharArray();
        char[] result = new char[length];
 
        // 배열 result를 공백으로 채운다.
        for (int i = 0; i < result.length; i++)
            result[i] = ' ';
 
        switch (alignment) {
        case CENTER:
            System.arraycopy(source, 0, result, diff / 2, source.length);
            break;
        case RIGHT:
            System.arraycopy(source, 0, result, diff, source.length);
            break;
        case LEFT:
        default:
            System.arraycopy(source, 0, result, 0, source.length);
        }
        return new String(result);
    }
	
	public int compareTo(Object obj) {
        int result = -1;
        if (obj instanceof Books) {
        	Books tmp = (Books) obj;
            result = (this.bookTitle).compareTo(tmp.bookTitle);
        }
        return result;
    }

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
