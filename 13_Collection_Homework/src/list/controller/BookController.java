package list.controller;

import java.util.ArrayList;

import list.model.vo.Book;

public class BookController {
	
	// 도서들을  담고 있는 bookList
	private ArrayList<Book> bookList = new ArrayList<Book>();
	{
		// 초기값 4개정도 추가
		bookList.add(new Book("자바의 정석", "홍길동", "기타", 20000));
		bookList.add(new Book("C언어", "김말똥", "기타", 15000));
		bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
		bookList.add(new Book("여러분", "KH", "의료", 10000));
	}
	
	
	public void insertBook(String title, String author, int category, int price) {
		
		String categoryN = "";
		
		switch(category) {
		case 1: categoryN = "인문"; break;
		case 2: categoryN = "자연과학"; break;
		case 3: categoryN = "의료"; break;
		case 4: categoryN = "기타"; break;
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
