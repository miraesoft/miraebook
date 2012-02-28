package kr.miraesoft.miraebook.controller;

import javax.inject.Inject;

import kr.miraesoft.miraebook.service.TagService;
import kr.miraesoft.miraebook.domain.Tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value="/tag")
public class TagController {

	@Inject
	private TagService tagService; 
	
	
	@RequestMapping( method=RequestMethod.GET)
	public String index(Model model) {
		return "redirect:list";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", tagService.getTagList());
		return "tag/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "tag/write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Tag tag) {
		
		tagService.addTag(tag);
		return "redirect:list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Tag tag, Model model) {
		model.addAttribute("tag", tagService.getTag(tag.getId()));
		return "tag/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Tag tag) {
		
		tagService.updateTag(tag);
		return "redirect:list";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteDo(Tag tag) {
		
		tagService.deleteTag(tag);
		return "redirect:list";
	}
	
	@RequestMapping(value="/{name}", method= RequestMethod.GET)
	public String view(@PathVariable("name")Integer id, Model model){
		model.addAttribute(tagService.getTag(id));
		
		return "tag/view";
	}
	

}
