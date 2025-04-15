package com.SCF.SupplyChain.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;

public class BusinessinformationS2Request {
	    
	@NotNull(message = "Invoice Number is required")
	    private String invoiceNumber;
	    private String companyName;
	    private String businessRegNumber;
	    private String businessType;
	    private Date dateOfIncorporation;
	    private String annualTurnover;
	    private String businessRegisteredAddress;
	    private String businessOperationalAddress;
	    private String companyCity;
	    private String companyState;
	    private String entityConsumptionType;
	    private String taxIdentificationNumber;
	    private String businessContactPerson;
	    private String businessContactPersonMobNo;
	    private String keyBusinessPartner;
	    private String noOfYearsMonthInBusiness;
	    private String businessWebsite;
		
	    
	    
	    
		public String getInvoiceNumber() {
			return invoiceNumber;
		}
		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
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

	    
	    
}
