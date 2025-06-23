package com.SCF.SupplyChain.bankdto;

import lombok.Data;

@Data
public class ScfbankFinancingOfferTermsRequest {
	
	private String interestRateRange;
    private String repaymentSchedule;
    private String repaymentNote;
    private String processingFeesRange;
    private String processingNote;
	public String getInterestRateRange() {
		return interestRateRange;
	}
	public void setInterestRateRange(String interestRateRange) {
		this.interestRateRange = interestRateRange;
	}
	public String getRepaymentSchedule() {
		return repaymentSchedule;
	}
	public void setRepaymentSchedule(String repaymentSchedule) {
		this.repaymentSchedule = repaymentSchedule;
	}
	public String getRepaymentNote() {
		return repaymentNote;
	}
	public void setRepaymentNote(String repaymentNote) {
		this.repaymentNote = repaymentNote;
	}
	public String getProcessingFeesRange() {
		return processingFeesRange;
	}
	public void setProcessingFeesRange(String processingFeesRange) {
		this.processingFeesRange = processingFeesRange;
	}
	public String getProcessingNote() {
		return processingNote;
	}
	public void setProcessingNote(String processingNote) {
		this.processingNote = processingNote;
	}
    
    
    

}
