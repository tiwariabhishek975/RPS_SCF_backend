package com.SCF.SupplyChain.Supplierdto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class EarlyPaymentResponse {
	private String message;
    private String invoiceNumber;
    private Long requestId;
    private Double financingAmount;
    
    
    
	
	public EarlyPaymentResponse(String message, String invoiceNumber, Long requestId, Double financingAmount) {
		super();
		this.message = message;
		this.invoiceNumber = invoiceNumber;
		this.requestId = requestId;
		this.financingAmount = financingAmount;
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
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public Double getFinancingAmount() {
		return financingAmount;
	}
	public void setFinancingAmount(Double financingAmount) {
		this.financingAmount = financingAmount;
	}
    
    
    
}

