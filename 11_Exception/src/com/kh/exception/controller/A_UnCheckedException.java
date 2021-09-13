package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException {

	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
	 * - NullPointerException : 참조변수가 null로 초기화된 상황에서 어떤거에 접근했을 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될때 발생되는 예외
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있음
	 * 	    아싸리 애초에 예외자체가 발생이 안되게끔 if문 조건처리 가능
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2; // 사용자가 두번째 정수를 0으로 입력하는 순간 예외 발생 => 비정상적으로 프로그램 종료
		/*
		// 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사 => 예외처리 아님!!
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		
		System.out.println("안녕하세요 반갑습니다. 당신의 결과를 알려드리겠습니다.");
		System.out.println("result : " + result);
		*/
		
		// 예외처리 : 예외가 "발생했을때" 실행할 내용을 미리 작성해놓는 방법
		/*
		 * * try catch 방법
		 * 
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 * }catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생됐을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
			
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			//e.printStackTrace(); // 강제로 오류난 이력보고자 할 때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스로제시하면서 접근했을 때 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/* if문으로 아싸리 예외자체가 발생이 안되도록 먼저 막는 방법
		if(size >= 101) {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);			
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " +arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		// 다중 catch블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " +arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수만을 입력해야됩니다.");
		}
		*/
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " +arr[100]);
			
		}catch(RuntimeException e) { // 다형성 적용해서 부모타입의 예외클래스 작성 가능
									 // 모든 자식 예외 발생시 다 받아서처리할 수 있음
			System.out.println("예외가 발생되긴했어.. 배열의 크기가 잘못됐던가,부적절한 인덱스가 제시됐던가, 정수가 아닌걸 입력했어");
		}
		*/
		// 각각의 예외 발생시 실행할 내용이 별개일경우 세분화해서 다중 catch블럭으로 기술하는게 적절함!
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " +arr[100]);
			
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
		}
		catch(RuntimeException e) {
			System.out.println("예외가 발생되긴했어.. 배열의 크기가 잘못됐던가,부적절한 인덱스가 제시됐던가");
		}
		// 부모 예외클래스와 자식 예외클래스를 가지고 catch블럭을 기술하고자 할때는
		// 자식예외클래스 catch블럭이 위에 있어야만함!! (아니면 unreachable catch block 오류뜸)
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * * RuntimeException 관련 애들은 UnCheckedException (예외처리구문이 필수는 아님)
	 * 	 if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 하는 것(예외처리구문 아님)
	 * 	 try-catch문 : 예외가 "발생했을 경우" 처리해주는 구문을 작성해두는 것(예외처리구문임)
	 * 
	 * 	 예측 가능한 상황은 if문으로 조건심사로 해결하는게 권장사항임!
	 * 	 부득이하게 조건문으로 핸들링이 안되는 구문 예외처리구문으로 작성해둘것!
	 */
	
}
