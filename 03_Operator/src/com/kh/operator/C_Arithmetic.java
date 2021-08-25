package com.kh.operator;

public class C_Arithmetic {

	/*
	 *  * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 *  + - * / %
	 *  
	 *  * / %  >  + -
	 */
	 
	 public void method1() {
		 int num1 = 10;
		 int num2 = 3;
		 
		 System.out.println("num1 + num2 = " + (num1 + num2));
		 System.out.println("num1 - num2 = " + (num1 - num2));
		 System.out.println("num1 * num2 = " + (num1 * num2));
		 System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기 했을때의 몫
		 System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 했을때의 나머지
		 
		 // 값 % 2 == 0 라는건 짝수란 소리
		 // 값 % 2 == 1 라는건 홀수란 소리
		 
		 // 값 % 5 == 0 라는건 5의 배수란 소리
		 // 값 % 3 == 0 라는건 3의 배수란 소리
		 
	 }
	 
	 public void quiz() {
	 int a = 5;
	 int b =10;
	 
	 int c = (++a) + b;
	 int d = c / a;
	 int e = c % a;
	 int f = e++;
	 int g = (--b)+ (d--);
	 int h = 2;
	 int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	 
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);
	 System.out.println("c : " + c);
	 System.out.println("d : " + d);
	 System.out.println("e : " + e);
	 System.out.println("f : " + f);
	 System.out.println("g : " + g);
	 System.out.println("h : " + h);
	 System.out.println("i : " + i);
	 
	 }

}
