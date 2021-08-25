package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : "����� �ƴϴ�.";
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candies = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + candies / people);
		System.out.println("���� ���� ���� : " + candies % people);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String genResult = (gender == 'M' || gender == 'm') ? "���л�" : (gender == 'F' || gender == 'f' ? "���л�" : "�߸� �Է��ϼ̽��ϴ�.");
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", 
				grade, classNum, number, name, genResult, score);
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "���" : (age <= 19 ? "û�ҳ�" : "����");
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int korean = sc.nextInt();
		
		System.out.print("���� : ");
		int english = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int totalSum = korean + english + math;
		double average = totalSum / 3;
		String result = (korean >= 40 && english >= 40 && math >= 40 && average >= 60) ? "�հ�" : "���հ�";
		
		System.out.printf("�հ� : %d\n��� : %.1f\n%s", totalSum, average, result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '2'|| num == '4') ? "����" : (num == '1' || num == '3') ? "����" : "�߸��Է��ϼ̽��ϴ�.";
		System.out.println(result);
	}
}

