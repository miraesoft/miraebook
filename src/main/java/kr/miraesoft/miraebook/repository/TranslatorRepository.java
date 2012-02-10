package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Translator;



public interface TranslatorRepository {

	List<Translator> getTranslatorList();

	Integer save(Translator translator);

	Translator get(Integer no);

	void delete(Translator translator);

	void update(Translator translator);
	

}
