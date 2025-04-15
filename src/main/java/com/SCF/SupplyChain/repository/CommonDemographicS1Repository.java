package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.CommonDemographicS1Entity;

@Repository
public interface CommonDemographicS1Repository extends JpaRepository<CommonDemographicS1Entity, Long> {
    
	CommonDemographicS1Entity findByInvoiceNumber(String invoiceNumber);
	//List<CommonDemographicS1Entity> findByInvoiceNumber(String invoiceNumber);
	
    
}
