package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
	/*
	 * * �÷����̶�?
	 * 	  �ڷᱸ�� ������ ����Ǿ��ִ� Ŭ������ �ڹٿ��� �����ϴ� "�ڷᱸ��"�� ����ϴ� "�����ӿ�ũ"�̴�.
	 * 
	 * 	 - �ڷᱸ�� : ����� �����͸� ���� ȿ�������� ����(��ȸ, ����, �߰�, ����, ����) �� �� �ֵ��� �����ִ� ����
	 * 	 - �����ӿ�ũ : �̹� ��������ִ� Ʋ(����)
	 * 
	 * * �迭�� ������ �÷����� ����
	 * > �迭�� ����
	 * 	 1. �迭�� �켱 ũ�⸦ �����ؾߵ�!! �ѹ� ������ ũ�⸦ ������ �� ����!!
	 * 	        ���ο� ���� �� �߰��ϰ��� �Ѵٸ� ���ο� ũ���� �迭�� ����� �������� �����ϴ� �ڵ带 ���� ���
	 * 
	 * 	 2. �迭�� �߰� ��ġ�� �߰��Ѵٰų� �����ϴ� ��� ���� �Ź� �����ִ� ������ �˰������� ���� ����ؾ���
	 *
	 *	 3. �� ������ �� Ÿ���� �����͵鸸 ���� �����ϴ�.
	 *
	 * 
	 * > �÷����� ����
	 * 	 1. ũ�� �������� �ʿ� ����! ���� �����ߴٰ� �ص� �� ���� �����͵��� ������ �˾Ƽ� ������ �÷���
	 * 		ũ���� ������ ����. 
	 * 
	 * 	 2. �߰��� ���� �߰��Ѵٰų� �����ϴ� ��� ���� �����ִ� �۾�(�˰�����)�� ���� ����� �ʿ����!!
	 * 		���� �޼ҵ� ȣ�⸸���� �˾Ƽ� ���������� ����ɲ���
	 * 
	 * 	 3. �� ������ ����Ÿ���� �����͵� ���� ����!! (��, ��ü�� ���� ����)
	 * 		�� Ÿ�Ը� ��⵵�� ������ �� ���� ����!
	 * 
	 * * ����� �����͵��� ���� ������ �صΰ� ��ȸ�� �� ��� �迭�� ���� ���
	 * 	  ����� �����͵��� ����, �߰�, ���� ��� �̷� �������� ����Ұ�� �÷����� ���� ���
	 * 
	 * 
	 *   // �׸��κ� ���� �ٽú���!
	 *   
	 */

	public static void main(String[] args) {
		
		// ������ ���׸� ������ ���� ������ <Object>	=> E == Object
		ArrayList/*Object*/ list = new ArrayList(3); // ũ�� �����Ҽ��� �ְ� ���Ҽ��� ����!!
		
		System.out.println(list); // �ȿ� �ƹ��͵� ����!! (����ִ� ����)
		
		// E --> Element : ����Ʈ�� ��� �����͵� (���)
		
		// 1. add(E e) : ����Ʈ���� ���� ���޵� �����͸� �߰������ִ� �޼ҵ�
		list.add(new Music("Good Bye", "��ȿ��"));
		list.add(new Music("�� ��", "�����"));
		list.add(new Music("��������", "��Ű"));
		list.add("��");
		
		// ������ ũ�⺸�� �� ���� �־ ���� �ȳ� => ����1 : ũ���� ���� ����
		// �پ��� Ÿ���� ������ ���� �� ����		=> ����3 : ����Ÿ�� ���� ����
		
		System.out.println(list); // list�� Ư¡ : �������� �ϸ鼭 ��� (0�� �ε������� ��������)
		
		// 2. add(int index, E e) : ���� �ε����� �����ؼ� �ش� �ε�����ġ�� �����͸� �߰������ִ� �޼ҵ�
		list.add(1, new Music("������ ��� �뷡", "���̽�"));
		
		// �߰� ��ġ�� ������ �߰��� ������ �˰����� ���� ���� ���� => ����2
		
		System.out.println(list);
		
		// 3. remove(int index)
		list.remove(1);
		
		System.out.println(list);
		
		// 4. set(int index, E e) : �ش� �ε�����ġ�� �����͸� ������ ���޵� e�� ���������ִ� �޼ҵ�
		list.set(0,  new Music("���� �޴�", "��������"));
		
		System.out.println(list);
		
		// 5. size() : ����Ʈ�� ������ ��ȯ�����ִ� �޼ҵ� (��, ��� �����Ͱ� ����ִ���)
		System.out.println("����Ʈ�� ������ : " + list.size()); 		// �迭�� ���غ��ڸ� length ���� ����
		System.out.println("����Ʈ�� ������ �ε����� : " + (list.size() - 1));
		
		// 6. get(int index) : �ش� �ε�����ġ�� ��ü�� ��ȯ�����ִ� �޼ҵ�
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)list.get(1)).getTitle());
		
		// 7. subList(int index1, int index2) : List	=> �����ؼ� ���ο� List�� ��ȯ
		List sub = list.subList(0,2); // 0 <=  < 2
		System.out.println(sub);
		
		// 8. addAll(Collection c) : �÷����� ��ä�� �ڿ� �߰������ִ� �޼ҵ�
		list.addAll(sub);
		System.out.println(list);
		
		// 9. isEmpty() : boolean	=> �÷����� ����ִ��� ���� �޼ҵ�
		System.out.println(list.isEmpty());
		
		// 10. clear(); : �� ����ִ� �޼ҵ�
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		// �ݺ����� ���� ���������� ���
		System.out.println("=================");
		// 1) for loop ��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=================");
		// 2) for each�� (���� for��)
		for(Object a : list) {
			System.out.println(a);
		}
		
		
	}

}