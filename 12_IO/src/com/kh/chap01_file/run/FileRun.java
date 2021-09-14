package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// �����ϰ� ����(file) ��������� ����
		// java.io.File Ŭ���� ������!

		try {

			// 1. ��������� ���� ���� ���� ���·� ���� ���� => ���� project ������ ���� ����
			File f1 = new File("test.txt");
			f1.createNewFile(); // �޼ҵ���� �����ؾ߸� ���� ������ �������!!
			
			// 2. �����ϴ� ������ ���� ���� => �ش� ��α��� �����ϸ��
			//File f2 = new File("D:\\test.txt");
			//f2.createNewFile(); // Ȥ�� �������� �ʴ� ��� ���ý� IOException �߻�
			
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			// 3. ���� ���� ����� ���ϱ��� ��������� �ϱ�
			//File tempFolder = new File("D:\\temp");
			//tempFolder.mkdir();// ������ ����������ϴ� �޼ҵ�
			
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile());
			//System.out.println(tempFolder.isFile());
			
			//------------------------------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	/*
	 * ���α׷����� �����͸� �ܺθ�ü�� ����� �Ѵٰų� �Ǵ� �ܺθ�ü�κ��� �Է��� �޾ƿð���!!
	 * �ݵ�� �� �ܺθ�ü�� ��θ� �����ߵ�!! �װ� �ٷ� ��Ʈ��!!
	 * 
	 * * ��Ʈ��(���)�� Ư¡
	 * - �ܹ��� : �Է��̸� �Է� / ����̸� ���
	 * 			=> �Է°� ����� ���ôٹ������� �ϰ��� �Ѵٸ�? => �Է¿뽺Ʈ��/��¿뽺Ʈ�� ���� ����ߵ�!!
	 * - ���Լ���(FIFO) : ��ΰ� ������ ���� �����̱� ������ ���� �������� ���� ����!!
	 * - �ð�����(delay) �̶�� ������ ���� �� ����!!
	 * 
	 * * ��Ʈ���� ����
	 * > ����� ������ (1byte¥�� / 2byte¥��)
	 * 	 - ����Ʈ��Ʈ�� : 1byte¥���� �Դٰ��� �� �� ���� ������ ������(�������) => �Է�(InputStream) / ���(OutputStream)
	 * 	 - ���� ��Ʈ�� : 2byte¥���� �Դٰ��� �� �� ���� ������ ������(�������)  => �Է�(Reader) / ���(Writer)
	 * 
	 * > �ܺθ�ü�� ���� �����ϴ� ����
	 * 	 - ��� ��Ʈ�� : �ܺ� ��ü�� ���������� ����Ǵ� ��� (�ʼ�)
	 * 	 - ���� ��Ʈ�� : ���״�� ���� ���Ҹ� �ϴ� ��� (�ӵ��� ������ �Ѵٰų�, �׿ܿ� ������ ��ɵ��� �����ϴ�..)
	 * 				  ������Ʈ�� �ܵ����δ� ��� �Ұ�!! ��ݽ�Ʈ���� �ݵ�� �⺻������ �־�ߵ�!!
	 * 
	 * model.vo // model -> �����͸� ����ϴ� ��Ű�� vo ->��ü�� �����͸� ������ �׸����� ���� �뵵
	 * model.dao -> data access object �����͸� ����Ҹ��� �뵵�� ���������� �����ؼ� �����ϴ� ���� �ǹ���!
	 */

}
