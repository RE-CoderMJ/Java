package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Person;
import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		s[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");
		
		for(Student st : s) {
			System.out.println(s);
		}
		
		Employee[] e = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
			e[count] = new Employee();
			
			System.out.print("이름 : ");
			e[count].setName(sc.nextLine());
			
			System.out.print("나이 : ");
			e[count].setAge(sc.nextInt());
			
			System.out.print("신장 : ");
			e[count].setHeight(sc.nextDouble());
			
			System.out.print("몸무게 : ");
			e[count].setWeight(sc.nextDouble());
			
			System.out.print("급여 : ");
			e[count].setSalary(sc.nextInt());
			
			sc.nextLine();
			System.out.print("부서 : ");
			e[count].setDept(sc.nextLine());
			
			count++;
			
			System.out.print("계속 입력하시겠습니까? (y|n) : ");
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
