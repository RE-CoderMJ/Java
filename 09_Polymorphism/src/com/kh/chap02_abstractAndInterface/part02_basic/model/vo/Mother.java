package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth;
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth: " + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		// ������� ������ 10����
		super.setWeight(super.getWeight() + 10);
		// �ǰ��� 10 ����
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		// ���ڸ� �ǰ��� 20����
		super.setHealth(super.getHealth() + 20);
	}

}
