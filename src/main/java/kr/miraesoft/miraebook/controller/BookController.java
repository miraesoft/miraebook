package kr.miraesoft.miraebook.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.service.BookService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	@Inject
	private BookService bookService;
	
	@RequestMapping(value="write",method=RequestMethod.GET)
	String write(){
		return "book/write";
	}
	
	@RequestMapping(value="write",method=RequestMethod.POST)
	String write(Model model, Book book){
		model.addAttribute("booklist", new ArrayList());
		return null;
	}
}
