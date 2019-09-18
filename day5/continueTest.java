package org.day5;

public class continueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
