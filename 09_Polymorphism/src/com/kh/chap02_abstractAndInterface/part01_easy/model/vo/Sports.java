package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	// 추상메소드(미완성된메소드) 만들기
	public abstract void rule();
	
}

