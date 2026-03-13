package com.SpringMVCHandler;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.SpringMVCService.UserService;
import com.SpringModel.User;
import com.SpringModel.ValidationInSpring;



@Controller
public class HandlerClass {
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	//THis is and old method of HttpServeltRequest
	
//	@RequestMapping(path="/process",method=RequestMethod.POST)
//	public String handleRequest(HttpServletRequest request,Model md) {
//		String username = request.getParameter("uname");
//		String fatherName=request.getParameter("fname");
//		md.addAttribute("uname",username);
//		md.addAttribute("fname",fatherName);
//		
//		return "displayDetails" ;
//	}
	
	/*
	 * @RequestMapping(path="/process" ,method=RequestMethod.POST) public String
	 * display(@RequestParam(name="username",required=false) String username,@RequestParam("father")
	 * String fatherName,Model model) {
	 * 
	 * User us = new User(); us.setFather(fatherName); us.setUsername(username);
	 * model.addAttribute("user",us); return "displayDetails"; }
	 */
	
//	@RequestMapping("/contact")
//	public String contact() {
//		return "contact";
//	}
	@RequestMapping("/staticFile")
	public String std(){
		return "staticFile";
	}
	@RequestMapping("/validation")
	public String validation() {
		return "validation";
	}
	@RequestMapping(path="/validate",method=RequestMethod.POST)
	public String data(@ModelAttribute("vsp") ValidationInSpring vsp,BindingResult br) {
		System.out.println(vsp);
		if(br.hasErrors()) {
			return "validation";
		}
		return "displayDetails";
	}
	@RequestMapping(path="/process" ,method=RequestMethod.POST)
	public String display(@ModelAttribute User user,Model model) {
		this.userService.createUserDao(user);
		return "displayDetails";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/ImageUploader")
	public String img() {
//		String str = null;
//		System.out.println(str.length());
		return "ImageUploader";
	}
	@RequestMapping(path="/imageupload", method=RequestMethod.POST)
	public String upl(@RequestParam("fk") MultipartFile file)  {
		try {
			byte[] arr = file.getBytes();
			String path = System.getProperty("user.home");
			Path pat = Paths.get(path);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return "imageshow";
	}
}

