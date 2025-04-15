package com.SCF.SupplyChain.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class UserRegistrationRequest {
	
	private String firstname;
	private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private String companyName;
    private String profilePicture;
    private String accountStatus;
    
    private Boolean smsNotifications;
    private String preferredLanguage;
    
    private String roleName;
    private String accessLevels;
    
    
    private String orgName;
    private String orgGstNumber;
    private String orgAddress;
    private String noOfEmployee;
    
    private String orgRoleName;
    private String orgRoleType;
    
    private String orgType;
    private String propName;
    private String propMobile;
    private String propEmail;
    private String propAadharNo;
    private String propAadharPhoto;
    private String propPanNo;
    private String propPanImg;
    private String propAddress;
    private String propCurrAddress;
    private LocalDate propDOB;
    
    
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	public Boolean getSmsNotifications() {
		return smsNotifications;
	}
	public void setSmsNotifications(Boolean smsNotifications) {
		this.smsNotifications = smsNotifications;
	}
	public String getPreferredLanguage() {
		return preferredLanguage;
	}
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getAccessLevels() {
		return accessLevels;
	}
	public void setAccessLevels(String accessLevels) {
		this.accessLevels = accessLevels;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgGstNumber() {
		return orgGstNumber;
	}
	public void setOrgGstNumber(String orgGstNumber) {
		this.orgGstNumber = orgGstNumber;
	}
	public String getOrgAddress() {
		return orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(String noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public String getOrgRoleName() {
		return orgRoleName;
	}
	public void setOrgRoleName(String orgRoleName) {
		this.orgRoleName = orgRoleName;
	}
	public String getOrgRoleType() {
		return orgRoleType;
	}
	public void setOrgRoleType(String orgRoleType) {
		this.orgRoleType = orgRoleType;
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
    
    
    
    

}
