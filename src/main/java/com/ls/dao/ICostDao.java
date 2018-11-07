package com.ls.dao;

import java.util.List;

import com.ls.vo.Cost;

public interface ICostDao {
	public List<Cost> list(Cost cost);
	
	public void add(Cost cost);
	
	public Cost findById(int costId);
	
	public void update(Cost cost);
	
	public void delete(Integer[] costId);
}
