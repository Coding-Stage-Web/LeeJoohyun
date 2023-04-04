package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Example06Controller {
	
	@GetMapping("/exam06")
	public String requestMethod(ModelMap model) {
		model.addAttribute("data", "Model �����Դϴ�.");
		model.addAttribute("data2", "�� ��û URL�� /home/exam06 �Դϴ�.");
		return "webpage05";
	}
}