package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping()
public class Example01Controller {
	
	@GetMapping("/exam01/{bookId}")
	public String requestMethod(@PathVariable String bookId, Model model) {
		System.out.println("���� ID : " + bookId);
		model.addAttribute("data", "���� ID : " + bookId);
		return "webpage06";
	}
}
