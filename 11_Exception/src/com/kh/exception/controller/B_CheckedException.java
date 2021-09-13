package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	/*
	 * CheckedException�� �ݵ�� ����ó���� �ؾߵǴ� ���ܵ���
	 * => ���ǹ� �̸������� �� ���� (��? ������ �Ұ��� ������ ������ �߻��ϱ� ������ �̸� ����ó�������� �ۼ��س��ߵ�!)
	 * => �ܺ� �Ű�ü�� ������� �Ͼ �� �߻���!(IOException)
	 * 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü (��, ���ڿ��� �о�鿩��)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ���ǵ��
		
		System.out.print("�ƹ��ų� �Է����ּ��� : ");
		
		// 1. try~catch �� : ���� �� �ڸ����� ��ٷ� ���ܸ� ó���ϰڴ�!!
		// try{} : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ�
		// catch(�߻��ɿ���Ŭ���� �Ű�����){} : try���������� ���ܰ� �߻����� ��� ��� ó���Ұ����� ���� ���� �ۼ�
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		*/
		
		// 2. throws : ���� �� �ڸ����� ���ܸ� ó������ �Ȱ� ���� �� �޼ҵ带 ȣ���ϴ� ������ ����ó���� ���ѱ�ڴ�. (�����ϰڴ�.)
		String str = br.readLine(); // readLine() �޼ҵ忡�� throws IOExcpetion�ϰ� ���� (���ѱ������)
		System.out.println(str);
	}
	
	/*
	 * 							����Ŭ����				���ܹ߻�����			����ó��
	 * UnchekckedException	RuntimeException	  	 ��Ÿ�ӿ���			   ����(�����ڰ� �ɹ��ɷ� ó��=> if���� ���� ���ʿ� ���ܰ� �߻��ȵǵ��� / ����ó������)
	 * 	  CheckedException	RuntimeException ��		�����Ͽ���(������)		   �ʼ�(���ǹ� �ȵ�!! ������ ����ó����������)
	 */
	
}
