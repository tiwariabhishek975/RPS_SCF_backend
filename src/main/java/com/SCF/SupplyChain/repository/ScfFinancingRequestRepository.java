package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfFinancingRequestEntity;
@Repository
public interface ScfFinancingRequestRepository extends JpaRepository<ScfFinancingRequestEntity, Long> {
}