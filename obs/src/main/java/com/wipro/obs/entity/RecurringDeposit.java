package com.wipro.obs.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RecurringDeposit {
	
	@Id
	@Column(nullable=false,unique=true)
	private String accno;
	private String name;
	private String branch;
	private String ifsc;
	private String instalmentamount;
	private String tenure;
	private String modeofoperation;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private String maturitydate;
	
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getInstalmentamount() {
		return instalmentamount;
	}
	public void setInstalmentamount(String instalmentamount) {
		this.instalmentamount = instalmentamount;
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
	public String getMaturitydate() {
		return maturitydate;
	}
	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}
	public RecurringDeposit(String accno, String name, String branch, String ifsc, String instalmentamount,
			String tenure, String modeofoperation, String maturitydate) {
		this.accno = accno;
		this.name = name;
		this.branch = branch;
		this.ifsc = ifsc;
		this.instalmentamount = instalmentamount;
		this.tenure = tenure;
		this.modeofoperation = modeofoperation;
		this.maturitydate = maturitydate;
	}
	public RecurringDeposit() {
	
	}
	
	
	
	
	
	
	

}
