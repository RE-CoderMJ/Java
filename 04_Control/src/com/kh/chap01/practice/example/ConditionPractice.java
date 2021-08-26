package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n5. ����\n");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = "";
		
		switch(num) {
		case 1:
			result = "�Է�";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��ȸ";
			break;
		case 4:
			result = "����";
			break;
		case 5:
			System.out.println("���α׷��� ����˴ϴ�.");
			return;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");		
			return;
		}
		
		System.out.println(result + " �޴��Դϴ�.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
	
		if(num > 0 && num % 2 == 0) {
			System.out.println("¦����");
		}else if(num > 0) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		double average = (kor + math + eng) / 3;
		
		if (kor >= 40 && math >= 40 && eng >= 40 && average >= 60)
		{
			System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n��� : %.1f\n�����մϴ�, �հ��Դϴ�!",
					kor, math, eng, kor+math+eng, average);
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default :
			//System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
			//return;
			season = "�߸� �Էµ� ��";
			break;
		}
		
		System.out.println(month + "���� " + season + "�Դϴ�.");
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		//���Ƿ� ���̵�� ��й�ȣ �����صδ� �͵� ����. ��������~
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		if (id.equals("minji") && password.equals("0209")) {
			System.out.println("�α��� ����!");
		}else if(id.equals("minji")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(password.equals("0209")){
			System.out.println("id�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("id�� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		//���� ���� �� ��쿡�� �� �� Ʋ���� ��찡 ������� �ʴ´�.
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		
		switch (sc.nextLine()) {
		case "������":
			System.out.println("ȸ������, �Խñ۰���");
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default : 
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI ���� : " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi < 30) {
			System.out.println("��");
		}else {
			System.out.println("�� ��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(num1 > 0 && num2 > 0) {
			
			switch(op) { // if-else if ������ �ٲ㼭�� Ǯ� ��
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default :
				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
			
		}else {
			System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		
		System.out.print("���� : ");
		int funcNum = sc.nextInt();
		
		switch(funcNum) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice9();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
