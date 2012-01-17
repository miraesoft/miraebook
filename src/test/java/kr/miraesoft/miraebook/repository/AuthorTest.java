package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.service.AuthorService;

import org.junit.Before;
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
	
	@Before
	public void initAuthor(){
		
	}
	
	@Test
	public void testAuthor() {
		Author author = new Author();
		assertNotNull(author);
	}
	
	@Test
	public void testAddAuthor() throws Exception {
		Author author = new Author();
		author.setNo(1);
		author.setName("æ»∫¥»÷");
		authorService.addAuthor(author);
		
		Author author2 = authorService.getAuthor(1);
		
		assertNotNull(author2); 
		
	}
	
	
}
