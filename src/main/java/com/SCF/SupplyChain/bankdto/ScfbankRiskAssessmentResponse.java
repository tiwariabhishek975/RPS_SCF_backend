package com.SCF.SupplyChain.bankdto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScfbankRiskAssessmentResponse {
	
	
	private String sectionTitle;      	
    private String details;           
    private String invoiceNumber;
    private LocalDate updatedDate;
    
    
	public ScfbankRiskAssessmentResponse(String sectionTitle, String details, String invoiceNumber,
			LocalDate updatedDate) {
		super();
		this.sectionTitle = sectionTitle;
		this.details = details;
		this.invoiceNumber = invoiceNumber;
		this.updatedDate = updatedDate;
	}
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
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
    
    
    

}
