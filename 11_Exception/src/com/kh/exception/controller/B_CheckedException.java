package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	/*
	 * CheckedException은 반드시 예외처리를 해야되는 예외들임
	 * => 조건문 미리제시할 수 없음 (왜? 예측이 불가한 곳에서 문제가 발생하기 때문에 미리 예외처리구문을 작성해놔야됨!)
	 * => 외부 매개체와 입출력이 일어날 때 발생됨!(IOException)
	 * 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 문자열로 읽어들여짐)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 강의듣기
		
		System.out.print("아무거나 입력해주세요 : ");
		
		// 1. try~catch 문 : 여기 이 자리에서 곧바로 예외를 처리하겠다!!
		// try{} : 예외가 발생할 가능성이 있는 코드를 작성
		// catch(발생될예외클래스 매개변수){} : try구문내에서 예외가 발생했을 경우 어떻게 처리할건지에 대한 내용 작성
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		*/
		
		// 2. throws : 지금 이 자리에서 예외를 처리하지 안고 현재 이 메소드를 호출하는 곳으로 예외처리를 떠넘기겠다. (위임하겠다.)
		String str = br.readLine(); // readLine() 메소드에서 throws IOExcpetion하고 있음 (떠넘기고있음)
		System.out.println(str);
	}
	
	/*
	 * 							예외클래스				예외발생시점			예외처리
	 * UnchekckedException	RuntimeException	  	 런타임에러			   세모(개발자가 케바케로 처리=> if문을 통해 애초에 예외가 발생안되도록 / 예외처리구문)
	 * 	  CheckedException	RuntimeException 외		컴파일에러(빨간줄)		   필수(조건문 안됨!! 무조건 예외처리구문으로)
	 */
	
}
