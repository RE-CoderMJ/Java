package com.kh.chap01_oneVSmany.model.vo;

public class Book {
	
	// ������, ����, ����, ���ǻ�
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// �⺻������
	public Book() {}
	
	// �Ű����� ������
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// �� �ʵ忡 ���� setter�޼ҵ��
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// �� �ʵ忡 ���� getter�޼ҵ��
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	// ��� �ʵ��� ���� �ϳ��� ���ڿ��� ���� ��ȯ���ִ� information �޼ҵ�
	public String information() {
		return "Title : " + title + ", Author: " + author + ", Price : " + price + ", Publisher : " + publisher;
	}

}
