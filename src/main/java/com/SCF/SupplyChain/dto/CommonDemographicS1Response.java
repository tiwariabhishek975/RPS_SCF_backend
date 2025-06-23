package com.SCF.SupplyChain.dto;

public class CommonDemographicS1Response {
	
	private String message;
	private String invoiceNumber;
    private String firstName;
    private String lastName;
    private String phoneNo;	
    //private CommonDemographicS1Entity user;
    
    
	public String getMessage() {
		return message;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
    
    
    

}
