package com.patil.atm.service;

import com.patil.atm.entity.Customer;

public interface CustomerService {
	
	Customer findCardNo(String cardNo);
	Boolean findCardPinNo(String cardNo,String cardPin);

}
