package org.proposal.students;

import java.util.Scanner;

public class StudentsScore {

	public static void main(String[] args) {
		boolean run = true;
		Scanner number = new Scanner(System.in);
		int num = 0;
		InputRecord IR = new InputRecord();
		DeleteRecord DR = new DeleteRecord();
		SortRecord SR = new SortRecord();
		while(run) {
			try {
				System.out.println("************************");
				System.out.println("1. �л����� �Է��ϱ�");
				System.out.println("2. �л����� �����ϱ�");
				System.out.println("3. �л����� �����Ͽ� ����");
				System.out.println("4. ���α׷� ����");
				System.out.println("************************");
				System.out.println("�޴� ���� : ");					
				num = number.nextInt();
				
				if (num==1) {
					IR.inputRecord();
				} else if (num==2) {
					DR.deleteRecord();
				} else if (num==3) {
					SR.sortRecord();
				} else if (num==4) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				
			} catch (Exception e) {
					System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �����ϼ���.");
				
			}
			
			
			
			
		}

	}
	
	
}
