package com.ls.dao;

import java.util.List;

import com.ls.vo.Salary;

public interface ISalaryDao {

	public  void add(Salary salary);

	public List<Salary> list(Salary salary);

	public List<Salary> find(Salary salary);

	
}
