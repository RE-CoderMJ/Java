package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		Book b = new Book();
		Book b1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(b.information());
		System.out.println(b1.information());
		
		System.out.println("==========================");
		
		b.setTitle("C언어");
		b.setPrice(30000);
		b.setDiscountRate(0.1);
		b.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(b.information());
		
		System.out.println("==========================");
		
		b.caculateThePrice();
		b1.caculateThePrice();
		
		
	}

}
