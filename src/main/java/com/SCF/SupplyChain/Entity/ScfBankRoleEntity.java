package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "scf_bank_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScfBankRoleEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_role_id")
    private Integer bankRoleId;

    @Column(name = "role_name", nullable = false)
    private String roleName;
    
    @Column(name = "access_level", nullable = false)
    private String accesslevel;

	public Integer getBankRoleId() {
		return bankRoleId;
	}

	public void setBankRoleId(Integer bankRoleId) {
		this.bankRoleId = bankRoleId;
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
