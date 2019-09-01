package com.man.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

	@GetMapping("/")
	public String goHome() {
		System.out.println(1);
		return "index.html";
	}

	@GetMapping("/{html}")
	public String goPage(@PathVariable String html) {
		System.out.println("html");
		return html;
	}
}
