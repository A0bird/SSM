package com.ls.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.IAnthorityDao;
import com.ls.service.IAnthorityService;
import com.ls.vo.Anthority;

@Service
public class IAnthorityServiceImpl  implements IAnthorityService{

	@Autowired
	private IAnthorityDao dao;
	
	@Override
	public List<Anthority> list(Anthority rminfo) {
		// TODO Auto-generated method stub
		return dao.list(rminfo);
	}

	@Override
	public void add(Integer roleId, Integer[] menuIds) {
		// TODO Auto-generated method stub
		dao.delete(roleId);
		for(Integer menuId:menuIds) {
			Anthority info=new Anthority();
			
			info.setMenuId(menuId);
			info.setRoleId(roleId);
			dao.add(info);
		}
	}

	@Override
	public List<Map> getMenuList(Integer roleId) {
		// TODO Auto-generated method stub
		return dao.getMenuList(roleId);
	}

	
	
}
