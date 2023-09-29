package com.wipro.obs.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class AccountStatement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.DATE)
    LocalDate date;
	private String description;
	private Long amountSent;
	private Long balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAmountSent() {
		return amountSent;
	}
	public void setAmountSent(Long amountSent) {
		this.amountSent = amountSent;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public AccountStatement(LocalDate date, String description, Long amountSent, Long balance) {
		this.date = date;
		this.description = description;
		this.amountSent = amountSent;
		this.balance = balance;
	}
	public AccountStatement() {
	}
	
	
		
	
	
}