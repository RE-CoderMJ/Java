package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {

		// Properties : Map계열의 컬렉션 => 키+벨류 세트로 저장
		// HashMap과의 차이점 : Properties에는 키값도 String, 벨류값도 String으로 담음!
		
		Properties prop = new Properties();
		
		/*
		// Map 계열이기 때문에 put 메소드 이용해서 키+벨류 세트 담기 가능!
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제")); // get 메소드 이용 가능!
		
		// 하지만 properties 사용하는 경우는 주로 properties에 담긴 것들을 파일로 출력 또는 입력받아 올때 사용함!
		// 즉, properties에서 제공하는 store(), load() 메소드 사용하기 위해서
		
		try {
			
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			// ClassCastExcpetion
			// 내부적으로 store실행시 Properties에 담겨있는 키 + 벨류세트들을 String로 형변환해서 출력함!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Properties 키+벨류 세트로 추가할 때
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장 순서 유지 안됨, key값 중복시 덮어씌워짐
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("새우깡")); // 존재하지 않는 키값 제시하면 null 반환
		
		try {
			// 3. store(OutputStream os, String comments) : Properties에 담겨있는 key-value 값들을 파일로 출력(내부적으로 다 String으로 변환)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest"); // 입력부분 다시듣기!
			
			// 4. sotoreToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
