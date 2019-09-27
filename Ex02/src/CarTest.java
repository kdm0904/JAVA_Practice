class Car{
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

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.setColor("Red");
		System.out.println("color:" + myCar.getColor());
		
		myCar.setSpeed(50);
		System.out.println("speed:" +myCar.getSpeed());
		
		myCar.setGear(2);
		System.out.println("gear:" +myCar.getGear());
	

	}

}
