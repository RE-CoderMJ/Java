package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "�� " + age + "�� " + 
		gender + "�� " + name + "�� �ݰ����ϴ�^^");
	}
	
	public void method2() {
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1+num2));
		System.out.println("���� ��� : " + (num1-num2));
		System.out.println("���ϱ� ��� : " + (num1*num2));
		System.out.println("������ �� ��� : " + (num1/num2));
	}
	
	public void method3() {
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		System.out.print("���� : ");
		double length = sc.nextDouble();
		
		System.out.println("���� : " + width*length);
		System.out.println("�ѷ� : " + (width+length)*2);
		
	}
	
	public void method4() {
		sc.nextLine();
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String a = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + a.charAt(0));
		System.out.println("�� ��° ���� : " + a.charAt(1));
		System.out.println("�� ��° ���� : " + a.charAt(2));
		
	}
}

