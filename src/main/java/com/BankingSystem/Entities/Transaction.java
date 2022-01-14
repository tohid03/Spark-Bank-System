package com.BankingSystem.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "Transfers")
public class Transaction {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
       private int id;
       private double amount;
       private String sendBy;
       private String sendTo;
       @Temporal(TemporalType.TIMESTAMP)
       private Date sendOn;
       private String status;
     //Getters and Setters  
       
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double ammount) {
		this.amount = ammount;
	}
	public String getSendBy() {
		return sendBy;
	}
	public void setSendBy(String sendBy) {
		this.sendBy = sendBy;
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public Date getSendOn() {
		return sendOn;
	}
	public void setSendOn(Date sendOn) {
		this.sendOn = sendOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
       
       

       
    

       
       
}
