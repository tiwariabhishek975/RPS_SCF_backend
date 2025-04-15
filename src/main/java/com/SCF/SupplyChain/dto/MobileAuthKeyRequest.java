package com.SCF.SupplyChain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobileAuthKeyRequest {
    private String sessionid;
    private String from_type;
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getFrom_type() {
		return from_type;
	}
	public void setFrom_type(String from_type) {
		this.from_type = from_type;
	}
    
    
    
}
