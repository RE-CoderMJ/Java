package com.kh.chap06_method.controller;

public class NonStaticMethod {

	/*
	 * * �޼ҵ�
	 * �� ����� ó���ϱ� ���� �뵵
	 * 
	 * ���������� [�����] ��ȯ�Ұ����ڷ��� �޼ҵ��)[�Ű�����], �Ű�����, ...]){
	 * 		���೻��;
	 * 		[return �����;]
	 * }
	 * 
	 * 
	 */
	
	// 1. �Ű����� ���� ��ȯ���� ���� �޼ҵ�
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� �ִ� �޼ҵ��Դϴ�.");
		//return;
	}
	
	// 2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
	public String method2() {
		System.out.println("�Ű������� ���� ��ȯ���� �ִ� �޼ҵ��Դϴ�.");
		return "�ȳ��ϼ���";
	}
	
	// 3. �Ű����� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		System.out.println("�Ű����� �ְ� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		
		if(num2 != 0) {
			System.out.println("������ ��� : " + num1/num2);
		}else {
			System.out.println("�˼������� 0���δ� ���� �� �����ϴ�.");
		}
		
	}
	
	// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	//	    ���ڿ��� �������� ���� �޾Ƽ� �ش� ���ڿ��� �ش� �����ε����� ���ڰ��� �̾Ƽ� ��ȯ
	public char method4(String str, int index) {
		
		System.out.println("�Ű������� ��ȯ�� �� �� �ִ� �޼ҵ��Դϴ�.");
		
		if(index >= 0 && index < str.length()) {
			return str.charAt(index);
		}
		else {
		return ' ';
		}
	}
}