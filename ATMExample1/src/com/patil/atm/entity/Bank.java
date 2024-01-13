package com.patil.atm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Bank {
	
	@Id
	@Column(length=11)
	private String ifscCode;
	private String bankName;
	private String branhCode;
	
	@OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
	private List<Customer> customer;
}
