package com.SCF.SupplyChain.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "org_details")
public class OrgDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "org_name")
    private String orgName;

   //@ManyToOne
   // @JoinColumn(name = "supplier_id", referencedColumnName = "user_id")
   // private ScfUserdetailsEntity supplier;

    @Column(name = "Org_gst_number")
    private String orgGstNumber;

    @ManyToOne
    @JoinColumn(name = "Org_role_id", referencedColumnName = "Org_role_id")
    private OrgRoleEntity orgRole;

    @ManyToOne
    @JoinColumn(name = "Org_kyc_id", referencedColumnName = "Org_kyc_id")
    private OrgKycGroupDetailsEntity orgKyc;

    @Column(name = "Org_address")
    private String orgAddress;

    @Column(name = "no_of_employee")
    private String noOfEmployee;

    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "update_date")
    private LocalDateTime updateDate = LocalDateTime.now();

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
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

	public OrgRoleEntity getOrgRole() {
		return orgRole;
	}

	public void setOrgRole(OrgRoleEntity orgRole) {
		this.orgRole = orgRole;
	}

	public OrgKycGroupDetailsEntity getOrgKyc() {
		return orgKyc;
	}

	public void setOrgKyc(OrgKycGroupDetailsEntity orgKyc) {
		this.orgKyc = orgKyc;
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
