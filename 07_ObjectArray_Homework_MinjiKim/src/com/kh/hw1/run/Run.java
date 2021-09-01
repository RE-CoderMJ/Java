package com.kh.hw1.run;

import com.kh.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[3];
		
		e[0] = new Employee();
		e[1] = new Employee(1, "È«±æµ¿", 19, 'M', "0102222333", "¼­¿ï Àá½Ç");
		e[2] = new Employee(2, "°­¸»¼ø", "±³À°ºÎ", "°­»ç", 20, 'F', 1000000, 0.01, "01011112222", "¼­¿ï ¸¶°î");
		
		for(int i=0; i<e.length; i++) {
			System.out.println("emp[" + i + "] : " + e[i].information());
		}
		
		System.out.println("================================================================");
		
		e[0].setEmpName("±è¸»¶Ë");
		e[0].setDept("¿µ¾÷ºÎ");
		e[0].setJob("ÆÀÀå");
		e[0].setAge(30);
		e[0].setGender('M');
		e[0].setSalary(3000000);
		e[0].setBonusPoint(0.2);
		e[0].setPhone("01055559999");
		e[0].setAddress("Àü¶óµµ ±¤ÁÖ");
		
		e[1].setDept("±âÈ¹ºÎ");
		e[1].setJob("ºÎÀå");
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
			System.out.println(e[i].getEmpName() + "ÀÇ ¿¬ºÀ : " + annualSalary + "¿ø");
			sum += annualSalary;
		}
		*/
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].getEmpName() + "ÀÇ ¿¬ºÀ : " + e[i].getAnnualSalary() + "¿ø");
		}
		
		System.out.println("================================================================");
		
		for(int i=0; i<e.length; i++) {
			sum += e[i].getAnnualSalary();
		}
		
		System.out.println("Á÷¿øµéÀÇ ¿¬ºÀÀÇ Æò±Õ : " + sum / e.length + "¿ø");
		
	}
}
