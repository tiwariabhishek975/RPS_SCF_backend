package com.SCF.SupplyChain.Entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "scf_application_Details_table")
public class BusinessinformationS2Entity {
	@Id
	@Column(name = "invoice_number", nullable = false, unique = true)
    private String invoiceNumber;
	
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
