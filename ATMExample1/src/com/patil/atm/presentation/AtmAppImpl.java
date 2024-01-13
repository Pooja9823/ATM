package com.patil.atm.presentation;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.patil.atm.entity.Customer;
import com.patil.atm.entity.Transaction;
import com.patil.atm.exception.InvalidInputException;
import com.patil.atm.service.AtmCardService;
import com.patil.atm.service.AtmCardServiceImpl;
import com.patil.atm.validation.Validation;

public class AtmAppImpl implements AtmApp {
	
	Scanner scanner = new Scanner(System.in);
	AtmCardService atmCardService = new AtmCardServiceImpl();
	

	@Override
	public void deposit(Customer customer) {
		try 
		{
			System.out.print("Enter amount to deposite: ");
			Double depositAmount = scanner.nextDouble();
			System.out.println(atmCardService.deposit(customer, depositAmount));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
			new App().display(customer);
		}	
	}
	

	@Override
	public void withdraw(Customer customer) {
		try
		{
			System.out.print("Enter amount to withdraw: ");
			Double withdrawAmount = scanner.nextDouble();
			System.out.println(atmCardService.withdraw(customer, withdrawAmount));	
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
			new App().display(customer);
		}			
	}
			
		

	@Override
	public void showBalance(Customer customer) {
		System.out.println("Available Balance: " +atmCardService.showBalance(customer));	
	}
	

	@Override
	public void changeCardPin(Customer customer) {
		try
		{
			System.out.println("Enter the new pin: ");
			String pinNo = scanner.next();
			Validation.checkCardPinLength(pinNo);
			Validation.checkCardPinFormat(pinNo);
			System.out.println(atmCardService.changeCardPin(customer, pinNo));
		}
		catch(InvalidInputException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	
	@Override
	public void miniStatement(Customer customer)
	{
		List<Transaction> list = atmCardService.miniStatement(customer);
		if(list.size()==0) {
			System.out.println("Empty");
		}else {
			Iterator<Transaction> itr = list.iterator();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("                                 Mini Statement                                        ");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Transaction Id   Amount        Type        Date            Time         Account No");
			
			while(itr.hasNext()) 
			{
				Transaction transaction = itr.next();
				
				System.out.println(
				transaction.getTransactionId()+ "               "+transaction.getAmount()+"        "+transaction.getTransactionType()+"      "
				+transaction.getTransactionDate()+"       "+transaction.getTransactionTime()+"       "+transaction.getAccountNo());
				System.out.println();
			}
			System.out.println("Available Balance is: "+customer.getAccount().getBalance());	
		}	
	}
	
	

	@Override
	public void updateCardStatus(String cardNo, String cardStatus) {
		atmCardService.updateCardStatus(cardNo, cardStatus);	
	}
}
