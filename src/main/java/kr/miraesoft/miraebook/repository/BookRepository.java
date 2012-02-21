package kr.miraesoft.miraebook.repository;

import kr.miraesoft.miraebook.domain.Book;

public interface BookRepository{

	Integer saveBook(Book book);

	Book findBook(int bookno);

	void reflushBook(Book book);

}
