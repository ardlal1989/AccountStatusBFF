package com.example.demo.entity.request;

public class GetCustomerAccountStatus 
{
	private HeaderInformation headerInformation;
	private CustomerDetail customerDetail;
	public HeaderInformation getHeaderInformation() {
		return headerInformation;
	}
	public void setHeaderInformation(HeaderInformation headerInformation) {
		this.headerInformation = headerInformation;
	}
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	
	

}
