package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.UserRoleEntity;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Integer> {
}
