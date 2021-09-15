package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// ������� ��û ó�����ִ� Ŭ����
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	{ // �ʱ�ȭ �� ����Ʈ �����ǰ� ���� ��ü �߰���
	list.add(new Music("GoodBye", "��ȿ��"));
	list.add(new Music("���� �޴�", "��������"));
	list.add(new Music("���� �޴�", "�����"));
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
		
		// result = 0 | 1 (���������� ���� �Ȱ���!)
		return result;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); 
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		// searchList => �ֺ������ �� ���� | �˻��� Music��ü���� ������� �� ����
		return searchList;
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) { // ������� �˻�
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}else { // ���������� �˻�
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
		
		// result == 0 (������ ���� ��ã�� ���) | 1 (���������� ������)
		return result;
	}
	
}
