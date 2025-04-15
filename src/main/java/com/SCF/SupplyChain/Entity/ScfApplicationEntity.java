package com.SCF.SupplyChain.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "scf_application_main")
@Getter
@Setter
@NoArgsConstructor
public class ScfApplicationEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
	@Column(name = "user_id", nullable = false)
    private String userId;
	
	
	@Column(name = "company_name", nullable = false)
	private String companyname;
	
	
    @Column(name = "supplier_id", nullable = false)
    private String supplierId;

    @Column(name = "supplier_name", nullable = false)
    private String supplierName;

    @Column(name = "s_mobile_no", length = 12, nullable = false)
    private String suppliermobNo;

    @Column(name = "supplier_address", columnDefinition = "TEXT")
    private String supplierAddress;

    @Column(name = "invoice_number", unique = true, nullable = false)
    private String invoiceNumber;
  
    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;

    @Column(name = "invoice_due_date")
    private LocalDate invoicedueDate;

    @Column(name = "invoice_amount", precision = 15, scale = 2)
    private BigDecimal invoiceAmount;

    @Column(name = "alternative_payment_terms", length = 50)
    private String alternativepaymentterms;

    @Column(name = "description_goods_services", nullable = false)
    private String descriptiongoodsservices;
    
    @Column(name = "purchase_order", nullable = false)
    private String purchaseorder;
    
    @Column(name = "payment_terms", nullable = false)
    private String paymentterms;
    
    @Column(name = "discount_offered", nullable = false)
    private String discountoffered;

    @Column(name = "financing_amount_required", nullable = false)
    private String financingamountrequired;
    
    
    @Column(name = "bank_name", nullable = false)
    private String bankname;
    
    @Column(name = "account_holder_name", nullable = false)
    private String accountholdername;
    
    @Column(name = "account_number", nullable = false)
    private String accountnumber;
    
    @Column(name = "swift_ifsc_code", nullable = false)
    private String swiftifsccode;
    
    @Column(name = "supporting_documents", columnDefinition = "TEXT")
    private String supportingdocuments;

    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "update_date")
    private LocalDateTime updateDate = LocalDateTime.now();

    @Column(name = "applicant_name")
    private String applicantname;

    @Column(name = "today_date", nullable = false)
    private LocalDate todaydate;

   // @Column(name = "application_id", unique = true, nullable = false)
   //private String applicationId;

    

    // Method to generate invoice number and application number
    @PrePersist
    public void generateInvoiceNumber() {
        String dateTimePart = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmmss"));
        this.invoiceNumber = "IN" + dateTimePart;
        //this.applicationId = "AP" + dateTimePart;
    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



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



	


	public String getAlternativepaymentterms() {
		return alternativepaymentterms;
	}



	public void setAlternativepaymentterms(String alternativepaymentterms) {
		this.alternativepaymentterms = alternativepaymentterms;
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



	public String getPaymentterms() {
		return paymentterms;
	}



	public void setPaymentterms(String paymentterms) {
		this.paymentterms = paymentterms;
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



	public LocalDateTime getCreateDate() {
		return createDate;
	}



	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}



	public LocalDateTime getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
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
