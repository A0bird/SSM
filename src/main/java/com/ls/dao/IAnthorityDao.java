package com.ls.dao;

import java.util.List;
import java.util.Map;

import com.ls.vo.Anthority;

public interface IAnthorityDao {
	
	public  List<Anthority> list(Anthority rminfo);

	public  void add(Integer roleId, Integer[] menuIds);

	public void delete(Integer roleId);

	public void add(Anthority info);
	
	public List<Map> getMenuList(Integer roleId);
}
