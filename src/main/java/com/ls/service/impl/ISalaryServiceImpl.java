package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ISalaryDao;
import com.ls.service.ISalaryService;
import com.ls.vo.Salary;


@Service
public class ISalaryServiceImpl implements ISalaryService{

	@Autowired
	private ISalaryDao dao;
	
	public void add(Salary salary) {
		// TODO Auto-generated method stub
		dao.add(salary);
	}

	@Override
	public List<Salary> list(Salary salary) {
		// TODO Auto-generated method stub
		return dao.list(salary);
	}

	@Override
	public List<Salary> find(Salary salary) {
		// TODO Auto-generated method stub
		return dao.find(salary);
	}

}
