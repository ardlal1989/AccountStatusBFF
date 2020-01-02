package com.example.demo.entity.response;

public class GetCustomerAccountStatusResponse 
{
private int returnCode;
private String returnMessage;
private CustomerAccountStatus customerAccountStatus;
public int getReturnCode() {
	return returnCode;
}
public void setReturnCode(int returnCode) {
	this.returnCode = returnCode;
}
public String getReturnMessage() {
	return returnMessage;
}
public void setReturnMessage(String returnMessage) {
	this.returnMessage = returnMessage;
}
public CustomerAccountStatus getCustomerAccountStatus() {
	return customerAccountStatus;
}
public void setCustomerAccountStatus(CustomerAccountStatus customerAccountStatus) {
	this.customerAccountStatus = customerAccountStatus;
}


}
