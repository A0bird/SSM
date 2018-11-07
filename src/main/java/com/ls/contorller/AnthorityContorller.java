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
	//��ѯ��ɫ
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
	//��ѯѡ�н�ɫӵ�е�Ȩ��
	@RequestMapping("change.do")
	public String find(Role role,Model model) throws Exception {
		//��ѯ��ȡѡ�еĽ�ɫ������
		Role roles=roleService.findById(role.getRoleId());
		model.addAttribute("role", roles);
		//��ѯ�����Թ���Ĳ˵���Ȩ�ޣ�
		List<Menu> list=menuService.list(null);
		model.addAttribute("list", list);
		System.out.println(list);
		//��ѯ�ý�ɫӵ�е�Ȩ��
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
