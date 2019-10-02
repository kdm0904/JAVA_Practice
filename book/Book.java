package org.proposal.book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Book {
	static ArrayList record = new ArrayList();
	
	public void book() {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("������ ������ ������ �����Ͻÿ� :");
		System.out.println("1. �Ҽ� | 2. ���� | 3. ���� | 4. ���� | 5. ���θ޴� ���ư���");
		num = sc.nextInt();
		
		if(num==1) {
			novel();
		} else if (num==2) {
			literature();
		} else if (num==3) {
			textBook();
		} else if (num==4) {
			science();
		} else if (num==5) {
			main.main(null);
		}
		
	}
	
	public void novel() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("'å ��ȣ, ����, ����, ���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Novel(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. 'å ��ȣ, ����, ����, ���'�� ������ �Է��ϼ���.");
            }
        }
	}
	
	public void literature() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("'å ��ȣ, ����, ����, ���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Literature(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. 'å ��ȣ, ����, ����, ���'�� ������ �Է��ϼ���.");
            }
        }
	}
	
	public void textBook() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("'å ��ȣ, ����, ����, ���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new TextBook(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. 'å ��ȣ, ����, ����, ���'�� ������ �Է��ϼ���.");
            }
        }
	}
	
	public void science() {
		Scanner number = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. �űԵ��� �Է��ϱ�");
		System.out.println("'å ��ȣ, ����, ����, ���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while (true) {
            System.out.println(">>");
 
            try {
                String input = sc.nextLine().trim();
 
                if (!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
 
                    record.add(new Science(s2.nextInt(), s2.next(), s2.next(), s2.nextInt()));
 
                    System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("�Է¿����Դϴ�. 'å ��ȣ, ����, ����, ���'�� ������ �Է��ϼ���.");
            }
        }
	}
	
}


