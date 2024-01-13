package com.patil.atm.presentation;

import com.patil.atm.entity.Customer;

public interface AtmApp {
	void deposit(Customer customer);
	void withdraw(Customer customer);
	void showBalance(Customer customer);
	void changeCardPin(Customer customer);
	void miniStatement(Customer customer);
	void updateCardStatus(String cardNo,String cardStatus);

}
