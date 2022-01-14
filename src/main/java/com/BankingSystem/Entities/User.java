package com.BankingSystem.Entities;

import java.math.BigInteger;
import javax.persistence.*;



@Entity
@Table(name="Customer")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String userName;
	@Column(unique = true)
	private String email;
	private BigInteger phone;
	@Column(unique = true)
	private String accountNumber;
	private double Balance;
	
	
	
	public User() {
		super();
		
	}

	//Getter And Setters

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public User(int id, String userName, String email, BigInteger phone, String accountNumber, double balance) {
		super();
		Id = id;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.accountNumber = accountNumber;
		Balance = balance;
	}

	public void setBalance(double balance) {
		this.Balance = balance;
	}

	
	
	
	
	

	
	
}