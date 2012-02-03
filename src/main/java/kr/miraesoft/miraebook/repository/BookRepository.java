package kr.miraesoft.miraebook.repository;

import kr.miraesoft.miraebook.domain.Book;

public interface BookRepository{

	void saveBook(Book book);

	Book findBook(int bookno);

	void updateBook(Book book);

}