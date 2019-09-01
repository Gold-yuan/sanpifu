package com.man.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String goPage() {
		System.out.println(1);
		return "index";
	}
}
