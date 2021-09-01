package com.kh.hw2.run;

import java.util.Scanner;

import com.kh.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] s = new Student[10];
		/*
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			}
			*/
		// �� �κ� ���� �����ҵ�!-> ���� Heap�� �������� ��ų�ʿ䰡 �����ϱ�..?
		 // nullPointException�߻��� ��������.
		 // �Ʒ��� for each �ݺ����� ����ؼ� information �޼ҵ� ����Ѱ� ������ �߻��� �� �־.

		int count = 0;

		while (true) {
			
			if (count == 10) {
				System.out.println("�Է��� �� �ִ� �л� ���� �ʰ��Ͽ����ϴ�.");
				break;
			}
			
			System.out.print("�г��� �Է��ϼ��� : ");
			int grade = sc.nextInt();
			// s[count].setGrade(sc.nextInt());

			System.out.print("���� �Է��ϼ��� : ");
			// s[count].setClassroom(sc.nextInt());
			int classroom = sc.nextInt();

			sc.nextLine();
			System.out.print("�̸��� �Է��ϼ��� : ");
			// s[count].setName(sc.nextLine());
			String name = sc.nextLine();

			System.out.print("���������� �Է��ϼ��� : ");
			// s[count].setKor(sc.nextInt());
			int kor = sc.nextInt();

			System.out.print("���������� �Է��ϼ��� : ");
			// s[count].setEng(sc.nextInt());
			int eng = sc.nextInt();

			System.out.print("���������� �Է��ϼ��� : ");
			// s[count].setMath(sc.nextInt());
			int math = sc.nextInt();

			s[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			sc.nextLine();
			System.out.print("��� �߰��Ͻðڽ��ϱ�? (y/n) : ");
			char ask = sc.nextLine().charAt(0);
			// String str = sc.nextLine().toUpperCase(); // ���ڿ�.toUpperCase : ������ �빮�ڷ� �ٲ��ִ�
			// �޼ҵ�!!

			if (ask == 'n') {
				break;
			} else if(ask == 'y'){
				continue;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			

		}

		/*
		for (Student v : s) {
			System.out.println(v.information());
		}
		*/
		
		for(int i=0; i<count; i++) {
			int sum = s[i].getKor() + s[i].getEng() + s[i].getMath();
			
			System.out.println(s[i].information() + ", ��� ���� : " + sum / 3);
		}
	}

}
