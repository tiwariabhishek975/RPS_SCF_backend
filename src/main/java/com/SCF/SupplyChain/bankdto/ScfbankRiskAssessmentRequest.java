package com.SCF.SupplyChain.bankdto;

import lombok.Data;

@Data
public class ScfbankRiskAssessmentRequest {
	
	
	
	private String sectionTitle;      // e.g. Credit Score	
    private String details;           // e.g. Your credit score is 750	
    private String invoiceNumber;
	public String getSectionTitle() {
		return sectionTitle;
	}
	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
    
    
    

}
