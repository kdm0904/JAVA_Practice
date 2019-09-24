package org.day9.constructor;

class Car3 {
	private String color;
	private int speed;
	private int gear;
	//자동차 시리얼 넘버
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
		System.out.println(id + "번 - " + "색상 : " + color + " 속도 : " + speed + " 기어 : " + gear);
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3("blue", 200, 6);
		Car3 c2 = new Car3("white", 200, 6);
		int n = Car3.getNumberOfCars();
		
		System.out.println("지금까지 생성된 자동차 수 : "+ n);
		c1.print();
		c2.print();
	}

}
