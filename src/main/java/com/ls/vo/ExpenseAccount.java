package com.ls.vo;

import java.util.Date;

public class ExpenseAccount {
		
	private int expenseId;
	
	private int userId;
	
	private String expenseName;
	
	private String expenseDesc;
	
	private Date  expenseTime;
	//±¨Ïú×´Ì¬
	private String expenseState;
	
	private Double expenseTotal;
	
	private String userName;

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getExpenseDesc() {
		return expenseDesc;
	}

	public void setExpenseDesc(String expenseDesc) {
		this.expenseDesc = expenseDesc;
	}

	public Date getExpenseTime() {
		return expenseTime;
	}

	public void setExpenseTime(Date expenseTime) {
		this.expenseTime = expenseTime;
	}

	public String getExpenseState() {
		return expenseState;
	}

	public void setExpenseState(String expenseState) {
		this.expenseState = expenseState;
	}

	public Double getExpenseTotal() {
		return expenseTotal;
	}

	public void setExpenseTotal(Double expenseTotal) {
		this.expenseTotal = expenseTotal;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "ExpenseAccount [expenseId=" + expenseId + ", userId=" + userId + ", expenseName=" + expenseName
				+ ", expenseDesc=" + expenseDesc + ", expenseTime=" + expenseTime + ", expenseState=" + expenseState
				+ ", expenseTotal=" + expenseTotal + ", userName=" + userName + "]";
	}

	
	
}
