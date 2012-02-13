package kr.miraesoft.miraebook.controller;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.PublisherRepository;
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
	PublisherService PublisherService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "publisher/hello";
	}

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){

		model.addAttribute("list", PublisherService.list());
		return "publisher/list";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){
		return "publisher/write";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Publisher publisher){
		publisher = PublisherService.add(publisher);
		return "redirect:view?id=" + publisher.getId();
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(@RequestParam("id") Integer id, Model model){
		Publisher publisher = PublisherService.get(id);
		model.addAttribute("publisher", publisher);
		return "publisher/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Publisher publisher){
		publisher = PublisherService.update(publisher);
		return "redirect:view?id=" + publisher.getId();
	}

	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String view(@RequestParam("id") Integer id, Model model){
		Publisher publisher = PublisherService.get(id);
		model.addAttribute("publisher", publisher);
		return "publisher/view";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("id") Integer id){
		PublisherService.delete(id);
		return "redirect:list";
	}
}
