class Television implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ������ �������ϴ�.");
		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("TV ������  �������ϴ�.");


		
	}
	
}


class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio ������ �������ϴ�.");

		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio ������ �������ϴ�.");

		
	}
	
}

public class TestRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television();
		Radio  rc = new Radio();
		
		tv.turnOn();
		tv.trunOff();
		
		rc.turnOn();
		rc.trunOff();
		

	}

}
