package com.SCF.SupplyChain.bankdto;

import lombok.Data;

@Data
public class ScfBankRegistrationRequest {

	
	
	
    private String jobIdNo; 
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    
    private String roleName;
    private String accesslevel;
	public String getJobIdNo() {
		return jobIdNo;
	}
	public void setJobIdNo(String jobIdNo) {
		this.jobIdNo = jobIdNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getAccesslevel() {
		return accesslevel;
	}
	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}
    
    
    
}
