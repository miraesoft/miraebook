package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Translator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class TranslatorRepositoryImpl implements TranslatorRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public List<Translator> getTranslatorList() {
		return getSession().createCriteria(Translator.class).list();
	}

	public Integer save(Translator translator) {
		return (Integer) getSession().save(translator);
	}

	public Translator get(Integer no) {
		return (Translator) getSession().get(Translator.class, no);
	}

	public void delete(Translator translator) {
		getSession().delete(translator);
	}

	public void update(Translator translator) {
		getSession().saveOrUpdate(translator);
	}


	
}
