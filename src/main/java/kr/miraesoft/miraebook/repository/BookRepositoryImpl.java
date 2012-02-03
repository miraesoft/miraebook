package kr.miraesoft.miraebook.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.miraesoft.miraebook.domain.Book;

@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void saveBook(Book book) {
		getSession().save(book);
	}

	public Book findBook(int bookno) {
		return (Book) getSession().get(Book.class,bookno);
	}

	public void reflushBook(Book book) {
		getSession().update(book);
	}


}
