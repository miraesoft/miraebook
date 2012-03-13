package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Publisher;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Publisher> list(PublisherSearchSpec publisherSearchSpec) {
		Criteria criteria = getSession().createCriteria(Publisher.class);
		//bookListSearch(publisherSearchSpec, criteria);
		criteria.setFirstResult(publisherSearchSpec.getFrom()); //첫번째 시작할행
		criteria.setMaxResults(publisherSearchSpec.getListSize()); //15행씩
		return criteria.list();
	}

	@Override
	public int count(PublisherSearchSpec publisherSearchSpec) {
		Criteria criteria = getSession().createCriteria(Publisher.class);
		//bookListSearch(publisherSearchSpec, criteria);
		return criteria.list().size();
	}

	@Override
	public Integer save(Publisher publisher) {
		return (Integer) getSession().save(publisher);
	}

	@Override
	public List<Publisher> findAll() {
		return getSession().createCriteria(Publisher.class).list();
	}

	@Override
	public Publisher findOne(Integer id) {
		return (Publisher) getSession().get(Publisher.class, id);
	}

	@Override
	public void delete(Publisher publisher) {
		getSession().delete(publisher);
	}

	@Override
	public void update(Publisher publisher) {
		getSession().update(publisher);
	}

}
