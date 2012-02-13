package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.repository.AuthorRepository;
import kr.miraesoft.miraebook.repository.BookRepository;
import kr.miraesoft.miraebook.repository.LocationRepository;
import kr.miraesoft.miraebook.repository.PublisherRepository;
import kr.miraesoft.miraebook.repository.TagJpaRepository;
import kr.miraesoft.miraebook.repository.TranslatorRepository;

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
		Book book =  bookRepository.findBook(bookno);
		book.getLocation().size();
		return book;
	}

	public void updateBook(Book book) {
		bookRepository.reflushBook(book);
	}

}