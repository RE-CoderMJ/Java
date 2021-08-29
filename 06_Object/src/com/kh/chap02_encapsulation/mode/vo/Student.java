package com.kh.chap02_encapsulation.mode.vo;

public class Student {

	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * * �޼ҵ� 
	 * <ǥ����>
	 * ���������� [�����] ��ȯ�� �޼ҵ�� ([�Ű�����]){
	 * 		//��ɱ���
	 * }
	 */
	
	 // setter �޼ҵ�
	 //	�ش� �ʵ忡 ���Խ�Ű���� �ϴ� �� ���޹޾� �ش� �ʵ忡 ���Խ����ִ� ����� �޼ҵ�
	public void setName(String name) { // String name = "ȫ�浿";
		// �Ű����� : �ش� �޼ҵ� ȣ��� ���ް��� �޾��ֱ� ���� ��������(�� �޼ҵ� �������� ��밡��)
		//name = name; // �Ű�����name = �Ű�����name; ����
					 // (��? �ʵ��� �Ű��������� ������ �������� {} ���� �ش� ������ ���ý� �ش� �������� ������� ������ �켱������ ����)
		
		// �ʵ�name = �Ű�����name; ����
		this.name = name; // this���� �ش� ��ü�� �ּҰ��� �������
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// getter �޼ҵ�
	// �ش� �ʵ忡 ��䰪�� ��ȯ���ִ� ������ ����
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	
}
