package com.wipro.obs.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="custdet")
public class CustDetails {
	@Id
	private String custid;
	@Column(nullable=false,unique=true)
	private String accno;
	private String custname;
	private String mobileno;
	private String address;
	private String password;
	private int balance;
	
	@OneToMany(cascade = CascadeType.ALL)
    private List<PayeeDetails> ob;
	
	
	
	
	public CustDetails(String custid, String accno, String custname, String mobileno, String address, String password,
			int balance, List<PayeeDetails> ob) {
		super();
		this.custid = custid;
		this.accno = accno;
		this.custname = custname;
		this.mobileno = mobileno;
		this.address = address;
		this.password = password;
		this.balance = balance;
		this.ob = ob;
	}
	public List<PayeeDetails> getOb() {
		return ob;
	}
	public void setOb(List<PayeeDetails> ob) {
		this.ob = ob;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustDetails(String custid, String accno, String custname, String mobileno, String address, String password,int balance) {
		this.custid = custid;
		this.accno = accno;
		this.custname = custname;
		this.mobileno = mobileno;
		this.address = address;
		this.password = password;
		this.balance = balance;
	}
	public CustDetails() {
	
	}

		
@Override
	public String toString() {
		return "Custdetails [custid=" + custid + ", password=" + password + "]";
	}
	
	
	
}	