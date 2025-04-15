package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfUserdetailsEntity;
@Repository
public interface ScfUserdetailsRepository extends JpaRepository<ScfUserdetailsEntity, Long> {
	
	Optional<ScfUserdetailsEntity> findByPhoneNumber(String phoneNo);
	Optional<ScfUserdetailsEntity> findByEmailAddress(String emailId);
}