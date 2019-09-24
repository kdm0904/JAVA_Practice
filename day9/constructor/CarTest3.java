package org.day9.constructor;

class Car3 {
	private String color;
	private int speed;
	private int gear;
	//�ڵ��� �ø��� �ѹ�
	private int id;
	private static int numberOfCars = 0;
	
	public Car3(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		id =  ++numberOfCars;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public void print() {
		System.out.println(id + "�� - " + "���� : " + color + " �ӵ� : " + speed + " ��� : " + gear);
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3("blue", 200, 6);
		Car3 c2 = new Car3("white", 200, 6);
		int n = Car3.getNumberOfCars();
		
		System.out.println("���ݱ��� ������ �ڵ��� �� : "+ n);
		c1.print();
		c2.print();
	}

}
