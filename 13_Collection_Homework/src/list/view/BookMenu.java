package list.view;

import java.util.ArrayList;
import java.util.Scanner;

import list.controller.BookController;
import list.model.vo.Book;

public class BookMenu {
	
	private BookController bc = new BookController(); // BookController�� �޼ҵ���� ����ϱ� ���� ���۷���
	private Scanner sc = new Scanner(System.in); // ����ڿ��� Ű����� ���� �Է� �ޱ� ���� Scanner ��ü
	
	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("\n===== ���� �޴� ====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� �����ϱ�");
			
			System.out.println("0. ���α׷� �����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
		
	}
	
	// 1. �� ���� �߰��� view �޼ҵ�
	public void insertBook() {
		
		System.out.print("������ : ");
		String title = sc.nextLine();
		System.out.print("���ڸ� : ");
		String author = sc.nextLine();
		System.out.print("�帣 (�����Է� : 1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		int category = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		bc.insertBook(title, author, category, price);
		
		System.out.println("���������� �߰��Ǿ����ϴ�.");
		
		}
	
	
	// 2. ���� ��ü�� view �޼ҵ�
	public void selectList() {
		
		ArrayList<Book> selectList = bc.selectList();
		
		if(selectList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for(int i=0; i<selectList.size(); i++) {
				System.out.println(selectList.get(i));
			}
		}
	}
	
	
	// 3. ���� �˻��� view �޼ҵ�
	public void searchBook() {
		
		System.out.print("�˻��� �������� �Է��ϼ��� : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchBook = bc.searchBook(keyword);
		
		if(searchBook.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i=0; i<searchBook.size(); i++) {
				System.out.println(searchBook.get(i));
			}
		}
		/*
		 *    ** �� ��� ���� �� ������ Book ��ü�� �ƴ϶� ����Ʈ �ΰ���??
		 *    	  ���� Ű����� �˻��Ѵ�! ��, �� Ű���带 ������ ����� �ϳ��� �ƴ϶� �������� �� �ֱ� ������ ����Ʈ�� �޾ƺ���~!
		 */
	}
	
	
	// 4. ���� ������ view �޼ҵ�
	public void deleteBook() {
		
		System.out.print("������ �������� �Է��ϼ��� : ");
		String title = sc.nextLine();
		System.out.print("������ ���ڸ��� �Է��ϼ��� : ");
		String author = sc.nextLine();
		
		int result = bc.deleteBook(title, author);
		
		if(result == 1) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		
	}
	

}
