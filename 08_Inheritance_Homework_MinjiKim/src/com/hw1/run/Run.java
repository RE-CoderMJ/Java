package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Person;
import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		s[0] = new Student("ȫ�浿", 20, 178.2, 70, 1, "�����ý��۰��а�");
		s[1] = new Student("�踻��", 21, 187.3, 80, 2, "�濵�а�");
		s[2] = new Student("������", 23, 167, 45, 4, "������Ű��а�");
		
		for(Student st : s) {
			System.out.println(s);
		}
		
		Employee[] e = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
			e[count] = new Employee();
			
			System.out.print("�̸� : ");
			e[count].setName(sc.nextLine());
			
			System.out.print("���� : ");
			e[count].setAge(sc.nextInt());
			
			System.out.print("���� : ");
			e[count].setHeight(sc.nextDouble());
			
			System.out.print("������ : ");
			e[count].setWeight(sc.nextDouble());
			
			System.out.print("�޿� : ");
			e[count].setSalary(sc.nextInt());
			
			sc.nextLine();
			System.out.print("�μ� : ");
			e[count].setDept(sc.nextLine());
			
			count++;
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y|n) : ");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'n' || answer == 'N') {
				break;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(e[i]);
		}

	}

}
