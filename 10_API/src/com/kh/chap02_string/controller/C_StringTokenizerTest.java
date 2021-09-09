package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �������� �ؼ� ���ڿ��� �и� ��Ű�� ���
		
		// ���1. �и��� ���ڿ����� String[] �迭�� �������� ����� �Ҷ�
		//	   	 StringŬ������ �����ϴ� split �޼ҵ� �̿�
		//		  ���ڿ�.split(������) : String[]
		
		String[] arr = str.split(",");
		
		System.out.println("�迭�� ���� : " + arr.length);
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε��� : " + arr[i]);
		}
		*/
		int i = 0;
		for(String s : arr) { // s = arr[0]; => s = arr[1]; ...
			System.out.println(i++ + "��° �ε��� : " + s);
		}
		
		// ���2. �и��� ���ڿ����� ���� ��ū���μ� �����ϰ��� �� ��
		//		 java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//   	 StirngTokenizer stn = new StringTokenizer(�и��ϰ����ϴ¹��ڿ�, ������);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countTokens());
		
		System.out.println(stn.nextToken()); // NoSuchElementException �߻� (���̻��� ��Ұ� �����ϴ�)
		*/
		
		/* �߸��� ��� (�ݺ����� 3���� ����)
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// j=0 j<6 
		// j=1 j<5
		// j=2 j<4
		// j=3 j<3 false => �ݺ��� ��������
		
		/*
		// �ذ���1.
		int count = stn.countTokens(); // count = 6
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// �ذ���2.
		while(stn.hasMoreTokens()) {
			
			System.out.println(stn.nextToken());
		}
		
		
	}
}
