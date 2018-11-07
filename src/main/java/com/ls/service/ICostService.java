package com.ls.service;

import java.util.List;

import com.ls.vo.Cost;

public interface ICostService {

	public List<Cost> list(Cost cost);

	public void add(Cost cost);

	public Cost findById(int costId);

	public void update(Cost cost);

	public void delete(Integer[] costId);

}
