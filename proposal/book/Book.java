package org.proposal.book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
	static ArrayList record = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("도서관리 프로그램 ver 1.0");
				System.out.println("************************");
				System.out.println("1. 신규도서 입력");
				System.out.println("2. 도서정보 삭제");
				System.out.println("3. 전체 도서정보 출력");
				System.out.println("4. 판매 현황");
				System.out.println("5. 베스트셀러");
				System.out.println("6. 프로그램종료");
				System.out.println("************************");
				System.out.println("메뉴 선택 : ");					
				num = number.nextInt();
				
				if (num==1) {
					inputBook();
				} else if (num==2) {
					deleteBook();
				} else if(num==3) {
					sortBook();
				} else if(num==4) {
					sellBooks();
				} else if(num==5) {
					bestSeller();
				}
				else if (num==6) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("유효하지 않은 값입니다. 다시 선택하세요.");
				
			}
		}
	}	
	
	public static void inputBook() {
		System.out.println("1. 신규도서 입력하기");
		System.out.println("'장르 ,책 번호, 제목, 저자, 재고, 판매부수'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Books(s2.next(), s2.next(), s2.next(), s2.next(), s2.nextInt(), s2.nextInt()));
 
                    System.out.println("입력이 완료되었습니다. 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다. '장르, 책 번호, 제목, 저자, 재고, 판매부수'의 순서로 입력하세요.");
            }
        }
		
	}
	
	
	
	//도서정보 삭제
	private static void deleteBook() {
		while (true) {
			displayMenu();
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
	public static void sortBook() {
		 while (true) {
	            System.out.println(" 정렬기준을 선택하세요.(1:장르순 2:책번호순 3:제목순 4:판매부수순 5:메인메뉴) : ");
	 
	            int sort = 0;
	 
	            do {
	                try {
	                    sort = Integer.parseInt(sc.nextLine());
	 
	                    if (sort >= 1 && sort <= 5) {
	                        break;
	                    } else {
	                        throw new Exception();
	                    }
	 
	                } catch (Exception e) {
	                    System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
	                    System.out.println(" 정렬기준을 선택하세요. (1:장르순 2:책번호순 3:제목순 4:판매부수순 5:메인메뉴) : ");
	                }
	            } while (true);
	 
	            if (sort == 1) {
	                Collections.sort(record, new GenreAscending());
	                displayMenu();
	            } else if (sort == 2) {
	                Collections.sort(record, new BookNumAscending());
	                displayMenu();
	            } else if (sort == 3) {
	            	Collections.sort(record, new TitleAscending());
	                displayMenu();
	            } else if (sort == 4) {
	            	Collections.sort(record, new Stockdescending());
	        		displayMenu();
	            }
	            
	            else {
	                return;
	            }
	        }
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		String genre = "";
		String bookNum = "";
		String bookTitle = "";
		String author = "";
		int stock = 0;
		int sells = 0;
		String soldOut = "X";
 
        System.out.println();
        System.out.println("장르 책번호 제목 저자 재고 판매부수");
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
                sells += book.sells;
            }
        } else {
            System.out.println();
            System.out.println(" 데이터가 없습니다.");
            System.out.println();
        }
 
        System.out.println("========================================");
        System.out.println();
	}
	
	private static void sellBooks() {
		displayMenu();
		System.out.println("판매된 책 번호를 입력하세요.(q:메인화면)");
		try {
            String input = sc.nextLine().trim();

            if (!input.equalsIgnoreCase("q")) {
                int length = record.size();
                boolean found = false;

                for (int i = 0; i < length; i++) {
                    Books book = (Books) record.get(i);
                    if (input.equals(book.bookNum)) {
                        found = true;
                        record.get(i);
                        System.out.println("판매된 부수를 입력하세요 : ");
                        book.sells = sc.nextInt();
                        book.stock = book.stock-book.sells; 
                        System.out.println(i +"번 책 판매부수 : "+ book.sells);
                        record.get(i);
                    }
                }

                if (found) {
                    System.out.println("입력되었습니다.");
                    
                } else {
                    System.out.println("일치하는 데이터가 없습니다.");
                }
            } else {
                return;
            }
        } catch (Exception e) {
            System.out.println("입력오류입니다. 다시 입력해 주세요.");
        }
		displayMenu();
	}
	
	private static void bestSeller() {
		Collections.sort(record, new Stockdescending());
		displayMenu();
	}
}


