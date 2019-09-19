package org.day7;

class Car {
	
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수버전 호출 " + s);
	}

	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수버전 호출 " + s);
	}
}

public class carTest {

	public static void main(String[] args) {

		Car myCar =  new Car();
		
		myCar.setSpeed(50);
		myCar.setSpeed(60.1);
	}

}
