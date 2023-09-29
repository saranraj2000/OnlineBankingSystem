package com.wipro.obs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccountSummary {
	@Id
	private String accno;
	private String acctype;
	private String currency;
	private String status;
	
	
	
	
	public AccountSummary() {
		
	}
	public AccountSummary(String accno, String acctype, String currency, String status) {
		
		this.accno = accno;
		this.acctype = acctype;
		this.currency = currency;
		this.status = status;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
