package org.proposal.goods;

import java.util.Scanner;

import org.proposal.students.Score;

public class InputRecord {
	
	private String goodsType;
	private String goodsNum;
	private String goodsName;
	private int goodsPrice;
	private int goodsStock;
	
	public String getGoodsType() {
		return goodsType;
	}



	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}



	public String getGoodsNum() {
		return goodsNum;
	}



	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}



	public String getGoodsName() {
		return goodsName;
	}



	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}



	public int getGoodsPrice() {
		return goodsPrice;
	}



	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}



	public int getGoodsStock() {
		return goodsStock;
	}



	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}



	public void inputRecord() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("��ǰ������ �Է��Ͻÿ� : ");
		setGoodsType(sc.next());
		getGoodsType();
		System.out.println("��ǰ��ȣ�� �Է��Ͻÿ� : ");
		setGoodsNum(sc.next());
		getGoodsNum();
		System.out.println("��ǰ�̸��� �Է��Ͻÿ� : ");
		setGoodsName(sc.next());
		getGoodsName();
		System.out.println("��ǰ������ �Է��Ͻÿ� : ");
		setGoodsPrice(sc.nextInt());
		getGoodsPrice();
		System.out.println("��� �Է��Ͻÿ� : ");
		setGoodsStock(sc.nextInt());
		getGoodsStock();
		
		
	}

}
