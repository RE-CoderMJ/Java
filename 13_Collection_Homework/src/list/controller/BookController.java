package list.controller;

import java.util.ArrayList;

import list.model.vo.Book;

public class BookController {
	
	// ��������  ��� �ִ� bookList
	private ArrayList<Book> bookList = new ArrayList<Book>();
	{
		// �ʱⰪ 4������ �߰�
		bookList.add(new Book("�ڹ��� ����", "ȫ�浿", "��Ÿ", 20000));
		bookList.add(new Book("C���", "�踻��", "��Ÿ", 15000));
		bookList.add(new Book("������ �Ǿ�����", "������", "�ι�", 17500));
		bookList.add(new Book("������", "KH", "�Ƿ�", 10000));
	}
	
	
	public void insertBook(String title, String author, int category, int price) {
		
		String categoryN = "";
		
		switch(category) {
		case 1: categoryN = "�ι�"; break;
		case 2: categoryN = "�ڿ�����"; break;
		case 3: categoryN = "�Ƿ�"; break;
		case 4: categoryN = "��Ÿ"; break;
		}
		
		Book bk = new Book(title, author, categoryN, price);
		bookList.add(bk);
		
	}
	
	
	public ArrayList<Book> selectList(){
		
		return bookList; 	
	}
	
	
	public ArrayList<Book> searchBook(String keyword){
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	public int deleteBook(String title, String author) {
		
		int result = 0;
		
		for(Book b : bookList) {
			
			if(title.equals(b.getTitle()) && author.equals(b.getAuthor())) {
				bookList.remove(b);
				result = 1;
				break;
			}
		
		}
		
		
		return result;
	}
	
	
	
	
}
