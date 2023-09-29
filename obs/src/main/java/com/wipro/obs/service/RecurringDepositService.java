package com.wipro.obs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.RecurringDeposit;
import com.wipro.obs.repository.RecurringDepositRepo;

@Service
public class RecurringDepositService {
	
	
	@Autowired
	RecurringDepositRepo recurringDepositeRepo;
	
	public void saverecurring(RecurringDeposit recurringdeposite) {
		recurringDepositeRepo.save(recurringdeposite);
	}
	
	public List<RecurringDeposit>getRecurringAccount(){
		List<RecurringDeposit> users = new ArrayList<>();
		for(RecurringDeposit user: recurringDepositeRepo.findAll()) {
			users.add(user);
		}
		return users;

		
	}
	
	public void delete(String accno) {
		recurringDepositeRepo.deleteById(accno);


}
}
