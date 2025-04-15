package com.SCF.SupplyChain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetApplicationResponse {
    private Long id;
    private String userId;
    private String companyName;
    private String supplierId;
    private String invoiceNumber;
    //private String applicationId;
    private String bankname; 
    private String accountholdername;
    private String accountnumber;
    private String swiftifsccode;
    //private LocalDateTime createDate;
    //private LocalDateTime updateDate;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getSwiftifsccode() {
		return swiftifsccode;
	}
	public void setSwiftifsccode(String swiftifsccode) {
		this.swiftifsccode = swiftifsccode;
	}
    
    
    
}
