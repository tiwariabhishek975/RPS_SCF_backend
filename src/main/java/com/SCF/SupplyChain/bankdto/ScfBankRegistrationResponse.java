package com.SCF.SupplyChain.bankdto;

import lombok.Data;

@Data
public class ScfBankRegistrationResponse {
	
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
