package com.ls.dao;

import java.util.List;

import com.ls.vo.Role;

public interface IRoleDao {
		public void add(Role role);
		
		public void update(Role role)throws Exception;
		
		public void delete(Integer id)throws Exception;
		
		public Role findById(Integer id);
		
		public List<Role> findName(String name);
		
		public List<Role> list(Role role);
}
