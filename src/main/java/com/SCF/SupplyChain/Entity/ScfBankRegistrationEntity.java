package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "scf_bank_registration_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScfBankRegistrationEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "job_id_no", nullable = false)
    private String jobIdNo;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "mobile_no", nullable = false)
    private String mobileNo;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @ManyToOne
    @JoinColumn(name = "bank_role_id", referencedColumnName = "bank_role_id")
    private ScfBankRoleEntity bankRole;
    
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public ScfBankRoleEntity getBankRole() {
		return bankRole;
	}

	public void setBankRole(ScfBankRoleEntity bankRole) {
		this.bankRole = bankRole;
	}
    
    
    

}
