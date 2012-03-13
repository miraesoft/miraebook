package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Publisher;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
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

	public List<Book> list(BookSearchSpec bookSearchSpec) {
		Criteria criteria = getSession().createCriteria(Book.class);
		bookListSearch(bookSearchSpec, criteria);
		criteria.setFirstResult(bookSearchSpec.getFrom()); //첫번째 시작할행
		criteria.setMaxResults(bookSearchSpec.getListSize()); //15행씩
		return criteria.list();
	}

	private void bookListSearch(BookSearchSpec bookSearchSpec, Criteria criteria) {
		if(bookSearchSpec.getName() != null && !bookSearchSpec.getName().equals("")){
			criteria.add(Restrictions.like("name", bookSearchSpec.getName(), MatchMode.ANYWHERE));
		}
		if(bookSearchSpec.getOrder() != null && !bookSearchSpec.getOrder().equals("")){
			if(bookSearchSpec.getOrdby().equals("desc")){
				criteria.addOrder(Order.desc(bookSearchSpec.getOrder()));
			}else if(bookSearchSpec.getOrdby().equals("asc")){
				criteria.addOrder(Order.asc(bookSearchSpec.getOrder()));
			}
			
		}
	}
	
	public int countBook(BookSearchSpec bookSearchSpec) {
		Criteria criteria = getSession().createCriteria(Book.class);
		bookListSearch(bookSearchSpec, criteria);
		return criteria.list().size();
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
