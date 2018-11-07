package com.ls.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ls.service.IMenuService;
import com.ls.vo.Menu;

@Controller
@RequestMapping("/menu/")
public class MenuContorller {

	@Autowired
	private IMenuService menuService;
	
	@RequestMapping("list.do")
	public String list() {
		
		
		return "menu/menu_index";
	}
	@RequestMapping("menumain.do")
	public String menumain(Menu menu,Model model) {
		Menu menuinfo=null;
		if(menu!=null&&menu.getMenuId()!=null) {
			if(menu.getMenuId()==0) {
				menuinfo=new Menu();
				menuinfo.setMenuId(0);
				menuinfo.setMenuName("根节点");
				menuinfo.setPrentMenuId(-1);
			}else
			{
				menuinfo=menuService.getinfo(menu);
			}
		}
		model.addAttribute("menu",menuinfo);
		 return "menu/menu_main";
	}
	@RequestMapping("loadadd.do")
	public String loadadd(Menu menu,Model model) {
		
	
		List<Menu>  lists=menuService.list(menu);
		model.addAttribute("list",lists);
		return "menu/menu_add";
	}
	@RequestMapping("add.do")
	public String add(Menu menu,Model model) {
		
		menuService.add(menu);
		return menumain(null,model);
	}
	@RequestMapping("loadupdate.do")
	public String loadupdate(Menu menu,Model model) {
		
		List<Menu>  lists=menuService.findAll(menu);
		System.out.println(lists);
		model.addAttribute("me",lists);
		Menu menus=menuService.findById(menu.getMenuId());
		model.addAttribute("menu",menus);
		return "menu/menu_update";
	}
	@RequestMapping("update.do")
	public String update(Menu menu) {
		
		menuService.update(menu);
		return "menu/menu_main";
	}
	@RequestMapping("delete.do")
	public String delete(Menu menu,Model model) {
		
		
		List<Menu>  list=menuService.getMenulist(menu);
		
		if(list!=null&&list.size()>0) {
			model.addAttribute("menu","对不起，请删除子菜单");
		}else {
				menuService.delete(menu);
				model.addAttribute("menu","删除成功");
		}
		return "menu/menu_info";
	}
	@RequestMapping("menutop.do")
	public String menutop() {
		
		
		return "menu/menu_top";
	}
	@RequestMapping("menuleft.do")
	public String menuleft(Menu menu,Model model) {		
		List<Menu>  list=menuService.list(menu);
		model.addAttribute("list",list);
		return "menu/menu_left";
	}

}
