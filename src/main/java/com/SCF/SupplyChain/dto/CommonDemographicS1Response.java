package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.CommonDemographicS1Entity;

public class CommonDemographicS1Response {
	
	private String message;
    private CommonDemographicS1Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CommonDemographicS1Entity getUser() {
		return user;
	}
	public void setUser(CommonDemographicS1Entity user) {
		this.user = user;
	}
    
    
    

}
