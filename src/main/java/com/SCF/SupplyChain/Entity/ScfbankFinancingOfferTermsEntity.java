package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_financing_offer_terms")
public class ScfbankFinancingOfferTermsEntity {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "interest_raterange")
	    private String interestRateRange; // e.g., "10% - 20%"

	    @Column(name = "repayment_schedule")
	    private String repaymentSchedule; // e.g., "30 - 180 days"

	    @Column(name = "repayment_note")
	    private String repaymentNote; // e.g., "You can choose to pay us back in..."

	    @Column(name = "processingfees_range")
	    private String processingFeesRange; // e.g., "Rs.12,150 - Rs.1,11,300"

	    @Column(name = "processing_note")
	    private String processingNote; // optional extra note

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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
