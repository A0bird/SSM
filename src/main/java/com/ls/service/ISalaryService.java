package com.ls.service;

import java.util.List;

import com.ls.vo.Salary;

public interface ISalaryService {

	public  void add(Salary salary);
	
	public List<Salary> list(Salary salary);
	
	public List<Salary> find(Salary salary);
}
