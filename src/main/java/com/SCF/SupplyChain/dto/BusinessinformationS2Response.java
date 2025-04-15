package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.BusinessinformationS2Entity;

public class BusinessinformationS2Response {
	
	
	private String message;
    private BusinessinformationS2Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BusinessinformationS2Entity getUser() {
		return user;
	}
	public void setUser(BusinessinformationS2Entity user) {
		this.user = user;
	}
    
    
    

}
