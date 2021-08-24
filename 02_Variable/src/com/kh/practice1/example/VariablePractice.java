package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + 
		gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : " + (num1-num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기 몫 결과 : " + (num1/num2));
	}
	
	public void method3() {
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + width*length);
		System.out.println("둘레 : " + (width+length)*2);
		
	}
	
	public void method4() {
		sc.nextLine();
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + a.charAt(0));
		System.out.println("두 번째 문자 : " + a.charAt(1));
		System.out.println("세 번째 문자 : " + a.charAt(2));
		
	}
}

