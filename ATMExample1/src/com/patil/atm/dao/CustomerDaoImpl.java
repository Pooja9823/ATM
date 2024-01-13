package com.patil.atm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.patil.atm.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	EntityManager entityManager = MyConnection.getEntityManagerObject();


	@Override
	public Customer findCardNo(String cardNo) {
		
		Customer customer = null;
		String jpql = "select c from Customer c where c.atmCard.cardNo=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, cardNo);
		List<Customer> list = query.getResultList();
		if(!list.isEmpty()) {
			customer = list.get(0);
		}
		return customer;
	}

	@Override
	public Boolean findCardPinNo(String cardNo,String cardPin) {
		
		String jpql = "select c from Customer c where c.atmCard.cardNo=?1 and c.atmCard.cardPin=?2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, cardNo);
		query.setParameter(2, cardPin);
		List<Customer> list = query.getResultList();
		if(!list.isEmpty()) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
