package com.SCF.SupplyChain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.ScfSupplierSelectedbankOfferEntity;

@Repository
public interface ScfSupplierSelectedbankOfferRepository extends JpaRepository<ScfSupplierSelectedbankOfferEntity, Long> {
    Optional<ScfSupplierSelectedbankOfferEntity> findByOffer_Id(Long offerId);
    //List<ScfSupplierSelectedbankOfferEntity> findByOffer_Id(Long offerId);
}
