package com.patil.atm.service;

import com.patil.atm.dao.CustomerDao;
import com.patil.atm.dao.CustomerDaoImpl;
import com.patil.atm.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public Customer findCardNo(String cardNo) {
	
		return customerDao.findCardNo(cardNo);
	}

	@Override
	public Boolean findCardPinNo(String cardNo, String cardPin) {
		
		return customerDao.findCardPinNo(cardNo,cardPin);
	}

}
