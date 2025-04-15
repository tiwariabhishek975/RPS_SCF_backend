package com.SCF.SupplyChain.Entity;

import java.time.LocalDate;

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
@Table(name = "scf_bank_risk_assessment")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ScfbankRiskAssessmentEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "section_Title", nullable = false)
	private String sectionTitle;      // e.g. Credit Score
	
	@Column(name = "details", nullable = false)
    private String details;           // e.g. Your credit score is 750
	
	@Column(name = "updated_date", nullable = false)
	private LocalDate updatedDate; // e.g. Oct 2024
    
    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
    
    
    
    

}
