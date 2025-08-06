package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfSupplierRegistrationEntity;

@Repository
public interface ScfSupplierRegistrationRepository extends JpaRepository<ScfSupplierRegistrationEntity, Long> {
	
	
	Optional<ScfSupplierRegistrationEntity> findByMobileNo(String mobileNo);
	Optional<ScfSupplierRegistrationEntity> findByEmailId(String emailId);

}
