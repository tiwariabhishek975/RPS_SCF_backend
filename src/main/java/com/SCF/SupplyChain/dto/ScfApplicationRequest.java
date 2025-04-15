package com.SCF.SupplyChain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScfApplicationRequest {
	
	private String userId;
	private String companyname;
	private String supplierId;
	private String supplierName;
	private String suppliermobNo;
	private String supplierAddress;
	private LocalDate invoiceDate;
	private LocalDate invoicedueDate;
	private BigDecimal invoiceAmount;
	private String paymentTerms;
	private String descriptiongoodsservices;
	private String purchaseorder;
	private String alternativepaymentterms;
	private String discountoffered;
	private String financingamountrequired;
	private String bankname;
	private String accountholdername;
	private String accountnumber;
	private String swiftifsccode;
	private String supportingdocuments;
	private String applicantname;
	private LocalDate todaydate;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSuppliermobNo() {
		return suppliermobNo;
	}
	public void setSuppliermobNo(String suppliermobNo) {
		this.suppliermobNo = suppliermobNo;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public LocalDate getInvoicedueDate() {
		return invoicedueDate;
	}
	public void setInvoicedueDate(LocalDate invoicedueDate) {
		this.invoicedueDate = invoicedueDate;
	}
	public BigDecimal getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public String getDescriptiongoodsservices() {
		return descriptiongoodsservices;
	}
	public void setDescriptiongoodsservices(String descriptiongoodsservices) {
		this.descriptiongoodsservices = descriptiongoodsservices;
	}
	public String getPurchaseorder() {
		return purchaseorder;
	}
	public void setPurchaseorder(String purchaseorder) {
		this.purchaseorder = purchaseorder;
	}
	
	public String getAlternativepaymentterms() {
		return alternativepaymentterms;
	}
	public void setAlternativepaymentterms(String alternativepaymentterms) {
		this.alternativepaymentterms = alternativepaymentterms;
	}
	public String getDiscountoffered() {
		return discountoffered;
	}
	public void setDiscountoffered(String discountoffered) {
		this.discountoffered = discountoffered;
	}
	public String getFinancingamountrequired() {
		return financingamountrequired;
	}
	public void setFinancingamountrequired(String financingamountrequired) {
		this.financingamountrequired = financingamountrequired;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getSwiftifsccode() {
		return swiftifsccode;
	}
	public void setSwiftifsccode(String swiftifsccode) {
		this.swiftifsccode = swiftifsccode;
	}
	public String getSupportingdocuments() {
		return supportingdocuments;
	}
	public void setSupportingdocuments(String supportingdocuments) {
		this.supportingdocuments = supportingdocuments;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public LocalDate getTodaydate() {
		return todaydate;
	}
	public void setTodaydate(LocalDate todaydate) {
		this.todaydate = todaydate;
	}
	
	
	
	
	
	
    
    
    

}
