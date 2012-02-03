package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public void addBook(Book book) {
		bookRepository.saveBook(book);
	}

	public Book getBook(int bookno) {
		return bookRepository.findBook(bookno);
	}

	public void updateBook(Book book) {
		bookRepository.reflushBook(book);
	}

}