package com.SCF.SupplyChain.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Org_kyc_Group_details")
public class OrgKycGroupDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Org_kyc_id")
    private Integer orgKycId;

    @Column(name = "org_type")
    private String orgType;

    @Column(name = "prop_name")
    private String propName;

    @Column(name = "prop_mobile")
    private String propMobile;

    @Column(name = "prop_email")
    private String propEmail;

    @Column(name = "prop_aadhar_no")
    private String propAadharNo;

    @Column(name = "prop_aadhar_photo")
    private String propAadharPhoto;

    @Column(name = "prop_pan_no")
    private String propPanNo;

    @Column(name = "prop_pan_img")
    private String propPanImg;

    @Column(name = "prop_address")
    private String propAddress;

    @Column(name = "prop_curr_address")
    private String propCurrAddress;

    @Column(name = "prop_DOB")
    private LocalDate propDOB;

    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "update_date")
    private LocalDateTime updateDate = LocalDateTime.now();

	public Integer getOrgKycId() {
		return orgKycId;
	}

	public void setOrgKycId(Integer orgKycId) {
		this.orgKycId = orgKycId;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getPropMobile() {
		return propMobile;
	}

	public void setPropMobile(String propMobile) {
		this.propMobile = propMobile;
	}

	public String getPropEmail() {
		return propEmail;
	}

	public void setPropEmail(String propEmail) {
		this.propEmail = propEmail;
	}

	public String getPropAadharNo() {
		return propAadharNo;
	}

	public void setPropAadharNo(String propAadharNo) {
		this.propAadharNo = propAadharNo;
	}

	public String getPropAadharPhoto() {
		return propAadharPhoto;
	}

	public void setPropAadharPhoto(String propAadharPhoto) {
		this.propAadharPhoto = propAadharPhoto;
	}

	public String getPropPanNo() {
		return propPanNo;
	}

	public void setPropPanNo(String propPanNo) {
		this.propPanNo = propPanNo;
	}

	public String getPropPanImg() {
		return propPanImg;
	}

	public void setPropPanImg(String propPanImg) {
		this.propPanImg = propPanImg;
	}

	public String getPropAddress() {
		return propAddress;
	}

	public void setPropAddress(String propAddress) {
		this.propAddress = propAddress;
	}

	public String getPropCurrAddress() {
		return propCurrAddress;
	}

	public void setPropCurrAddress(String propCurrAddress) {
		this.propCurrAddress = propCurrAddress;
	}

	public LocalDate getPropDOB() {
		return propDOB;
	}

	public void setPropDOB(LocalDate propDOB) {
		this.propDOB = propDOB;
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

	
    
    
    
}