package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i=1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=num; i>0; i--) {
				System.out.print(i+ " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i=num; i>0; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;

			if (i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 > 0 && num2 >0) {
			
		/*
			if(num2 > num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}else if(num1 > num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+ " ");
				}	
			}
		*/
			int min = Math.min(num1, num2); // 두 수 중 작은 값 담기
			int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
			
			for(int i=min; i<=max; i++) {
				System.out.print(i+ " ");
			}
			
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 > 0 && num2 >0) {
				/*
				if(num2 > num1) {
					for(int i=num1; i<=num2; i++) {
						System.out.print(i + " ");
					}
				}else if(num1 > num2) {
					for(int i=num2; i<=num1; i++) {
						System.out.print(i + " ");
					}
				}*/
				
				int min = Math.min(num1, num2);
				int max = Math.max(num1, num2);
				for(int i=min; i<=max; i++) {
					System.out.print(i+ " ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===== " + dan + "단 =====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
				System.out.println();
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int snum = sc.nextInt();
		System.out.print("공차 : ");
		int dif = sc.nextInt();
		
		/*
		for(int i=snum; i<=snum+dif*9; i+=dif) {
			System.out.print(i + " ");
		}
		*/
		for(int i=1; i<=10; i++) {
			System.out.print(snum + " ");
			
			snum += dif;
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; //return;도 상관 없으나 뒤에 코드가 있다면 break로!
			} else if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
				
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				sc.nextLine();

				if ((op.equals("/") || op.equals("%")) && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				} else {
					int result = 0;
					switch (op) {
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
					case "/":
						result = num1 / num2;
						break;
					case "%":
						result = num1 % num2;
						break;
					}
					System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
				}

			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}
}
