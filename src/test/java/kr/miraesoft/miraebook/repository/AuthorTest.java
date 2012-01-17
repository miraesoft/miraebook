package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.*;
import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.service.AuthorService;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class AuthorTest {
	
	@Autowired
	private AuthorService authorService;
	
	@Test
	public void testAuthor() {
		Author author = new Author();
		assertNotNull(author);
		assertNotNull(authorService);
	}
	
	@Ignore
	@Test
	public void testAddAuthor_저장후_확인() throws Exception {
		Author author = new Author();
		author.setNo(1);
		author.setName("안병휘");
		authorService.addAuthor(author);
		
		Author author2 = authorService.getAuthor(author);
		
		assertNotNull(author2.getName(),author2); 
		
		assertEquals(author2.getName(), author.getName());
		
	}
	
	
}
