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
public class Example03Controller {
	
	@GetMapping("/exam03/{bookId}")
	public String requestMethod(@PathVariable String bookId,
			@MatrixVariable String category, Model model) {
		System.out.println("���� ID : " + bookId);
		System.out.println("���� �о� : " + category);
		model.addAttribute("data", "���� ID : " + bookId + "<br>" + "���� �о�: " + category);
		return "webpage06";
	}
}
