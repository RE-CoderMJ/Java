package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// ����صѰ�!! '=' �������� �ؼ� ���ʰ� �������� �ڷ���(Ÿ��)�� ���ƾߵ�!!
		
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ�ü�� �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 ���۷����� Parent���� ���ٰ���
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // �ڵ�����ȯ �Ȱſ���!! (Child=>Parent)
		//((Parent)c1).printParent;
		
		// c1���۷����� Child1, Parent �� �� ���� ����
		// (Parent ���ٽ� �ڵ����� ����ȯ �� ä�� ����Ȱ���)
		
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ��� (������)");
		Parent p2 = /*(Parent)*/new Child1(); // �ڵ�����ȯ ��
		p2.printParent();
		((Child1)p2).printChild1(); // ��������ȯ�� �ϸ� ȣ���� ����!

		// p2 ���۷����� ���� ������ Parent���� ���� ����������
		// Child1�� �����ϰ��� �Ѵٸ� ��������ȯ�� �ϸ� ������ ����!!
		
		/*
		 * ��� ������ Ŭ������ ������ ����ȯ ����
		 * 
		 * 1. UpCasting
		 * 	    �ڽ� Ÿ�� -> �θ� Ÿ������ ����ȯ
		 * 	    �ڵ�����ȯ
		 * 	  ex) �ڽ�.�θ�޼ҵ�()
		 * 		    �θ� = �ڽİ�ü;
		 * 
		 * 2. DownCasting
		 * 	    �θ�Ÿ�� -> �ڽ� Ÿ������ ����ȯ
		 * 	    ��������ȯ �ؾߵ�
		 * 	  ex) ((�ڽ�)�θ�).�ڽĸ޼ҵ�();
		 */
		
		// * ������ ����
		// - �θ�Ÿ�����κ��� �Ļ��� �������� Ÿ���� �ڽ� ��ü���� �θ�Ŭ���� Ÿ�� �ϳ��� �ٷ� �� �ִ� ���
		
		// * �������� ���� ���� (����)
		
		// �������� ���� ��...
		// Child1 ��ü 2���� Child2 ��ü 2���� �����ؾߵ�
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5); 
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// ----------------------------------------
		// �������� ������ ��...
	  //Parent
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// �ϳ��� �θ�Ÿ�Ը����� ���� �ڽİ�ü���� ���� �� ����=> ���ϴ�, �ڵ� ���� ����
		
		System.out.println("==============================");
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		//((Child1)arr[2]).printChild1(); // ClassCastException -> ��..?
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("=====�ݺ��� �̿��ؼ� ���=====");
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof ������ => ���� ��� true/false �� ��ȯ
			 * ���� ���۷����� ���������� � Ŭ����Ÿ���� �����ϴ��� Ȯ�� �Ҷ� ���
			 */
			if(arr[i] instanceof Child1) { // �ش� ���۷����� ���� Child1 �����ϰ� �ִٸ� true �ƴϸ� false
				((Child1)arr[i]).printChild1();								
			}else {
				((Child2)arr[i]).printChild2();
			}
		}
		
		System.out.println("==============================");
		
		//Parent pp = new Child1();
		//pp.print();
		/*
		 * �������ε� : ���α׷� ����Ǳ� ������ ������ �Ǹ鼭 �������ε� (���۷���Ÿ���� �޼ҵ带 ����Ŵ)
		 * 			  ��, ���������� �����ϴ� �ڽ�Ŭ������ �ش� �޼ҵ尡 �������̵��� �Ǿ��ִٸ�
		 * 			  ���α׷� ����� �������� �� �ڽ�Ŭ������ �������̵� �� �޼ҵ带 ã�Ƽ� ����
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		
	}
	

}
