package SpringApp.springapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

}
