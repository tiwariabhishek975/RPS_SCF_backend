package com.SCF.SupplyChain.dto;

import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class GetApplicationDetailsResponse {
	
	
	private String message;
    private SCFuserupdatedetailsS7Entity user;
	/*private Long application_details_id;
	private String applicationId;
    private String invoiceNumber;
    private String firstName;
    private String emailId;
    private String phoneNo;
    private String companyName;
    private String businessType;
    private String loanAmountRequired;
    
    
    public GetApplicationDetailsResponse(SCFuserupdatedetailsS7Entity entity) {
    	this.application_details_id = entity.getApplication_details_id();
        this.applicationId = entity.getApplicationId();
        this.invoiceNumber = entity.getInvoiceNumber();
        this.firstName = entity.getFirstName();
        this.emailId = entity.getEmailId();
        this.phoneNo = entity.getPhoneNo();
        this.companyName = entity.getCompanyName();
        this.businessType = entity.getBusinessType();
        this.loanAmountRequired = entity.getLoanAmountRequired();
    }
*/
    
    
    
	public String getMessage() {
		return message;
	}
	public GetApplicationDetailsResponse(String message, SCFuserupdatedetailsS7Entity user) {
		super();
		this.message = message;
		this.user = user;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SCFuserupdatedetailsS7Entity getUser() {
		return user;
	}
	public void setUser(SCFuserupdatedetailsS7Entity user) {
		this.user = user;
	}

	
    
    
	
	

}
