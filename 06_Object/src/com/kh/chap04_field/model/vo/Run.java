package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		// public : ��𼭵� ���� ����
		System.out.println(f2.pub);
		// protected : ������Ű�������� ���� ����, �ٸ���Ű����� ��ӱ��������� ���� ����
		System.out.println(f2.pro);
		
		// default : ������ ���� ��Ű���������� ���� ����
		System.out.println(f2.def);
		
		// private : only �ش� �� Ŭ���������� ���� ����
		//System.out.println(f2.pri);
	}
}
