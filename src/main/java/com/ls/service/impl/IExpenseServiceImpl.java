package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.IExpenseDao;
import com.ls.service.IExpenseService;
import com.ls.vo.Audit;
import com.ls.vo.ExpenseAccount;
import com.ls.vo.ExpenseDetails;

@Service
public class IExpenseServiceImpl  implements IExpenseService{

	@Autowired
	private IExpenseDao dao;
	
	@Override
	public void add(ExpenseAccount ea, Integer[] costId, Double[] expenseDetailsAmount) {
		// TODO Auto-generated method stub
		dao.addExpense(ea);
		
		for(int i=0;i<costId.length;i++) {
			ExpenseDetails ed=new ExpenseDetails();
			
			ed.setExpenseId(ea.getExpenseId());
			
			ed.setCostId(costId[i]);
			ed.setExpenseDetailsAmount(expenseDetailsAmount[i]);
			
			dao.addDetails(ed);
		}
		
	}
	@Override
	public void updates(ExpenseAccount ea, Integer[] costId, Double[] expenseDetailsAmount) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<ExpenseAccount> list(ExpenseAccount ea) {
		// TODO Auto-generated method stub
		return  dao.list(ea);
	}

	@Override
	public List<ExpenseAccount> finds(ExpenseAccount ea) {
		// TODO Auto-generated method stub
		return dao.finds(ea);
	}

	@Override
	public ExpenseAccount findone(int expenseId) {
		// TODO Auto-generated method stub
		return dao.findone(expenseId);
	}

	@Override
	public List<ExpenseDetails> findsone(int expenseId) {
		// TODO Auto-generated method stub
		return dao.findsone(expenseId);
	}

	@Override
	public void addAudit(Audit audit) {
		// TODO Auto-generated method stub
		dao.addAudit(audit);
	}

	@Override
	public List<ExpenseAccount> findaudits(Audit audit) {
		// TODO Auto-generated method stub
		return dao.findaudits(audit);
	}

	@Override
	public void update(Audit audit) {
		// TODO Auto-generated method stub
		dao.update(audit);
	}

	@Override
	public List<Audit> findme(int userId) {
		// TODO Auto-generated method stub
		return dao.findme(userId);
	}

	@Override
	public List<ExpenseAccount> findMy(int userId) {
		// TODO Auto-generated method stub
		return dao.findMy(userId);
	}
	@Override
	public List<ExpenseAccount> findMyself(String userName) {
		// TODO Auto-generated method stub
		return dao.findMyself(userName);
	}

	



	

}
