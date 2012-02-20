package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Book;

public interface BookService {

	Book addBook(Book book);

	Book getBook(int bookno);
	
	void updateBook(Book book);
}
