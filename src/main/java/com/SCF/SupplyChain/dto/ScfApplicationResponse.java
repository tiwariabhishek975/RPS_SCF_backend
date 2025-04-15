package com.SCF.SupplyChain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScfApplicationResponse {
	
	private String message;
	private Long id;
    private String supplierId;
    //private String supplierName;
    //private String suppliermobNo;
    //private String supplierAddress;
    private String invoiceNumber;
    //private Integer applicationDetailsId;
    //private LocalDate invoiceDate;
    //private LocalDate dueDate;
    //private BigDecimal totalAmount;
    //private String paymentTerms;
    //private String uploadedInvoice;
    //private String additionalNotes;
    //private Integer applicationStatus;
    //private String remarkStatus;
    //private LocalDate statusDate;
    //private String applicationId;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
    
	
    
    
    

}
