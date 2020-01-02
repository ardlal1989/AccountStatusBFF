package com.example.demo.entity.response;

import java.util.List;

public class CustomerAccountStatus 
{
private String accountNumber;
private List<CustStatusDetails> custStatusDetails;
private List<AccountStatusRecommendations> accountStatusRecommendations;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public List<CustStatusDetails> getCustStatusDetails() {
	return custStatusDetails;
}
public void setCustStatusDetails(List<CustStatusDetails> custStatusDetails) {
	this.custStatusDetails = custStatusDetails;
}
public List<AccountStatusRecommendations> getAccountStatusRecommendations() {
	return accountStatusRecommendations;
}
public void setAccountStatusRecommendations(List<AccountStatusRecommendations> accountStatusRecommendations) {
	this.accountStatusRecommendations = accountStatusRecommendations;
}

}
