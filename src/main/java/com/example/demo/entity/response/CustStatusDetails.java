package com.example.demo.entity.response;

import java.math.BigInteger;

public class CustStatusDetails {
	
	private BigInteger accountStatusType;
	private String accountStatusDescription;
	private boolean accountStatusInd;
	public BigInteger getAccountStatusType() {
		return accountStatusType;
	}
	public void setAccountStatusType(BigInteger accountStatusType) {
		this.accountStatusType = accountStatusType;
	}
	public String getAccountStatusDescription() {
		return accountStatusDescription;
	}
	public void setAccountStatusDescription(String accountStatusDescription) {
		this.accountStatusDescription = accountStatusDescription;
	}
	public boolean isAccountStatusInd() {
		return accountStatusInd;
	}
	public void setAccountStatusInd(boolean accountStatusInd) {
		this.accountStatusInd = accountStatusInd;
	}
	
	

}
