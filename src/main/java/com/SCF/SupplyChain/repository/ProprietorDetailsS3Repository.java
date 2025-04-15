package com.SCF.SupplyChain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ProprietorDetailsS3Entity;

@Repository
public interface ProprietorDetailsS3Repository extends JpaRepository<ProprietorDetailsS3Entity, Long> {

}
