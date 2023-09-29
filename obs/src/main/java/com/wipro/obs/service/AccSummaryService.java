package com.wipro.obs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.AccountSummary;
import com.wipro.obs.entity.CustDetails;
import com.wipro.obs.repository.AccSummaryRepo;

@Service
public class AccSummaryService {
	
	@Autowired
	AccSummaryRepo summaryrepo;
	
	public List<AccountSummary>getAccountsummaries(){
		List<AccountSummary> users=new ArrayList<>();
		for(AccountSummary user : summaryrepo.findAll()) {
			users.add(user);
		}
		
		return users;
		
	}
	
	public List<AccountSummary>getAccountsummariesbyaccno(String accno){
		List<AccountSummary> users=new ArrayList<>();
		for(AccountSummary user : summaryrepo.findByAccno(accno)) {
			users.add(user);
		}
		
		return users;
		
	}
		
	

}
