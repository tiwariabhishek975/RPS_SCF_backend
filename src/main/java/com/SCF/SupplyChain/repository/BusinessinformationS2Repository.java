package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.BusinessinformationS2Entity;

@Repository
public interface BusinessinformationS2Repository extends JpaRepository<BusinessinformationS2Entity, String>{
	
}
