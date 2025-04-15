package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.OrgRoleEntity;
@Repository
public interface OrgRoleRepository extends JpaRepository<OrgRoleEntity, Integer> {
}
