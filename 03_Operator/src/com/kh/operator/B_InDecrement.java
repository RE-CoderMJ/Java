package com.kh.operator;

public class B_InDecrement {

	/*
	 *  * 증감연산자 (단항 연산자)
	 *  ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 *       ++변수; 변수++;
	 *  -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 *       --변수; 변수--;
	 *       
	 * (증감연산자)변수 : 전위연산       => 선증감 후처리
	 * 변수(증감연산자) : 후위연산      => 선처리 후증감
	 */
	
	public void method1() {
		
		// 전위연산 테스트
		int num1 = 10;
		System.out.println("전위 연산 적용 전 num1의 값 : " + num1); //num1=10 출력
		System.out.println("1회 수행 후 결과 : " + ++num1); // num=11 출력
		System.out.println("2회 수행 후 결과 : " + ++num1); // num=12 출력
		System.out.println("3회 수행 후 결과 : " + ++num1); // num=13 출력
		System.out.println("최종 num1의 값 : " + num1); // 13출력
		
		System.out.println("=========================");
		
		// 후위연산 테스트
		int num2 = 10;
		System.out.println("후위 연산 적용 전 num2의 값 : " + num2); // num2=10 출력
		System.out.println("1회 수행 후 결과 : " + num2++); // 10출력 후 => num2=11로 증가
		System.out.println("2회 수행 후 결과 : " + num2++); // 11출력 후 => num2=12로 증가
		System.out.println("3회 수행 후 결과 : " + num2++); // 12출력 후 => num2=13로 증가
		System.out.println("최종 num2의 값 : " + num2++); // 13출력
	}
	
	public void method2() {
		int a = 10;
		int b = ++a; //선증가 a = 11 b = 11
		
		System.out.printf("a : %d, b : %d\n", a, b);
		
		int c = 10;
		int d = c++; // d=10, c=11
		
		System.out.printf("c : %d, d : %d\n", c, d);
		
		System.out.println("=======================");
		
		int num =20;
		System.out.println("현재 num : " + num); // 20
		System.out.println("++num은? : " + ++num); // 21
		System.out.println("num++는? : " + num++); // 21
		System.out.println("--num은? : " + --num); // 21
		System.out.println("num--는? : " + num--); // 21
		System.out.println("최종 num : " + num); // 20
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = ++num1 * 3; // 21, 63
		
		System.out.printf("num1 : %d, result1 : %d\n", num1, result1);
		
		int num2 = 20;
		int result2 = num2++ * 3; // 21, 60
		
		System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // 10
		System.out.println(++a + b++); // a=12 b= 20 32
		System.out.println(a++ + --b + --c); // a=12 b=20 c=29 61
		
		System.out.printf("a : %d, b : %d, c: %d", a, b, c); // a=13 b=20 c=29
	}
}
