package com.patil.atm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	private String customerId;
	@Column(length = 20)
	private String customerName;
	private String mobileNo;
	private String emailId;
	private String gender;
	private String dob;
	private String adharNo;
	private String panNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cardNo")
	private AtmCard atmCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="accountNo")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="ifscCode")
	private Bank bank;

}
