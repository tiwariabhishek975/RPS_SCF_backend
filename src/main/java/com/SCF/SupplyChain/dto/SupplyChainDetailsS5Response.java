package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.SupplyChainDetailsS5Entity;

public class SupplyChainDetailsS5Response {
	
	private String message;
    private SupplyChainDetailsS5Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SupplyChainDetailsS5Entity getUser() {
		return user;
	}
	public void setUser(SupplyChainDetailsS5Entity user) {
		this.user = user;
	}
    
    
    

}
