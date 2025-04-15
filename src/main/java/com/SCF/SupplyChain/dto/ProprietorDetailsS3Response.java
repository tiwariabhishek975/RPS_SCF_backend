package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.ProprietorDetailsS3Entity;

public class ProprietorDetailsS3Response {
	
	private String message;
    private ProprietorDetailsS3Entity user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ProprietorDetailsS3Entity getUser() {
		return user;
	}
	public void setUser(ProprietorDetailsS3Entity user) {
		this.user = user;
	}
    
    
    


}
