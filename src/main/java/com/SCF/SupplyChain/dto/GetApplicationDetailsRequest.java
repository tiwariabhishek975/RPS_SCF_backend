package com.SCF.SupplyChain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetApplicationDetailsRequest {
	
	
	@NotBlank(message = "Invoice number is required")
    private String invoiceNumber;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	
	

}
