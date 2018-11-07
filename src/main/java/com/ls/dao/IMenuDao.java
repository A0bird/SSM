package com.ls.dao;

import java.util.List;

import com.ls.vo.Menu;

public interface IMenuDao {

	public List<Menu> list(Menu menu);
	
	public Menu getinfo(Menu menu);
	
	public Menu findById(Integer Id);
	
	public void add(Menu menu);
	
	public void update(Menu menu);
	
	public void delete(Menu menu);
	
	public List<Menu> findAll(Menu menu);
	
	public List<Menu> getMenulist(Menu menu);
}
