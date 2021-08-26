package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			for(int i=1; i<=num; i++) {
				if(i % 2 == 1) {
					System.out.print("박");
				}else {
					System.out.print("수");
				}
			}
			
		}else {
			System.out.println("양수가 아닙니다");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>0) {
				for(int i=1; i<=num; i++) {
					if(i % 2 == 1) {
						System.out.print("박");
					}else {
						System.out.print("수");
					}
					break;
				}
			}else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("포함된 갯수 : " + count);
	}
}
