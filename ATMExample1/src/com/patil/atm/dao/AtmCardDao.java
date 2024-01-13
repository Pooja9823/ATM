package com.patil.atm.dao;

import java.time.LocalDate;
import java.util.List;

import com.patil.atm.entity.Customer;
import com.patil.atm.entity.Transaction;

public interface AtmCardDao {
	
	void deposit(Customer customer, Double depositAmount);
	void withdraw(Customer customer, Double withdrawAmount);
	Double showBalance(Customer customer);
	void changeCardPin(Customer customer,String cardPin);
	List<Transaction> miniStatement(Customer customer);
	void updateCardStatus(String cardNo, String cardStatus);
	Integer checkTransactionCount(String AccountNo,String transactionType,LocalDate transactionDate);

}
