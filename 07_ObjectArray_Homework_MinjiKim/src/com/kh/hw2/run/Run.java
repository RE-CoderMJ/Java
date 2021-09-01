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
		// 이 부분 생략 가능할듯!-> 굳이 Heap에 공간차지 시킬필요가 없으니까..?
		 // nullPointException발생을 막기위해.
		 // 아래에 for each 반복문을 사용해서 information 메소드 출력한것 때문에 발생할 수 있어서.

		int count = 0;

		while (true) {
			
			if (count == 10) {
				System.out.println("입력할 수 있는 학생 수를 초과하였습니다.");
				break;
			}
			
			System.out.print("학년을 입력하세요 : ");
			int grade = sc.nextInt();
			// s[count].setGrade(sc.nextInt());

			System.out.print("반을 입력하세요 : ");
			// s[count].setClassroom(sc.nextInt());
			int classroom = sc.nextInt();

			sc.nextLine();
			System.out.print("이름을 입력하세요 : ");
			// s[count].setName(sc.nextLine());
			String name = sc.nextLine();

			System.out.print("국어점수를 입력하세요 : ");
			// s[count].setKor(sc.nextInt());
			int kor = sc.nextInt();

			System.out.print("영어점수를 입력하세요 : ");
			// s[count].setEng(sc.nextInt());
			int eng = sc.nextInt();

			System.out.print("수학점수를 입력하세요 : ");
			// s[count].setMath(sc.nextInt());
			int math = sc.nextInt();

			s[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			sc.nextLine();
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			char ask = sc.nextLine().charAt(0);
			// String str = sc.nextLine().toUpperCase(); // 문자열.toUpperCase : 무조건 대문자로 바꿔주는
			// 메소드!!

			if (ask == 'n') {
				break;
			} else if(ask == 'y'){
				continue;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			

		}

		/*
		for (Student v : s) {
			System.out.println(v.information());
		}
		*/
		
		for(int i=0; i<count; i++) {
			int sum = s[i].getKor() + s[i].getEng() + s[i].getMath();
			
			System.out.println(s[i].information() + ", 평균 점수 : " + sum / 3);
		}
	}

}
