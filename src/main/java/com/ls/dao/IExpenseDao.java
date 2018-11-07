package com.ls.dao;

import java.util.List;

import com.ls.vo.Audit;
import com.ls.vo.ExpenseAccount;
import com.ls.vo.ExpenseDetails;

public interface IExpenseDao {
	
	
	public int addExpense(ExpenseAccount ea);
	
	
	public int addDetails(ExpenseDetails ed);
	
	public void addAudit(Audit audit);
	
	public void updateEa(ExpenseAccount ea);
	
	public void updateEd(ExpenseDetails ed);
	
	public void update(Audit audit);
	
	public List<ExpenseAccount> list(ExpenseAccount ea);
	
	public List<ExpenseAccount> finds(ExpenseAccount ea);
	
	public ExpenseAccount findone(int expenseId);
	
	public List<ExpenseDetails> findsone(int expenseId);
	
	public List<ExpenseAccount> findaudits(Audit audit);
	
	public List<Audit> findme(int userId);
	
	public List<ExpenseAccount> findMy(int userId);
	
	public List<ExpenseAccount> findMyself(String userName);
}
