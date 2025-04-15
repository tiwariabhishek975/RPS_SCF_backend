package com.SCF.SupplyChain.bankdto;

import lombok.Data;

@Data
public class ScfFinancingRequestNotificationRequest {
	
	
	
	
	
	private String senderName;
    private String message;
    private String invoiceNumber;
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
    
    
    

}
