package com.wipro.obs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.AccountSummary;

@Repository
public interface AccSummaryRepo extends JpaRepository<AccountSummary, String> {
	
	List<AccountSummary> findByAccno(String accno);
	

}
