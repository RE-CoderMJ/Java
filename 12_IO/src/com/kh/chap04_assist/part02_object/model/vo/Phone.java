package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화

	// 객체 자체를 입출력하고자 한다면 반드시 직렬화 과정 필수
	
	private String name;
	private int price;
	
	public Phone() {}

	// Alt + Shift + S => O => Enter
	public Phone(String name, int price) { 
		super();
		this.name = name;
		this.price = price;
	}

	// Alt + shift + s => r => alt + a(모든필드 체크) => alt + r(generate)
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
