package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break;	: 반복문 안에 사용되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * 	* 유의사항 : switch문 안의 break;는 단지 switch문만을 빠져나가는 구문
	 */
	
	public void method1() {
		
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정 계속 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우(%3 == 0) 반복문 빠져나오게.
		
				
		while(true) {
			int random = (int)(Math.random()*100 +1);
			
			System.out.println("랜덤값 : " + random);
			
			if(random % 3 == 0) {
				break;
			}
		}
		
	}
	
	public void method2() {
		
		// 사용자에게 문자열입력받아 해당 그 문자열의 길이 출력 (이 과정을 매번 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 빠져나가도록
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("문자열의 길이 : " + str.length());
		}
	}
	
	public void method3() {
		
		// 사용자에게 단을 입력받아 해당 단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("단(2~9)을 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { // 잘 입력했을 경우 => 해당 단을 출력 후 반복문 빠져나가기
				for(int i=1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
				break;
			}else { // 잘못입력했을 경우 => 잘못입력했음을 알리는 구문 출력
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	
	
	public void methodTest() {



		Scanner sc = new Scanner(System.in);



		System.out.print("정수1 : ");

		int num1 = sc.nextInt();

		System.out.print("정수2 : ");

		int num2 = sc.nextInt();



		sc.nextLine();

		System.out.print("연산기호(+,-,*,/,%)를 입력하시오 : ");

		char ch = sc.nextLine().charAt(0);



		int result = 0;

		if(ch == '+'){

		result = num1 + num2;

		}else if(ch == '-'){

		result = num1 - num2;

		}else if(ch == '*'){

		result = num1 * num2;

		}else if(ch == '/'){

		result = num1 / num2;

		}else if(ch == '%'){

		result = num1 % num2;

		}else {

		System. out.println("연산기호를 잘못 입력하였습니다.");

		return;

		}



		System.out.println("연산결과 : " + result);



		}
	
	
}
