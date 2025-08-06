package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
//@AllArgsConstructor
public class GetApplicationDetailsResponse {
		
	private String message;
    private SCFuserupdatedetailsS7Entity userDetails;
	
	public String getMessage() {
		return message;
	}
	public GetApplicationDetailsResponse(String message, SCFuserupdatedetailsS7Entity userDetails) {
		super();
		this.message = message;
		this.userDetails = userDetails;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SCFuserupdatedetailsS7Entity getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(SCFuserupdatedetailsS7Entity userDetails) {
		this.userDetails = userDetails;
	}

}
