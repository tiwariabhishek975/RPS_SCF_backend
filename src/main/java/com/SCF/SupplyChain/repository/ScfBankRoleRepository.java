package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfBankRoleEntity;

@Repository
public interface ScfBankRoleRepository extends JpaRepository<ScfBankRoleEntity, Integer> {
}