package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;

public interface BookService {

	Integer addBook(Book book);

	Book getBook(int bookno);
	
	Book updateBook(Book book);

	void dropBook(Integer id);
}
