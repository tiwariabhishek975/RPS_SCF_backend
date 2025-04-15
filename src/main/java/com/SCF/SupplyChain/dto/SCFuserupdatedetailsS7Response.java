package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;

public class SCFuserupdatedetailsS7Response {
	
	
	private String message;
    private SCFuserupdatedetailsS7Entity updatedDetails;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SCFuserupdatedetailsS7Entity getUpdatedDetails() {
		return updatedDetails;
	}
	public void setUpdatedDetails(SCFuserupdatedetailsS7Entity updatedDetails) {
		this.updatedDetails = updatedDetails;
	}

    
    
    
}
