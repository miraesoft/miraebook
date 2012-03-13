package kr.miraesoft.miraebook.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.miraesoft.miraebook.domain.Translator;
import kr.miraesoft.miraebook.repository.TranslatorRepository;

@Service
public class TranslatorServiceImpl implements TranslatorService {
	
	@Inject private TranslatorRepository translatorRepository;

	public List<Translator> getTranslatorList() {
		// TODO Auto-generated method stub
		return translatorRepository.getTranslatorList();
	}


}
