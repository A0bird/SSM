package com.ls.vo;

public class ExpenseDetails {
			private int expenseDetailsId;
			
			private int expenseId;
			
			private int costId;
			//报销的具体金额
			private Double expenseDetailsAmount;
			
			private String costName;
			
			private String costDesc;

			public int getExpenseDetailsId() {
				return expenseDetailsId;
			}

			public void setExpenseDetailsId(int expenseDetailsId) {
				this.expenseDetailsId = expenseDetailsId;
			}

			public int getExpenseId() {
				return expenseId;
			}

			public void setExpenseId(int expenseId) {
				this.expenseId = expenseId;
			}

			public int getCostId() {
				return costId;
			}

			public void setCostId(int costId) {
				this.costId = costId;
			}

			public Double getExpenseDetailsAmount() {
				return expenseDetailsAmount;
			}

			public void setExpenseDetailsAmount(Double expenseDetailsAmount) {
				this.expenseDetailsAmount = expenseDetailsAmount;
			}

			public String getCostName() {
				return costName;
			}

			public void setCostName(String costName) {
				this.costName = costName;
			}

			public String getCostDesc() {
				return costDesc;
			}

			public void setCostDesc(String costDesc) {
				this.costDesc = costDesc;
			}


			
			
}
