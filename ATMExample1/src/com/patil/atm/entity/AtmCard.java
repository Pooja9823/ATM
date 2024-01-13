package com.patil.atm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AtmCard {
	@Id
	@Column(length= 16)
	private String cardNo;
	@Column(length=4)
	private String cardPin;
	private String cardType;
	private String cardStatus;
	private String issueDate;
	private String expireDate;
	@Column(length=3)
	private Integer cvv;
	
	@OneToOne(mappedBy="atmCard",cascade = CascadeType.ALL)
	private Customer customer;

}
