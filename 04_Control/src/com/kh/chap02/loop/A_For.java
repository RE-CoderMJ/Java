package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <�ݺ���>
	 * ���α׷� �帧�� �����ϴ� ��� �� �ϳ�
	 * � �����ڵ带 �ݺ������� ���������
	 * 
	 * ũ�� �� ������ ���� ( for�� / while��(do-while��) )
	 * 
	 * * for��
	 * 
	 * for(�ʱ��; ���ǽ�; ������) { // �ݺ� Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		�ݺ������� �����Ű�����ϴ� ����;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "ó���� �� �ѹ��� ����Ǵ� ����"
	 * 			(���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ�ϴ� ����)
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ش� ������ ����
	 * 			���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 * 			(���� �ʱ�Ŀ� ���õ� ������ ������ ���ǽ��� �ۼ���)
	 * 
	 * - ������ : �ݺ����� �����ϴ� ���� ���� ������Ű�� ����
	 * 			(���� �ʱ�Ŀ� ���õ� ������ ������ ����������(++,--)�� �����)
	 * 
	 * * for���� ������ ����
	 * �ʱ�� --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--------------- �� ������ ��� �ݺ� ---------------
	 * 		--> ���ǽ� �˻� --> false�� ��� ������ ���� ����X ==> �ݺ��� ��������
	 * 
	 * 
	 * * �˾Ƶ� ��
	 * 	 for�� �ȿ� �ʱ��,���ǽ�, ������ ���� ���������ϱ��� (��, ;�� �ݵ�� �ʼ�)
	 */
	
	public void method1() {
		
		for(int i = 0; i <5; i++) {
			System.out.println("�ȳ��ϼ���");
			// i ���� 0�������� 4���� �Ź� 1�� �����ϴ� ���� �ݺ� ����
			// 0, 1, 2, 3, 4 => 5ȸ
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("�ݰ����ϴ�.");
			// i ���� 1�������� 5���� �Ź� 1�� �����ϴ� ���� �ݺ� ����
			// 1, 2, 3, 4, 5 => 5ȸ
		}
		
		for(int i = 11; i < 16; i++) {
			System.out.println("��ڳ׿�");
			// i ���� 1�������� 5���� �Ź� 1�� �����ϴ� ���� �ݺ� ����
			// 11, 12, 13, 14, 15 => 5ȸ
		}
		
		for(int i = 1; i <= 9; i += 2) {
			System.out.println("Hello");
			// i ���� 1�������� 9���� �Ź� 2�� �����ϴ� ���� �ݺ� ����
			// 1, 3, 5, 7, 9 => 5ȸ
		}
	}
	
	public void method2() {
		// 1���� 5���� ���
		
		for(int i = 1; i<6; i++) { 
			// i���� 1�������� 5���� �Ź� 1��������Ű�µ��� �ݺ� ����(1,2,3,4,5)
			System.out.println(i);
		}
		
	}
	
	public void method3() {
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
			// i���� 5�������� 1���� �Ź� 1�� �����ϴµ��� �ݺ� ����
			// 5,4,3,2,1 => 5ȸ
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
		System.out.println("1�������� 10������ �� �հ� : " + sum);
	}
	
	public void method7() {
		// 1�������� ����ڰ� �Է��� �������� �� �հ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���� : ");
			int num = sc.nextInt();
			
			if(num >0) {
				int sum = 0;
				for(int i=1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1��������  " + num + "������ �� �հ� : " + sum);
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void method8() {
		// 1�������� � ������(1~10)������ �� �հ�
		
		/*
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ� ȣ���ؼ� �Ź� �ٸ� �������� �� �� ����!!
		 * 
		 * Math.random() ȣ��� ==> 0.0 ~ 0.99999999 ������ ������ �߻�
		 * 						 (0.0 <=    < 1.0)
		 * 
		 */
		// int random = Math.random(); // double���̶� �ȵ�
		//				0.0 <=   < 1.0  => 0.0 ~ 0.999999
		// int random = Math.random() * 10;
		//				0.0 <=   < 10.0 => 0.0 ~ 0.999999
		
		// int random = Math.random() * 10 + 1;
		//				1.0 <=	  < 11.0 => 1.0 ~ 10.999999
		
		int random = (int)(Math.random() * 10 +1);
		//				1 <=   < 11     => 1 ~ 10
		
		System.out.println("1~10������ ������ : " + random);
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		// �� �ε����� ���� �̾Ƽ� ���
		for(int i = 0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		for(int i=0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 2�� ����ϱ�
		
		for(int i=1; i<=9; i++) {
			//System.out.println("2 x " + i + " = " + 2*i);
			System.out.printf("%d x %d = %d", 2, i, 2*i);
		}
		
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2~9)�� �Է� : ");
		int num = sc.nextInt();
		
		if(num >=2 && num <=9) { // �� �Է�������� => �ش� �� ������ֱ�
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", num, i, num*i);
			}	
		}else { // �߸��Է����� ��� => "�߸��Է�����"���
			System.out.println("2~9������ ���ڸ� �Է��ؾߵ˴ϴ�. �߸��Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void method13() {
		// 2���� 9������ ���� ���� ����ϱ�
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
		// 2�ܺ��� 9�ܱ��� ���
		
		for(int dan=2; dan<=9; dan++) {
		
			System.out.println("===" + dan + "�� ===");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
			System.out.println();
		}
	}
}
