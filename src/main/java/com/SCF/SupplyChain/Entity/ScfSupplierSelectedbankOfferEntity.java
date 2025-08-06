package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "scf_selected_bankoffer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScfSupplierSelectedbankOfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "offer_id", nullable = false)
    private ScfSupplierBankOfferEntity offer;

    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;

    @Column(name = "proceed", nullable = false)
    private boolean proceed;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScfSupplierBankOfferEntity getOffer() {
		return offer;
	}

	public void setOffer(ScfSupplierBankOfferEntity offer) {
		this.offer = offer;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public boolean isProceed() {
		return proceed;
	}

	public void setProceed(boolean proceed) {
		this.proceed = proceed;
	}
    
    
    
    
    
    
}
