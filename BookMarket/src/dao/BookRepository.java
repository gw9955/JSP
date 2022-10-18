package dao;

import java.util.ArrayList;
import java.util.List;


import dto.BookVO;

public class BookRepository {
	
	//클래스의 기본 생성자에 대한 객체 변수 instance를 작성함
	private static BookRepository instance = new BookRepository();
	
	//객체 변수 instance에 대한 Getter() 메소드
	public static BookRepository getInstance() {
		return instance;
	}

	//상품 목록을 저장하기 위한 List<ProductVO>추가
	private List<BookVO> listOfBooks = 
			new ArrayList<BookVO>();
	
	//기본 생성자
	public BookRepository() {
		BookVO book = new BookVO("a001", "HTML5 + CSS3", 15000);
	      book.setAuthor("황재호");
	      book.setDescription("워드나 PPT문서를 만들 수 있나요? 그러면 문제 없습니다. "
	            + "지금 바로 웹페이지 제작에 도전해보세요. 지금 당장 컴퓨터가 없어도 괜찮습니다. "
	            + "코드와 실행 화면이 바로 보여서 눈으..");
	      book.setPublisher("한빛미디어");
	      book.setCategory("[Hello Coding]");
	      book.setTotalPages(268);
	      book.setUnitsInstock(1500);
	      book.setReleaseDate("2018/03/07");
	    //ch07에서 추가
			book.setFilename("a001.png");
	      listOfBooks.add(book);
	      
	      BookVO book2 = new BookVO("a002", "쉽게 배우는 자바 프로그래밍", 27000);
	      book2.setAuthor("우종종");
	      book2.setDescription("객체 지향의 핵심과 자바의 현대적 기능은 충실히 다루면서도 초보자가 쉽게"
	            + "학습할 수 있게 구성했습니다. 시각화 도구를 활용한 개념 설명과 군더더기 없는"
	            + "핵심 코드를 통해 개념과 구현..");
	      book2.setPublisher("한빛미디어");
	      book2.setCategory("[IT모바일]");
	      book2.setTotalPages(308);
	      book2.setUnitsInstock(2000);
	      book2.setReleaseDate("2016/09/01");
	    //ch07에서 추가
			book2.setFilename("a002.png");
	      listOfBooks.add(book2);
	      
	      BookVO book3 = new BookVO("a003", "스프링4 입문", 27000);
	      book3.setAuthor("하세가와유이치.오오노와타루.토키고헤이");
	      book3.setDescription("스프링은 단순히 사용 방법만 익히는 것보다 아키텍처를 어떻게 이해하고"
	            + "설계하는지가 더 중요합니다. 예제를 복사해 붙여넣는 식으로는 실제 개발에서"
	            + " 스프링을 재대로 활용할 수 없습니다..");
	      book3.setPublisher("한빛미디어");
	      book3.setCategory("[IT모바일]");
	      book3.setTotalPages(189);
	      book3.setUnitsInstock(3000);
	      book3.setReleaseDate("2019/05/03");
	    //ch07에서 추가
			book3.setFilename("a003.png");
	      listOfBooks.add(book3);
		
	}
	
	public List<BookVO> getAllBooks(){
		return listOfBooks;
	}
	
	public void addBook(BookVO bookVO) {
	      listOfBooks.add(bookVO);
	   }
	
	public BookVO getBookById(String bookId) {
		//자바 빈 객체 선언
		BookVO bookById = null;
		
		//listOfBooks 의 크기만큼 반복
		for(int i=0; i<listOfBooks.size();i++) {
			BookVO vo = listOfBooks.get(i);
			if(vo !=null && vo.getBookId() !=null && vo.getBookId().equals(bookId)) {
				bookById = vo;
				break;
			}
		}
		
		return bookById;
	}

}
