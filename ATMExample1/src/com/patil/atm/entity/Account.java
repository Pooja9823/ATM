package com.patil.atm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Account {
	
	@Id
	@Column(length=11)
	private String accountNo;
	private String accountType;
	private String accountStatus;
	private String accountOpeningDate;
	private Double balance;
	
	@OneToOne(mappedBy = "account",cascade = CascadeType.ALL)
	private Customer customer;

}