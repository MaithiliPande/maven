package com.yash.dams.controller;



import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.yash.dams.model.User;
import com.yash.dams.service.UserService;

/**
 * This controller will perform all the user related controlling.
 * @author maithili.pande
 *
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("loginUser")
public class UserController {
	
	private static final Logger logger =Logger.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showhomePage() {
		logger.info("user service : "+userService);
		return "home";
	}
	
	@RequestMapping(value="/userRegistration.htm", method= RequestMethod.GET)
	public String showUserRegistration() {
		return "userRegistration";
	}
	
	@RequestMapping(value="/processRegistration.htm",method=RequestMethod.POST)
	public String processRegistration(@ModelAttribute("user")User user) {
		userService.registerUser(user);
		return "redirect:./home.htm";
	}
	
	@RequestMapping(value="/userLogin.htm",method=RequestMethod.GET)
	public String showLogin() {
		return "userLogin";
	}
	
	@RequestMapping(value="/processLogin.htm",method=RequestMethod.POST)
	public String processLogin(Model model,@RequestParam String loginName, @RequestParam String password) {
		User user = userService.loginUser(loginName,password);
		if(user != null) {
			model.addAttribute("loginUser", user);
			return "success";
		}else {
			return "home";
		}
		
		
	}
	
	@RequestMapping(value="/logoutUser.htm", method=RequestMethod.POST)
	public String processLogout(HttpSession httpSession,SessionStatus sessionStatus) {
		httpSession.invalidate();
		sessionStatus.setComplete();
		return "home";
	}
	
}
