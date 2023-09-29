package com.wipro.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.DepositAccount;

@Repository
public interface DepositAccountRepo extends JpaRepository<DepositAccount, String> {

}
