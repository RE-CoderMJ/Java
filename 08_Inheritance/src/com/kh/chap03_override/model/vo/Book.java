package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	/*
	 * * �������̵�
	 * - �ڽ�Ŭ������ ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ°�
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * 	  �ڽ� ��ü�� ���� ����� �ڽĸ޼ҵ尡 �켱���� ����
	 * 
	 * * �������̵� ���� ����
	 * - �θ�޼ҵ�� ����
	 * - �Ű����� ����, �ڷ���, ���� ����(�Ű��������� �������)
	 * - �θ�޼ҵ��� ��ȯ�� ����(jdk �������� �Ǹ鼭 �θ�޼ҵ��� ��ȯ���� �ڽ� �ڷ�����δ� ����)
	 *   ex) �θ�޼ҵ��� ���������ڰ� protected�� ��� �������̵��ϴ� �޼ҵ��� ���������ڴ� protected, public
	 *   
	 *   => �Ծ��� ������ ������(�ʰ� �������ҰŸ� �������� ��Ģ�� ������)
	 *  
	 * * @Override ������̼�
	 * - ���� ������, ũ�� ��� ���� (������� �ʾƵ� �������̵� �� ����)
	 * - ������̼� ���̴� ����
	 * 	 >> �θ� �޼ҵ���̳� �Ű������� ������ ��� => ã�ƺ��� ����
	 * 	        �ڽĸ޼ҵ� ����� ��Ÿ�� ���� ��� => ã�ƺ��� ����
	 * 	 >> ���� �� �޼ҵ� �������̵� �� �޼ҵ�� �˸��� �;!
	 */
	@Override
	public String toString() {
		return "title= " + title + ", author= " + author + ", price= " + price;
	}
	

}
