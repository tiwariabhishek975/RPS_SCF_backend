package com.SCF.SupplyChain.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "scf_application_Details_table", uniqueConstraints = @UniqueConstraint(columnNames = "invoice_number"))
public class SCFuserupdatedetailsS7Entity {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long application_details_id;

	//@Column(name = "application_id", unique = true, nullable = false)
    //private String applicationId;
	
	@Column(name = "invoice_number", unique = true, nullable = false)
    private String invoiceNumber;
		
		
		@Column(name = "first_name", nullable = false)
	    private String firstName;
		
		@Column(name = "last_name", nullable = false)
	    private String lastName;

	    @Column(name = "email_id", nullable = false, unique = true)
	    private String emailId;

	    @Column(name = "alternate_email_id")
	    private String alternateEmailId;

	    @Column(name = "phone_no", nullable = false, unique = true)
	    private String phoneNo;

	    @Column(name = "alternate_phone_no")
	    private String alternatePhoneNo;

	    @Column(name = "gender")
	    private String gender;

	    @Column(name = "dob", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date dob;

	    @Column(name = "current_address", nullable = false, columnDefinition = "TEXT")
	    private String currentAddress;

	    @Column(name = "permanent_address", nullable = false, columnDefinition = "TEXT")
	    private String permanentAddress;

	    @Column(name = "city", nullable = false)
	    private String city;

	    @Column(name = "state", nullable = false)
	    private String state;
	    
	    @Column(name = "create_date")
	    private LocalDateTime createDate;

	    @Column(name = "update_date")
	    private LocalDateTime updateDate;
	    
	    @Column(name = "company_name", length = 255, nullable = false)
	    private String companyName;

	    @Column(name = "business_reg_number", length = 255, nullable = false, unique = true)
	    private String businessRegNumber;

	    @Column(name = "business_type", length = 255)
	    private String businessType;

	    @Column(name = "date_of_incorporation")
	    @Temporal(TemporalType.DATE)
	    private Date dateOfIncorporation;

	    @Column(name = "annual_turnover", length = 255)
	    private String annualTurnover;

	    @Column(name = "business_registered_add", length = 255)
	    private String businessRegisteredAddress;

	    @Column(name = "business_operational_add", length = 255)
	    private String businessOperationalAddress;

	    @Column(name = "company_city", length = 255)
	    private String companyCity;

	    @Column(name = "company_state", length = 255)
	    private String companyState;

	    @Column(name = "entity_consumption_type", length = 255)
	    private String entityConsumptionType;

	    @Column(name = "tax_identification_number", length = 255, unique = true)
	    private String taxIdentificationNumber;

	    @Column(name = "business_contact_person", length = 255)
	    private String businessContactPerson;

	    @Column(name = "business_contact_person_mob_no", length = 20, nullable = false, unique = true)
	    private String businessContactPersonMobNo;

	    @Column(name = "key_business_partner", length = 255)
	    private String keyBusinessPartner;

	    @Column(name = "no_of_years_month_in_business", length = 255)
	    private String noOfYearsMonthInBusiness;

	    @Column(name = "business_website", length = 255)
	    private String businessWebsite;
	    
	    
	    @Column(name = "full_name_proprietor", length = 255, nullable = false)
	    private String fullNameProprietor;

	    @Column(name = "designation", length = 255)
	    private String designation;

	    @Column(name = "proprietor_dob")
	    @Temporal(TemporalType.DATE)
	    private Date proprietorDob;

	    @Column(name = "proprietor_gender", length = 255)
	    private String proprietorGender;

	    @Column(name = "nationality", length = 255)
	    private String nationality;

	    @Column(name = "marital_status", length = 255)
	    private String maritalStatus;

	    @Column(name = "contact_no", length = 255, nullable = false, unique = true)
	    private String contactNo;

	    @Column(name = "proprietor_email_id", length = 255, nullable = false, unique = true)
	    private String proprietorEmailId;

	    @Column(name = "residential_add", length = 255)
	    private String residentialAdd;

	    @Column(name = "aadhar_no", length = 255, unique = true)
	    private String aadharNo;

	    @Column(name = "aadhar_img", columnDefinition = "TEXT")
	    private String aadharImg;

	    @Column(name = "pan_no", length = 255, unique = true)
	    private String panNo;

	    @Column(name = "pan_img", columnDefinition = "TEXT")
	    private String panImg;

	    @Column(name = "passport_no", length = 255, unique = true)
	    private String passportNo;

	    @Column(name = "passport_img", columnDefinition = "TEXT")
	    private String passportImg;

	    @Column(name = "years_of_experience_in_company", length = 255)
	    private String yearsOfExperienceInCompany;

	    @Column(name = "previous_company", length = 255)
	    private String previousCompany;

	    @Column(name = "percentage_of_ownership_in_company", length = 255)
	    private String percentageOfOwnershipInCompany;

	    
	    
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
	    
	    
	    @Column(name = "top_suppliers", length = 255)
	    private String topSuppliers;

	    @Column(name = "top_buyers", length = 255)
	    private String topBuyers;

	    @Column(name = "supplier_name", length = 255)
	    private String supplierName;

	    @Column(name = "supplier_contact_person", length = 255)
	    private String supplierContactPerson;

	    @Column(name = "supplier_payment_terms", length = 255)
	    private String supplierPaymentTerms;

	    @Column(name = "supplier_annual_purchase_value", length = 255)
	    private String supplierAnnualPurchaseValue;

	    @Column(name = "key_customer", length = 255)
	    private String keyCustomer;

	    @Column(name = "customer_name", length = 255)
	    private String customerName;

	    @Column(name = "customer_contact_person", length = 255)
	    private String customerContactPerson;

	    @Column(name = "customer_payment_terms", length = 255)
	    private String customerPaymentTerms;

	    @Column(name = "customer_annual_purchase_value", length = 255)
	    private String customerAnnualPurchaseValue;

	    @Column(name = "monthly_invoices", columnDefinition = "TEXT")
	    private String monthlyInvoices;

	    
	    @Column(name = "do_you_have_any_collateral", length = 255)
	    private String doYouHaveAnyCollateral;

	    @Column(name = "type_of_collateral", length = 255)
	    private String typeOfCollateral;

	    @Column(name = "owner_of_collateral", length = 255)
	    private String ownerOfCollateral;

	    @Column(name = "estimated_market_value", length = 255)
	    private String estimatedMarketValue;

	    @Column(name = "collateral_location", length = 255)
	    private String collateralLocation;

	    @Column(name = "collateral_documentation", columnDefinition = "TEXT")
	    private String collateralDocumentation;

	    @Column(name = "credit_score", length = 255)
	    private String creditScore;

	    @Column(name = "credit_score_img", columnDefinition = "TEXT")
	    private String creditScoreImg;

	    @Column(name = "any_past_loan", length = 255)
	    private String anyPastLoan;

	    @Column(name = "existing_loan", length = 255)
	    private String existingLoan;

	    @Column(name = "current_loan_obligation", length = 255)
	    private String currentLoanObligation;

	    @Column(name = "if_yes", length = 255)
	    private String ifYes;

	    @Column(name = "lender_name", length = 255)
	    private String lenderName;

	    @Column(name = "loan_amount", length = 255)
	    private String loanAmount;

	    @Column(name = "emi_amount", length = 255)
	    private String emiAmount;

	    @Column(name = "outstanding_balance", length = 255)
	    private String outstandingBalance;

	    @Column(name = "loan_end_date")
	    @Temporal(TemporalType.DATE)
	    private Date loanEndDate;

		

		public Long getApplication_details_id() {
			return application_details_id;
		}

		public void setApplication_details_id(Long application_details_id) {
			this.application_details_id = application_details_id;
		}

		
		public String getInvoiceNumber() {
			return invoiceNumber;
		}

		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getAlternateEmailId() {
			return alternateEmailId;
		}

		public void setAlternateEmailId(String alternateEmailId) {
			this.alternateEmailId = alternateEmailId;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		
		

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAlternatePhoneNo() {
			return alternatePhoneNo;
		}

		public void setAlternatePhoneNo(String alternatePhoneNo) {
			this.alternatePhoneNo = alternatePhoneNo;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getCurrentAddress() {
			return currentAddress;
		}

		public void setCurrentAddress(String currentAddress) {
			this.currentAddress = currentAddress;
		}

		public String getPermanentAddress() {
			return permanentAddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
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

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getBusinessRegNumber() {
			return businessRegNumber;
		}

		public void setBusinessRegNumber(String businessRegNumber) {
			this.businessRegNumber = businessRegNumber;
		}

		public String getBusinessType() {
			return businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public Date getDateOfIncorporation() {
			return dateOfIncorporation;
		}

		public void setDateOfIncorporation(Date dateOfIncorporation) {
			this.dateOfIncorporation = dateOfIncorporation;
		}

		public String getAnnualTurnover() {
			return annualTurnover;
		}

		public void setAnnualTurnover(String annualTurnover) {
			this.annualTurnover = annualTurnover;
		}

		public String getBusinessRegisteredAddress() {
			return businessRegisteredAddress;
		}

		public void setBusinessRegisteredAddress(String businessRegisteredAddress) {
			this.businessRegisteredAddress = businessRegisteredAddress;
		}

		public String getBusinessOperationalAddress() {
			return businessOperationalAddress;
		}

		public void setBusinessOperationalAddress(String businessOperationalAddress) {
			this.businessOperationalAddress = businessOperationalAddress;
		}

		public String getCompanyCity() {
			return companyCity;
		}

		public void setCompanyCity(String companyCity) {
			this.companyCity = companyCity;
		}

		public String getCompanyState() {
			return companyState;
		}

		public void setCompanyState(String companyState) {
			this.companyState = companyState;
		}

		public String getEntityConsumptionType() {
			return entityConsumptionType;
		}

		public void setEntityConsumptionType(String entityConsumptionType) {
			this.entityConsumptionType = entityConsumptionType;
		}

		public String getTaxIdentificationNumber() {
			return taxIdentificationNumber;
		}

		public void setTaxIdentificationNumber(String taxIdentificationNumber) {
			this.taxIdentificationNumber = taxIdentificationNumber;
		}

		public String getBusinessContactPerson() {
			return businessContactPerson;
		}

		public void setBusinessContactPerson(String businessContactPerson) {
			this.businessContactPerson = businessContactPerson;
		}

		public String getBusinessContactPersonMobNo() {
			return businessContactPersonMobNo;
		}

		public void setBusinessContactPersonMobNo(String businessContactPersonMobNo) {
			this.businessContactPersonMobNo = businessContactPersonMobNo;
		}

		public String getKeyBusinessPartner() {
			return keyBusinessPartner;
		}

		public void setKeyBusinessPartner(String keyBusinessPartner) {
			this.keyBusinessPartner = keyBusinessPartner;
		}

		public String getNoOfYearsMonthInBusiness() {
			return noOfYearsMonthInBusiness;
		}

		public void setNoOfYearsMonthInBusiness(String noOfYearsMonthInBusiness) {
			this.noOfYearsMonthInBusiness = noOfYearsMonthInBusiness;
		}

		public String getBusinessWebsite() {
			return businessWebsite;
		}

		public void setBusinessWebsite(String businessWebsite) {
			this.businessWebsite = businessWebsite;
		}

		public String getFullNameProprietor() {
			return fullNameProprietor;
		}

		public void setFullNameProprietor(String fullNameProprietor) {
			this.fullNameProprietor = fullNameProprietor;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Date getProprietorDob() {
			return proprietorDob;
		}

		public void setProprietorDob(Date proprietorDob) {
			this.proprietorDob = proprietorDob;
		}

		public String getProprietorGender() {
			return proprietorGender;
		}

		public void setProprietorGender(String proprietorGender) {
			this.proprietorGender = proprietorGender;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}

		public String getProprietorEmailId() {
			return proprietorEmailId;
		}

		public void setProprietorEmailId(String proprietorEmailId) {
			this.proprietorEmailId = proprietorEmailId;
		}

		public String getResidentialAdd() {
			return residentialAdd;
		}

		public void setResidentialAdd(String residentialAdd) {
			this.residentialAdd = residentialAdd;
		}

		public String getAadharNo() {
			return aadharNo;
		}

		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
		}

		public String getAadharImg() {
			return aadharImg;
		}

		public void setAadharImg(String aadharImg) {
			this.aadharImg = aadharImg;
		}

		public String getPanNo() {
			return panNo;
		}

		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}

		public String getPanImg() {
			return panImg;
		}

		public void setPanImg(String panImg) {
			this.panImg = panImg;
		}

		public String getPassportNo() {
			return passportNo;
		}

		public void setPassportNo(String passportNo) {
			this.passportNo = passportNo;
		}

		public String getPassportImg() {
			return passportImg;
		}

		public void setPassportImg(String passportImg) {
			this.passportImg = passportImg;
		}

		public String getYearsOfExperienceInCompany() {
			return yearsOfExperienceInCompany;
		}

		public void setYearsOfExperienceInCompany(String yearsOfExperienceInCompany) {
			this.yearsOfExperienceInCompany = yearsOfExperienceInCompany;
		}

		public String getPreviousCompany() {
			return previousCompany;
		}

		public void setPreviousCompany(String previousCompany) {
			this.previousCompany = previousCompany;
		}

		public String getPercentageOfOwnershipInCompany() {
			return percentageOfOwnershipInCompany;
		}

		public void setPercentageOfOwnershipInCompany(String percentageOfOwnershipInCompany) {
			this.percentageOfOwnershipInCompany = percentageOfOwnershipInCompany;
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

		public String getTopSuppliers() {
			return topSuppliers;
		}

		public void setTopSuppliers(String topSuppliers) {
			this.topSuppliers = topSuppliers;
		}

		public String getTopBuyers() {
			return topBuyers;
		}

		public void setTopBuyers(String topBuyers) {
			this.topBuyers = topBuyers;
		}

		public String getSupplierName() {
			return supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getSupplierContactPerson() {
			return supplierContactPerson;
		}

		public void setSupplierContactPerson(String supplierContactPerson) {
			this.supplierContactPerson = supplierContactPerson;
		}

		public String getSupplierPaymentTerms() {
			return supplierPaymentTerms;
		}

		public void setSupplierPaymentTerms(String supplierPaymentTerms) {
			this.supplierPaymentTerms = supplierPaymentTerms;
		}

		public String getSupplierAnnualPurchaseValue() {
			return supplierAnnualPurchaseValue;
		}

		public void setSupplierAnnualPurchaseValue(String supplierAnnualPurchaseValue) {
			this.supplierAnnualPurchaseValue = supplierAnnualPurchaseValue;
		}

		public String getKeyCustomer() {
			return keyCustomer;
		}

		public void setKeyCustomer(String keyCustomer) {
			this.keyCustomer = keyCustomer;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerContactPerson() {
			return customerContactPerson;
		}

		public void setCustomerContactPerson(String customerContactPerson) {
			this.customerContactPerson = customerContactPerson;
		}

		public String getCustomerPaymentTerms() {
			return customerPaymentTerms;
		}

		public void setCustomerPaymentTerms(String customerPaymentTerms) {
			this.customerPaymentTerms = customerPaymentTerms;
		}

		public String getCustomerAnnualPurchaseValue() {
			return customerAnnualPurchaseValue;
		}

		public void setCustomerAnnualPurchaseValue(String customerAnnualPurchaseValue) {
			this.customerAnnualPurchaseValue = customerAnnualPurchaseValue;
		}

		public String getMonthlyInvoices() {
			return monthlyInvoices;
		}

		public void setMonthlyInvoices(String monthlyInvoices) {
			this.monthlyInvoices = monthlyInvoices;
		}

		public String getDoYouHaveAnyCollateral() {
			return doYouHaveAnyCollateral;
		}

		public void setDoYouHaveAnyCollateral(String doYouHaveAnyCollateral) {
			this.doYouHaveAnyCollateral = doYouHaveAnyCollateral;
		}

		public String getTypeOfCollateral() {
			return typeOfCollateral;
		}

		public void setTypeOfCollateral(String typeOfCollateral) {
			this.typeOfCollateral = typeOfCollateral;
		}

		public String getOwnerOfCollateral() {
			return ownerOfCollateral;
		}

		public void setOwnerOfCollateral(String ownerOfCollateral) {
			this.ownerOfCollateral = ownerOfCollateral;
		}

		public String getEstimatedMarketValue() {
			return estimatedMarketValue;
		}

		public void setEstimatedMarketValue(String estimatedMarketValue) {
			this.estimatedMarketValue = estimatedMarketValue;
		}

		public String getCollateralLocation() {
			return collateralLocation;
		}

		public void setCollateralLocation(String collateralLocation) {
			this.collateralLocation = collateralLocation;
		}

		public String getCollateralDocumentation() {
			return collateralDocumentation;
		}

		public void setCollateralDocumentation(String collateralDocumentation) {
			this.collateralDocumentation = collateralDocumentation;
		}

		public String getCreditScore() {
			return creditScore;
		}

		public void setCreditScore(String creditScore) {
			this.creditScore = creditScore;
		}

		public String getCreditScoreImg() {
			return creditScoreImg;
		}

		public void setCreditScoreImg(String creditScoreImg) {
			this.creditScoreImg = creditScoreImg;
		}

		public String getAnyPastLoan() {
			return anyPastLoan;
		}

		public void setAnyPastLoan(String anyPastLoan) {
			this.anyPastLoan = anyPastLoan;
		}

		public String getExistingLoan() {
			return existingLoan;
		}

		public void setExistingLoan(String existingLoan) {
			this.existingLoan = existingLoan;
		}

		public String getCurrentLoanObligation() {
			return currentLoanObligation;
		}

		public void setCurrentLoanObligation(String currentLoanObligation) {
			this.currentLoanObligation = currentLoanObligation;
		}

		public String getIfYes() {
			return ifYes;
		}

		public void setIfYes(String ifYes) {
			this.ifYes = ifYes;
		}

		public String getLenderName() {
			return lenderName;
		}

		public void setLenderName(String lenderName) {
			this.lenderName = lenderName;
		}

		public String getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(String loanAmount) {
			this.loanAmount = loanAmount;
		}

		public String getEmiAmount() {
			return emiAmount;
		}

		public void setEmiAmount(String emiAmount) {
			this.emiAmount = emiAmount;
		}

		public String getOutstandingBalance() {
			return outstandingBalance;
		}

		public void setOutstandingBalance(String outstandingBalance) {
			this.outstandingBalance = outstandingBalance;
		}

		public Date getLoanEndDate() {
			return loanEndDate;
		}

		public void setLoanEndDate(Date loanEndDate) {
			this.loanEndDate = loanEndDate;
		}
	    
	    
	    
	    
	    

}
