package xyz.jangle.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.jangle.service.UserService;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello(){
		
		System.out.println("hello,哇塞，我被执行到了");
		
		return userService.getUser();
	}

}
