package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.*;
import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.service.BookService;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
@TransactionConfiguration(defaultRollback=false)
public class BookTest {

	@Autowired
	private BookService bookService;
	



	@Test
	public void testBook() {
		Book book = new Book();
		
		assertNotNull(book);
	}
	
	@Test
	public void testAddBook_책_추가_후_확인() throws Exception {
		Book book = new Book();
		book.setName("하이버네이트");
		bookService.addBook(book);
		
		Book tempBook = bookService.getBook(1);
		
		assertEquals(tempBook.getName(), "하이버네이트");
	}
	
	@Test
	public void testUpdateBook_책_추가_후_수정_후_확인() throws Exception {
		Book book = new Book();
		book.setName("토비의 스프링3.0");
		bookService.addBook(book);
		assertEquals(bookService.getBook(1).getName(), "토비의 스프링3.0");
		
		book.setName("토비의 스프링3.0 업데이트");
		bookService.updateBook(book);
		assertEquals(bookService.getBook(1).getName(), "토비의 스프링3.0 업데이트");
	}
}
