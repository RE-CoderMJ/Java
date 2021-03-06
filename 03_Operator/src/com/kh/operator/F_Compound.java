package com.kh.operator;

public class F_Compound {

	/*
	 * * 복합 대입 연산자
	 * 	산술연산자와 대입연산자가 결합되어있는 형태
	 * 	연산처리 속도가 빨라지므로 사용하는걸 권장함!!
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
		
		System.out.println("최초 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num += 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("최종 num(이전까지의 num값을 4로 나눈 나머지) : " + num);
		
		
		String str = "Hello";
		//str = str + "World"; // "HelloWorld"
		str += "World";
		System.out.println(str);
	}
}
