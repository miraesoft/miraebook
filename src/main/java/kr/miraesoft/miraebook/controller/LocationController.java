package kr.miraesoft.miraebook.controller;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.service.LocationService;

import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/location")
public class LocationController {
	
	@Inject
	private LocationService locationService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "redirect:list";
	}


	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(@RequestParam(required=false)String order, Model model){
		model.addAttribute("list", locationService.getLocationList(order));
		return "location/list";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(){

		return "location/write";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writeDo(Location location){
		location.setId(locationService.addLocation(location));
		return "redirect:" + location.getId();
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Location location,Model model){
		location = locationService.getLocation(location.getId());
		model.addAttribute("location", location);
		return "location/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateDo(Location location){
		locationService.updateLocation(location);
		return "redirect:" + location.getId();
	}

	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String view(@PathVariable("name") Integer id,Model model){
		Location location = locationService.getLocation(id);
		model.addAttribute("location", location);
		return "location/view";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Location location){
		locationService.deleteLocation(location);
		return "redirect:list";
	}
}