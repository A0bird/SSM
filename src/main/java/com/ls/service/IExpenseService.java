package com.ls.service;

import java.util.List;

import com.ls.vo.Audit;
import com.ls.vo.ExpenseAccount;
import com.ls.vo.ExpenseDetails;

public interface IExpenseService {

	public void add(ExpenseAccount ea, Integer[] costId, Double[] expenseDetailsAmount);

	public List<ExpenseAccount> list(ExpenseAccount ea);

	public List<ExpenseAccount> finds(ExpenseAccount ea);

	public ExpenseAccount findone(int expenseId);

	public List<ExpenseDetails> findsone(int expenseId);

	public void addAudit(Audit audit);

	public List<ExpenseAccount> findaudits(Audit audit);

	public void update(Audit audit);

	public List<Audit> findme(int userId);

	public List<ExpenseAccount> findMy(int userId);

	public void updates(ExpenseAccount ea, Integer[] costId, Double[] expenseDetailsAmount);

	public List<ExpenseAccount> findMyself(String userName);

}
