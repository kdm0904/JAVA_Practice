package org.proposal.book.ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
	static ArrayList record = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	public void inputBook() {
		System.out.println("1. 신규도서 입력하기");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
            	String input = sc.nextLine().trim();
                if (!input.equalsIgnoreCase("q")) {
                	
                    System.out.println("장르 : ");
                    record.add(new Books().genre);
                    System.out.println("책 번호 : " );
                    record.add(new Books().bookNum);
                    System.out.println("제목 : " );
                    record.add(new Books().bookTitle);
                    System.out.println("저자 : " );
                    record.add(new Books().author);
                    System.out.println("재고 : " );
                    record.add(new Books().stock);
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '장르, 책 번호, 제목, 저자, 재고'의 순서로 입력하세요.");
            }
        }
		
	}
	
	
	
	//도서정보 삭제
	public void deleteBook() {
		while (true) {
			displayRecord();
            System.out.println("삭제하고자 하는 데이터의 책번호를 입력하세요.(q:메인화면)");
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    int length = record.size();
                    boolean found = false;
 
                    for (int i = 0; i < length; i++) {
                        Books book = (Books) record.get(i);
                        if (input.equals(book.bookNum)) {
                            found = true;
                            record.remove(i);
                        }
                    }
 
                    if (found) {
                        System.out.println("삭제되었습니다.");
                    } else {
                        System.out.println("일치하는 데이터가 없습니다.");
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. 다시 입력해 주세요.");
            }

		}
	}
	
	//도서정보 정렬
	public void sortBook() {
		 while (true) {
	            System.out.println(" 정렬기준을 선택하세요.(1:장르순 2:책번호순 3:제목순 4:메인메뉴) : ");
	 
	            int sort = 0;
	 
	            do {
	                try {
	                    sort = Integer.parseInt(sc.nextLine());
	 
	                    if (sort >= 1 && sort <= 4) {
	                        break;
	                    } else {
	                        throw new Exception();
	                    }
	 
	                } catch (Exception e) {
	                    System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
	                    System.out.println(" 정렬기준을 선택하세요. (1:장르순 2:책번호순 3:제목순 4:메인메뉴) : ");
	                }
	            } while (true);
	 
	            if (sort == 1) {
	                Collections.sort(record, new GenreAscending());
	                displayRecord();
	            } else if (sort == 2) {
	                Collections.sort(record, new BookNumDescending());
	                displayRecord();
	            } else if (sort == 3) {
	            	Collections.sort(record, new TitleDescending());
	                displayRecord();
	            } else {
	                return;
	            }
	        }
	}

	private void displayRecord() {
		// TODO Auto-generated method stub
		String genre = "";
		int bookNum = 0;
		String bookTitle = "";
		String author = "";
		int stock = 0;
		String soldOut = "X";
 
        System.out.println();
        System.out.println("장르 책번호 제목 저자 재고 ");
        System.out.println("========================================");
        int length = record.size();
 
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                Books book = (Books) record.get(i);
                System.out.println(book);
                genre += book.genre;
                bookNum += book.bookNum;
                bookTitle += book.bookTitle;
                author += book.author;
                stock += book.stock;
            }
        } else {
            System.out.println();
            System.out.println(" 데이터가 없습니다.");
            System.out.println();
        }
 
        System.out.println("========================================");
        System.out.println("도서정보 : " + Books.format(genre + "", 11, Books.RIGHT)
                + Books.format(bookNum + "", 6, Books.RIGHT)
                + Books.format(bookTitle + "", 6, Books.RIGHT) + Books.format(author + "", 6, Books.RIGHT)
        		+ Books.format(stock + "", 6, Books.RIGHT));
 
        System.out.println();
	}
}


