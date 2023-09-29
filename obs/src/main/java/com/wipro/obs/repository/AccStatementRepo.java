package com.wipro.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.AccountStatement;

@Repository
public interface AccStatementRepo extends JpaRepository<AccountStatement, String>{

}
