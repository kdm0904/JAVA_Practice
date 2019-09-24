package org.day9.constructor;

public class CarTest2 {
	private String color;
	private int speed;
	private int gear;
	
	public CarTest2(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public CarTest2(String c) {
		this(c, 0, 1);
	}
}
