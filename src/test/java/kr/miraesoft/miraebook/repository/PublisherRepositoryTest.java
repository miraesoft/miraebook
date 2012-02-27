package kr.miraesoft.miraebook.repository;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.inject.Inject;

import junit.framework.TestCase;

import kr.miraesoft.miraebook.domain.Publisher;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class PublisherRepositoryTest {

	@Inject PublisherRepository publisherRepository;
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Test
	@Ignore
	public void 출판소를_등록합니다() throws Exception {
		//begin
		Publisher publisher = new Publisher();
		publisher.setId(1);
		publisher.setName("한빛미디어");
		
		//when
		publisherRepository.save(publisher);
		
		//begin
		publisher = new Publisher();
		publisher.setId(2);
		publisher.setName("인사이트");
		
		//when
		publisherRepository.save(publisher);
		
		//then.
		assertEquals(publisherRepository.findAll().size(), 2);
	}
	
	@Test
	@Ignore
	public void 출판소를_수정합니다() throws Exception {
		//begin
		Publisher publisher = publisherRepository.findOne(1);
		publisher.setName("영진");
		
		//when
		publisherRepository.save(publisher);
		publisher = publisherRepository.findOne(1);
		
		//then
		assertEquals(publisher.getName(), "영진");
		
	}
	
	
	/**
	 * @throws Exception
	 */
	/**
	 * @throws Exception
	 */
	@Test
	@Ignore
	public void 출판소를_삭제합니다() throws Exception {
		//begin
		Publisher publisher = publisherRepository.findOne(2);
		
		//when
		publisherRepository.delete(2);
		publisher = publisherRepository.findOne(2);
		
		//then
		assertNull(publisher);
			
	}
	
	@Transactional
	@Test
	@Ignore
	public void 정렬테스트() throws Exception {
		//begin
		Publisher publisher = null;

		for(int i=1; i <=50; i++){
			publisher = new Publisher();
			publisher.setId(i);
			publisher.setName("한빛미디어");
			publisherRepository.save(publisher);
		}
		
		//then.
		//assertEquals(publisherRepository.findAll().size(), 2);
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Publisher.class);
		criteria.addOrder(Order.desc("id"));
		Publisher p = (Publisher) criteria.list().get(0);
		assertEquals(p.getId(), new Integer(50));
		
	}
	
	@Transactional
	@Test
	@Ignore
	public void 페이징테스트() throws Exception {
		//begin
		Publisher publisher = null;

		for(int i=1; i <=50; i++){
			publisher = new Publisher();
			publisher.setId(i);
			publisher.setName("한빛미디어");
			publisherRepository.save(publisher);
		}
		
		//then.
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Publisher.class);
		criteria.addOrder(Order.desc("id"));
		criteria.setFirstResult(10); //첫번째 시작할행
		criteria.setMaxResults(15); //15행씩
		Publisher p = (Publisher) criteria.list().get(0);
		assertEquals(criteria.list().size(), 15);
		
	}
	
	@Transactional
	@Test
	@Ignore
	public void 검색조건지정테스트() throws Exception {
		//begin
		Publisher publisher = null;

		for(int i=1; i <=50; i++){
			publisher = new Publisher();
			publisher.setId(i);
			publisher.setName("한빛미디어"+i);
			publisherRepository.save(publisher);
		}
		
		//then.
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Publisher.class);
		criteria.add(Restrictions.eq("id", new Integer(3))).add(Restrictions.eq("name", "한빛미디어3"));
		Publisher p = (Publisher) criteria.list().get(0);
		//assertEquals(criteria.list().size(), 1);
		assertEquals(p.getId(), new Integer(3));
		
	}
}
