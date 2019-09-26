package org.day11.ex;

import java.util.Scanner;


class Person2 {
	private static String name;
	private static String address;
	private static String phoneNum;
	
	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
}

class Customer2 extends Person2{
	
	private int customerNum;
	private int mileage;
	
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}	


public class Test {

	public static void main(String[] args) {
		
		Customer2 c1 = new Customer2();
		Scanner sc = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		int num=0;
		boolean run = true;
		
		while(run) {
			if (num < 4) {
				System.out.println("***********************************************************");
				System.out.println("1.������ �Է� | 2.������ ���| 3. ����");
				System.out.println("***********************************************************");
				System.out.println("�޴� ���� : ");
				num = number.nextInt();
				System.out.println("************************************");
			} else {
				System.out.println("���� �Ұ�");
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			if (num == 1) {
				System.out.println("���̸� �Է� : ");
				c1.setName(sc.next());
				c1.getName();
				System.out.println("���ּ� �Է� : ");
				c1.setAddress(sc.next());
				c1.getAddress();
				System.out.println("������ó �Է� : ");
				c1.setPhoneNum(sc.next());
				c1.getPhoneNum();
				System.out.println("����ȣ �Է� : ");
				c1.setCustomerNum(sc.nextInt());
				c1.getCustomerNum();
				System.out.println("�����ϸ��� �Է� : ");
				c1.setMileage(sc.nextInt());
				c1.getMileage();
			} else if (num==2){
				System.out.println(c1.getCustomerNum()+"�� ��\n"+"�̸� : "+c1.getName()+
						" �ּ� : "+c1.getAddress()+" ����ó : "+c1.getPhoneNum()+" ���ϸ��� : "+c1.getMileage());

			} else if (num==3) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			
		}
		
	}

}

