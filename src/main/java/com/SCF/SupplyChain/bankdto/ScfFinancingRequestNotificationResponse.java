package com.SCF.SupplyChain.bankdto;

import java.time.LocalTime;

import lombok.Data;

@Data
public class ScfFinancingRequestNotificationResponse {
	
	
	 private String senderName;
	    private String message;
	    private String invoiceNumber;
	    private LocalTime timestamp;
		public String getSenderName() {
			return senderName;
		}
		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getInvoiceNumber() {
			return invoiceNumber;
		}
		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}
		public LocalTime getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(LocalTime timestamp) {
			this.timestamp = timestamp;
		}
	    
	    
	    

}
