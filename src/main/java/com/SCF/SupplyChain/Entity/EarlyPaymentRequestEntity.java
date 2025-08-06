package com.SCF.SupplyChain.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "early_payment_request")
public class EarlyPaymentRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "supplier_information", nullable = false)
    private String supplierInformation;

    @Column(name = "supplier_name", nullable = false)
    private String supplierName;

    @Column(name = "supplier_id", nullable = false)
    private String supplierId;

    @Column(name = "buyer_name", nullable = false)
    private String buyerName;

    @Column(name = "invoice_number", nullable = false, unique = true)
    private String invoiceNumber;

    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;

    @Column(name = "invoice_due_date", nullable = false)
    private LocalDate invoiceDueDate;

    @Column(name = "invoice_amount", nullable = false)
    private Double invoiceAmount;

    @Column(name = "goods_description")
    private String goodsDescription;

    @Column(name = "purchase_order_number")
    private String purchaseOrderNumber;

    @Column(name = "payment_terms")
    private String paymentTerms;

    @Column(name = "discount_offered")
    private String discountOffered;

    @Column(name = "financing_amount", nullable = false)
    private Double financingAmount;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @Column(name = "account_holder_name", nullable = false)
    private String accountHolderName;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "swift_or_ifsc_code", nullable = false)
    private String swiftOrIfscCode;

    @Column(name = "authorized_name", nullable = false)
    private String authorizedName;

    @Column(name = "declaration_date", nullable = false)
    private LocalDate declarationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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