package org.day10.inherit;

class Car {
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
}

class SportsCar extends Car {
	boolean turbo;
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		SportsCar c2 = new SportsCar();
		
		c1.speedUp(100);
		c1.gear = 5;
		c1.color="red";
		System.out.println("속도 : "+c1.speed+" 기어 : "+c1.gear+" 색상 : " + c1.color);
		
		c2.speedUp(200);
		c2.gear = 6;
		c2.color="red";
		c2.setTurbo(true);
		System.out.println("속도 : "+c2.speed+" 기어 : "+c2.gear+" 색상 : " + c2.color +" 터보 : " +c2.turbo);
	}

}
