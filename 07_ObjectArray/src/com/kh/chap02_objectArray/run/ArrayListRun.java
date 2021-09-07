package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList<>();
		
		list.add(new Phone());
		list.add(new Phone("���̻�", "���", 1300000, "11pro"));
		list.add(new Phone("���ϼ�", "����", 1200000, "s20"));
		
		//list.set(0, new Phone("������", "����", 1000000, "1"));
		list.get(0).setName("������");
		list.get(0).setBrand("����");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		for(Phone a : list) { // p = list.get(0);	=> p= list.get(1); ... 
			System.out.println(a.information());
			total += a.getPrice();
		}
		
		System.out.println("�� ���� : " + total + "��");
		System.out.println("��հ� : " + total / list.size() + "��");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ��� �ϴ� �ڵ��� : ");
		String buy = sc.nextLine();
		
		for(Phone a : list) {
			if(a.getName().equals(buy)) {
				System.out.println("����� �����ϰ��� �ϴ� �ڵ����� ������" + a.getPrice() + "�� �Դϴ�.");
			}
		}
		
		
		
	}

}
