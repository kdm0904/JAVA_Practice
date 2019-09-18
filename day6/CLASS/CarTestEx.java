package org.day6.CLASS;

class CarEx {
	String color;
	int speed;
	int gear;
	
	void print(String color, int speed, int gear) {
		System.out.println("color : " +color);
		System.out.println("speed : " +speed);
		System.out.println("gear : " +gear);
	}
	
}

public class CarTestEx {

	public static void main(String[] args) {
		
		CarEx myCar =  new CarEx();
		
		myCar.print("red", 60, 2);
		
	}

}
