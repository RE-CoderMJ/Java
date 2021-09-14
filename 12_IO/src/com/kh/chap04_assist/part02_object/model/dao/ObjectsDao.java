package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {

	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("Galaxy", 1200000);
		arr[1] = new Phone("Iphone", 1300000);
		arr[2] = new Phone("Zflip", 1500000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_phones.txt"))){
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_phones.txt"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 EOFException 예외 발생!
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램이 종료됩니다.");
	}
	
}
