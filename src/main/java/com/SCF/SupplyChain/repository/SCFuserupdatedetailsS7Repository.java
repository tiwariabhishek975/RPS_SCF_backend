package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;
@Repository
public interface SCFuserupdatedetailsS7Repository extends JpaRepository<SCFuserupdatedetailsS7Entity, Long> {
    Optional<SCFuserupdatedetailsS7Entity> findByPhoneNo(String phoneNo);
    Optional<SCFuserupdatedetailsS7Entity> findByEmailId(String emailId);
    Optional<SCFuserupdatedetailsS7Entity> findByInvoiceNumber(String invoiceNumber);
    
    //List<SCFuserupdatedetailsS7Entity> findByPhoneNo(String phoneNo);
}