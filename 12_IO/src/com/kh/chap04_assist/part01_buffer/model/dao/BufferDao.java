package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	/*
	 * ������Ʈ�� : ��ݽ�Ʈ�������� �����ߴ� ������ ���� ��� �����ִ� ��Ʈ��
	 * 			  ��ݽ�Ʈ������ �������� �ʴ� �߰����� �޼ҵ� ���� / ������ ���ۼӵ� ��� ��Ų�ٰų� ���
	 * 		>> �ܺθ�ü�� ���������� ����Ǵ� ��Ʈ�� �ƴ�!!
	 * 		      �ܵ� ��� �Ұ�(�ݵ�� ��ݽ�Ʈ���� �Բ� ���)
	 */
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ���ϰ� ���������� �����ؼ� 2����Ʈ ������ ����� �� �ִ� ��Ʈ��
		// BufferedWriter : ���۶�� ������ �������ִ� ���� ��Ʈ��(�ӵ� ���)
		
		// 1. ��ݽ�Ʈ�� ���� ����
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. ������Ʈ�� ������ ��ݽ�Ʈ�� ��ü�� �����ϸ鼭 ����
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// ���� ������ ���ٷ� �ۼ�
		/*
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write �޼ҵ� �̿��ؼ� ������ ���
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine(); // �߰����� �޼ҵ� Ȱ�� ����
			bw.write("����������.");
			// ���۶�� ������ ��� �׾Ƴ��ٰ� �ѹ��� ������� => �ӵ� ��� ����.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // �߰��� ������� �߻��ϴ� �ݵ�� �����ϴ� ��
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//��������� �κ� �ٽõ��
		
		*/
		
		// try~with~resource�������� �ڿ��ݳ����� �� �����ϰ� �۾��� �� ����
		// jdk7���� �̻���� ��� ����
		/*
		 * try(try�������� ����� ��Ʈ����ü ���� ����){ // �˾Ƽ� try�� ������ ��Ʈ�� �ݳ����� ����
		 * 
		 * } catch(����Ŭ���� e){
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
			
			bw.write("�ȳ��ϼ���");
			bw.write("�ݰ����ϴ�.");
			bw.newLine();
			bw.write("����������");
			
		} catch(IOException e) {
			e.printStackTrace();
		} // �ڿ��ݳ� ���� �Ƚᵵ��! �ڵ����� �ݳ����� ���ٲ���
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// FileReader : ���ϰ� �����ؼ� 2����Ʈ ������ �����͸� �Է¹��� �� �ִ� ��ݽ�Ʈ��
		// BufferedReader : �ӵ� ��� ������ �Ǵ� ������Ʈ��
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			// readLine �޼ҵ带 �̿��ؼ� ���پ� �о���̱�
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // ������ ���� ������ ���� null ��ȯ
			System.out.println(br.readLine());
			*/
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
