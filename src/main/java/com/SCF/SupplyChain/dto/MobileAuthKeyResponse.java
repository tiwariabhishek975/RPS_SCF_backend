package com.SCF.SupplyChain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobileAuthKeyResponse {
    private String authKey;
    private String status;
    private String message;
	
    
    
    
	public MobileAuthKeyResponse(String authKey, String status, String message) {
		super();
		this.authKey = authKey;
		this.status = status;
		this.message = message;
	}
	public String getAuthKey() {
		return authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    
}