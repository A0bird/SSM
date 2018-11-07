package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.IRoleDao;
import com.ls.service.IRoleService;
import com.ls.vo.Role;

@Service
public class IRoleServiceImpl implements IRoleService {

	@Autowired
	public IRoleDao dao;

	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		dao.add(role);
	}

	@Override
	public List<Role> list(Role role) {
		// TODO Auto-generated method stub
		return dao.list(role);
	}

	@Override
	public void update(Role role) throws Exception {
		// TODO Auto-generated method stub
		dao.update(role);
	}

	@Override
	public Role findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findById(id);

	}

	@Override
	public List<Role> findName(String name) {
		// TODO Auto-generated method stub
		return dao.findName(name);
	}
	
	public void delete(Integer[]  roleId) {
		
		for(Integer id:roleId) {
			
			Role info=new Role();
			
			info.setRoleId(id);
			info.setRoleMark("1");
			
			try {
				dao.update(info);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


		
}
