package com.SCF.SupplyChain.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_scf_session")
@Getter
@Setter
public class UserSession {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // Ensure sessionId is unique
    private String sessionId;

    @Column(nullable = false)
    private String phoneNo;

    @Column(nullable = false)
    private LocalDateTime loginTime;

    @Column
    private LocalDateTime logoutTime;

    @Column(nullable = false)
    private Boolean isActive;



    @Column
    private String authKey; // Dynamic authKey

    @Column
    private LocalDateTime authKeyExpiryTime; // Expiry time for authKey



    @Column
    private LocalDateTime sessionIdExpiryTime; // Expiry time for sessionId

    // ✅ Added password field
    @Column(nullable = false)
    private String password;
    

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSessionId() {
		return sessionId;
	}



	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public LocalDateTime getLoginTime() {
		return loginTime;
	}



	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}



	public LocalDateTime getLogoutTime() {
		return logoutTime;
	}



	public void setLogoutTime(LocalDateTime logoutTime) {
		this.logoutTime = logoutTime;
	}



	public Boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	public String getAuthKey() {
		return authKey;
	}



	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}



	public LocalDateTime getAuthKeyExpiryTime() {
		return authKeyExpiryTime;
	}



	public void setAuthKeyExpiryTime(LocalDateTime authKeyExpiryTime) {
		this.authKeyExpiryTime = authKeyExpiryTime;
	}



	public LocalDateTime getSessionIdExpiryTime() {
		return sessionIdExpiryTime;
	}



	public void setSessionIdExpiryTime(LocalDateTime sessionIdExpiryTime) {
		this.sessionIdExpiryTime = sessionIdExpiryTime;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
    
    
    
}