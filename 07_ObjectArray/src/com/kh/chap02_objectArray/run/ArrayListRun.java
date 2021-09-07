package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList<>();
		
		list.add(new Phone());
		list.add(new Phone("아이뽄", "사과", 1300000, "11pro"));
		list.add(new Phone("은하수", "샘송", 1200000, "s20"));
		
		//list.set(0, new Phone("벨벳폰", "헬지", 1000000, "1"));
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("헬지");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		for(Phone a : list) { // p = list.get(0);	=> p= list.get(1); ... 
			System.out.println(a.information());
			total += a.getPrice();
		}
		
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / list.size() + "원");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(Phone a : list) {
			if(a.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 핸드폰의 가격은" + a.getPrice() + "원 입니다.");
			}
		}
		
		
		
	}

}
