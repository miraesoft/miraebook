package kr.miraesoft.miraebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import kr.miraesoft.miraebook.domain.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AuthorRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	private EntityManager getEntityManager(){
		return entityManagerFactory.createEntityManager();
	}
		
	public void insertAuthor(Author author) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(author);
		et.commit();
		em.close();
	}
	
	public Author findAuthor(Author author) {
		return (Author) getEntityManager().find(author.getClass(), author.getNo());
	}
	
}
