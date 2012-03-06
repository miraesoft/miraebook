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
public class MainController {

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }
    
    @RequestMapping("/main")
    public String welcome() {
    	return "main/main";
    }

}
