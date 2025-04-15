package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scf_application_Details_table")
public class BusinessFinanceDetailsS4Entity {
	
	
	@Id
	@Column(name = "invoice_number", unique = true, nullable = false)
    private String invoiceNumber;
	
	
	@Column(name = "buss_ac_name", length = 255)
    private String businessAccountName;

    @Column(name = "buss_ac_no", length = 255, unique = true, nullable = false)
    private String businessAccountNumber;

    @Column(name = "buss_ac_ifsc", length = 255, nullable = false)
    private String businessAccountIFSC;

    @Column(name = "pan_entity", length = 255, unique = true, nullable = false)
    private String panEntity;

    @Column(name = "loan_amount_required", length = 255)
    private String loanAmountRequired;

    @Column(name = "purpose_of_loan", length = 255)
    private String purposeOfLoan;

    @Column(name = "preferred_loan_tenure", length = 255)
    private String preferredLoanTenure;

    @Column(name = "existing_loan_details", length = 255)
    private String existingLoanDetails;

    // Documents (Stored as BASE64 Encoded Strings or File Paths)
    @Column(name = "six_month_bank_statement", columnDefinition = "TEXT")
    private String sixMonthBankStatement;

    @Column(name = "financial_statement", columnDefinition = "TEXT")
    private String financialStatement;

    @Column(name = "business_reg_certificate", columnDefinition = "TEXT")
    private String businessRegCertificate;

    @Column(name = "gst_certificate", columnDefinition = "TEXT")
    private String gstCertificate;

    @Column(name = "kyc_documents", columnDefinition = "TEXT")
    private String kycDocuments;

    @Column(name = "audited_balance_sheet", columnDefinition = "TEXT")
    private String auditedBalanceSheet;

    @Column(name = "income_tax_return", columnDefinition = "TEXT")
    private String incomeTaxReturn;

    @Column(name = "company_reg_certificate", columnDefinition = "TEXT")
    private String companyRegCertificate;



	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getBusinessAccountName() {
		return businessAccountName;
	}

	public void setBusinessAccountName(String businessAccountName) {
		this.businessAccountName = businessAccountName;
	}

	public String getBusinessAccountNumber() {
		return businessAccountNumber;
	}

	public void setBusinessAccountNumber(String businessAccountNumber) {
		this.businessAccountNumber = businessAccountNumber;
	}

	public String getBusinessAccountIFSC() {
		return businessAccountIFSC;
	}

	public void setBusinessAccountIFSC(String businessAccountIFSC) {
		this.businessAccountIFSC = businessAccountIFSC;
	}

	public String getPanEntity() {
		return panEntity;
	}

	public void setPanEntity(String panEntity) {
		this.panEntity = panEntity;
	}

	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}

	public String getPreferredLoanTenure() {
		return preferredLoanTenure;
	}

	public void setPreferredLoanTenure(String preferredLoanTenure) {
		this.preferredLoanTenure = preferredLoanTenure;
	}

	public String getExistingLoanDetails() {
		return existingLoanDetails;
	}

	public void setExistingLoanDetails(String existingLoanDetails) {
		this.existingLoanDetails = existingLoanDetails;
	}

	public String getSixMonthBankStatement() {
		return sixMonthBankStatement;
	}

	public void setSixMonthBankStatement(String sixMonthBankStatement) {
		this.sixMonthBankStatement = sixMonthBankStatement;
	}

	public String getFinancialStatement() {
		return financialStatement;
	}

	public void setFinancialStatement(String financialStatement) {
		this.financialStatement = financialStatement;
	}

	public String getBusinessRegCertificate() {
		return businessRegCertificate;
	}

	public void setBusinessRegCertificate(String businessRegCertificate) {
		this.businessRegCertificate = businessRegCertificate;
	}

	public String getGstCertificate() {
		return gstCertificate;
	}

	public void setGstCertificate(String gstCertificate) {
		this.gstCertificate = gstCertificate;
	}

	public String getKycDocuments() {
		return kycDocuments;
	}

	public void setKycDocuments(String kycDocuments) {
		this.kycDocuments = kycDocuments;
	}

	public String getAuditedBalanceSheet() {
		return auditedBalanceSheet;
	}

	public void setAuditedBalanceSheet(String auditedBalanceSheet) {
		this.auditedBalanceSheet = auditedBalanceSheet;
	}

	public String getIncomeTaxReturn() {
		return incomeTaxReturn;
	}

	public void setIncomeTaxReturn(String incomeTaxReturn) {
		this.incomeTaxReturn = incomeTaxReturn;
	}

	public String getCompanyRegCertificate() {
		return companyRegCertificate;
	}

	public void setCompanyRegCertificate(String companyRegCertificate) {
		this.companyRegCertificate = companyRegCertificate;
	}
    
    
    

}
