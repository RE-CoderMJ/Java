package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 ( for문 / while문(do-while문) )
	 * 
	 * * for문
	 * 
	 * for(초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++,--)를 사용함)
	 * 
	 * * for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--------------- 이 내용이 계속 반복 ---------------
	 * 		--> 조건식 검사 --> false일 경우 실행할 구문 실행X ==> 반복문 빠져나옴
	 * 
	 * 
	 * * 알아둘 것
	 * 	 for문 안에 초기식,조건식, 증감식 각각 생략가능하긴함 (단, ;은 반드시 필수)
	 */
	
	public void method1() {
		
		for(int i = 0; i <5; i++) {
			System.out.println("안녕하세요");
			// i 값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복 수행
			// 0, 1, 2, 3, 4 => 5회
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("반갑습니다.");
			// i 값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행
			// 1, 2, 3, 4, 5 => 5회
		}
		
		for(int i = 11; i < 16; i++) {
			System.out.println("기쁘네요");
			// i 값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행
			// 11, 12, 13, 14, 15 => 5회
		}
		
		for(int i = 1; i <= 9; i += 2) {
			System.out.println("Hello");
			// i 값이 1에서부터 9까지 매번 2씩 증가하는 동안 반복 수행
			// 1, 3, 5, 7, 9 => 5회
		}
	}
	
	public void method2() {
		// 1부터 5까지 출력
		
		for(int i = 1; i<6; i++) { 
			// i값이 1에서부터 5까지 매번 1씩증가시키는동안 반복 수행(1,2,3,4,5)
			System.out.println(i);
		}
		
	}
	
	public void method3() {
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
			// i값이 5에서부터 1까지 매번 1씩 감소하는동안 반복 수행
			// 5,4,3,2,1 => 5회
		}
	}
	
	public void method4() {
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public void method5() {
		// 1 2 3 4 .... 8 9 10
		for(int i=0; i<=9; i++) {
			System.out.print(i+1 + " ");
		}
	}
	
	public void method6() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1에서부터 10까지의 총 합계 : " + sum);
	}
	
	public void method7() {
		// 1에서부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 정수 : ");
			int num = sc.nextInt();
			
			if(num >0) {
				int sum = 0;
				for(int i=1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1에서부터  " + num + "까지의 총 합계 : " + sum);
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void method8() {
		// 1에서부터 어떤 랜덤값(1~10)까지의 총 합계
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출해서 매번 다른 랜덤값을 얻어낼 수 있음!!
		 * 
		 * Math.random() 호출시 ==> 0.0 ~ 0.99999999 사이의 랜덤값 발생
		 * 						 (0.0 <=    < 1.0)
		 * 
		 */
		// int random = Math.random(); // double형이라서 안됨
		//				0.0 <=   < 1.0  => 0.0 ~ 0.999999
		// int random = Math.random() * 10;
		//				0.0 <=   < 10.0 => 0.0 ~ 0.999999
		
		// int random = Math.random() * 10 + 1;
		//				1.0 <=	  < 11.0 => 1.0 ~ 10.999999
		
		int random = (int)(Math.random() * 10 +1);
		//				1 <=   < 11     => 1 ~ 10
		
		System.out.println("1~10사이의 랜덤값 : " + random);
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		// 각 인덱스별 문자 뽑아서 출력
		for(int i = 0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i=0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 2단 출력하기
		
		for(int i=1; i<=9; i++) {
			//System.out.println("2 x " + i + " = " + 2*i);
			System.out.printf("%d x %d = %d", 2, i, 2*i);
		}
		
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9)를 입력 : ");
		int num = sc.nextInt();
		
		if(num >=2 && num <=9) { // 잘 입력했을경우 => 해당 단 출력해주기
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", num, i, num*i);
			}	
		}else { // 잘못입력햇을 경우 => "잘못입력했음"출력
			System.out.println("2~9사이의 숫자를 입력해야됩니다. 잘못입력하셨습니다.");
		}
		
	}
	
	public void method13() {
		// 2부터 9사이의 랜덤 단을 출력하기
		int dan = (int)(Math.random() * 8 + 2);
		
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
	}
	
	public void method14() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int j=0; j<3; j++) {
			for(int i=1; i<6; i++) {
				System.out.print(i + " ");
			
			}
			System.out.println();
		}
	}
	
	public void method15() {
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void method16() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");	
				}
							}
			System.out.println();
		}
	}
	
	public void method17() {
		// 2단부터 9단까지 출력
		
		for(int dan=2; dan<=9; dan++) {
		
			System.out.println("===" + dan + "단 ===");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
			System.out.println();
		}
	}
}
