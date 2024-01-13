package com.patil.atm.dao;

import com.patil.atm.entity.Customer;

public interface CustomerDao {
	
	Customer findCardNo(String cardNo);
	Boolean findCardPinNo(String cardNo,String cardPin);

}
