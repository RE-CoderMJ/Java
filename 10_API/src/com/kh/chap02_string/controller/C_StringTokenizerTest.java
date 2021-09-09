package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때
		//	   	 String클래스에 제공하는 split 메소드 이용
		//		  문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		
		System.out.println("배열의 길이 : " + arr.length);
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		*/
		int i = 0;
		for(String s : arr) { // s = arr[0]; => s = arr[1]; ...
			System.out.println(i++ + "번째 인덱스 : " + s);
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰으로서 관리하고자 할 때
		//		 java.util.StringTokenizer 클래스를 이용하는 방법
		//   	 StirngTokenizer stn = new StringTokenizer(분리하고자하는문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countTokens());
		
		System.out.println(stn.nextToken()); // NoSuchElementException 발생 (더이상의 요소가 없습니다)
		*/
		
		/* 잘못된 방법 (반복문이 3번만 돈다)
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// j=0 j<6 
		// j=1 j<5
		// j=2 j<4
		// j=3 j<3 false => 반복문 빠져나옴
		
		/*
		// 해결방법1.
		int count = stn.countTokens(); // count = 6
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2.
		while(stn.hasMoreTokens()) {
			
			System.out.println(stn.nextToken());
		}
		
		
	}
}
