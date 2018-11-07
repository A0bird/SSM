package com.ls.vo;

import java.util.Date;

public class Salary {

		private String paymentId;
		
		private String userName;
		
		private int userId;
		
		private String paymentTime;
		
		private String paymentMoney;

		public String getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getPaymentTime() {
			return paymentTime;
		}

		public void setPaymentTime(String paymentTime) {
			this.paymentTime = paymentTime;
		}

	

		public String getPaymentMoney() {
			return paymentMoney;
		}

		public void setPaymentMoney(String paymentMoney) {
			this.paymentMoney = paymentMoney;
		}

		@Override
		public String toString() {
			return "Salary [paymentId=" + paymentId + ", userName=" + userName + ", userId=" + userId + ", paymentTime="
					+ paymentTime + ", paymentMoney=" + paymentMoney + "]";
		}

	
		
}
