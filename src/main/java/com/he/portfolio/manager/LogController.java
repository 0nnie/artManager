package com.he.portfolio.manager;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
	
	
	@GetMapping(value = "/")
	public String getIndex() {
		
		return "index";
	}
}
