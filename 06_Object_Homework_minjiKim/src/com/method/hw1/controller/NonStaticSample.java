package com.method.hw1.controller;

public class NonStaticSample {

	public void printLottoNumbers() {
		for(int i=0; i<6; i++) {
			System.out.print((int)(Math.random()* 45 + 1) + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		System.out.printf("2. %c���� %d�� ��� : ", c, num);
		
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	public char alphabette() {
		
		while(true) {
			int random = (int)(Math.random()*122 +1);
			
			if((random >='a' && random<='z') || (random >='A' && random<='Z')) {
				System.out.print("3. ���� ������ ��� : ");
				return (char)random;
			}
		}
	}
	
	public String mySubstring(String str, int index1, int index2) {
	
		/*
		for(int i=index1; i<index2; i++){
		
			result += str.charAt(i);
			
		}
		*/
		if(!str.isEmpty()) {
			String result = str.substring(index1, index2);
			System.out.printf("4. %s�� %d�� %d�� �ε��� ������ �� ��� : ", str, index1, index2);
			return result;			
		}else {
			return null;
		}
	}
}
