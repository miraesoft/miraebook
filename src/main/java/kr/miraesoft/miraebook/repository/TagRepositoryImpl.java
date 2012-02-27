package kr.miraesoft.miraebook.repository;

import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Tag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TagRepositoryImpl implements TagRepository {

	@Inject
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	
	public Integer addTag(Tag tag) {
		return (Integer) getSession().save(tag);
	}


	public Tag getTag(Integer id) {
		return (Tag) getSession().get(Tag.class, id);
	}


	public void updateTag(Tag tag) {
		getSession().saveOrUpdate(tag);
//		getSession().update(tag);
	}


	public void deleteTag(Tag tag) {
		getSession().delete(tag);
	}


	public List getTagList() {
		return getSession().createCriteria(Tag.class).list();
	}

}
