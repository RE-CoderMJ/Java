package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	public void method() {
		
		String str1 = "Hell world";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//	    문자열에서 전달받은 index위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//	    문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		// str2 new 생성자 통해서 새로운 문자열 (Hello world!!!) Heap영역에 생성됨
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		// str2와 str3에 담긴 문자열은 일치하나 실제 담겨있는 주소값은 다름!!
		// str3 String Pool 영역에 새로운 문자열 (Hello world!!!) 생성됨.
		
		System.out.println("str2와 str3가 일치합니까 : " + (str2 == str3));
		
		// 3. 문자열.equals(Object obj) : boolean
		// 	    문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열값을 가지고 동등비교 해줌
		System.out.println("str2와 str3가 일치합니까(equals) : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello라는 문자열이 포함되어있습니까 : " + str1.contains("Hell"));
		System.out.println("str1에 Bye라는 문자열이 포함되어있습니까 : " + str1.contains("Bye"));
		
		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex위치에서부터 끝까지의 문자열을 추출해서리턴
		//	    문자열.substring(int beginIndex, int endIndex) : String
		//	  		=> 문자열의 beginIndex위치에서부터 endIndex-1 위치까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4)); // begin <=   <  end
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		//	    문자열에서의 oldChar문자들을 newChar로 변환한 새 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		System.out.println("str1이 변경됐나? : " + str1);
		
		// 8. 문자열.toUpperCase() : String	=> 문자열을 다 대문자로 변경한 새 문자열 리턴
		//	  문자열.toLowerCase() : String	=> 문자열을 다 소문자로 변경한 새 문자열 리턴
		String str5 = str1.toUpperCase();	
		System.out.println(str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
		/*
		 * System.out.println("계속하시겠습니까 (y/n) : ";
		 * char ch = sc.nextLine().toUpperCase().charAt(0); // 'N' 'Y'
		 * 			// 메소드를 연이어서 호출 == 메소드 체이닝
		 * if(ch == 'N'){
		 * 	  // 프로그램 종료
		 * }
		 */
		
		// 9. 문자열.trim() : String
		// 	    문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str6 = "   JA  VA   ";
		System.out.println("trim : " + str6.trim());
		
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 11. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
	}
}
