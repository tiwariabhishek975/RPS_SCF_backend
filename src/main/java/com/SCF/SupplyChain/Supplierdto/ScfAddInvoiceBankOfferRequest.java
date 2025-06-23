package com.SCF.SupplyChain.Supplierdto;

import lombok.Data;

@Data
public class ScfAddInvoiceBankOfferRequest {
    private Long offerId;
    private String invoiceNumber;
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
    
    
    

}
