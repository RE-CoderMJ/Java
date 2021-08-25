package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다.";
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candies = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candies / people);
		System.out.println("남는 사탕 개수 : " + candies % people);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String genResult = (gender == 'M' || gender == 'm') ? "남학생" : (gender == 'F' || gender == 'f' ? "여학생" : "잘못 입력하셨습니다.");
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", 
				grade, classNum, number, name, genResult, score);
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int totalSum = korean + english + math;
		double average = totalSum / 3;
		String result = (korean >= 40 && english >= 40 && math >= 40 && average >= 60) ? "합격" : "불합격";
		
		System.out.printf("합계 : %d\n평균 : %.1f\n%s", totalSum, average, result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '2'|| num == '4') ? "여자" : (num == '1' || num == '3') ? "남자" : "잘못입력하셨습니다.";
		System.out.println(result);
	}
}

