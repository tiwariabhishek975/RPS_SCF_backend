package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfbankFinancingOfferTermsEntity;

@Repository
public interface ScfbankFinancingOfferTermsRepository extends JpaRepository<ScfbankFinancingOfferTermsEntity, Long>{

}
