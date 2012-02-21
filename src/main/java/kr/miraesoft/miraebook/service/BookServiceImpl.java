package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;
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
	
	public Book addBook(Book book) {
		Publisher temp_publisher = new Publisher();
		temp_publisher.setId(book.getPublisher_id());
		book.setPublisher(temp_publisher);
		Location temp_location = new Location();
		temp_location.setId(book.getLocation_id());
		book.setLocation(temp_location);
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