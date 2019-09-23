package org.day8.practice3;

public class calc {
	
	point score = new point();
	
	
	public int tot() {
		int tot = score.getKor()+score.getEng()+score.getMath();
		return tot;
	}

	public int avg() {
		int avg = (score.getKor()+score.getEng()+score.getMath())/3;
		return avg;
	}
}	
