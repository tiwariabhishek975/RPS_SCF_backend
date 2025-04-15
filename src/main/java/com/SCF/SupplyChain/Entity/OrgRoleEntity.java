package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Org_role")
public class OrgRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Org_role_id")
    private Integer orgRoleId;

    @Column(name = "Org_role_name")
    private String orgRoleName;

    @Column(name = "Org_role_type")
    private String orgRoleType;

	public Integer getOrgRoleId() {
		return orgRoleId;
	}

	public void setOrgRoleId(Integer orgRoleId) {
		this.orgRoleId = orgRoleId;
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

    
    
    
    
}

