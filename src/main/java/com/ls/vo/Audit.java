package com.ls.vo;

import java.util.Date;

public class Audit {
		private  int auditId;
		
		private int expenseId;
		
		private int userId;
		
		private String auditState;
		
		private Date auditTime;
		
		private String auditDesc;
		
		private String userName;

		private String auditName;
		

		public int getAuditId() {
			return auditId;
		}


		public void setAuditId(int auditId) {
			this.auditId = auditId;
		}


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


		public String getAuditState() {
			return auditState;
		}


		public void setAuditState(String auditState) {
			this.auditState = auditState;
		}


		public Date getAuditTime() {
			return auditTime;
		}


		public void setAuditTime(Date auditTime) {
			this.auditTime = auditTime;
		}


		public String getAuditDesc() {
			return auditDesc;
		}


		public void setAuditDesc(String auditDesc) {
			this.auditDesc = auditDesc;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getAuditName() {
			return auditName;
		}


		public void setAuditName(String auditName) {
			this.auditName = auditName;
		}


		@Override
		public String toString() {
			return "Audit [auditId=" + auditId + ", expenseId=" + expenseId + ", userId=" + userId + ", auditState="
					+ auditState + ", auditTime=" + auditTime + ", auditDesc=" + auditDesc + ", userName=" + userName
					+ ", auditName=" + auditName + "]";
		}

		
		
		
		
}
