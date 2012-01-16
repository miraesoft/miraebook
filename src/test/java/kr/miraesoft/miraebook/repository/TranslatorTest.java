package kr.miraesoft.miraebook.repository;

import static org.junit.Assert.*;

import java.util.List;

import kr.miraesoft.miraebook.domain.Translator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class TranslatorTest {

	@Autowired 
	TranslatorRepository translatorRepository;


	@Test
	public void test() {
		// begin
		Translator translator = new  Translator(0, "황순원");

		// then
		assertEquals("황순원", translator.getName());

	}

	@Before
	public void 번역자저장() {
		// begin
		Translator translator1 = new  Translator(1, "안소영");
		Translator translator2 = new  Translator(2, "장보아");
		// when
		translatorRepository.save(translator1);
		translatorRepository.save(translator2);
		// then
		assertEquals(2, translatorRepository.count());

	}


	@Test
	public void 번역자정보가져오기() {
		// begin
		Translator translator = new  Translator();
		translator.setId(1);

		// when
		translator = translatorRepository.findOne(translator.getId());
		// then
		assertEquals("안소영", translator.getName());
	}



	@Test
	public void 번역자정보리스트가져오기() {
		// begin

		// when
		List<Translator> list = translatorRepository.findAll();
		// then
		assertEquals(2, list.size());
	}

	@Test
	public void 번역자정보수정하기(){
		// begin

		// when 
		translatorRepository.save(new Translator(1,"김범수"));
		Translator translator1 = translatorRepository.findOne(1);
		Translator translator2 = translatorRepository.findOne(2);


		// then
		assertEquals("김범수", translator1.getName());
		assertEquals("장보아", translator2.getName());
	}

	@Test
	public void 번역자정보삭제하기(){
		//when
		translatorRepository.deleteAll();

		//then
		assertEquals(0, translatorRepository.findAll().size());
	}

}