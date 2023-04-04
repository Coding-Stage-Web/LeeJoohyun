package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/home")
public class Example02Controller {
	
	@GetMapping("/exam02/{category}/publisher/{publisher}")
	public String requestMethod(@PathVariable String category, @PathVariable String publisher, Model model) {
		
		System.out.println("���� �о� : " + category);
		System.out.println("���ǻ� : " + publisher);
		model.addAttribute("data", "���� �о�: " + category + "<br>" + "���ǻ�: " + publisher);
		
		return "webpage06";
	}
}
