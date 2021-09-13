package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException {

	/*
	 * * RuntimeException
	 * - ���α׷� ����� �߻��Ǵ� ���ܵ�
	 * 
	 * * RuntimeException�� �ļյ�
	 * - IndexOutOfBoundsException : �������� �ε����� ������ ���ٽ� �߻��Ǵ� ����
	 * - NullPointerException : ���������� null�� �ʱ�ȭ�� ��Ȳ���� ��ſ� �������� �� �߻��Ǵ� ����
	 * - ArithmeticException : ������ ����� 0���� ������ �� �߻��Ǵ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ����ɶ� �߻��Ǵ� ����
	 * 
	 * => RuntimeException ���õ� ���ܴ� ����� ���������� ��Ȳ�� ����
	 * 	    �ƽθ� ���ʿ� ������ü�� �߻��� �ȵǰԲ� if�� ����ó�� ����
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : ������ ����� 0���� ������ �� �߻��Ǵ� ����
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2; // ����ڰ� �ι�° ������ 0���� �Է��ϴ� ���� ���� �߻� => ������������ ���α׷� ����
		/*
		// ���ʿ� ���� ��ü�� �߻��� �ȵǰԲ� if������ ���� �˻� => ����ó�� �ƴ�!!
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		
		System.out.println("�ȳ��ϼ��� �ݰ����ϴ�. ����� ����� �˷��帮�ڽ��ϴ�.");
		System.out.println("result : " + result);
		*/
		
		// ����ó�� : ���ܰ� "�߻�������" ������ ������ �̸� �ۼ��س��� ���
		/*
		 * * try catch ���
		 * 
		 * try {
		 * 		���ܰ� �߻��� �� �ִ� ����;
		 * }catch(�߻��ɿ���Ŭ���� �Ű�����) {
		 * 		�ش� ���ܰ� �߻����� ��� ������ ����;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
			
		} catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			//e.printStackTrace(); // ������ ������ �̷º����� �� �� �����ϴ� ����
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException : �迭 �Ҵ� �������� �迭�� ũ�⸦ ������ �����ϴ� ��� �߻��Ǵ� ����
		// ArrayIndexOutOfBoundsException : �迭�� �������� �ε����������ϸ鼭 �������� �� �߻��Ǵ� ����
		
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		
		/* if������ �ƽθ� ������ü�� �߻��� �ȵǵ��� ���� ���� ���
		if(size >= 101) {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);			
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " +arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}
		// ���� catch�� �ۼ� ����
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	public void method3() {
		
		System.out.print("�迭�� ũ�� : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " +arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}catch(InputMismatchException e) {
			System.out.println("�������� �Է��ؾߵ˴ϴ�.");
		}
		*/
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " +arr[100]);
			
		}catch(RuntimeException e) { // ������ �����ؼ� �θ�Ÿ���� ����Ŭ���� �ۼ� ����
									 // ��� �ڽ� ���� �߻��� �� �޾Ƽ�ó���� �� ����
			System.out.println("���ܰ� �߻��Ǳ��߾�.. �迭�� ũ�Ⱑ �߸��ƴ���,�������� �ε����� ���õƴ���, ������ �ƴѰ� �Է��߾�");
		}
		*/
		// ������ ���� �߻��� ������ ������ �����ϰ�� ����ȭ�ؼ� ���� catch������ ����ϴ°� ������!
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " +arr[100]);
			
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ���� �Է��ϼ̽��ϴ�.");
		}
		catch(RuntimeException e) {
			System.out.println("���ܰ� �߻��Ǳ��߾�.. �迭�� ũ�Ⱑ �߸��ƴ���,�������� �ε����� ���õƴ���");
		}
		// �θ� ����Ŭ������ �ڽ� ����Ŭ������ ������ catch���� ����ϰ��� �Ҷ���
		// �ڽĿ���Ŭ���� catch���� ���� �־�߸���!! (�ƴϸ� unreachable catch block ������)
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	/*
	 * * RuntimeException ���� �ֵ��� UnCheckedException (����ó�������� �ʼ��� �ƴ�)
	 * 	 if�� : ���ʿ� ������ü�� �߻��Ǳ� ���� �ҽ��ڵ�� �ڵ鸵 �ϴ� ��(����ó������ �ƴ�)
	 * 	 try-catch�� : ���ܰ� "�߻����� ���" ó�����ִ� ������ �ۼ��صδ� ��(����ó��������)
	 * 
	 * 	 ���� ������ ��Ȳ�� if������ ���ǽɻ�� �ذ��ϴ°� ���������!
	 * 	 �ε����ϰ� ���ǹ����� �ڵ鸵�� �ȵǴ� ���� ����ó���������� �ۼ��صѰ�!
	 */
	
}
