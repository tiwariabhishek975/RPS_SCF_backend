package com.SCF.SupplyChain.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "scf_Userdetails")
public class ScfUserdetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_details_id")
    private Long userDetailsId;

    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_role_id", referencedColumnName = "user_role_id")
    private UserRoleEntity userRole;

    @Column(name = "first_name", nullable = false)
    private String firstname;
    
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email_address", nullable = false, unique = true)
    private String emailAddress;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "account_status", nullable = false)
    private String accountStatus = "Active";

    
    @Column(name = "sms_notifications")
    private Boolean smsNotifications = true;

    @Column(name = "preferred_language", nullable = false)
    private String preferredLanguage = "EN";

    
    
    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "update_date")
    private LocalDateTime updateDate = LocalDateTime.now();

    
    

 // Method to generate User ID in the format: first_name + ddMMyyHHmmss
    @PrePersist
    public void generateUserIdNumber() {
        if (this.firstname != null && !this.firstname.trim().isEmpty()) {
            String dateTimePart = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyHHmmss"));
            this.userId = this.firstname.toLowerCase() + dateTimePart;
        } else {
            throw new RuntimeException("Username cannot be null or empty");
        }
    }


   
	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public Long getUserDetailsId() {
		return userDetailsId;
	}

	public void setUserDetailsId(Long userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserRoleEntity getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleEntity userRole) {
		this.userRole = userRole;
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

