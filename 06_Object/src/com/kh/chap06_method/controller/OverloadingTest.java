package com.kh.chap06_method.controller;

public class OverloadingTest {

	// �����ε� : �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ��
	
	public void test() {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	/*
	public void test(int c, int d) {
		
	}
	*/
	// "�Ű��������̶��� �������" �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� ��.
	
	public void test(String str) {
		
	}
	/*
	public int test(String str) {
		
	}
	*/
	// "��ȯ���̶��� �������!!" ������ �Ű������� �޶�ߵ�
	
	/*
	private void test(String str) {
		
	}
	*/
	// "���������ڶ��� �������!!"
	
	/*
	 * ���
	 * �����ε� : �� Ŭ���� ���� ������ �̸��� �޼ҵ��
	 * 		       ��, �Ű�������, ����������, ��ȯ���� �� ������
	 * 		       �Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ��־�ߵ�!!
	 */
}
