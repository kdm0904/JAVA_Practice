package org.day9.constructor;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	public Time() {
		this(0, 0, 0);
	}
	
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	public void setTime(int h, int m, int s) {
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
}

public class TimeTest {

	public static void main(String[] args) {
		
		Time time1 = new Time();
		System.out.print("�⺻ ������ ȣ�� �� �ð� : ");
		System.out.println(time1.toString());
		
		Time time2 = new Time(13,27,6);
		System.out.print("�ι�° ������ ȣ�� �� �ð� : ");
		System.out.println(time2.toString());
		
		Time time3 = new Time(99, 89, 75);
		System.out.print("�ùٸ��� �ʴ� �ð� ȣ�� �� �ð� : ");
		System.out.println(time3.toString());
	}

}
