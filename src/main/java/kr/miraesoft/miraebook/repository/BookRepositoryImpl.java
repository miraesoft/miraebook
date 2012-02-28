package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Publisher;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Integer saveBook(Book book) {
		return (Integer) getSession().save(book);
	}

	public Book findBook(int bookno) {
		return (Book) getSession().get(Book.class,bookno);
	}

	public List<Book> list(String name) {
		Criteria criteria = getSession().createCriteria(Book.class);
		criteria.add(Restrictions.like("name", name));
		return criteria.list();
	}
	
	public Book reflushBook(Book book) {
		 getSession().update(book);
		 return findBook(book.getBookno());
	}

	public void deleteBook(Integer id) {
		Book book = new Book();
		book.setBookno(id);
		getSession().delete(book);
	}
	


}
