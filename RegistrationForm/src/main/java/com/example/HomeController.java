package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("registerUser")
	public String register(@ModelAttribute RegisterUser user,RedirectAttributes re)
	{
		us.register(user);
		re.addFlashAttribute("message", "Registration successful!");
		return "redirect:/";
	}
}
