package com.john.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String count() {
		
		return "counterPage.jsp";
	}
	
}
