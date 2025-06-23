package com.SCF.SupplyChain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfBankFundDisbursementEntity;

@Repository
public interface ScfBankFundDisbursementRepository extends JpaRepository<ScfBankFundDisbursementEntity, Long> {
    List<ScfBankFundDisbursementEntity> findAllByOrderByDateDescTimeDesc();
	
	
	

}
