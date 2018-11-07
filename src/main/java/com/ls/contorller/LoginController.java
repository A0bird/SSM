package com.ls.contorller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ls.service.IAnthorityService;
import com.ls.service.IUserService;
import com.ls.vo.User;

@Controller

@RequestMapping("/")
public class LoginController {

	@Autowired
	private IUserService userService;
	
	@Autowired 
	private IAnthorityService ianthorityService;
	

	@RequestMapping("login.do")
	public String login(User user,HttpSession seesion ,Model model) {
		
		User userinfo=userService.login(user);
		System.out.println(userinfo);
		
		if(userinfo!=null) {
			seesion.setAttribute("user", userinfo);
			System.out.println(user.getRoleId());
			List<Map> lists=ianthorityService.getMenuList(userinfo.getRoleId());
			
			model.addAttribute("list",lists);
			
			return "main/index";
		}
		
		return "redirect:login.jsp";
		
	}
	
	@RequestMapping("bootm.do")
	public String bootm() {
		
		
		return "main/bootm";
	}
	@RequestMapping("exit.do")
	public String exit(HttpSession session) {

	session.invalidate();
	return "redirect:login.jsp";
		
	}
	
}
