package com.SCF.SupplyChain.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "scf_application_Details_table")
public class CollateralCreditworthinessS6Entity {
	
	@Id
	@Column(name = "invoice_number", unique = true, nullable = false)
    private String invoiceNumber;
	
	@Column(name = "do_you_have_any_collateral", length = 255)
    private String doYouHaveAnyCollateral;

    @Column(name = "type_of_collateral", length = 255)
    private String typeOfCollateral;

    @Column(name = "owner_of_collateral", length = 255)
    private String ownerOfCollateral;

    @Column(name = "estimated_market_value", length = 255)
    private String estimatedMarketValue;

    @Column(name = "collateral_location", length = 255)
    private String collateralLocation;

    @Column(name = "collateral_documentation", columnDefinition = "TEXT")
    private String collateralDocumentation;

    @Column(name = "credit_score", length = 255)
    private String creditScore;

    @Column(name = "credit_score_img", columnDefinition = "TEXT")
    private String creditScoreImg;

    @Column(name = "any_past_loan", length = 255)
    private String anyPastLoan;

    @Column(name = "existing_loan", length = 255)
    private String existingLoan;

    @Column(name = "current_loan_obligation", length = 255)
    private String currentLoanObligation;

    @Column(name = "if_yes", length = 255)
    private String ifYes;

    @Column(name = "lender_name", length = 255)
    private String lenderName;

    @Column(name = "loan_amount", length = 255)
    private String loanAmount;

    @Column(name = "emi_amount", length = 255)
    private String emiAmount;

    @Column(name = "outstanding_balance", length = 255)
    private String outstandingBalance;

    @Column(name = "loan_end_date")
    @Temporal(TemporalType.DATE)
    private Date loanEndDate;

	

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getDoYouHaveAnyCollateral() {
		return doYouHaveAnyCollateral;
	}

	public void setDoYouHaveAnyCollateral(String doYouHaveAnyCollateral) {
		this.doYouHaveAnyCollateral = doYouHaveAnyCollateral;
	}

	public String getTypeOfCollateral() {
		return typeOfCollateral;
	}

	public void setTypeOfCollateral(String typeOfCollateral) {
		this.typeOfCollateral = typeOfCollateral;
	}

	public String getOwnerOfCollateral() {
		return ownerOfCollateral;
	}

	public void setOwnerOfCollateral(String ownerOfCollateral) {
		this.ownerOfCollateral = ownerOfCollateral;
	}

	public String getEstimatedMarketValue() {
		return estimatedMarketValue;
	}

	public void setEstimatedMarketValue(String estimatedMarketValue) {
		this.estimatedMarketValue = estimatedMarketValue;
	}

	public String getCollateralLocation() {
		return collateralLocation;
	}

	public void setCollateralLocation(String collateralLocation) {
		this.collateralLocation = collateralLocation;
	}

	public String getCollateralDocumentation() {
		return collateralDocumentation;
	}

	public void setCollateralDocumentation(String collateralDocumentation) {
		this.collateralDocumentation = collateralDocumentation;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

	public String getCreditScoreImg() {
		return creditScoreImg;
	}

	public void setCreditScoreImg(String creditScoreImg) {
		this.creditScoreImg = creditScoreImg;
	}

	public String getAnyPastLoan() {
		return anyPastLoan;
	}

	public void setAnyPastLoan(String anyPastLoan) {
		this.anyPastLoan = anyPastLoan;
	}

	public String getExistingLoan() {
		return existingLoan;
	}

	public void setExistingLoan(String existingLoan) {
		this.existingLoan = existingLoan;
	}

	public String getCurrentLoanObligation() {
		return currentLoanObligation;
	}

	public void setCurrentLoanObligation(String currentLoanObligation) {
		this.currentLoanObligation = currentLoanObligation;
	}

	public String getIfYes() {
		return ifYes;
	}

	public void setIfYes(String ifYes) {
		this.ifYes = ifYes;
	}

	public String getLenderName() {
		return lenderName;
	}

	public void setLenderName(String lenderName) {
		this.lenderName = lenderName;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(String emiAmount) {
		this.emiAmount = emiAmount;
	}

	public String getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(String outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	public Date getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
    
    
    

}
