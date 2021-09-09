package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	public void method() {
		
		String str1 = "Hell world";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		//	    ���ڿ����� ���޹��� index��ġ�� ���ڸ��� �����ؼ� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String
		//	    ���ڿ��� ���޵� �Ǵٸ� ���ڿ��� �ϳ��� ���ļ� ���ο� ���ڿ��� ����
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		// str2 new ������ ���ؼ� ���ο� ���ڿ� (Hello world!!!) Heap������ ������
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		// str2�� str3�� ��� ���ڿ��� ��ġ�ϳ� ���� ����ִ� �ּҰ��� �ٸ�!!
		// str3 String Pool ������ ���ο� ���ڿ� (Hello world!!!) ������.
		
		System.out.println("str2�� str3�� ��ġ�մϱ� : " + (str2 == str3));
		
		// 3. ���ڿ�.equals(Object obj) : boolean
		// 	    ���ڿ��� ���޵� �� �ٸ� ���ڿ� ������ �ּҰ� �񱳰� �ƴ� ���� ���ڿ����� ������ ����� ����
		System.out.println("str2�� str3�� ��ġ�մϱ�(equals) : " + str2.equals(str3));
		
		// 4. ���ڿ�.contains(CharSequence s) : boolean
		System.out.println("str1�� Hello��� ���ڿ��� ���ԵǾ��ֽ��ϱ� : " + str1.contains("Hell"));
		System.out.println("str1�� Bye��� ���ڿ��� ���ԵǾ��ֽ��ϱ� : " + str1.contains("Bye"));
		
		// 5. ���ڿ�.length() : int
		System.out.println("str1�� ���� : " + str1.length());
		
		// 6. ���ڿ�.substring(int beginIndex) : String => ���ڿ��� beginIndex��ġ�������� �������� ���ڿ��� �����ؼ�����
		//	    ���ڿ�.substring(int beginIndex, int endIndex) : String
		//	  		=> ���ڿ��� beginIndex��ġ�������� endIndex-1 ��ġ������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4)); // begin <=   <  end
		
		// 7. ���ڿ�.replace(char oldChar, char newChar) : String
		//	    ���ڿ������� oldChar���ڵ��� newChar�� ��ȯ�� �� ���ڿ� ����
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		System.out.println("str1�� ����Ƴ�? : " + str1);
		
		// 8. ���ڿ�.toUpperCase() : String	=> ���ڿ��� �� �빮�ڷ� ������ �� ���ڿ� ����
		//	  ���ڿ�.toLowerCase() : String	=> ���ڿ��� �� �ҹ��ڷ� ������ �� ���ڿ� ����
		String str5 = str1.toUpperCase();	
		System.out.println(str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
		/*
		 * System.out.println("����Ͻðڽ��ϱ� (y/n) : ";
		 * char ch = sc.nextLine().toUpperCase().charAt(0); // 'N' 'Y'
		 * 			// �޼ҵ带 ���̾ ȣ�� == �޼ҵ� ü�̴�
		 * if(ch == 'N'){
		 * 	  // ���α׷� ����
		 * }
		 */
		
		// 9. ���ڿ�.trim() : String
		// 	    ���ڿ��� �� �� ������ ���Ž�Ų �� ���ڿ� ����
		String str6 = "   JA  VA   ";
		System.out.println("trim : " + str6.trim());
		
		// 10. ���ڿ�.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 11. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
	}
}
