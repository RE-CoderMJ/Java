package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand~price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super. 으로 부모에 접근 가능(단, private은 접근할 수 없음)
		
		// 해결방법1. 부모클래스에 있는 필드를 protected 접근제한자로 수정
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter메소드를 활용하기(public이기 때문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모 생성자 호출
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는것
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
}
