package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// 사용자의 요청 처리해주는 클래스
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	{ // 초기화 블럭 리스트 생성되고 나서 객체 추가됌
	list.add(new Music("GoodBye", "박효신"));
	list.add(new Music("술이 달다", "에픽하이"));
	list.add(new Music("밥이 달다", "김민지"));
	}
	
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		
		// result = 0 | 1 (성공적으로 삭제 된거임!)
		return result;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); 
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		// searchList => 텅비어있을 수 있음 | 검색된 Music객체들이 담겨있을 수 있음
		return searchList;
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) { // 곡명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}else { // 가수명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setArtist(upArtist);
				m.setTitle(upTitle);
				result = 1;
				break;
			}
		}
		
		// result == 0 (수정할 곡을 못찾을 경우) | 1 (성공적으로 수정됨)
		return result;
	}
	
}
