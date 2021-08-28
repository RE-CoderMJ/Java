package com.kh.array;

import java.util.Arrays;
// import java.lang.*; => 알게모르게 포함되어있음

public class B_ArrayCopy {

	// 배열 복사
	public void method1() {
		int[] original = {1, 2, 3, 4, 5};
		
		System.out.println("<< original 배열 출력 >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println();
		
		//단순하게 origin을 다시 대입시킨 copy배열 세팅
		int[] copy = original;
		System.out.println("<< 복사본 배열 출력 >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("********* 복사본 배열 값 변경 후 ********");
		System.out.println("<< original 배열 출력 >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("\n << 복사본 배열 출력 >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// copy만을 가지고 수정을 해도 원본까지 변경되어있음
		// 왜? original과 copy가 같은 곳을 참조하고 있기 때문 (즉, 같은 주소값)
		System.out.println("\noriginal 주소값 : " + original.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		// 얕은복사 : 주소값을 복사

	}
	
	// 얕은복사의 문제를 해결하기 위해서 깊은복사
	public void method2() {
		// 1. for문을 활용한 방법
		//	    새로운 배열을 아싸리 생성한 후 반복문을 활용해서 원본배열의 값들을 새로이 만든 배열에 대입
		int[] original = {1, 2, 3, 4, 5};
		
		//int[] copy = original; // 얕은복사 : 주소값 대입
		int[] copy = new int[5];
		/*
		 * copy[0] = original[0];
		 * copy[1] = original[1];
		 * ...
		 * copy[4] = original[4];
		 */
		for(int i=0; i<original.length; i++) {
			copy[i] = original[i];
		}
		
		copy[2] = 99;
		System.out.println("**** copy 수정 후 ****");
		System.out.println("<< 원본 배열 출력 >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("\n<< 복사본 배열 출력 >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\noriginal 주소값 : " + original.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	public void method3() {
		// 2. 아싸리 새로운 배열 생성 후 System클래서에서의 arraycopy() 메소드를 이용한 복사
		int[] original = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10]; // 넉넉하게 크게 생성 0~9번 인덱스 까지 0이 다 담겨있을 것!!
		
		// System.arraycopy(원본배열명, 복사시작할 인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할갯수);
		
		System.arraycopy(original, 0, copy, 2, 5);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 주소값이 다름(깊은복사)
		// => 각자 다른 배열을 참조하고 있음
		// => 즉, 배열 수정시 서로에게 영향을 주지 않음
	}
	
	public void method4() {
		
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		int[] original = {1, 2, 3, 4, 5};
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할길이);
		int[] copy = Arrays.copyOf(original, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * Arrays.copyOf 메소드
		 * => 내가 제시한 길이 만큼 복사본 배열 크기 할당
		 * => 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값 다 복사 나머지는 0으로 채움
		 * =>    내가 제시한 길이가 원본배열의 크기보다 작을 경우 기존의 배열에 있는 값 내가 제시한 길이만큼 복사
		 */
		
		System.out.println("\noriginal 주소값 : " + original.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		}
	
	public void method5() {
		
		// 4. clone() 메소드 이용한 복사
		//	  인덱스 지정 불가, 크기 지정 별도로 못함
		int[] original = {1, 2, 3, 4, 5};
		// 복사본 배열 = 원본배열.clone();
		int[] copy = original.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\noriginal 주소값 : " + original.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	/*
	 * [참고]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * ==> java.lang 패키지에 있는 클래스들을 쓸떄는 import안해도됨!!
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * ==> java.lang 이외의 패키지에 있는 클래스들을 쓸때는 무조건 import해야됨!!
	 */
	
	public void minji() {
		int[] original = new int[5];
		for(int i=0; i<original.length; i++) {
			original[i] = i;
		}
		
		int[] copy = original.clone();
		
		int[] copy2 = new int[10];
		System.arraycopy(original, 0, copy2, 1, 5);
		
		int[] copy3 = Arrays.copyOf(original, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		for(int i=0; i<copy2.length; i++) {
			System.out.print(copy2[i]+ " ");
		}
		System.out.println();
		for(int i=0; i<copy3.length; i++) {
			System.out.print(copy3[i]+ " ");
		}
	}
}
