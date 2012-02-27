package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Tag;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class TagRepositoryTest {

	@Inject
	private TagRepository tagRepository;
	private Tag tag;
	private List tagList ;
	@Before
	@Ignore
	public void 태그추가(){
		tag = new Tag();
		tag.setName("외로움");
		
		tag.setId(tagRepository.addTag(tag));
		
		assertThat(1, is(tag.getId()));
	}
	
	@Test
	@Ignore
	public void 태그정보가져오기(){
		Tag tag = new Tag();
		tag.setName("첫번째태그");
		tag.setId(tagRepository.addTag(tag));
		
		Tag dbTag = tagRepository.getTag(tag.getId());
		
		assertThat(tag.getName(), is(dbTag.getName()));
		assertThat(tag.getId(), is(dbTag.getId()));
	}
	
	@Test
	@Ignore
	public void 태그정보수정_열린트랜잭션(){
		String param = "첫번째태그-수정";
		Tag tag = new Tag();
		tag.setName("첫번째태그");
		tag.setId(tagRepository.addTag(tag));
		tag.setName(param);
		Tag dbTag = tagRepository.getTag(tag.getId());
		
		assertThat(param, is(dbTag.getName()));
	}
	
	@Test
	@Ignore
	public void 태그정보수정_쿼리(){

		Tag dbTag = tagRepository.getTag(tag.getId());
		dbTag.setName("가가");
		
		tagRepository.updateTag(dbTag);
		
		dbTag = tagRepository.getTag(tag.getId());
		System.out.println(">>> dbTag " + dbTag.getName());
		assertThat("가가", is(dbTag.getName()));
	}

	@Test
	@Ignore
	public void 태그삭제(){
		
		Integer id = tag.getId();
		tagRepository.deleteTag(tag);

		Tag dbTag = tagRepository.getTag(id);
		
		assertThat(null, is(dbTag));
	}
	
	@Before
	@Ignore
	public void 태그리스트_110개(){
		int idx = 0;
		tagList = new ArrayList();
		while(idx < 110){
			tag = new Tag();
			tag.setName("외로움");
			tag.setId(tagRepository.addTag(tag));
			tagList.add(tag);
		}
		
		
	}
	
	@Test
	public void 태그리스트(){
		
		assertThat(110, is(tagList.size()));
	}
	
	
}
