package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {

		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String Ŭ������ toString�޼ҵ� �̹� �������̵� �Ǿ�����!! (���� ��� ���ڿ� ��ȯ�ϵ���)
		
		System.out.println(str1 == str2); // false (�ּҰ� �񱳶�)
		
		System.out.println(str1.equals(str2));
		// String Ŭ������ equals�޼ҵ� �̹� �������̵� �Ǿ�����!! (�ּҰ� �񱳰� �ƴ� ���� ��� ���ڿ��� ��)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// StringŬ������ hashCode�޼ҵ� �̹� �������̵� �Ǿ�����!! (�ּҰ��� �ƴ� ���� ��� ���ڿ������� ����)
		
		
		// �������� �ּҰ��� ���ؼ� �˰� �ʹٸ� System.identitiyHashCode(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. ���ڿ��� ���ͷ������� ����
		String str1 = "hello";
		String str2 = "hello";
		// ���ͷ� ���ý� ���Ǯ(String Pool) ������ �ö�
		// String Pool�� Ư¡ : ������ ���ڿ��� ���� �� ����
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true(�ּҰ� ��ġ��)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		
		String str3 = "hi";
		System.out.println(System.identityHashCode(str3));
		
		// StringŬ���� == �Һ�Ŭ���� (������ �ʴ� Ŭ����)
		// ������ �����ϱ� �ϳ� �� �ڸ����� �����Ǵ� ���� �ƴ�!!
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// �����ϴ� ���� ������ ���ڿ� �ڸ����� ����Ǵ°� �ƴ�
		// ���ο� ���� �����ϵ��� �� (���ο� �ּҰ� �ο����� == �ּҰ� ����)
		// �����ִ� hi�� �Ҵ�Ǿ��ִ� ������ ������ �÷��Ͱ� �ð��� ������ �˾Ƽ� ������
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));
		
	}
	
}
