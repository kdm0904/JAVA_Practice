class Television implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원이 켜졌습니다.");
		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원이  꺼졌습니다.");


		
	}
	
}


class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio 전원이 켜졌습니다.");

		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio 전원이 켜졌습니다.");

		
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
