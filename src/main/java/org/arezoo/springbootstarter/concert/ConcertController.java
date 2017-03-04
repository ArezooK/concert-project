package org.arezoo.springbootstarter.concert;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/concerts")
public class ConcertController {
	
	@Autowired
	private ConcertService concertService;
	
	@GetMapping
	public  ModelAndView getAllConcerts(){
		Iterable<Concert> concerts = concertService.getAllConcerts();
		return new ModelAndView("concertsList", "concerts", concerts);
	}
	
	

}
