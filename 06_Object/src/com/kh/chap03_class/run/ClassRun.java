package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화까지 진행해줬음!!
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("김민지");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("abcd@gamil.com");
		
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		System.out.println("===================");
		//첫번째 방법 : 기본생성자로 생성 후 setter 이요해서 값 초기화
		/*
		Product p1 = new Product();
		
		p1.setpName("Galaxy");
		p1.setPrice(120000);
		p1.setBrand("Samsung");
		*/
		Product p1 = new Product("갤럭시", 1200000, "삼성");
		
		// 두번쨰 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		
		System.out.println(p1.getpName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
		
		/*
		Product p2 = new Product();
		p2.setpName("iphone");
		p2.setPrice(1300000);
		p2.setBrand("Apple");
		*/
		Product p2 = new Product("아이폰", 120000, "애플");
		
		// pName: xxx, price: xxxx, brand: xxx
		//System.out.println("pName: " + p1.getpName() + ", price: "+ p1.getPrice() + ", brand: " +p1.getBrand());
		System.out.println(p1.information());
		
		//System.out.println("pName: " + p2.getpName() + ", price: "+ p2.getPrice() + ", brand: " +p2.getBrand());
		System.out.println(p2.information());
		
	}

}
