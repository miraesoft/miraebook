package kr.miraesoft.miraebook.controller;

import java.util.List;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Book;
import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.BookSearchSpec;
import kr.miraesoft.miraebook.service.BookService;
import kr.miraesoft.miraebook.service.LocationService;
import kr.miraesoft.miraebook.service.PublisherService;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
		return "book/view";
	}
	
	@RequestMapping(value="read/{bookno}",method=RequestMethod.GET)
	String read(Model model ,@PathVariable("bookno") Integer bookno){
		Book book = bookService.getBook(bookno);
		model.addAttribute("book",book);
		return "book/view";
	}
	
	@RequestMapping(value="remove/{bookno}",method=RequestMethod.GET)
	String remove(@PathVariable("bookno") Integer bookno, Model model){
		bookService.dropBook(bookno);
		return "book/view";
	}
	
	@RequestMapping(value="update/{bookno}",method=RequestMethod.GET)
	String update(@PathVariable("bookno") Integer bookno, Model model){
		Book book = bookService.getBook(bookno);
		List<Location> locationList = locationService.getLocationList("name"); 
		List<Publisher> publisherList = publisherService.list();
		model.addAttribute("book",book);
		model.addAttribute("locationList", locationList);
		model.addAttribute("publisherList", publisherList);
		return "book/update";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	ModelAndView update(Book book, Model model){
		 bookService.updateBook(book);
		return new ModelAndView(new RedirectView("view/"+book.getBookno()));
	}
	

	@RequestMapping(value="list",method=RequestMethod.GET)
	String list(Model model , BookSearchSpec bookSearchSpec){
		
/*		Book book = new Book();
		book.setName("하이버네이트");
		book.setLocation(locationService.getLocation(1));
		bookService.addBook(book);
		
		book = new Book();
		book.setName("디자인패턴");
		book.setLocation(locationService.getLocation(1));
		bookService.addBook(book);
		
		book = new Book();
		book.setName("디비");
		book.setLocation(locationService.getLocation(1));
		bookService.addBook(book);*/
		
		
		model.addAttribute("paging",bookService.listBook(bookSearchSpec));
		return "book/list";
	}

	@RequestMapping(value="view/{bookno}",method=RequestMethod.GET)
	String view(@PathVariable("bookno") Integer bookno,Model model){
		Book book  = bookService.getBook(bookno);
		model.addAttribute("book", book);
		return "book/view";
	}
	
}
