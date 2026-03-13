package com.SpringMVCHandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one Hadler");
//		return "redirect:/two";
//	}
//	@RequestMapping("/two")
//	public String two() {
//		System.out.println("This is Second Handler");
//		return "redirect:/contact";
//	}
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one Hadler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("This is Second Handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("contact");
		return redirectView;
	}
}
