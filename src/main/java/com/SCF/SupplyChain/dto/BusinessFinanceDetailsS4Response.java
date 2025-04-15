package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.BusinessFinanceDetailsS4Entity;

public class BusinessFinanceDetailsS4Response {
	
	
	private String message;
    private BusinessFinanceDetailsS4Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BusinessFinanceDetailsS4Entity getUser() {
		return user;
	}
	public void setUser(BusinessFinanceDetailsS4Entity user) {
		this.user = user;
	}
    
    
    

}
