package com.SCF.SupplyChain.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCF.SupplyChain.Entity.UserSession;

@Repository
public interface UserSessionRepository extends JpaRepository<UserSession, Long> {
    Optional<UserSession> findByPhoneNo(String phoneNo);
    //List<UserSession> findBySessionId(@Param("sessionId") String sessionId);
    
    
    
    List<UserSession> findBySessionId(String sessionId);
}