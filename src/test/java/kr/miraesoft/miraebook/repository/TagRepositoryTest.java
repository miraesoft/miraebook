package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.*;
import kr.miraesoft.miraebook.domain.Tag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("/applicationContext.xml")
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})

@Transactional
public class TagRepositoryTest {
	
	@Autowired TagJpaRepository repository;
	
	@Test
	public void crud() {
		Tag tag = new Tag();
		tag.setName("java");
		repository.save(tag);
	}
	

}
