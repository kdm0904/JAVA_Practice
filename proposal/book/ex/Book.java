package org.proposal.book.ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
	static ArrayList record = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	public void inputBook() {
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
            	String input = sc.nextLine().trim();
                if (!input.equalsIgnoreCase("q")) {
                	
                    System.out.println("�帣 : ");
                    record.add(new Books().genre);
                    System.out.println("å ��ȣ : " );
                    record.add(new Books().bookNum);
                    System.out.println("���� : " );
                    record.add(new Books().bookTitle);
                    System.out.println("���� : " );
                    record.add(new Books().author);
                    System.out.println("��� : " );
                    record.add(new Books().stock);
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. '�帣, å ��ȣ, ����, ����, ���'�� ������ �Է��ϼ���.");
            }
        }
		
	}
	
	
	
	//�������� ����
	public void deleteBook() {
		while (true) {
			displayRecord();
            System.out.println("�����ϰ��� �ϴ� �������� å��ȣ�� �Է��ϼ���.(q:����ȭ��)");
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
                        System.out.println("�����Ǿ����ϴ�.");
                    } else {
                        System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�.");
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. �ٽ� �Է��� �ּ���.");
            }

		}
	}
	
	//�������� ����
	public void sortBook() {
		 while (true) {
	            System.out.println(" ���ı����� �����ϼ���.(1:�帣�� 2:å��ȣ�� 3:����� 4:���θ޴�) : ");
	 
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
	                    System.out.println("��ȿ���� ���� �Է°��Դϴ�. �ٽ� �Է����ּ���.");
	                    System.out.println(" ���ı����� �����ϼ���. (1:�帣�� 2:å��ȣ�� 3:����� 4:���θ޴�) : ");
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
        System.out.println("�帣 å��ȣ ���� ���� ��� ");
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
            System.out.println(" �����Ͱ� �����ϴ�.");
            System.out.println();
        }
 
        System.out.println("========================================");
        System.out.println("�������� : " + Books.format(genre + "", 11, Books.RIGHT)
                + Books.format(bookNum + "", 6, Books.RIGHT)
                + Books.format(bookTitle + "", 6, Books.RIGHT) + Books.format(author + "", 6, Books.RIGHT)
        		+ Books.format(stock + "", 6, Books.RIGHT));
 
        System.out.println();
	}
}


