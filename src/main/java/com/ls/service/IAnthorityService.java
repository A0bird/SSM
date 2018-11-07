package com.ls.service;

import java.util.List;
import java.util.Map;

import com.ls.vo.Anthority;

public interface IAnthorityService {

	public  List<Anthority> list(Anthority rminfo);

	public  void add(Integer roleId, Integer[] menuIds);
	
	public List<Map> getMenuList(Integer roleId);
}
