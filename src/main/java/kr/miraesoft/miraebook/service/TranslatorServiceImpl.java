package kr.miraesoft.miraebook.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.Translator;
import kr.miraesoft.miraebook.repository.TranslatorRepository;

@Service
public class TranslatorServiceImpl implements TranslatorService {
	
	@Inject private TranslatorRepository translatorRepository;
	
	@Override
	public List<kr.miraesoft.miraebook.domain.Translator> getTranslatorList() {
		return translatorRepository.getTranslatorList();
	}

}
