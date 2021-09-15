package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music>�� ���׸� ���� �� => E == Music
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Good Bye", "��ȿ��"));
		list.add(new Music("�� ��", "�����"));
		//list.add("��");

		System.out.println(list);
		
		list.add(1, new Music("������ ��� �뷡", "���̽�"));
		
		System.out.println(list);
		
		list.set(0, new Music("���� �޴�", "��������"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());
		
		for(Music o : list) {
			System.out.println(o);
		}
		
		/*
		 * * ���׸�<>�� ����ϴ� ����
		 * 1. ��õ� Ÿ���� ��ü�� �����ϵ��� ������ �� �� ����
		 * 2. �÷��ǿ� ����� ��ü�� ������ ����� �� �Ź� ����ȯ�ϴ� ������ ���ֱ� ����
		 */
	}

}
