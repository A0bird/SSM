package com.ls.service;

import java.util.List;

import com.ls.vo.Role;

public interface IRoleService {
		public void add(Role role);

		public List<Role> list(Role role);
		
		public void update(Role role) throws Exception;
		
		public Role findById(Integer id)throws Exception;

		public void delete(Integer[] roleId);
		
		public List<Role> findName(String name);
}
