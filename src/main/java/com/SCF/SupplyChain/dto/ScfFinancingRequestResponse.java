package com.SCF.SupplyChain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor

public class ScfFinancingRequestResponse {

	
	
	private BigDecimal amount;
    private String tenure;
    private Double interestRate;
    private String bankName;
    private LocalDate createdDate;
    private String invoiceNumber;
    
    
    
	
	public ScfFinancingRequestResponse(BigDecimal amount, String tenure, Double interestRate, String bankName,
			LocalDate createdDate, String invoiceNumber) {
		super();
		this.amount = amount;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.bankName = bankName;
		this.createdDate = createdDate;
		this.invoiceNumber = invoiceNumber;
	}
	
	
	
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
    
    
    
}
