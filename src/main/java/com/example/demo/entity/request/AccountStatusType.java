package com.example.demo.entity.request;

import java.math.BigInteger;

public class AccountStatusType 
{
private BigInteger accountStatusType;
private boolean accountStatusInd;
public BigInteger getAccountStatusType() {
	return accountStatusType;
}
public void setAccountStatusType(BigInteger accountStatusType) {
	this.accountStatusType = accountStatusType;
}
public boolean isAccountStatusInd() {
	return accountStatusInd;
}
public void setAccountStatusInd(boolean accountStatusInd) {
	this.accountStatusInd = accountStatusInd;
}


}
