package com.patil.atm.service;

import java.util.List;

import com.patil.atm.entity.Customer;
import com.patil.atm.entity.Transaction;

public interface AtmCardService {
	
	String deposit(Customer customer, Double depositAmount);
	String withdraw(Customer customer, Double withdrawAmount);
	Double showBalance(Customer customer);
	String changeCardPin(Customer customer,String cardPin);
	List<Transaction> miniStatement(Customer customer);
	void updateCardStatus(String cardNo, String cardStatus);
	

}
