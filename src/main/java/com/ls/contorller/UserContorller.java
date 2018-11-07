package com.ls.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ls.service.IRoleService;
import com.ls.service.IUserService;
import com.ls.vo.Role;
import com.ls.vo.User;

@Controller
@RequestMapping("/user/")
public class UserContorller {
		
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;
	
	
	@RequestMapping("add.do")
	public String uiadd(User user,Model model) {
	
		if(user==null) {
			user=new User();
		}
		user.setUserMark("0");
		
		userService.add(user);
		//System.out.println(user);
		return list(user,model);
	}

	@RequestMapping("loadadd.do")
	public String loadadd(Role roleinfo,Model model) {

		if(roleinfo==null) {
			roleinfo=new Role();
		}
		roleinfo.setRoleMark("0");
		List<Role>  list=roleService.list(roleinfo);
		//System.out.println(list.size());
		model.addAttribute("list",list);
		return "user/user_add";
		
	}
	@RequestMapping("list.do")
	public String list(User user,Model model) {
			if(user==null) {
				user=new User();
			}
		user.setUserMark("0");
		List<User> users=userService.list(user);
		//System.out.println(users);
		model.addAttribute("users",users);
		return "user/user_list";
	}
	@RequestMapping("listone.do")
	public String listone(User user,Model model) {
		if(user==null) {
			user=new User();
		}
		System.out.println(user);
		user.setUserMark("0");
	List<User> users=userService.findByName(user);
	//System.out.println(users);
	model.addAttribute("users",users);
	return "user/user_list";
	}
	@RequestMapping("showuser.do")
	public String show(User user,Model model) {
		
		System.out.println(user.getUserId());
		User userinfo=userService.findById(user.getUserId());
		model.addAttribute("user",userinfo);
		return "user/user_show";
	}
	@RequestMapping("loadupdate.do")
	public String loaupdate(User user,Model model) throws Exception {
		if(user==null) {
			user=new User();
		}	
		System.out.println(user.getUserId());
		User users=userService.findById(user.getUserId());
		model.addAttribute("users",users );
		System.out.println(users);
		return "user/user_update";
	}
	@RequestMapping("update.do")
	public String update(User user,Model model) throws Exception {
		System.out.println(user);
		userService.update(user);
		
		return list(user, model);
	}
	@RequestMapping("delete.do")
	public String delete(Integer[] userId,Model model) throws Exception {
		
		
		userService.delete(userId);
		
		
		return list(null,model);
	}
	@RequestMapping("check.do")
	public @ResponseBody int  check(User user) {
		
		User info=userService.getUser(user);
		System.out.println(info);
		if(info!=null) {
			
			return 0;
		}else {
			
			return 1;
		}
	}
}
