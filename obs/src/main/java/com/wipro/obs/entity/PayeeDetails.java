package com.wipro.obs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class PayeeDetails {
	
	@Id
	private int payeeid;
	@Column(nullable=false,unique=true)
	private String accno;
    private String name;
	private String ifsc;
	private String mobno;
	private String setstatus;
	public int getPayeeid() {
		return payeeid;
	}
	public void setPayeeid(int payeeid) {
		this.payeeid = payeeid;
	}
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
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getSetstatus() {
		return setstatus;
	}
	public void setSetstatus(String setstatus) {
		this.setstatus = setstatus;
	}

		
	public PayeeDetails(int payeeid, String accno, String name, String ifsc, String mobno, String setstatus,
			CustDetails custdetails) {
		this.payeeid = payeeid;
		this.accno = accno;
		this.name = name;
		this.ifsc = ifsc;
		this.mobno = mobno;
		this.setstatus = setstatus;

	}
	public PayeeDetails() {
	}


	@ManyToOne
    @JoinColumn(name = "cust_id")
    private CustDetails custdetails;


	public void setCustdetails(CustDetails custdetails) {
		this.custdetails = custdetails;
	}
	public CustDetails getCustdetails() {
		return custdetails;
	}
	
	
}
