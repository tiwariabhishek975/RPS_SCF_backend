package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.EarlyPaymentRequestEntity;

@Repository
public interface EarlyPaymentRequestRepository extends JpaRepository<EarlyPaymentRequestEntity, Long> {
    //Optional<EarlyPaymentRequestEntity> findByInvoiceNumber(String invoiceNumber);
	 boolean existsByInvoiceNumber(String invoiceNumber);
}
