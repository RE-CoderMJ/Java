package com.kh.hw1.run;

import com.kh.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[3];
		
		e[0] = new Employee();
		e[1] = new Employee(1, "ȫ�浿", 19, 'M', "0102222333", "���� ���");
		e[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���� ����");
		
		for(int i=0; i<e.length; i++) {
			System.out.println("emp[" + i + "] : " + e[i].information());
		}
		
		System.out.println("================================================================");
		
		e[0].setEmpName("�踻��");
		e[0].setDept("������");
		e[0].setJob("����");
		e[0].setAge(30);
		e[0].setGender('M');
		e[0].setSalary(3000000);
		e[0].setBonusPoint(0.2);
		e[0].setPhone("01055559999");
		e[0].setAddress("���� ����");
		
		e[1].setDept("��ȹ��");
		e[1].setJob("����");
		e[1].setSalary(4000000);
		e[1].setBonusPoint(0.3);
		
		for(int i=0; i<2; i++) {
			System.out.println("emp["+ i + "] : " + e[i].information());
		}
		
		System.out.println("================================================================");
		
		int sum = 0;
		/*
		for(int i=0;i<e.length; i++) {
			int annualSalary = (int)(e[i].getSalary() + (e[i].getSalary()*e[i].getBonusPoint())) * 12;
			System.out.println(e[i].getEmpName() + "�� ���� : " + annualSalary + "��");
			sum += annualSalary;
		}
		*/
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].getEmpName() + "�� ���� : " + e[i].getAnnualSalary() + "��");
		}
		
		System.out.println("================================================================");
		
		for(int i=0; i<e.length; i++) {
			sum += e[i].getAnnualSalary();
		}
		
		System.out.println("�������� ������ ��� : " + sum / e.length + "��");
		
	}
}
