package com.SCF.SupplyChain.Supplierdto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EarlyPaymentRequest {

	private String supplierInformation;
    private String supplierName;
    private String supplierId;
    private String buyerName;
    private String invoiceNumber;
    private LocalDate invoiceDate;
    private LocalDate invoiceDueDate;
    private Double invoiceAmount;
    private String goodsDescription;
    private String purchaseOrderNumber;
    private String paymentTerms;
    private String discountOffered;
    private Double financingAmount;
    private String bankName;
    private String accountHolderName;
    private String accountNumber;
    private String swiftOrIfscCode;
    private String authorizedName;
    private LocalDate declarationDate;
	public String getSupplierInformation() {
		return supplierInformation;
	}
	public void setSupplierInformation(String supplierInformation) {
		this.supplierInformation = supplierInformation;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public LocalDate getInvoiceDueDate() {
		return invoiceDueDate;
	}
	public void setInvoiceDueDate(LocalDate invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}
	public Double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public String getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public String getDiscountOffered() {
		return discountOffered;
	}
	public void setDiscountOffered(String discountOffered) {
		this.discountOffered = discountOffered;
	}
	public Double getFinancingAmount() {
		return financingAmount;
	}
	public void setFinancingAmount(Double financingAmount) {
		this.financingAmount = financingAmount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSwiftOrIfscCode() {
		return swiftOrIfscCode;
	}
	public void setSwiftOrIfscCode(String swiftOrIfscCode) {
		this.swiftOrIfscCode = swiftOrIfscCode;
	}
	public String getAuthorizedName() {
		return authorizedName;
	}
	public void setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
	}
	public LocalDate getDeclarationDate() {
		return declarationDate;
	}
	public void setDeclarationDate(LocalDate declarationDate) {
		this.declarationDate = declarationDate;
	}
    
    
    
    
	    
	    
	    
    
}

