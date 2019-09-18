package org.day6.CLASS;

class Car {
	String color;
	int speed;
	int gear;
	
	void print() {
		System.out.println("color : " +color);
		System.out.println("speed : " +speed);
		System.out.println("gear : " +gear);
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar =  new Car();
		myCar.color = "red";
		myCar.speed = 50;
		myCar.gear = 2;
		myCar.print();
		
		Car yourCar =  new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 2;
		yourCar.print();
		
	}

}



