package kr.miraesoft.miraebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/author")
public class AuthorController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "author/hello";
	}

	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(){
		
		return "author/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){
		
		return "author/write";
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(){
		
		return "author/update";
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String view(){
		
		return "author/view";
	}

}
