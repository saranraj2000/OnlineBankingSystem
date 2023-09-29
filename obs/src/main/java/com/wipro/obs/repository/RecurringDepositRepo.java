package com.wipro.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.RecurringDeposit;

@Repository
public interface RecurringDepositRepo extends JpaRepository<RecurringDeposit, String> {

}
