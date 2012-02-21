package kr.miraesoft.miraebook.controller;

import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.service.BookService;
import kr.miraesoft.miraebook.service.LocationService;
import kr.miraesoft.miraebook.service.PublisherService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	@Inject private BookService bookService;
	@Inject	private LocationService locationService;
	@Inject private PublisherService publisherService;
	
	@RequestMapping(value="write",method=RequestMethod.GET)
	String write(Model model){
		List<Location> locationList = locationService.getLocationList("name"); 
		List<Publisher> publisherList = publisherService.list();
		model.addAttribute("locationList", locationList);
		model.addAttribute("publisherList", publisherList);
		return "book/write";
	}
	
	@RequestMapping(value="write",method=RequestMethod.POST)
	String write(Model model, Book book){
		int bookno = bookService.addBook(book);
		model.addAttribute("book", bookService.getBook(bookno));
		return "book/write";
	}
}
