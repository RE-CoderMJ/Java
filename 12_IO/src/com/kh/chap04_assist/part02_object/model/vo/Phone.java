package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // ����ȭ

	// ��ü ��ü�� ������ϰ��� �Ѵٸ� �ݵ�� ����ȭ ���� �ʼ�
	
	private String name;
	private int price;
	
	public Phone() {}

	// Alt + Shift + S => O => Enter
	public Phone(String name, int price) { 
		super();
		this.name = name;
		this.price = price;
	}

	// Alt + shift + s => r => alt + a(����ʵ� üũ) => alt + r(generate)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// alt + shift + s => s => enter
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
}
