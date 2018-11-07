package com.ls.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ls.service.IAnthorityService;
import com.ls.service.IMenuService;
import com.ls.service.IRoleService;
import com.ls.service.IUserService;
import com.ls.vo.Anthority;
import com.ls.vo.Menu;
import com.ls.vo.Role;

@Controller
@RequestMapping("/anthority/")
public class AnthorityContorller {

	@Autowired
	private IRoleService roleService;
	
	
	@Autowired
	private IMenuService menuService;
	
	@Autowired
	private IAnthorityService anthorityService;
	//查询角色
	@RequestMapping("list.do")
	public String list(Role role ,Model model) {
		if(role==null) {
			role=new Role();
		}
		role.setRoleMark("0");
		List<Role> lists=roleService.list(role);
		model.addAttribute("list",lists);
		return "anthority/anthority_list";
	}
	//查询选中角色拥有的权限
	@RequestMapping("change.do")
	public String find(Role role,Model model) throws Exception {
		//查询获取选中的角色的名称
		Role roles=roleService.findById(role.getRoleId());
		model.addAttribute("role", roles);
		//查询出可以管理的菜单（权限）
		List<Menu> list=menuService.list(null);
		model.addAttribute("list", list);
		System.out.println(list);
		//查询该角色拥有的权限
		Anthority rminfo=new Anthority();
		
		rminfo.setRoleId(role.getRoleId());
		
		List<Anthority> rmlist=anthorityService.list(rminfo);
		model.addAttribute("rmlist",rmlist);
		return "anthority/anthority_change";
	}
	
	@RequestMapping("update.do")
		public String change(Integer roleId,Integer[] menuIds, Model model) {
		
		anthorityService.add(roleId, menuIds);
		
		return list(null, model);
	}
}
