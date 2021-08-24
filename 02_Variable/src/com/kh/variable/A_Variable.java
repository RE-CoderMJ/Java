package com.kh.variable;

public class A_Variable {

	//시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printVariable() {
		
		System.out.println("==== 변수 사용 전 ====");
		
		System.out.println("시급 : 8500원");//9450으로 변경
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
	
		// 월급 = 시급 X 근무시간 X 근무일수
		// 김갑생 = ooooo원 형식으로 출력하고싶다!
		System.out.println("James : " + (9450 * 6 * 8) + "원");
		System.out.println("Ann : " + (9450 * 6 * 8) + "원");
		System.out.println("Sophia : " + (9450 * 6 * 8) + "원");
		System.out.println("Katie : " + (9450 * 6 * 8) + "원");
		System.out.println("Summer : " + (9450 * 6 * 8) + "원"); // 곱셈은 * 기호로 나타낸다.
	
		//변수 사용 후
		System.out.println("==== 변수 사용 후 ====");
		
		int pay = 9450; // 자바에서 = 기호는 동등하다라는 뜻이 아니라 8500이라는 값을 pay라는 변수에 대입시켜주는 것.
		int time = 6;
		int day = 8;
		
		System.out.println("Soo : " + (pay * time * day) + "원");
		System.out.println("Brittany : " + (pay * time * day) + "원");
		System.out.println("Regina : " + (pay * time * day) + "원");
		System.out.println("Samantha : " + (pay * time * day) + "원");
		System.out.println("Cindy : " + (pay * time * day) + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다.)
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. (재사용성이 높아진다.)
		 * 3. 유지보수를 보다 쉽게할 수 있다.
		 */
	}
	
	//변수의 선언
	public void declareVariable(){
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉, 값을 보관하기 위한 상자를 만들겠다!!
		 * 
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분(의미부여!)
		 * 
		 * 변수 선언 시 주의할점
		 * 1. 변수명은 소문자로 시작 / 단, 낙타봉 표기법을 지킬것! / 예약어는 불가!
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가 => 즉, 중복이 불가능하다!
		 * 3. 해당 영역 안 ({}) 에서 선언된 변수는 그 영역 안에서만 사용 가능
		 * 	=> 다른 메소드에서는 사용이 불가하다!
		 */
		
		// ------ 자료형에 대한 개념 ------
		// 1. 논리형 (논리값 = true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte
		System.out.println("isFalse안에 값 대입 전! " + isFalse);
		
		isTrue = 1+3 > 1; // 4는 1보다 큽니까? 참입니다! 즉 (true)를 의미
		isFalse = 4+2 < 1; // 6은 1보다 작습니까? 거짓입니다! (false)를 의미
		
		// 2. 숫자형
		// 2_1. 정수형 (소숫점 X)
		byte bNum; // 1byte (-128 ~ 127)
		bNum = -128;
		//bNum = 128;
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte, 정수형의 기본 자료형
		
		long lNum = 100000; // 8byte
		
		// 2_2. 실수형 (소숫점 O)
		float fNum = 0.0f; // 4byte -> 소숫점 7자리까지 표현 가능
						   // float의 경우 double과 값을 구분하기위해 값뒤에 f를 붙여준다.
		
		double dNum = 0.0; // 8byte -> 소숫점 15자리까지 표현 가능, 실수형의 기본 자료형
		
		// 3. 문자형
		// 3_1. 문자
		char ch = 'a'; // 2byte
		char kim;
		kim = '김';
		
		// 3_2. 문자열
		String str; // 참조형
		str = "abc";
		
		// 값이 잘 담겼는지 확인해보자!
		System.out.println(isTrue);
		System.out.println("isFalse에 새로운 값을 넣은 후 : " + isFalse);
		System.out.println(bNum);
		
		// 변수이름 : 값의 형태로 출력하고싶다!
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("kim : " + kim);
		System.out.println("str : " + str);
		
		
		// 상수의 선언!
		// [표현법] final 자료형 상수이름;
		final int AGE; // 상수명은 모두 대문자로 적는다!
		AGE = 10; // 초기화
		
		System.out.println("AGE : " + AGE);
		
		//AGE = 1004; 오류가 나는 것을 알 수 있다. 상수는 값의 변경이 불가하다.
		//대표적인 상수의 예 : 3.14 (파이, 원주율)
		System.out.println("파이 : " + Math.PI);
		
		//번외 (가독성을 위해 '_' 사용 가능
		int etc = 999_999_999;
		
		System.out.println("etc : " + etc);
	}
	
	
}
