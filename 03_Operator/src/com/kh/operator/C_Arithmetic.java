package com.kh.operator;

public class C_Arithmetic {

	/*
	 *  * ��������� (���׿����� == �ΰ��� ���� ������ ����)
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
		 System.out.println("num1 / num2 = " + (num1 / num2)); // ������ �������� ��
		 System.out.println("num1 % num2 = " + (num1 % num2)); // ������ �������� ������
		 
		 // �� % 2 == 0 ��°� ¦���� �Ҹ�
		 // �� % 2 == 1 ��°� Ȧ���� �Ҹ�
		 
		 // �� % 5 == 0 ��°� 5�� ����� �Ҹ�
		 // �� % 3 == 0 ��°� 3�� ����� �Ҹ�
		 
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
