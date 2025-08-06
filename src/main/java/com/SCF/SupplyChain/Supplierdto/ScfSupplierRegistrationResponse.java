package com.SCF.SupplyChain.Supplierdto;

import lombok.Data;

@Data
public class ScfSupplierRegistrationResponse {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
