package com.ls.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ls.service.IRoleService;
import com.ls.vo.Role;


@Controller
@RequestMapping("/role/")
public class RoleController {

	@Autowired
	private IRoleService roleService;
	
	@RequestMapping("add.do")
	public String add(Role role,Model model) {
		
		if(role==null) {
			role=new Role();
		}
		role.setRoleMark("0");
		
		roleService.add(role);
		
		return list(role, model);
	}
	
	@RequestMapping("loadadd.do")
	public String loadadd() {
		
		return "role/role_add";
		
	}
	@RequestMapping("loadupdate.do")
	public String loaupdate(Role role,Model model) throws Exception {
		if(role==null) {
			role=new Role();
		}		
		Role roles=roleService.findById(role.getRoleId());
		model.addAttribute("roles",roles );
		
		return "role/role_update";
	}
	@RequestMapping("update.do")
	public String update(Role role,Model model) throws Exception {
		if(role==null) {
			role=new Role();
		}
		System.out.println(role);
		roleService.update(role);
		
		return list(role, model);
	}
	@RequestMapping("list.do")
	public String list(Role roleinfo,Model model) {
		if(roleinfo==null) {
			roleinfo=new Role();
		}
		roleinfo.setRoleMark("0");
		
		List<Role> roles=roleService.list(roleinfo);
		
		model.addAttribute("roles",roles);
		
		return "role/role_list";
	}
	
	@RequestMapping("delete.do")
	public String delete(Integer[] roleId,Model model) {
		
		roleService.delete(roleId);
		
		
		return list(null,model);
	}
	@RequestMapping("findOne.do")
	public String listOne(Role roleinfo,Model model) throws Exception {
		if(roleinfo==null) {
			roleinfo=new Role();
		}		
		List<Role> roles=roleService.findName(roleinfo.getRoleName());
		model.addAttribute("roles",roles );
		
		return "role/role_list";
	}
	
}
