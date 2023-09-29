package com.wipro.obs.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.AccountStatement;
import com.wipro.obs.entity.AccountSummary;
import com.wipro.obs.entity.CustDetails;
import com.wipro.obs.repository.AccStatementRepo;
import com.wipro.obs.repository.AccSummaryRepo;
import com.wipro.obs.repository.CustRepo;

@Service
public class CustService {
	
	@Autowired
	CustRepo custRepo;
	
	@Autowired
	AccStatementRepo accStatementRepo;
	
	@Autowired
	AccSummaryRepo accSummaryRepo;
	
	public void savecust(CustDetails Custdetails) {
		custRepo.save(Custdetails);
		
	}

	public boolean transfers(String uId,String accNo, int amount) {
		Optional<CustDetails> opt = custRepo.findById(uId);
		CustDetails cust = opt.get();
		int bal = cust.getBalance();
		int fin = bal - amount;
		
		//balance and amount sent
		Long balance = (long) fin;
		Long sent = (long) amount;
		
		cust.setBalance(fin);
		custRepo.save(cust);
		//code for adding acc transaction to the account Statement
		AccountStatement accountStatement = new AccountStatement(LocalDate.now(),"PAYMENT COMPLETED",sent,balance);
		accStatementRepo.save(accountStatement);
		return true;
	}
	
		
    public CustDetails getbyid(String id){
		
		CustDetails user= custRepo.findById(id).get();
		return user;
		
	}
    
    
    public void deduct(String uId,String accNo, int amount) {
		Optional<CustDetails> opt = custRepo.findById(uId);
		CustDetails cust = opt.get();
		int bal = cust.getBalance();
		int fin = bal + amount;
		
		//balance and amount sent
		Long balance = (long) fin;
		Long sent = (long) amount;
		
		cust.setBalance(fin);
		custRepo.save(cust);
		//code for adding acc transaction to the account Statement
		AccountStatement accountStatement = new AccountStatement(LocalDate.now(),"PAYMENT COMPLETED",sent,balance);
		accStatementRepo.save(accountStatement);
	}


}
