package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {

	// �߻�Ŭ����(abstract class) : �Ϲ��ʵ� + �Ϲݸ޼ҵ� [+ �߻�޼ҵ�]
	// �������̽�(interface)		: only ����ʵ�+ �߻�޼ҵ�
	
	// private int a; �Ұ�
	/*
	public void test() {
		
	}
	*/
	
	// �������̽������� �ʵ�� ������ ����ʵ���!!
	/*public static final*/ int NUM = 10;
	
	// �������̽������� �޼ҵ�� ������ �߻�޼ҵ���!!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	
}
