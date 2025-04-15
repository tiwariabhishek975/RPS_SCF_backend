package com.SCF.SupplyChain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfbankRiskAssessmentEntity;

@Repository
public interface ScfbankRiskAssessmentRepository extends JpaRepository<ScfbankRiskAssessmentEntity, Long> {
	
	List<ScfbankRiskAssessmentEntity> findByInvoiceNumber(String invoiceNumber);
	

}
