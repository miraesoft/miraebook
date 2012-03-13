package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.hyunjae.paging.Paging;
import kr.miraesoft.hyunjae.paging.PagingFactory;
import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.repository.BookRepository;
import kr.miraesoft.miraebook.repository.BookSearchSpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Integer addBook(Book book) {
		return bookRepository.saveBook(book);
	}

	public Book getBook(int bookno) {
		Book book =  bookRepository.findBook(bookno);
//		book.getLocation().size();
		return book;
	}

	public Book updateBook(Book book) {
		return bookRepository.reflushBook(book);
	}

	public void dropBook(Integer id) {
		bookRepository.deleteBook(id);
	}

	public Paging listBook(BookSearchSpec bookSearchSpec) {
		Paging paging = PagingFactory.createPaging(bookSearchSpec);
		List<Book> list =  bookRepository.list(bookSearchSpec);
		paging.setList(list);
		paging.setTotal(bookRepository.countBook(bookSearchSpec));
		return paging;
	}
}