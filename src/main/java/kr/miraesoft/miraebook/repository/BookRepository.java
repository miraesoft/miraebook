package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Book;

public interface BookRepository{

	Integer saveBook(Book book);

	Book findBook(int bookno);

	Book reflushBook(Book book);

	void deleteBook(Integer id);

	List<Book> list(BookSearchSpec bookSearchSpec);
	
	public int countBook(BookSearchSpec bookSearchSpec);
}
