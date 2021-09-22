package list.view;

import java.util.ArrayList;
import java.util.Scanner;

import list.controller.BookController;
import list.model.vo.Book;

public class BookMenu {
	
	private BookController bc = new BookController(); // BookController의 메소드들을 사용하기 위한 레퍼런스
	private Scanner sc = new Scanner(System.in); // 사용자에게 키보드로 값을 입력 받기 위한 Scanner 객체
	
	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("\n===== 메인 메뉴 ====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제하기");
			
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하였습니다. 다시 입력해주세요"); break;
			}
		}
		
	}
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 (숫자입력 : 1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		bc.insertBook(title, author, category, price);
		
		System.out.println("성공적으로 추가되었습니다.");
		
		}
	
	
	// 2. 도서 전체용 view 메소드
	public void selectList() {
		
		ArrayList<Book> selectList = bc.selectList();
		
		if(selectList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(int i=0; i<selectList.size(); i++) {
				System.out.println(selectList.get(i));
			}
		}
	}
	
	
	// 3. 도서 검색용 view 메소드
	public void searchBook() {
		
		System.out.print("검색할 도서명을 입력하세요 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchBook = bc.searchBook(keyword);
		
		if(searchBook.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0; i<searchBook.size(); i++) {
				System.out.println(searchBook.get(i));
			}
		}
		/*
		 *    ** 왜 결과 값이 한 도서의 Book 객체가 아니라 리스트 인가요??
		 *    	  보통 키워드로 검색한다! 즉, 그 키워드를 포함한 결과가 하나가 아니라 여러개일 수 있기 때문에 리스트로 받아보자~!
		 */
	}
	
	
	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
		
		System.out.print("삭제할 도서명을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명을 입력하세요 : ");
		String author = sc.nextLine();
		
		int result = bc.deleteBook(title, author);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}
	

}
