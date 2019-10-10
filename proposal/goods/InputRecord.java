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
		
		
		System.out.println("상품종류를 입력하시오 : ");
		setGoodsType(sc.next());
		getGoodsType();
		System.out.println("상품번호를 입력하시오 : ");
		setGoodsNum(sc.next());
		getGoodsNum();
		System.out.println("상품이름을 입력하시오 : ");
		setGoodsName(sc.next());
		getGoodsName();
		System.out.println("상품가격을 입력하시오 : ");
		setGoodsPrice(sc.nextInt());
		getGoodsPrice();
		System.out.println("재고를 입력하시오 : ");
		setGoodsStock(sc.nextInt());
		getGoodsStock();
		
		
	}

}
