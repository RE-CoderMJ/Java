package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * * while 문
	 * 
	 * 초기식;
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식이 true일 경우 해당 코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사--> false일 경우 실행코드 실행x => 반복문 빠져나옴
	 * 
	 */
	
	public void method1() {
		
		// 안녕하세요 5번 출력
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while(i<=5) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " "); // 위의 두줄을 다음과 같이 한줄로 줄일 수 있음
		}
	}
	
	public void method3() {
		// 1에서 부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		
		int num = 1;
		/*
		while(num < 10) {
			System.out.print(num + " ");
			num += 2;
		}
		*/
		while(num < 10) {
			if(num % 2 == 1) {
				System.out.print(num + " ");
			}
			num++;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값(1~100사이) 까지의 합계
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i<=random) {
			sum += i++;
			//i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	public void method5() {
		// A_For 클래스에 method10을 while문으로 변경해서 실행
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i++));
		}
	}
}
