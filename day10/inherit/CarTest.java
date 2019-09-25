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
		System.out.println("�ӵ� : "+c1.speed+" ��� : "+c1.gear+" ���� : " + c1.color);
		
		c2.speedUp(200);
		c2.gear = 6;
		c2.color="red";
		c2.setTurbo(true);
		System.out.println("�ӵ� : "+c2.speed+" ��� : "+c2.gear+" ���� : " + c2.color +" �ͺ� : " +c2.turbo);
	}

}
