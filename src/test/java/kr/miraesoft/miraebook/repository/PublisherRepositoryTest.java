package kr.miraesoft.miraebook.repository;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import kr.miraesoft.miraebook.domain.Publisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class PublisherRepositoryTest {

	@Autowired PublisherRepository publisherRepository;
	
	@Test
	public void 출판소를_등록합니다() throws Exception {
		//begin
		Publisher publisher = new Publisher();
		publisher.setId(1L);
		publisher.setName("한빛미디어");
		
		//when
		publisherRepository.save(publisher);
		
		//begin
		publisher = new Publisher();
		publisher.setId(2L);
		publisher.setName("인사이트");
		
		//when
		publisherRepository.save(publisher);
		
		//then.
		assertEquals(publisherRepository.findAll().size(), 2);
	}
	
	@Test
	public void 출판소를_수정합니다() throws Exception {
		//begin
		Publisher publisher = publisherRepository.findOne(1L);
		publisher.setName("영진");
		
		//when
		publisherRepository.save(publisher);
		publisher = publisherRepository.findOne(1L);
		
		//then
		assertEquals(publisher.getName(), "영진");
		
	}
	
	
	@Test
	public void 출판소를_삭제합니다() throws Exception {
		//begin
		Publisher publisher = publisherRepository.findOne(2L);
		
		//when
		publisherRepository.delete(2L);
		publisher = publisherRepository.findOne(2L);
		
		//then
		assertNull(publisher);
			
	}
}
