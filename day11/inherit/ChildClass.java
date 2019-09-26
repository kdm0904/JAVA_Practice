package org.day11.inherit;

class ParentsClass {
	int data = 100;
	public void print() {
		System.out.println("���� Ŭ������ print() �żҵ�");
	}
}

public class ChildClass extends ParentsClass {
	
	int data = 200;
	public void print() {
		super.print();
		System.out.println("���� Ŭ������ print() �żҵ�");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.print();
	}

}
