package com.springmvc.chap10;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Controller
public class Example03Controller {
	
	@GetMapping("/exam03")
	public void handleReques() {
		throw new Example03Exception();
	}
	
	@ExceptionHandler(Example03Exception.class)
	public ModelAndView handleException(Example03Exception ex) {
		ModelAndView model = new ModelAndView();
		model.addObject("errorMessage", ex.getErrMsg());
		model.addObject("exception", ex);
		model.setViewName("webpage10_03");
		return model;
	}
}
