package kr.miraesoft.miraebook.controller;


import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Translator;
import kr.miraesoft.miraebook.repository.TranslatorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/translator")
public class TranslatorController {
	
	@Inject
	private TranslatorRepository translatorRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "translator/hello";
	}


	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){

		model.addAttribute("list", translatorRepository.getTranslatorList());
		return "translator/list";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){

		return "translator/write";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Translator translator){
		Integer no = translatorRepository.save(translator);
		return "redirect:" + no;
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Translator translator,Model model){
		translator = translatorRepository.get(translator.getNo());
		model.addAttribute("translator", translator);
		return "translator/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Translator translator){
		translatorRepository.update(translator);
		return "redirect:" + translator.getNo();
	}

	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String view(@PathVariable("name") Integer no,Model model){
		Translator translator = translatorRepository.get(no);
		model.addAttribute("translator", translator);
		return "translator/view";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Translator translator){
		translatorRepository.delete(translator);
		return "redirect:list";
	}
}