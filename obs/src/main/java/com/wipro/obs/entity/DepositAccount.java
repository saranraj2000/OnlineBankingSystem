package com.wipro.obs.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DepositAccount {
	
	@Id
	@Column(nullable=false,unique=true)
	private String accno;
	private String branch;
	private String ifsc;
	private String depositeamount;
	private String tenure;
	private String modeofoperation;
	private String rateofinterest;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	
	private String maturitydate;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getDepositeamount() {
		return depositeamount;
	}
	public void setDepositeamount(String depositeamount) {
		this.depositeamount = depositeamount;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getModeofoperation() {
		return modeofoperation;
	}
	public void setModeofoperation(String modeofoperation) {
		this.modeofoperation = modeofoperation;
	}
	public String getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(String rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	public String getMaturitydate() {
		return maturitydate;
	}
	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}
	public DepositAccount(String accno, String branch, String ifsc, String depositeamount, String tenure,
			String modeofoperation, String rateofinterest, String maturitydate) {
		this.accno = accno;
		this.branch = branch;
		this.ifsc = ifsc;
		this.depositeamount = depositeamount;
		this.tenure = tenure;
		this.modeofoperation = modeofoperation;
		this.rateofinterest = rateofinterest;
		this.maturitydate = maturitydate;
	}
	public DepositAccount() {
	}
	
	
	
	
	
	
	}
