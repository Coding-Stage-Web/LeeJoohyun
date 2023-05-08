package com.springmvc.chap10;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class Example01Controller {
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="요청 실패했습니다.")
	@GetMapping("/exam01")
	public String requestMethod(Model model) {
		System.out.println("chapter10_01 예제입니다");
		model.addAttribute("data", "@ResponseStatus 처리 예제입니다");
		return "webpage10_01";
	}
}
