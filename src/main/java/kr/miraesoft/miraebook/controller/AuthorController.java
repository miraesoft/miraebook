package kr.miraesoft.miraebook.controller;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.service.AuthorService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/author")
public class AuthorController {
	@Inject
	private AuthorService authorService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "author/hello";
	}

	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){
		
		model.addAttribute("list", authorService.getAuthorList());
		return "author/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){
		
		return "author/write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Author author){
		author = authorService.addAuthor(author);
		return "redirect:" + author.getNo();
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Author author,Model model){
		author = authorService.getAuthor(author.getNo());
		model.addAttribute("author", author);
		return "author/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Author author){
		author = authorService.updateAuthor(author);
		return "redirect:" + author.getNo();
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String view(@PathVariable("name") Integer no,Model model){
		Author author = authorService.getAuthor(no);
		model.addAttribute("author", author);
		return "author/view";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("no") Integer no){
		authorService.deleteAuthor(no);
		return "redirect:list";
	}
}
