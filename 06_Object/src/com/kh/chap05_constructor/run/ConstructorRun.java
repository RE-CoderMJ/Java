package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. �⺻�����ڷ� ��ü ���� ���� �ش� ��ü ���� ���
		User u1 = new User();
		//System.out.println(u1.information());
		// �� �ʵ忡 JVM�� �ʱⰪ�� �������!!
		
		
		/*
		User u2 = new User();
		u2.setUserId("mjkim2058");
		u2.setUserPwd("mj1004");
		u2.setUserName("Minji Kim");
		u2.setAge(27);
		u2.setGender('F');
		*/
		// 2. �Ű����� 3��¥�� �����ڷ� ��ü ���� �� ���� ���
		User u2 = new User("user02", "pass02", "ȫ�浿");
		System.out.println(u2.information());
		
		u2.setUserName("ȫ����"); // �ʵ� �ϳ��� ������ ��쵵 �����ű⶧���� setter�޼ҵ� �ʿ�
		System.out.println(u2.information());
		
		User u3 = new User("user03", "pass03", "�踻��", 23, '��');
		System.out.println(u3.information());
		
	}

}
