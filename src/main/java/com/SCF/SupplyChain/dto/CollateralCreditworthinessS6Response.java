package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.CollateralCreditworthinessS6Entity;

public class CollateralCreditworthinessS6Response {

	
	private String message;
    private CollateralCreditworthinessS6Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CollateralCreditworthinessS6Entity getUser() {
		return user;
	}
	public void setUser(CollateralCreditworthinessS6Entity user) {
		this.user = user;
	}
    
    
}
