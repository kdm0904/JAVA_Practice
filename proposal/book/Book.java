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
				System.out.println("�������� ���α׷� ver 1.0");
				System.out.println("************************");
				System.out.println("1. �űԵ��� �Է�");
				System.out.println("2. �������� ����");
				System.out.println("3. ��ü �������� ���");
				System.out.println("4. �Ǹ� ��Ȳ");
				System.out.println("5. ����Ʈ����");
				System.out.println("6. ���α׷�����");
				System.out.println("************************");
				System.out.println("�޴� ���� : ");					
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
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �����ϼ���.");
				
			}
		}
	}	
	
	public static void inputBook() {
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("'�帣 ,å ��ȣ, ����, ����, ���, �Ǹźμ�'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Books(s2.next(), s2.next(), s2.next(), s2.next(), s2.nextInt(), s2.nextInt()));
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. '�帣, å ��ȣ, ����, ����, ���, �Ǹźμ�'�� ������ �Է��ϼ���.");
            }
        }
		
	}
	
	
	
	//�������� ����
	private static void deleteBook() {
		while (true) {
			displayMenu();
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
	public static void sortBook() {
		 while (true) {
	            System.out.println(" ���ı����� �����ϼ���.(1:�帣�� 2:å��ȣ�� 3:����� 4:�Ǹźμ��� 5:���θ޴�) : ");
	 
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
	                    System.out.println("��ȿ���� ���� �Է°��Դϴ�. �ٽ� �Է����ּ���.");
	                    System.out.println(" ���ı����� �����ϼ���. (1:�帣�� 2:å��ȣ�� 3:����� 4:�Ǹźμ��� 5:���θ޴�) : ");
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
        System.out.println("�帣 å��ȣ ���� ���� ��� �Ǹźμ�");
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
            System.out.println(" �����Ͱ� �����ϴ�.");
            System.out.println();
        }
 
        System.out.println("========================================");
        System.out.println();
	}
	
	private static void sellBooks() {
		displayMenu();
		System.out.println("�Ǹŵ� å ��ȣ�� �Է��ϼ���.(q:����ȭ��)");
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
                        System.out.println("�Ǹŵ� �μ��� �Է��ϼ��� : ");
                        book.sells = sc.nextInt();
                        book.stock = book.stock-book.sells; 
                        System.out.println(i +"�� å �Ǹźμ� : "+ book.sells);
                        record.get(i);
                    }
                }

                if (found) {
                    System.out.println("�ԷµǾ����ϴ�.");
                    
                } else {
                    System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�.");
                }
            } else {
                return;
            }
        } catch (Exception e) {
            System.out.println("�Է¿����Դϴ�. �ٽ� �Է��� �ּ���.");
        }
		displayMenu();
	}
	
	private static void bestSeller() {
		Collections.sort(record, new Stockdescending());
		displayMenu();
	}
}


