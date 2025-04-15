package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.SupplyChainDetailsS5Entity;

@Repository
public interface SupplyChainDetailsS5Repository extends JpaRepository<SupplyChainDetailsS5Entity, Long> {

}
