package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import kr.miraesoft.miraebook.domain.Tag;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
@Transactional
public class TagJpaRepositoryTest {
	
	@Autowired TagJpaRepository repository;
	
	@Test
	@Ignore
	public void tag_저장() {
		Tag tag = new Tag();
		Tag conformTag = new Tag();
		String conformName = null;
		
		tag.setName("java");
		
		conformTag = repository.save(tag);
//		conformTag = repository.findOne(3L);
		conformName = conformTag.getName();
		
		assertEquals("java",conformName);
	}
	
	@Test
	@Ignore
	public void tag_수정() {
		Tag tag = new Tag();
		
		tag.setName("java");
		repository.save(tag);
		
		tag = repository.findOne(2);
		
		tag.setName("uml");
		repository.save(tag);
		
		List<Tag> tagList = repository.findAll();
//		System.out.println(tagList.get(0).getId());
		
		assertThat(tagList.size(), is(1));
		
		assertEquals("uml",tag.getName());		
	}
	
	@Test
	@Ignore
	public void tag_삭제() {
		Tag tag = new Tag();
		tag.setName("call");
		repository.save(tag);
		
		List<Tag> 삭제이전 = repository.findAll();
		
		repository.delete(tag.getId());
		
		List<Tag> 삭제이후 = repository.findAll();
		
		assertThat(삭제이전.size()-삭제이후.size(), is(1));
		
	}
	

}
