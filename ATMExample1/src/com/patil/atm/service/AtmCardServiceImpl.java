package com.patil.atm.service;

import java.time.LocalDate;
import java.util.List;

import com.patil.atm.dao.AtmCardDao;
import com.patil.atm.dao.AtmCardDaoImpl;
import com.patil.atm.entity.Customer;
import com.patil.atm.entity.Transaction;

public class AtmCardServiceImpl implements AtmCardService {
	
	AtmCardDao atmCardDao = new AtmCardDaoImpl();

	@Override
	public String deposit(Customer customer, Double depositAmount) {
		Integer count = atmCardDao.checkTransactionCount(customer.getAccount().getAccountNo(), "cr", LocalDate.now());
		if(count>=3) {
			return "Number of transactions per day has exceeded";
		}
		else if(depositAmount>10000)
		{
			return "Amount should be less than 10000 Rs";
		}
		else if(depositAmount<100)
		{
			return "Amount should be greater than 100 Rs";
		}
		else if(depositAmount%100 ==0 || depositAmount%200 == 0 || depositAmount%500==0)
		{
			atmCardDao.deposit(customer, depositAmount);
			return "Amount deposited successfully";
		}else{
			return "Amount should be multiple of 100 Rs or 200 Rs or 500 Rs";
		}
	}
	
	
	@Override
	public String withdraw(Customer customer, Double withdrawAmount) {
		Integer count = atmCardDao.checkTransactionCount(customer.getAccount().getAccountNo(), "dr", LocalDate.now());
		if(count>=3) {
			return "Number of transactions per day has exceeded";
		}
		else if(withdrawAmount>10000) 
		{
			return "Amount must be less than 10000 Rs";
		}
		else if(withdrawAmount<100)
		{
			return "Amount must be greater than 100 Rs";
		}
		else if(withdrawAmount>0 && withdrawAmount<(customer.getAccount().getBalance()))
		{
			if(withdrawAmount%100==0 || withdrawAmount%200==0 || withdrawAmount%500==0) 
			{
				 atmCardDao.withdraw(customer, withdrawAmount);
				 return "Amount withdrawn successfully. Collect your money";	
			}else
			{
				return "Amount should be multiple of 100 Rs or 200 Rs or 500 Rs";
			}
		}
		else
		{
			return "Insufficient balance";
		}	
	}
		
	
	@Override
	public Double showBalance(Customer customer) {
		return atmCardDao.showBalance(customer);
	}

	
	@Override
	public String changeCardPin(Customer customer, String cardPin) {
		if(cardPin.equals(customer.getAtmCard().getCardPin())) 
		{
			return "New pin matching with old pin. Please enter different pin.";
		}
		else
		{
			atmCardDao.changeCardPin(customer, cardPin);
			return "Pin Changed Successfully";
		}	
	}

	
	@Override
	public List<Transaction> miniStatement(Customer customer) {
		return atmCardDao.miniStatement(customer);
	}


	@Override
	public void updateCardStatus(String cardNo, String cardStatus) {
		atmCardDao.updateCardStatus(cardNo, cardStatus);
		
	}

	
}
