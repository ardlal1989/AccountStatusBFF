package com.example.demo.entity.request;

import java.util.List;

public class CustomerDetail 
{
private String accountNumber;
private String chordiantId;
private List<AccountStatusType> accountStatusType;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getChordiantId() {
	return chordiantId;
}
public void setChordiantId(String chordiantId) {
	this.chordiantId = chordiantId;
}
public List<AccountStatusType> getAccountStatusType() {
	return accountStatusType;
}
public void setAccountStatusType(List<AccountStatusType> accountStatusType) {
	this.accountStatusType = accountStatusType;
}


}
