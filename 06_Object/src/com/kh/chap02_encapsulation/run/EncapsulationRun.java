package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.mode.vo.Student;

public class EncapsulationRun {
	
	/*
	 * 7. ĸ��ȭ �������� �����ؼ� �Ϻ��� Ŭ������ ���¸� ���߰Բ�!!
	 * 
	 * 	  * ĸ��ȭ : �߻�ȭ�� ���� ���ǵ� �Ӽ���� ��ɵ��� �ϳ��� ���� �����ϴ� ����� �ϳ���
	 * 				Ŭ���������� ���� �߿��� ������ "�������� ���� ����"�� ��Ģ����
	 * 				�ܺηκ��� "�������� ���� ������ ����"
	 * 				��ſ� �����͸� ���������γ��� ó���� �� �ִ� �޼ҵ���� Ŭ���� ���ο� �ۼ��ؼ� �����ϴ� ���
	 * 
	 * 	  1) �������� : private
	 * 		���� ������ ���� ���� private ��� ���������� ���
	 * 
	 * 	  2) setter/getter �޼ҵ�
	 * 		 private �ϴ� ���� �ʵ忡 ���� �Ұ�
	 * 		 setter�޼ҵ� : �ش� �ʵ忡 ���Խ�Ű�����ϴ� �� ���޹޾� �ش� �ʵ忡 ���Խ����ִ� ��
	 */

	
	public static void main(String[] args) {
		
		Student hong = new Student();
		
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(162.3);
		hong.setKorScore(100);
		hong.setMathScore(90);

		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
		
		
	}

}
