package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

	public void updateBook(Book book) {
		bookRepository.reflushBook(book);
	}

}