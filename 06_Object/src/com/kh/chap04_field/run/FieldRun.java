package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		/*
		// ----- FeildTest1 -----
		FieldTest1 f1 = new FieldTest1();
		
		f1.test(5);
		*/
		
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		// public : ��𼭵� ���� ����
		System.out.println(f2.pub);
		// protected : ������Ű�������� ���� ����, �ٸ���Ű����� ��ӱ��������� ���� ����
		//System.out.println(f2.pro);
		
		// default : ������ ���� ��Ű���������� ���� ����
		//System.out.println(f2.def);
		
		// private : only �ش� �� Ŭ���������� ���� ����
		//System.out.println(f2.pri);
		
		// ----- FieldTest3 -----
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "hahaha"; // ����Ұ�
		
		System.out.println(Math.PI);
		//Math.PI = 2.53;
	}
	

}
