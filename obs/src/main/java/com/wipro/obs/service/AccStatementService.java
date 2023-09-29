package com.wipro.obs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.AccountStatement;
import com.wipro.obs.entity.AccountSummary;
import com.wipro.obs.repository.AccStatementRepo;
import com.wipro.obs.repository.AccSummaryRepo;

@Service
public class AccStatementService {
	
	@Autowired
	AccStatementRepo statementrepo;
	
	public List<AccountStatement>geAccountstatements(){
		List<AccountStatement> users =new ArrayList<>();
		for(AccountStatement user : statementrepo.findAll()) {
			users.add(user);
		}
		return users;
		
	}
	
	public List<AccountStatement>getAccountstatementbyaccno(String accno){
		List<AccountStatement> users=new ArrayList<>();
		for(AccountStatement user : statementrepo.findAll()) {
			users.add(user);
		}
		return users;
	}
			
	
	

	
	

}
