package com.kh.chap03_class.model.vo;

public class Product {
	// Ŭ���� ���� ������ �ۼ������� ����������(public, default)
	// public���� �ϸ� ���� ��Ű���� �ٸ� ��Ű���� �ش� Ŭ���� ��밡��
	// default�� �ϸ� ���� ��Ű�������� ��� ���� / �ٸ� ��Ű�������� �ش� Ŭ���� ��� �Ұ�

	/*
	 * * �ʵ�(field)
	 * 
	 * �ʵ� == ������� == �ν��Ͻ�����
	 * 
	 * < ǥ���� >
	 * ���������� [�����] �ڷ��� ������;
	 */
	
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * * ������
	 * - ��ü�� �����ϱ� ���� ������ �޼ҵ�
	 * 
	 * < ǥ���� >
	 * ���������� Ŭ������([�Ű�����, �Ű�����, ...]) {
	 * 
	 * }
	 */
	public Product() {
		
	}
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	/*
	 * * �޼ҵ�
	 * - ����� ó���ϴ� ���
	 * 
	 * < ǥ���� >
	 * ���������� ��ȯ�� �޼ҵ��([�Ű�����, �Ű�����,...]) {
	 * 		// ��� ����
	 * }
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	//��� �ʵ尪�� �� ��ģ �� ���ڿ��� ��ȯ���ִ� �޼ҵ�
	public String information() {
		return "pName: " + pName + ", price: " + price + ", brand: " + brand;
	}
}