package com.SCF.SupplyChain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfApplicationEntity;

@Repository
public interface ScfApplicationRepository extends JpaRepository<ScfApplicationEntity, Long> {
	List<ScfApplicationEntity> findByUserId(String userId);
}