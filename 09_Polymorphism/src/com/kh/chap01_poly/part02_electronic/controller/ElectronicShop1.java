package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을떄!!
public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	// 세개의 제품 갖다 놓기 위해 자리만 마련해둠
	
	// 오버로딩 적용된것도 확인 가능!!
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~);
		desk = d;
	}
	
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~);
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
}
