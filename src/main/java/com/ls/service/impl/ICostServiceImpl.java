package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ICostDao;
import com.ls.service.ICostService;
import com.ls.vo.Cost;
import com.ls.vo.User;


@Service
public class ICostServiceImpl implements ICostService{

	@Autowired
	private ICostDao dao;
	@Override
	public List<Cost> list(Cost cost) {
		// TODO Auto-generated method stub
		return dao.list(cost);
	}
	@Override
	public void add(Cost cost) {
		// TODO Auto-generated method stub
		dao.add(cost);
	}
	@Override
	public Cost findById(int costId) {
		// TODO Auto-generated method stub
		return dao.findById(costId);
	}
	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		dao.update(cost);
	}
	
	public void delete(Integer[] costId) {
		// TODO Auto-generated method stub

		for(Integer id:costId) {
			
			Cost info=new Cost();
			
			info.setCostId(id);
			info.setCostMark("1");
			
			try {
				dao.update(info);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
