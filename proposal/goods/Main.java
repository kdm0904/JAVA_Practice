package org.proposal.goods;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		InputRecord IR = new InputRecord();
		DeleteRecord DR = new DeleteRecord();
		SaledRecord SR = new SaledRecord();
		BestRecord BR = new BestRecord();
		
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("1. ��ǰ �Է��ϱ�");
				System.out.println("2. ��ǰ �����ϱ�");
				System.out.println("3. �Ǹŵ� ��ǰ ����");
				System.out.println("4. ����Ʈ ����");
				System.out.println("5. ���α׷� ����");
				System.out.println("************************");
				System.out.println("�޴� ���� : ");					
				num = number.nextInt();
				
				if (num==1) {
					IR.inputRecord();
				} else if (num==2) {
					DR.deleteRecord();
				} else if (num==3) {
					SR.saledRecord();
				} else if (num==4) {
					BR.bestRecord();
				} else if (num==5) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �����ϼ���.");
				
			}
			
			
			
			
		}
	}

}
