package org.day11.inherit;

/*
 * 필드 = 이름/주소/전화번호/고객번호/마일리지
 * 뒤의 2개는 고객클래스의 필드
 * 클래스당 생성자 생잔
 * 각 필드에 대해 접근자/설정자 작성
 */

class Person {
	private String name;
	private String address;
	private String phoneNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Person(String name, String address, String phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	public String toString() {
		return "이름 : "+name+" 주소 : "+address+" 연락처 : "+phoneNum;
	}
	
}

class Customer extends Person{
	
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
	public Customer(String name, String address, String phoneNum) {
		super(name, address, phoneNum);
		// TODO Auto-generated constructor stub
	}
//	public Customer(String name, String address, String phoneNum, int customerNum,int mileage) {
//		
//	}
}

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("paul", "daegu", "01011112222");
		System.out.println(p1);
		
		Customer c1 = new Customer("paul", "daegu", "01011112222");
		c1.setCustomerNum(1);
		c1.getCustomerNum();
		c1.setMileage(20000);
		c1.getMileage();
		
		System.out.println("****************");
		System.out.println("고객번호 : "+c1.getCustomerNum());
		System.out.print(c1+" 마일리지 : "+c1.getMileage());
	}

}
