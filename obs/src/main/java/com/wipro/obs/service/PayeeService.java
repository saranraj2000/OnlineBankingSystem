package com.wipro.obs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.wipro.obs.entity.CustDetails;
import com.wipro.obs.repository.CustRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.obs.entity.PayeeDetails;
import com.wipro.obs.repository.PayeeRepo;

@Service
public class PayeeService {
	
	@Autowired
	PayeeRepo payeeRepo;

	@Autowired
	CustRepo custRepo;
	
	public void savepayee(PayeeDetails payeedetails, String custId) {
		// add logic
		Optional<CustDetails> _custdetails = custRepo.findById(custId);
		CustDetails custdetails = _custdetails.get();

		// Set the retrieved Custdetails object in the PayeeDetails object
		payeedetails.setCustdetails(custdetails);
		payeeRepo.save(payeedetails);
	}
	
	
	public List<PayeeDetails>getPayeeDetails(){
	List<PayeeDetails> users=new ArrayList<>();
	for(PayeeDetails user: payeeRepo.findAll()) {
		users.add(user);
	}
	return users;
}
	
	
	public void delete(int payeeid) {
		payeeRepo.deleteById(payeeid);
	}
	
	public void Approve(PayeeDetails payeedetails) {
		PayeeDetails update=payeeRepo.findById(payeedetails.getPayeeid()).get();
		update.setAccno(payeedetails.getAccno());
		update.setIfsc(payeedetails.getIfsc());
		update.setMobno(payeedetails.getMobno());
		update.setName(payeedetails.getName());
		update.setSetstatus("Approved");
		payeeRepo.save(update);
				
	}
	

	public PayeeDetails getById(int payeeid) {
		return payeeRepo.findById(payeeid).get();
	}
	
	
	public PayeeDetails getByaccno(String acc) {
		return payeeRepo.findByAccno(acc);
	}
	
	
}
	