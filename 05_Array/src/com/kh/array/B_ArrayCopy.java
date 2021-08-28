package com.kh.array;

import java.util.Arrays;
// import java.lang.*; => �˰Ը𸣰� ���ԵǾ�����

public class B_ArrayCopy {

	// �迭 ����
	public void method1() {
		int[] original = {1, 2, 3, 4, 5};
		
		System.out.println("<< original �迭 ��� >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println();
		
		//�ܼ��ϰ� origin�� �ٽ� ���Խ�Ų copy�迭 ����
		int[] copy = original;
		System.out.println("<< ���纻 �迭 ��� >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("********* ���纻 �迭 �� ���� �� ********");
		System.out.println("<< original �迭 ��� >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("\n << ���纻 �迭 ��� >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// copy���� ������ ������ �ص� �������� ����Ǿ�����
		// ��? original�� copy�� ���� ���� �����ϰ� �ֱ� ���� (��, ���� �ּҰ�)
		System.out.println("\noriginal �ּҰ� : " + original.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		// �������� : �ּҰ��� ����

	}
	
	// ���������� ������ �ذ��ϱ� ���ؼ� ��������
	public void method2() {
		// 1. for���� Ȱ���� ���
		//	    ���ο� �迭�� �ƽθ� ������ �� �ݺ����� Ȱ���ؼ� �����迭�� ������ ������ ���� �迭�� ����
		int[] original = {1, 2, 3, 4, 5};
		
		//int[] copy = original; // �������� : �ּҰ� ����
		int[] copy = new int[5];
		/*
		 * copy[0] = original[0];
		 * copy[1] = original[1];
		 * ...
		 * copy[4] = original[4];
		 */
		for(int i=0; i<original.length; i++) {
			copy[i] = original[i];
		}
		
		copy[2] = 99;
		System.out.println("**** copy ���� �� ****");
		System.out.println("<< ���� �迭 ��� >>");
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("\n<< ���纻 �迭 ��� >>");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\noriginal �ּҰ� : " + original.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
	}
	
	public void method3() {
		// 2. �ƽθ� ���ο� �迭 ���� �� SystemŬ���������� arraycopy() �޼ҵ带 �̿��� ����
		int[] original = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ���� 0~9�� �ε��� ���� 0�� �� ������� ��!!
		
		// System.arraycopy(�����迭��, ��������� �ε���, ���纻�迭��, ���纻�迭�� ����� �����ε���, �����Ұ���);
		
		System.arraycopy(original, 0, copy, 2, 5);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// �ּҰ��� �ٸ�(��������)
		// => ���� �ٸ� �迭�� �����ϰ� ����
		// => ��, �迭 ������ ���ο��� ������ ���� ����
	}
	
	public void method4() {
		
		// 3. Arrays Ŭ�������� �����ϴ� copyOf() �޼ҵ� ���
		int[] original = {1, 2, 3, 4, 5};
		// ���纻 �迭 = Arrays.copyOf(�����迭��, �����ұ���);
		int[] copy = Arrays.copyOf(original, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * Arrays.copyOf �޼ҵ�
		 * => ���� ������ ���� ��ŭ ���纻 �迭 ũ�� �Ҵ�
		 * => ��, ���� ������ ���̰� �����迭�� ũ�⺸�� Ŭ ��� ������ �迭�� �ִ� �� �� ���� �������� 0���� ä��
		 * =>    ���� ������ ���̰� �����迭�� ũ�⺸�� ���� ��� ������ �迭�� �ִ� �� ���� ������ ���̸�ŭ ����
		 */
		
		System.out.println("\noriginal �ּҰ� : " + original.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		}
	
	public void method5() {
		
		// 4. clone() �޼ҵ� �̿��� ����
		//	  �ε��� ���� �Ұ�, ũ�� ���� ������ ����
		int[] original = {1, 2, 3, 4, 5};
		// ���纻 �迭 = �����迭.clone();
		int[] copy = original.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\noriginal �ּҰ� : " + original.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
	}
	
	/*
	 * [����]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * ==> java.lang ��Ű���� �ִ� Ŭ�������� ������ import���ص���!!
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * ==> java.lang �̿��� ��Ű���� �ִ� Ŭ�������� ������ ������ import�ؾߵ�!!
	 */
	
	public void minji() {
		int[] original = new int[5];
		for(int i=0; i<original.length; i++) {
			original[i] = i;
		}
		
		int[] copy = original.clone();
		
		int[] copy2 = new int[10];
		System.arraycopy(original, 0, copy2, 1, 5);
		
		int[] copy3 = Arrays.copyOf(original, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		for(int i=0; i<copy2.length; i++) {
			System.out.print(copy2[i]+ " ");
		}
		System.out.println();
		for(int i=0; i<copy3.length; i++) {
			System.out.print(copy3[i]+ " ");
		}
	}
}
