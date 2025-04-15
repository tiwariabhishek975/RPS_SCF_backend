package com.SCF.SupplyChain.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ScfFinancingRequestRequest {

	
	
	private BigDecimal amount;
    private String tenure;
    private Double interestRate;
    private String bankName;
    private String invoiceNumber;
    
    
    
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
    
    
    
}
