package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.assertNotNull;
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
	public void testAddAuthor_저장후_확인() throws Exception {
		Author author = new Author();
		author.setNo(1);
		author.setName("안병휘");
		authorService.addAuthor(author);
		
		Author author2 = authorService.getAuthor(author.getNo());
		System.out.println(author2.getNo()+author2.getName());
		
		
		assertNotNull(author2.getName(),author2); 
		
	}
	
	
}
