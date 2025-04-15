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
public class ProprietorDetailsS3Entity {
	
	
	@Id
	@Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;
	
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

	

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
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
    
    
    
	
	
	

}
