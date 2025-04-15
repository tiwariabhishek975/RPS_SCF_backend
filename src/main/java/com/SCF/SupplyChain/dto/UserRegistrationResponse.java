package com.SCF.SupplyChain.dto;

import lombok.Data;

@Data
public class UserRegistrationResponse {
	
	private String message;
	private String userId;
    //private String fullName;
    //private String emailAddress;
    //private String phoneNumber;
    //private String companyName;
    //private String accountStatus;
    //private String preferredLanguage;
    //private String roleName;
    //private String orgName;
    //private String orgRoleName;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
    
    
	
    
    
    
    
    

}
