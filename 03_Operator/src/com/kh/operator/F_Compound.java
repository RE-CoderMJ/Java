package com.kh.operator;

public class F_Compound {

	/*
	 * * ���� ���� ������
	 * 	��������ڿ� ���Կ����ڰ� ���յǾ��ִ� ����
	 * 	����ó�� �ӵ��� �������Ƿ� ����ϴ°� ������!!
	 * 
	 * 	+= -= *= /= %=
	 * 
	 * 	a = a + 3;	=>	a += 3;
	 * 	a = a - 3;	=>	a -= 3;
	 * 	a = a * 3;	=>	a *= 3;
	 * 	a = a / 3;	=>	a /= 3;
	 * 	a = a % 3;	=>	a %= 3;
	 * 
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("���� num : " + num);
		
		num = num + 3;
		System.out.println("3 ������Ų num : " + num);
		
		num += 3;
		System.out.println("3 ������Ų num : " + num);
		
		num -= 5;
		System.out.println("5 ���ҽ�Ų num : " + num);
		
		num *= 6;
		System.out.println("6�� ������Ų num : " + num);
		
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num : " + num);
		
		num %= 4;
		System.out.println("���� num(���������� num���� 4�� ���� ������) : " + num);
		
		
		String str = "Hello";
		//str = str + "World"; // "HelloWorld"
		str += "World";
		System.out.println(str);
	}
}
