package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break;	: �ݺ��� �ȿ� ���Ǵ� �б⹮
	 * 			  break;�� ����Ǵ� ���� ���� �����ִ� �ݺ����� ������ ��������
	 * 
	 * 	* ���ǻ��� : switch�� ���� break;�� ���� switch������ ���������� ����
	 */
	
	public void method1() {
		
		// ������(1~100) �߻���Ű�� �� ������ ��� (�� ���� ��� �ݺ�)
		// ��, �߻��� �������� 3�� ����� ���(%3 == 0) �ݺ��� ����������.
		
				
		while(true) {
			int random = (int)(Math.random()*100 +1);
			
			System.out.println("������ : " + random);
			
			if(random % 3 == 0) {
				break;
			}
		}
		
	}
	
	public void method2() {
		
		// ����ڿ��� ���ڿ��Է¹޾� �ش� �� ���ڿ��� ���� ��� (�� ������ �Ź� �ݺ�)
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ����� ������������
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.println("���ڿ��� ���� : " + str.length());
		}
	}
	
	public void method3() {
		
		// ����ڿ��� ���� �Է¹޾� �ش� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("��(2~9)�� �Է����ּ��� : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { // �� �Է����� ��� => �ش� ���� ��� �� �ݺ��� ����������
				for(int i=1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
				break;
			}else { // �߸��Է����� ��� => �߸��Է������� �˸��� ���� ���
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		
	}
	
	
	public void methodTest() {



		Scanner sc = new Scanner(System.in);



		System.out.print("����1 : ");

		int num1 = sc.nextInt();

		System.out.print("����2 : ");

		int num2 = sc.nextInt();



		sc.nextLine();

		System.out.print("�����ȣ(+,-,*,/,%)�� �Է��Ͻÿ� : ");

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

		System. out.println("�����ȣ�� �߸� �Է��Ͽ����ϴ�.");

		return;

		}



		System.out.println("������ : " + result);



		}
	
	
}
