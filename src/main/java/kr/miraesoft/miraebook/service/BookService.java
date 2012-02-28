package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.hyunjae.paging.Paging;
import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.repository.BookSearchSpec;

public interface BookService {

	Integer addBook(Book book);

	Book getBook(int bookno);
	
	Book updateBook(Book book);

	void dropBook(Integer id);
	
	public Paging listBook(BookSearchSpec bookSearchSpec);
}
