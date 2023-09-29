package com.wipro.obs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.CustDetails;
import com.wipro.obs.entity.DepositAccount;
import com.wipro.obs.repository.DepositAccountRepo;

@Service
public class DepositAccountService {
	
	
	@Autowired
	DepositAccountRepo depositeRepo;
	
	public void savedeposite(DepositAccount depositeaccount) {
		depositeRepo.save(depositeaccount);
	}
	
	public List<DepositAccount>getDepositeAccount(){
		List<DepositAccount> users = new ArrayList<>();
		for(DepositAccount user : depositeRepo.findAll()) {
			users.add(user);
		}
		return users;
	}
	
	public void delete(String accno) {
		depositeRepo.deleteById(accno);
	}
	
public DepositAccount getbyid(String id){
		
		DepositAccount user= depositeRepo.findById(id).get();
		return user;
		
	}

}
