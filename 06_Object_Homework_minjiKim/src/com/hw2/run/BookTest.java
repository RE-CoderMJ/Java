package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		Book b = new Book();
		Book b1 = new Book("�ڹ�������", 20000, 0.2, "����");
		
		System.out.println(b.information());
		System.out.println(b1.information());
		
		System.out.println("==========================");
		
		b.setTitle("C���");
		b.setPrice(30000);
		b.setDiscountRate(0.1);
		b.setAuthor("ȫ�浿");
		
		System.out.println("������ ��� Ȯ��");
		System.out.println(b.information());
		
		System.out.println("==========================");
		
		b.caculateThePrice();
		b1.caculateThePrice();
		
		
	}

}
