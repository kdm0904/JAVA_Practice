package org.day5;

public class exKeyboard {
	//throws Exception - ����ó��
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*
 *Ű����� ���� �Է�
 *-1. �������� : 49
 *-2. ���ڰ��� : 50
 *-3. ���� : 51 
 */
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			//13 = �ٹٲ�
			//10 = ����Ű�� ����
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("----------------");
				System.out.println("���� : ");
			}
			
			keyCode=System.in.read();
			
			if(keyCode==49) {
				speed++;
				System.out.println("���� �ӵ� : "+speed);
			} else if(keyCode==50) {
				speed--;
				System.out.println("���� �ӵ� : "+speed);
			} else if(keyCode==51) {
				run=false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
	

}
