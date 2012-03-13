package kr.miraesoft.miraebook.controller;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.PublisherRepository;
import kr.miraesoft.miraebook.repository.PublisherSearchSpec;
import kr.miraesoft.miraebook.service.PublisherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/publisher")
public class PublisherController {

	@Autowired
	PublisherService publisherService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "redirect:list";
	}

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model, PublisherSearchSpec publisherSearchSpec){

		model.addAttribute("paging", publisherService.getPagingList(publisherSearchSpec));
		return "publisher/list";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){
		return "publisher/write";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Publisher publisher){
		publisherService.add(publisher);
		return "redirect:list";
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(@RequestParam("id") Integer id, Model model){
		Publisher publisher = publisherService.get(id);
		model.addAttribute("publisher", publisher);
		return "publisher/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Publisher publisher){
		publisherService.update(publisher);
		return "redirect:list";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Publisher publisher){
		publisherService.delete(publisher);
		return "redirect:list";
	}
}
