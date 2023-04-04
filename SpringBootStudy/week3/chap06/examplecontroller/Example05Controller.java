package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/home")

public class Example05Controller {
	
	@GetMapping("/exam05/{bookId}")
	public String requestMethod(
			@MatrixVariable(required=false, defaultValue="���") String q,
			Model model) {
		System.out.println("���ǻ� : " + q);
		model.addAttribute("data", "���ǻ� : " + q);
		return "webpage06";
	}
}
