package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i=1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=num; i>0; i--) {
				System.out.print(i+ " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i=num; i>0; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
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
			int min = Math.min(num1, num2); // �� �� �� ���� �� ���
			int max = Math.max(num1, num2); // �� �� �� ū �� ���
			
			for(int i=min; i<=max; i++) {
				System.out.print(i+ " ");
			}
			
		}else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
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
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		System.out.println("===== " + dan + "�� =====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
				System.out.println();
			}
		} else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + i + "�� =====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int snum = sc.nextInt();
		System.out.print("���� : ");
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

			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break; //return;�� ��� ������ �ڿ� �ڵ尡 �ִٸ� break��!
			} else if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
				
				System.out.print("����1 : ");
				int num1 = sc.nextInt();
				System.out.print("����2 : ");
				int num2 = sc.nextInt();
				sc.nextLine();

				if ((op.equals("/") || op.equals("%")) && num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
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
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
}
