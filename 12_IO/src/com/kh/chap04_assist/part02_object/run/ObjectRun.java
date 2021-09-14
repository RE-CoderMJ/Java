package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {

		ObjectDao o = new ObjectDao();
		//o.fileSave();
		//o.fileRead();
		
		ObjectsDao dao = new ObjectsDao();
		//dao.fileSave();
		dao.fileRead();
		
		
	}

}
