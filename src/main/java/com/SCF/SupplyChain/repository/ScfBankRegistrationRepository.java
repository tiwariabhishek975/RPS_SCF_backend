package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfBankRegistrationEntity;

@Repository
public interface ScfBankRegistrationRepository extends JpaRepository<ScfBankRegistrationEntity, Long> {
	
	
	Optional<ScfBankRegistrationEntity> findByMobileNo(String mobileNo);
	Optional<ScfBankRegistrationEntity> findByEmailId(String emailId);
}