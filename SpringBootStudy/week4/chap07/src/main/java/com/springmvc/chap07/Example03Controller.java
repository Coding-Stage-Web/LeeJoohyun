package com.springmvc.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example03Controller {
	
	@GetMapping("/exam03")
	public String showForm(){
		return "webpage07_03";
	}
	
	@ModelAttribute("title")
	public String setTitle() {
		return "@ModelAttribute ����";
	}
	
	@ModelAttribute
	public void setsubTitle(Model model) {
		model.addAttribute("subtitle", "�޼ҵ� @ModelAttribute �ֳ����̼� �����ϱ�");
	}
}
