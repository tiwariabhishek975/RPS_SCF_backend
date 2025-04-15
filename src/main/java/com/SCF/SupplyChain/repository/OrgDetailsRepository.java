package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.OrgDetailsEntity;

@Repository
public interface OrgDetailsRepository extends JpaRepository<OrgDetailsEntity, Integer> {
}