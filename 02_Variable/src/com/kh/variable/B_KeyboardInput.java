package com.kh.variable;

import java.util.Scanner;

// ����ڰ� Ű����� �Է��� ���� �޾Ƶ��̴� Scanner �ǽ�
public class B_KeyboardInput {

	public void inputTest() {
		
		/*
		 * Ű����� ���� �Է��ϴ� ���
		 * Scanner�� ����Ѵ�!
		 * (�� java.util.Scanner Ŭ������ �̿��ϴ� ���̴�!)
		 * Scanner Ŭ���� ������ �޼ҵ带 ȣ���Ͽ� �Է¹޴°�.
		 */
		
		// ��ĳ�� Ŭ������ ��ü ����
		Scanner sc = new Scanner(System.in);
		// System.in �� �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴٴ� �ǹ�
		// ��� �ÿ��� System.out �̶�� ������ �����!
		
		System.out.print("�ƹ��ų� �Է��غ����� : ");
		String typeIn = sc.nextLine();
		
		System.out.println("�Է¹��� ���� : " + typeIn);
		
	}
	
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ� : ");
		//String name = sc.next();
		// next(); ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� ���� �о��
		//		   (���� ����������� ��� �̷� ���� ���� ��� ������ ���� �� �ֱ� ������ ����� �� ���� �������� �� ����)
		
		String name = sc.nextLine();
		// nextLine(); ����ڰ� �Է��� �� ��� �� �о��(���� �������� ��� ��)
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		int age = sc.nextInt(); // ����ڰ� �Է��� ���� ������ �о���̴� �޼ҵ�
		
		System.out.print("����� Ű�� ���Դϱ�(�Ҽ��� ù° �ڸ�����) : ");
		double height = sc.nextDouble(); // ����ڰ� �Է��� ���� �Ǽ��� �о���̴� �޼ҵ�
		
		// xxx���� xx���̸�, Ű�� xxx.xcm �Դϴ�
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm�Դϴ�.");
		
	}
	
	//Ű����� ���� �Է¹��� �� ���� �߻��Ǵ� ����
	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		//sc.nextLine(); ���ۿ��� '����' ���������� ��� ���� ������ �� '����'�� ����ִ� ����
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		// sc.nextLine(); ���� ��� �޼ҵ� : �ش� ���� �о���� '����'�� ���ۿ� ��������
		
		//���ۿ� �����ִ� ���͸� ����ִ� �ڵ� �߰�
		sc.nextLine();
		//��� : sc.nextXXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 ���Ե� ��� ���ۿ� �����ִ� '����'�� ����ִ� ���� �ʼ�!!
		
		System.out.print("�ּ�  : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		//xxx���� xx���̸�, ��� ���� xxxxxxx�̰�, Ű�� xxx.xcm�Դϴ�.
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�̰�, Ű�� " + height + "�Դϴ�.");
		System.out.printf("%s���� %d���̸�, ��� ���� %s�̰�, Ű�� %.2f �Դϴ�.", name, age, address, height);
	}
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է¹����� => sc.nextLine()
		// �������� �Է¹����� => sc.nextInt()
		// �Ǽ����� �Է¹����� => sc.nextDouble()
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		//char gender = sc.nextChar(); // nextChar�� �������� ����
		char gender = sc.nextLine().charAt(0); 
		// ���ڿ�.charAt(�ε���) : �ش� ���ڿ��κ��� �ش� �ε����� ���ڸ� �������ִ� �޼ҵ�
		// ** �ε��� :���� ��������. ��, 0���� ������!!
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx���� ��������
		 * ���� : x
		 * ���� : xx
		 * Ű : xxx.x
		 */
		
		System.out.println(name+"���� ��������");
		System.out.println("���� : " + gender +"\n����: " + age + "\nŰ : " + height);
				
	}
	
	public void charAtTest() {
		String str = "Hello";
		
		char ch = str.charAt(4);
		System.out.println(ch);
		
		//System.out.println(str.charAt(10)); //StringIndexOutOfBoundsException �߻�
		
 	}
	
	/*
	 * ** ���� **
	 * 1. �ܼ�â(�����)�� ����ϱ����� : System.out.print[ln]()�޼ҵ� �̿�
	 * 2. �ܼ�â(Ű����)�� �Է¹ޱ����� : Scanner �̿��ؼ� (nextLine(), next(), nextInt(), nextDouble()...)
	 * 
	 * 		> ���ǻ���
	 * 		1) sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 �;ߵ� ���
	 * 			sc.nextLine() �޼ҵ带 �ѹ� �� ���༭ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʼ�!!
	 * 		2) '����' ���� �Է¹޾ƾߵ� ���
	 * 			sc.nextLine() �޼ҵ带 ���� �켱 ���ڿ��� �Է¹ް� �� �ڿ� .charAt(�ε���) �޼ҵ带 ���ؼ� ���� �ϳ� ����
	 */
}
