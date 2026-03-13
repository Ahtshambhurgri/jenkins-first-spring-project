package com.SpringMVCHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionHandlerInSpringMVC {
	@ExceptionHandler(value=Exception.class)
	public String erros(Model model) {
		
		model.addAttribute("msg","SomethingWent Wrong please Try again");
		return "errorhandling";
	}
}
