package com.SCF.SupplyChain.exceptions;

public class InvoiceNumberAlreadyExist extends RuntimeException {
	public InvoiceNumberAlreadyExist(String message) {
        super(message);
    }
}