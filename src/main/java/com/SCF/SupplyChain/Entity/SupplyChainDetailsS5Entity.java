package com.SCF.SupplyChain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scf_application_Details_table")
public class SupplyChainDetailsS5Entity {
	
	
	@Id
	@Column(name = "invoice_number", unique = true, nullable = false)
    private String invoiceNumber;
	
	@Column(name = "top_suppliers", length = 255)
    private String topSuppliers;

    @Column(name = "top_buyers", length = 255)
    private String topBuyers;

    @Column(name = "supplier_name", length = 255)
    private String supplierName;

    @Column(name = "supplier_contact_person", length = 255)
    private String supplierContactPerson;

    @Column(name = "supplier_payment_terms", length = 255)
    private String supplierPaymentTerms;

    @Column(name = "supplier_annual_purchase_value", length = 255)
    private String supplierAnnualPurchaseValue;

    @Column(name = "key_customer", length = 255)
    private String keyCustomer;

    @Column(name = "customer_name", length = 255)
    private String customerName;

    @Column(name = "customer_contact_person", length = 255)
    private String customerContactPerson;

    @Column(name = "customer_payment_terms", length = 255)
    private String customerPaymentTerms;

    @Column(name = "customer_annual_purchase_value", length = 255)
    private String customerAnnualPurchaseValue;

    @Column(name = "monthly_invoices", columnDefinition = "TEXT")
    private String monthlyInvoices;

	

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getTopSuppliers() {
		return topSuppliers;
	}

	public void setTopSuppliers(String topSuppliers) {
		this.topSuppliers = topSuppliers;
	}

	public String getTopBuyers() {
		return topBuyers;
	}

	public void setTopBuyers(String topBuyers) {
		this.topBuyers = topBuyers;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContactPerson() {
		return supplierContactPerson;
	}

	public void setSupplierContactPerson(String supplierContactPerson) {
		this.supplierContactPerson = supplierContactPerson;
	}

	public String getSupplierPaymentTerms() {
		return supplierPaymentTerms;
	}

	public void setSupplierPaymentTerms(String supplierPaymentTerms) {
		this.supplierPaymentTerms = supplierPaymentTerms;
	}

	public String getSupplierAnnualPurchaseValue() {
		return supplierAnnualPurchaseValue;
	}

	public void setSupplierAnnualPurchaseValue(String supplierAnnualPurchaseValue) {
		this.supplierAnnualPurchaseValue = supplierAnnualPurchaseValue;
	}

	public String getKeyCustomer() {
		return keyCustomer;
	}

	public void setKeyCustomer(String keyCustomer) {
		this.keyCustomer = keyCustomer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContactPerson() {
		return customerContactPerson;
	}

	public void setCustomerContactPerson(String customerContactPerson) {
		this.customerContactPerson = customerContactPerson;
	}

	public String getCustomerPaymentTerms() {
		return customerPaymentTerms;
	}

	public void setCustomerPaymentTerms(String customerPaymentTerms) {
		this.customerPaymentTerms = customerPaymentTerms;
	}

	public String getCustomerAnnualPurchaseValue() {
		return customerAnnualPurchaseValue;
	}

	public void setCustomerAnnualPurchaseValue(String customerAnnualPurchaseValue) {
		this.customerAnnualPurchaseValue = customerAnnualPurchaseValue;
	}

	public String getMonthlyInvoices() {
		return monthlyInvoices;
	}

	public void setMonthlyInvoices(String monthlyInvoices) {
		this.monthlyInvoices = monthlyInvoices;
	}
    
    
    

}
