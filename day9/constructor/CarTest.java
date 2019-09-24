package org.day9.constructor;

class Car {
	private String color;
	private int speed;
	private int gear;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car() {
		color = "red";
		speed = 0;
		gear = 1;
	}
	public void print() {
		System.out.println("색상 : " + color + " 속도 : " + speed + " 기어 : " + gear);
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 0);
		Car c2 = new Car();
		
		c1.print();
	}

}