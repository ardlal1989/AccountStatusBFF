package com.example.demo.entity.response;

import java.math.BigInteger;

public class AccountStatusRecommendations 
{
	private BigInteger accountStatusType;
	private String accountStatusRecommendation;
	public BigInteger getAccountStatusType() {
		return accountStatusType;
	}
	public void setAccountStatusType(BigInteger accountStatusType) {
		this.accountStatusType = accountStatusType;
	}
	public String getAccountStatusRecommendation() {
		return accountStatusRecommendation;
	}
	public void setAccountStatusRecommendation(String accountStatusRecommendation) {
		this.accountStatusRecommendation = accountStatusRecommendation;
	}
	
	
}
