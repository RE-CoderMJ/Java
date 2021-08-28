package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.print((arr[i] = i+1) + " ");
		}
	}
	
	public void practice2() {
	
		int[] arr = new int[10];
		//int num = arr.length;
		for(int i=0; i<arr.length; i++) {
			System.out.print((arr[i] = arr.length-i) + " ");
			//System.out.print((arr[i] = num--) + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((arr[i] = i+1) + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
			if(ch == arr[i]) {
				count++;
			}
		}
		
		System.out.printf("%c 개수 : %d", ch, count);
	}
	
	public void practice6() {

		String[] arr = { "월", "화", "수", "목", "금", "토", " 일" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("\n총 합 : %d", sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.print("정수  : ");
			int num = sc.nextInt();
			
			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				int a = 1;
				for (int i = 0; i < arr.length; i++) {
				
					arr[i] = a;
					if(i < arr.length/2) { 
						a++;
					}else {
						a--;
					}
					
					/*
					if (i <= num / 2) {
						arr[i] = a++;
						// a[0] = 1 a[1] = 2 a[2] = 3

					} else {
						// a[3] = 2 a[4] = 1
						arr[i] = (a--) - 2;
					}
					*/
					if (i == arr.length - 1) {
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}
				}
				
				break;
				
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		String[] chicken = {"후라이드", "양념", "마늘간장"};
		
		boolean result = false;
		for (int i=0; i<chicken.length; i++) {
			if(chicken[i].equals(menu)) {
				System.out.println(menu + "치킨 배달 가능");
				result = true;
				break;
			}
		}
		if(result == false) {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {//출력문은 따로 써주는 것이 나을까??
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		
		char[] arr = new char[num.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = num.charAt(i);
		}
		
		char[] copy = new char[arr.length];
		//System.arraycopy(original,0,copy,14);
		//int[] copy = Arrays,copyOf(original, 14);
		for(int i=0; i<copy.length; i++) {
			if(i<8) {
				copy[i] = arr[i];
			}else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	}
}
