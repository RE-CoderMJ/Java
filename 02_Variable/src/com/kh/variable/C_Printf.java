package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		//System.out.print(����ϰ����ϴ� ��); //��¸� �� (�ٹٲ� �߻� x)
		//System.out.println(����ϰ����ϴ� ��); // ����� �ٹٲ� �߻� o
		
		// System.out.printf("����ϰ����ϴ�����(����)", ����ϰ����ϴ°�, ��, ...);
		// ����ϰ����ϴ� ������ ������ ���Ŀ� ���缭 ��¸� ����(���ٶ���ȵ�!!)
		
		/*
		 * ���˾ȿ��� ���ϼ��ִ� Ű����
		 * %d : ����
		 * %c : ����
		 * %s : ���ڿ� (���ڵ� ����)
		 * %f : �Ǽ�
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println();
		
		System.out.printf("%5d\n", iNum1); //5ĭ�� ����Ȯ�� �� ������ ���� (������ ����)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		System.out.printf("%5d\n", 400000);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t %f\n", dNum1, dNum2); // ������ �Ҽ��� �Ʒ� 6°¥������ ������
		System.out.printf("%.2f %.1f\n", dNum1, dNum2); // ���� ���ϴ� �ڸ������� ��� ����
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch, str, ch);
		
		System.out.printf("%C %S", ch, str); // �빮�ڷε� ��� ����
		
	}
}
