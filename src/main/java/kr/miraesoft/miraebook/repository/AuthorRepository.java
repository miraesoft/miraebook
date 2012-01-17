package kr.miraesoft.miraebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import kr.miraesoft.miraebook.domain.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public void insertAuthor(Author author) {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(author);
		et.commit();
		em.close();
	}
	
}
