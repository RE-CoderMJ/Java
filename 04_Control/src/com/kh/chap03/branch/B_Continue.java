package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue;	: �ݺ��� �ȿ� ����Ǵ� ����
	 * 				  continue; ���� ����� �� ���� ������ ������� �ʰ� ��ٷ� ���� �����ִ� �ݺ��� ���� �ö� 
	 */	
	
	public void method1() {
		
		// 1���� 10���� Ȧ�� ���
		/*
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { // i���� ¦���� ���
				continue; // �ݺ��� ���� ���� �������� ������� �ʰ� �ݺ��� ���� �ö�(������)
			}
			
			System.out.print(i + " ");
		}
	}
	
	public void method2() {

		// 1���� 100������ �� �հ�
		// ��, 6�� ������� ���� ���� ����
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}

		System.out.println("��� : " + sum);

	}
	
	public void method3() {

		// 2~9�� ���� ���

		for (int i = 2; i <= 9; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("==== " + i + "�� ====");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}