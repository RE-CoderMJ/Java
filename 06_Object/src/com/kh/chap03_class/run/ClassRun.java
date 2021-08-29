package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		// ���� �Ŀ� �ʵ忡 ��䰪�� ��ٷ� �˾ƺ���
		// JVM�� �ʱ�ȭ���� ����������!!
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("�����");
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
		//ù��° ��� : �⺻�����ڷ� ���� �� setter �̿��ؼ� �� �ʱ�ȭ
		/*
		Product p1 = new Product();
		
		p1.setpName("Galaxy");
		p1.setPrice(120000);
		p1.setBrand("Samsung");
		*/
		Product p1 = new Product("������", 1200000, "�Ｚ");
		
		// �ι��� ��� : �Ű����� �����ڷ� ������ ���ÿ� �� �ʱ�ȭ
		
		System.out.println(p1.getpName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
		
		/*
		Product p2 = new Product();
		p2.setpName("iphone");
		p2.setPrice(1300000);
		p2.setBrand("Apple");
		*/
		Product p2 = new Product("������", 120000, "����");
		
		// pName: xxx, price: xxxx, brand: xxx
		//System.out.println("pName: " + p1.getpName() + ", price: "+ p1.getPrice() + ", brand: " +p1.getBrand());
		System.out.println(p1.information());
		
		//System.out.println("pName: " + p2.getpName() + ", price: "+ p2.getPrice() + ", brand: " +p2.getBrand());
		System.out.println(p2.information());
		
	}

}
