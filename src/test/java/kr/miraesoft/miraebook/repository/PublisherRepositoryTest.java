package kr.miraesoft.miraebook.repository;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Publisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class PublisherRepositoryTest {

	@Inject PublisherRepository publisherRepository;
	
	@Test
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
	public void 출판소를_삭제합니다() throws Exception {
		//begin
		Publisher publisher = publisherRepository.findOne(2);
		
		//when
		publisherRepository.delete(2);
		publisher = publisherRepository.findOne(2);
		
		//then
		assertNull(publisher);
			
	}
}
