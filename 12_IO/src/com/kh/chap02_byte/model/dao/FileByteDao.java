package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object)

public class FileByteDao {

	/*
	 * "����Ʈ ��� ��Ʈ��" ������ ������ ������غ���!!
	 * 
	 * - ����Ʈ ��Ʈ�� : �����͸� 1����Ʈ ������ �����ϴ� ��� (���������.. 1����Ʈ�� �ѱ۱���)
	 * - ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ���!
	 * 
	 * XXXInputStream : XXX��ü�κ��� �����͸� �Է¹޴� ��� (�ܺθ�ü�κ��� ������ �о������!)
	 * XXXOuntputStream : XXX��ü�� �����͸� ����ϴ� ��� (�ܺθ�ü�� �����͸� �������ڴ�. ���ڴ�.)
	 * 
	 */
	
	
	// ���α׷�(�ڹ� �Ǵ� �޸�) --> �ܺθ�ü(����) (��� : ���α׷� ���� �����͸� ���Ϸ� ��������, �� ���Ϸ� ����)
	public void fileSave() {
		
		// FileOutputStream : ���ϰ� ���������� �����ؼ� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		// 1. ��Ʈ�� ���� (��� �����)
		// 2. ��Ʈ������ �����͸� ��� (�޼ҵ� Ȱ��)
		// 3. �� ����� �� ��Ʈ�� �ݳ�
		
		FileOutputStream fout = null;
		try {
			// 1. FileOutputStream ��ü ���� => �ش� ���ϰ��� ������ΰ� �������
			/*
			 * true ���ۼ��� => �ش� ������ ������ ��� ������ ������ �������(�⺻���� false) // �� �κ� �ٽú�����
			 * true  �ۼ���  => �ش� ������ ������ ��� ������ �����Ϳ� �̾ �ۼ�
			 */
			fout = new FileOutputStream("a_byte.txt", true); // �ش� ������ ������ ���� ������ְ� ��α��� ���� / ������ �׳� ��� ����

			// 2. ���Ͽ� �����͸� ����ϰ��� �� �� write �޼ҵ� ���
			//	    ���ڸ� ����ϴ� ���ڸ� ����ϵ� �ǻ� ���Ͽ� ��ϵǴ°� ���ڷ� ��ϵ� (�ƽ�Ű�ڵ�ǥ)
			//	    ����(0~127)
			fout.write(97); // 'a' ���ڰ� ����
			fout.write('b');// 'b' ���ڰ� ����
			fout.write('��');// �ѱ��� 2byte¥������ ������ ����� => ����Ʈ ��Ʈ�����δ� ������ ����
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde ���ڰ�����
			
			// write(byte[] b, int off, int len) : byte�迭�� off�ε����������� len ������ŭ ���
			fout.write(arr, 1, 2); // de ���ڰ� ����
			
			// 3. ��Ʈ�� �� �̿������� �ݳ��ϱ�! (�ݵ��!)
			//fout.close(); // IOException����.. // ������ write() �޼ҵ� ����� IOEXception �߻����� ��� => catch�� ������ ������������(��,�ݳ��ڵ�� ����ȵ�)
												// �ݵ�� �����ؾ߸� �ϴ� �����̱⶧���� finally{}�� ���!
			
			
		} catch (FileNotFoundException e) { // �������� �ʴ� ��� ���ý� �߻��� �� ����
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // �� �ȿ� �ۼ��� �ڵ�� � ���ܰ� �߻��ߴ����� �������� ������ �����ϰ� ��������
			
			// 3. ��Ʈ�� �� �̿������� �ݳ��ϱ�! (�ݵ��!)
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	
	// ���α׷� <-- ����(�Է�: ���Ϸκ��� ������ ��������)
	public void fileRead() {
		
		// FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ��
		
		// 1. ��Ʈ�� ���� (��� �����)
		// 2. ��Ʈ�� ���ؼ� �Է¹޾ƿ� (�޼ҵ� Ȱ��)
		// 3. ����� ���� ��Ʈ�� �ݳ�
		
		FileInputStream fin = null;
		try {
			// 1. FileInputStream ��ü ���� => �ش� ���ϰ� ������� �������
			fin = new FileInputStream("a_byte.txt"); // ���� ������ִ� �� ����!
			
			// 2. ���Ϸ� ���� �����͸� �о���̰��� �� �� read �޼ҵ� ���
			// 	  1byte������ �ϳ��� �о�� / ���ڷ� �о����
			
			// ������ ���Ͽ� �󸶸�ŭ�� �����Ͱ� �ִ��� �𸦰��? => �ݺ��� Ȱ��
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read()); // ������ ���� ������ ���� -1�� �޾ƿ��°� Ȯ��!!
			System.out.println(fin.read());
			*/
			
			/* �ݺ��� ����� �Ź� read()�� �ι��� ����Ǳ� ������ �������� �о�鿩�� => �߸���
			while(fin.read() != -1) { // �о���� ���� -1�� �ƴ� ��쿡�� �ݺ������� ����ǵ���
				System.out.println(fin.read());
			}*/
			
			// read()ȣ���� �ݺ��� ����� �Ź� �ѹ��� ����ǵ���
			// �ذ���1. ���ѹݺ����� �����鼭 �Ź� ���ǰ˻�
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// �ذ���2. ������
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}

			
		} catch (FileNotFoundException e) { // ������ �������� ������ ���� �߻�
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 3. �� ����� ��Ʈ�� �ݳ�
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
