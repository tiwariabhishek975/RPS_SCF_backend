package com.SCF.SupplyChain.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "scf_bank_offer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScfSupplierBankOfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @Column(name = "interest_rate", nullable = false)
    private double interestRate;

    @Column(name = "terms_in_year", nullable = false)
    private int termInYears;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @OneToMany(mappedBy = "offer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ScfSupplierSelectedbankOfferEntity> selectedOffers = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTermInYears() {
		return termInYears;
	}

	public void setTermInYears(int termInYears) {
		this.termInYears = termInYears;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<ScfSupplierSelectedbankOfferEntity> getSelectedOffers() {
		return selectedOffers;
	}

	public void setSelectedOffers(List<ScfSupplierSelectedbankOfferEntity> selectedOffers) {
		this.selectedOffers = selectedOffers;
	}
    
    
    
}
