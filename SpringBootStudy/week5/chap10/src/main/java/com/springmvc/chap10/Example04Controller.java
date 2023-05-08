package com.springmvc.chap10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example04Controller {
	@GetMapping("/exam04")
	public void handleReques() {
		throw new Example03Exception();
	}
}
