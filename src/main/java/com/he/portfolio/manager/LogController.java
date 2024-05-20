package com.he.portfolio.manager;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogController {
	
	
	@GetMapping(value = "a")
	public String getIndex() {
		
		return "index";
	}
}
