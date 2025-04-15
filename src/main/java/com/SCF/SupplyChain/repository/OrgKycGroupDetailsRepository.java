package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.OrgKycGroupDetailsEntity;
@Repository
public interface OrgKycGroupDetailsRepository extends JpaRepository<OrgKycGroupDetailsEntity, Integer> {
}
