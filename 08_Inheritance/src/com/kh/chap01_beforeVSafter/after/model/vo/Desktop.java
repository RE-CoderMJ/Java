package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand~price �� ���� ������ �θ�Ŭ����(Product)�� �ʵ忡 ����
		// super. ���� �θ� ���� ����(��, private�� ������ �� ����)
		
		// �ذ���1. �θ�Ŭ������ �ִ� �ʵ带 protected ���������ڷ� ����
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// �ذ���2. �θ�Ŭ������ �ִ� setter�޼ҵ带 Ȱ���ϱ�(public�̱� ������ ���� ����)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ���3. �θ� ������ ȣ��
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//�������̵� : �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ�������� �������ϴ°�
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
}
