package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		
		Person mom = new Mother("�����", 50, 70, "���");
		Person baby = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // ������ +10 �ǰ��� -10
		baby.eat(); // ������ +3 �ǰ��� +1
		
		mom.sleep(); // �ǰ���+20
		baby.sleep(); // �ǰ���+3
		//((Baby)(baby)).sayHi();
		
		System.out.println("====== ������ ======");
		System.out.println(mom);
		System.out.println(baby);
		
		System.out.println();
		//Basic b = new Basic(); // ���۷��� �����δ� ��� �����ϳ� ��ü ������ �Ұ���!!
		
		Basic mom2 = new Mother("�����", 50, 70, "���");
		Basic baby2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(mom2);
		System.out.println(baby2);
		
		mom2.eat();
		baby2.eat();
		mom2.sleep();
		baby2.sleep();
		//baby2.sayHi();
		//Basic �������̽��� ���ǵ� �޼ҵ常 ��� ����.
		
		System.out.println(mom2);
		System.out.println(baby2);

		/*
		 * Ŭ�������� Ŭ������ ��ӹ����� : Ŭ���� extends Ŭ���� (���ϻ�Ӹ� ����) 					   : ȭ��ǥ "�Ǽ�"
		 * Ŭ�������� �������̽��� �����Ҷ� : Ŭ���� implements �������̽�, �������̽�, ..(���߻�� ����) : ȭ��ǥ "����"
		 * �������̽����� �������̽� ���    : �������̽�  extends �������̽�, �������̽�, ..(���߻�� ����) : ȭ��ǥ "�Ǽ�"
		 * 
		 * 
		 * 		       ��	             �߻�Ŭ����			��			�������̽�
		 * ====================================================================
		 * ��Ӱ���     ��			���ϻ��			��			���߻��
		 * ---------------------------------------------------------------------
		 * Ű����	       ��       		extends			��		  implements
		 * ---------------------------------------------------------------------
		 * �߻�޼ҵ�  ��      	�߻�޼ҵ� 0�� �̻�		��		��� �޼ҵ尡 �߻�޼ҵ�
		 * ǥ����/������	��������� abstract ���	��	���������� abstract (��������)
		 * ---------------------------------------------------------------------
		 * �Ϲݸ޼ҵ忩�� �� 		  O				��				X
		 * ---------------------------------------------------------------------
		 * �ʵ�		��		�Ϲ��ʵ� ���� �� ����		��	����ʵ常 ���� �� ����(���������� public static final)
		 * ---------------------------------------------------------------------
		 * 
		 * 
		 * extends �Ϲ�Ŭ����	-->	extends �߻�Ŭ����	--> implements �������̽�
		 * ------------------------------------------------------------>
		 * 					  �������� �� £����(�Ծ��� �� ����)
		 * 
		 * 
		 */
	}

}
