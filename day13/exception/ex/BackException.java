package org.day13.exception.ex;

import java.util.Scanner;

public class BackException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int account = 0;
		int deposit;
		int withdraw;
		int keyCode = 0;
		
		while(run) {
			//13 = �ٹٲ�
			//10 = ����Ű�� ����
			try {
				
			
				if(keyCode != 13 && keyCode != 10) {
					System.out.println("----------------");
					System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
					System.out.println("----------------");
					System.out.println("���� : ");
				}
				
				keyCode=System.in.read();
				
				if(keyCode==49) {
					System.out.println("���ݾ� : ");
					deposit=sc.nextInt();
					account += deposit;
					
				} else if(keyCode==50) {
					System.out.println("��ݾ� : ");
					withdraw = sc.nextInt();
					if (account > withdraw) {
						account -= withdraw;
						System.out.println("��� �Ϸ�");
					} else if (account < withdraw) {
						throw new NegativeBalanceException();
					}
					
				} else if(keyCode==51) {
					System.out.println("�ܾ� : "+ account);
				
				} else if(keyCode==52) {
					run=false;
				} 
			} catch(NegativeBalanceException b) {
				b.Negative();
			}
		}
		
		System.out.println("���α׷� ����");
		
	}

}
