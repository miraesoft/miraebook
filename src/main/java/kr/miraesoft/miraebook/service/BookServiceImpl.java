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
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	@Autowired
	private TranslatorRepository translatorRepository;
	
	@Autowired
	private TagJpaRepository tagRepository;
	
	public void addBook(Book book) {
		bookRepository.saveBook(book);
	}

	public Book getBook(int bookno) {
		Book book =  bookRepository.findBook(bookno);
		return book;
	}

	public void updateBook(Book book) {
		bookRepository.reflushBook(book);
	}

}