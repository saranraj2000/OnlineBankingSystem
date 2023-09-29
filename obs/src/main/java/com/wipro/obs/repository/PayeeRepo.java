package com.wipro.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.PayeeDetails;


@Repository
public interface PayeeRepo extends JpaRepository<PayeeDetails, Integer> {
	

	public PayeeDetails findByAccno(String accno);
}
