package org.day12;

public interface RemoteControl {

	public void turnOn();
	public void turnOff();
}

class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ����");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV ����");
	}
	
}

class Radio implements RemoteControl {
	@Override
	public void turnOn()
	{
		System.out.println("���� ����");
	}
	@Override
	public void turnOff() {
		System.out.println("���� ����");
	}
}

