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
public class Example04Controller {
	
	@GetMapping("/exam04/{bookId}/category/{category}")
	public String requestMethod(
			@MatrixVariable(value="publisher", pathVar="bookId") String q1,
			@MatrixVariable(value="publisher", pathVar="category") String q2,
			Model model) {
		System.out.println("���� ID : " + q1);
		System.out.println("���� �о� : " + q2);
		model.addAttribute("data", "���� ID : " + q1 + "<br>" + "���� �о�: " + q2);
		return "webpage06";
	}
}


