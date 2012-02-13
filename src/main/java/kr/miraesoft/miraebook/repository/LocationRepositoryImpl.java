package kr.miraesoft.miraebook.repository;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.miraesoft.miraebook.domain.Location;

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

}
