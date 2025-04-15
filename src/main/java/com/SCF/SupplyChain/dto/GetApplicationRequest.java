package com.SCF.SupplyChain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetApplicationRequest {
    private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    
    

}
