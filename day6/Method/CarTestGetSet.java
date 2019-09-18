package org.day6.Method;

class Car {
	private String color;
	private int speed;
	private int gear;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	
}

public class CarTestGetSet {

	public static void main(String[] args) {
		
		Car myCar =  new Car();
		myCar.setColor("Red");
		myCar.getColor();
		System.out.println("color : " +myCar.getColor());
		
		myCar.setSpeed(50);
		myCar.getSpeed();
		System.out.println("speed : " +myCar.getSpeed());
		
		myCar.setGear(2);
		myCar.getGear();
		System.out.println("gear : " +myCar.getGear());
	}

}
