package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. 기본생성자로 객체 생성 직후 해당 객체 정보 출력
		User u1 = new User();
		//System.out.println(u1.information());
		// 각 필드에 JVM의 초기값들 담겨있음!!
		
		
		/*
		User u2 = new User();
		u2.setUserId("mjkim2058");
		u2.setUserPwd("mj1004");
		u2.setUserName("Minji Kim");
		u2.setAge(27);
		u2.setGender('F');
		*/
		// 2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02", "pass02", "홍길동");
		System.out.println(u2.information());
		
		u2.setUserName("홍말동"); // 필드 하나씩 수정할 경우도 있을거기때문에 setter메소드 필요
		System.out.println(u2.information());
		
		User u3 = new User("user03", "pass03", "김말똥", 23, '남');
		System.out.println(u3.information());
		
	}

}
