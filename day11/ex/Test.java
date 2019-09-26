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
				System.out.println("1.고객정보 입력 | 2.고객정보 출력| 3. 종료");
				System.out.println("***********************************************************");
				System.out.println("메뉴 선택 : ");
				num = number.nextInt();
				System.out.println("************************************");
			} else {
				System.out.println("서비스 불가");
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			if (num == 1) {
				System.out.println("고객이름 입력 : ");
				c1.setName(sc.next());
				c1.getName();
				System.out.println("고객주소 입력 : ");
				c1.setAddress(sc.next());
				c1.getAddress();
				System.out.println("고객연락처 입력 : ");
				c1.setPhoneNum(sc.next());
				c1.getPhoneNum();
				System.out.println("고객번호 입력 : ");
				c1.setCustomerNum(sc.nextInt());
				c1.getCustomerNum();
				System.out.println("고객마일리지 입력 : ");
				c1.setMileage(sc.nextInt());
				c1.getMileage();
			} else if (num==2){
				System.out.println(c1.getCustomerNum()+"번 고객\n"+"이름 : "+c1.getName()+
						" 주소 : "+c1.getAddress()+" 연락처 : "+c1.getPhoneNum()+" 마일리지 : "+c1.getMileage());

			} else if (num==3) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			
		}
		
	}

}

