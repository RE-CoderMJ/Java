package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("������ ����", "������", 100);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 300);
		
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk2/*.toString()*/);
		// ��¹��� ���۷����� ����ϰ��� �Ҷ� JVM�� �ڵ����� �ش� ���۷���.toString() �޼ҵ� ȣ��
		// �� �� ���ƿ� ��� ���
		
		// �������̵� �� : Object Ŭ������ toString() ����=> ǮŬ������ + @ + ��ü�� �ؽ��ڵ�
		// �������̵� �� : Book Ŭ������ toString() ����=> �ش� ��ü�� ������ �ִ� ��� �ʵ� ���� �� ���ڿ��� ���� ����
	}

}
