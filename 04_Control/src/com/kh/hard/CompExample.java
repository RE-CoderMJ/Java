package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			for(int i=1; i<=num; i++) {
				if(i % 2 == 1) {
					System.out.print("��");
				}else {
					System.out.print("��");
				}
			}
			
		}else {
			System.out.println("����� �ƴմϴ�");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num>0) {
				for(int i=1; i<=num; i++) {
					if(i % 2 == 1) {
						System.out.print("��");
					}else {
						System.out.print("��");
					}
					break;
				}
			}else {
				System.out.println("����� �ƴմϴ�.");
			}
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("ã���� �ϴ� ���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("���Ե� ���� : " + count);
	}
}
