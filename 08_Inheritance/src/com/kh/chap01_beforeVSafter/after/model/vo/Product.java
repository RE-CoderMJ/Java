package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	// �� Ŭ���� ��� ���������� ������ �ִ� ��ҵ�(�ʵ�, �޼ҵ�)���� ���
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode(String pCode) {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName(String pName) {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price;
	}
}