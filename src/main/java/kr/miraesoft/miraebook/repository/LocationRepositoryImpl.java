package kr.miraesoft.miraebook.repository;

import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Location;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LocationRepositoryImpl implements LocationRepository {

	@Inject
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public Integer saveLocation(Location location) {
		return (Integer) getSession().save(location);
	}

	public List findAll() {
		return getSession().createCriteria(Location.class).list();
	}

	public Location findOne(Integer id) {
		return (Location) getSession().get(Location.class, id);
	}

	public void reflush(Location location) {
		getSession().update(location);
	}

	public void delete(Location location) {
		getSession().delete(location);
	}

	public List findAllOrdering(String order) {
		Criteria criteria = getSession().createCriteria(Location.class);
		criteria.addOrder(Order.asc(order));
		return criteria.list();
	}

}
