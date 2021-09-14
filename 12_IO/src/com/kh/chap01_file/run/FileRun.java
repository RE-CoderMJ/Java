package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일(file) 만들어지는 과정
		// java.io.File 클래스 가지고!

		try {

			// 1. 경로지정을 딱히 하지 않은 상태로 파일 생성 => 현재 project 폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐!!
			
			// 2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정하면됨
			//File f2 = new File("D:\\test.txt");
			//f2.createNewFile(); // 혹시 존재하지 않는 경로 제시시 IOException 발생
			
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하기
			//File tempFolder = new File("D:\\temp");
			//tempFolder.mkdir();// 폴더가 만들어지게하는 메소드
			
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile());
			//System.out.println(tempFolder.isFile());
			
			//------------------------------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/*
	 * 프로그램상의 데이터를 외부매체로 출력을 한다거나 또는 외부매체로부터 입력을 받아올거임!!
	 * 반드시 그 외부매체와 통로를 만들어야됨!! 그게 바로 스트림!!
	 * 
	 * * 스트림(통로)의 특징
	 * - 단방향 : 입력이면 입력 / 출력이면 출력
	 * 			=> 입력과 출력을 동시다발적으로 하고자 한다면? => 입력용스트림/출력용스트림 따로 열어야됨!!
	 * - 선입선출(FIFO) : 통로가 파이프 같은 개념이기 때문에 먼저 보낸값이 먼저 나옴!!
	 * - 시간지연(delay) 이라는 문제가 생길 수 있음!!
	 * 
	 * * 스트림의 구분
	 * > 통로의 사이즈 (1byte짜리 / 2byte짜리)
	 * 	 - 바이트스트림 : 1byte짜리만 왔다갔다 할 수 있을 정도의 사이즈(좁은통로) => 입력(InputStream) / 출력(OutputStream)
	 * 	 - 문자 스트림 : 2byte짜리도 왔다갔다 할 수 있을 정도의 사이즈(넓은통로)  => 입력(Reader) / 출력(Writer)
	 * 
	 * > 외부매체와 직접 연결하는 유무
	 * 	 - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로 (필수)
	 * 	 - 보조 스트림 : 말그대로 보조 역할만 하는 통로 (속도를 빠르게 한다거나, 그외에 유용한 기능들을 제공하는..)
	 * 				  보조스트림 단독으로는 사용 불가!! 기반스트림은 반드시 기본적으로 있어야됨!!
	 * 
	 * model.vo // model -> 데이터를 담당하는 패키지 vo ->객체의 데이터를 보관할 그릇과도 같은 용도
	 * model.dao -> data access object 데이터를 기록할만한 용도와 직접적으로 접근해서 보관하는 것을 의미함!
	 */

}
