package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfSupplierBankOfferEntity;

@Repository
public interface ScfSupplierBankOfferRepository extends JpaRepository<ScfSupplierBankOfferEntity, Long> {
}
