package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.IMenuDao;
import com.ls.service.IMenuService;
import com.ls.vo.Menu;

@Service
public class IMenuServiceImpl implements IMenuService{

	
	
	@Autowired
	private IMenuDao dao;
	@Override
	public List<Menu> list(Menu menu) {
		// TODO Auto-generated method stub
		return dao.list(menu);
	}
	@Override
	public Menu getinfo(Menu menu) {
		// TODO Auto-generated method stub
		return dao.getinfo(menu);
	}
	@Override
	public Menu findById(Integer Id) {
		// TODO Auto-generated method stub
		return dao.findById(Id);
	}
	@Override
	public void add(Menu menu) {
		// TODO Auto-generated method stub
		dao.add(menu);
	}
	@Override
	public void update(Menu menu) {
		// TODO Auto-generated method stub
		dao.update(menu);
	}
	@Override
	public void delete(Menu menu) {
		// TODO Auto-generated method stub
		dao.delete(menu);
	}
	@Override
	public List<Menu> findAll(Menu menu) {
		// TODO Auto-generated method stub
		return dao.findAll(menu);
	}
	@Override
	public List<Menu> getMenulist(Menu menu) {
		// TODO Auto-generated method stub
		return dao.getMenulist(menu);
	}


}
