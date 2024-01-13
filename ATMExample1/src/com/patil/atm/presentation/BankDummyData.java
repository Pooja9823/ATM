package com.patil.atm.presentation;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.patil.atm.dao.MyConnection;
import com.patil.atm.entity.Account;
import com.patil.atm.entity.AtmCard;
import com.patil.atm.entity.Bank;
import com.patil.atm.entity.Customer;

public class BankDummyData {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		Customer customer4 = new Customer();
		Customer customer5 = new Customer();
		Customer customer6 = new Customer();
		Customer customer7 = new Customer();
		Customer customer8 = new Customer();
		Customer customer9 = new Customer();
		Customer customer10 = new Customer();
		
		AtmCard atmCard1 = new AtmCard();
		AtmCard atmCard2 = new AtmCard();
		AtmCard atmCard3 = new AtmCard();
		AtmCard atmCard4 = new AtmCard();
		AtmCard atmCard5 = new AtmCard();
		AtmCard atmCard6 = new AtmCard();
		AtmCard atmCard7 = new AtmCard();
		AtmCard atmCard8 = new AtmCard();
		AtmCard atmCard9 = new AtmCard();
		AtmCard atmCard10 = new AtmCard();
		
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		Account account4 = new Account();
		Account account5 = new Account();
	    Account account6 = new Account();
		Account account7 = new Account();
		Account account8 = new Account();
		Account account9 = new Account();
		Account account10 = new Account();
	
		account1.setAccountNo("21212884554");
		account1.setAccountType("Saving");
		account1.setAccountStatus("Active");
		account1.setAccountOpeningDate(LocalDate.now().toString());
		account1.setBalance(3000.0);
		account1.setCustomer(customer1);
		
		account2.setAccountNo("31312345564");
		account2.setAccountType("Saving");
		account2.setAccountStatus("Active");
		account2.setAccountOpeningDate(LocalDate.now().toString());
		account2.setBalance(4000.0);
		account2.setCustomer(customer2);
		
		account3.setAccountNo("45621254455");
		account3.setAccountType("Saving");
		account3.setAccountStatus("Active");
		account3.setAccountOpeningDate(LocalDate.now().toString());
		account3.setBalance(1000.0);
		account3.setCustomer(customer3);
		
		account4.setAccountNo("61213344564");
		account4.setAccountType("Saving");
		account4.setAccountStatus("Active");
		account4.setAccountOpeningDate(LocalDate.now().toString());
		account4.setBalance(5000.0);
		account4.setCustomer(customer4);
		
		account5.setAccountNo("41242444555");
		account5.setAccountType("Saving");
		account5.setAccountStatus("Active");
		account5.setAccountOpeningDate(LocalDate.now().toString());
		account5.setBalance(6000.0);
		account5.setCustomer(customer5);
		
		account6.setAccountNo("25612347654");
		account6.setAccountType("Saving");
		account6.setAccountStatus("Active");
		account6.setAccountOpeningDate(LocalDate.now().toString());
		account6.setBalance(8000.0);
		account6.setCustomer(customer6);
		
		account7.setAccountNo("28888344554");
		account7.setAccountType("Saving");
		account7.setAccountStatus("Active");
		account7.setAccountOpeningDate(LocalDate.now().toString());
		account7.setBalance(6000.0);
		account7.setCustomer(customer7);
		
		account8.setAccountNo("8245644554");
		account8.setAccountType("Saving");
		account8.setAccountStatus("Active");
		account8.setAccountOpeningDate(LocalDate.now().toString());
		account8.setBalance(2000.0);
		account8.setCustomer(customer8);
		
		account9.setAccountNo("21212344554");
		account9.setAccountType("Saving");
		account9.setAccountStatus("Active");
		account9.setAccountOpeningDate(LocalDate.now().toString());
		account9.setBalance(30000.0);
		account9.setCustomer(customer9);
		
		account10.setAccountNo("29934655422");
		account10.setAccountType("Saving");
		account10.setAccountStatus("Active");
		account10.setAccountOpeningDate(LocalDate.now().toString());
		account10.setBalance(30000.0);
		account10.setCustomer(customer10);
		
		
		customer1.setCustomerId("11111122222");
		customer1.setCustomerName("Kavya Chauhan");
		customer1.setMobileNo("9764833044");
		customer1.setEmailId("kavya@gmail.com");
		customer1.setGender("Female");
		customer1.setDob("1/5/1990");
		customer1.setAdharNo("4443127845327890");
		customer1.setPanNo("EEFPK4532J");
		customer1.setBank(bank1);
		customer1.setAtmCard(atmCard1);
		customer1.setAccount(account1);
		
		customer2.setCustomerId("22222233333");
		customer2.setCustomerName("Shama Rathod");
		customer2.setMobileNo("9164332054");
		customer2.setEmailId("shama@gmail.com");
		customer2.setGender("Female");
		customer2.setDob("12/5/1980");
		customer2.setAdharNo("5443127845327890");
		customer2.setPanNo("AAPFS4532");
		customer2.setBank(bank1);
		customer2.setAtmCard(atmCard2);
		customer2.setAccount(account2);
		
		customer3.setCustomerId("33333344444");
		customer3.setCustomerName("Komal Singh");
		customer3.setMobileNo("8764833044");
		customer3.setEmailId("komal@gmail.com");
		customer3.setGender("Female");
		customer3.setDob("10/15/1970");
		customer3.setAdharNo("6443127845327890");
		customer3.setPanNo("JEPFK4532");
		customer3.setBank(bank1);
		customer3.setAtmCard(atmCard3);
		customer3.setAccount(account3);
		
		customer4.setCustomerId("44444455555");
		customer4.setCustomerName("Sumbul Mane");
		customer4.setMobileNo("9864833044");
		customer4.setEmailId("sumbul@gmail.com");
		customer4.setGender("Female");
		customer4.setDob("21/5/1992");
		customer4.setAdharNo("4443127845327890");
		customer4.setPanNo("SEPFS4532");
		customer4.setBank(bank1);
		customer4.setAtmCard(atmCard4);
		customer4.setAccount(account4);
		
		customer5.setCustomerId("55555566666");
		customer5.setCustomerName("Mayuri Varkad");
		customer5.setMobileNo("9164833044");
		customer5.setEmailId("mayuri@gmail.com");
		customer5.setGender("Female");
		customer5.setDob("1/4/1960");
		customer5.setAdharNo("5553127845327890");
		customer5.setPanNo("EEJFM4532");
		customer5.setBank(bank1);
		customer5.setAtmCard(atmCard5);
		customer5.setAccount(account5);
		
		customer6.setCustomerId("66666677777");
		customer6.setCustomerName("Supriya Deshmukh");
		customer6.setMobileNo("6764833044");
		customer6.setEmailId("supriya@gmail.com");
		customer6.setGender("Female");
		customer6.setDob("16/6/1997");
		customer6.setAdharNo("4443127845327890");
		customer6.setPanNo("DEPFS4532");
		customer6.setBank(bank2);
		customer6.setAtmCard(atmCard6);
		customer6.setAccount(account6);
		
		customer7.setCustomerId("77777788888");
		customer7.setCustomerName("Gayatri Mishra");
		customer7.setMobileNo("7464833044");
		customer7.setEmailId("gayatri@gmail.com");
		customer7.setGender("Female");
		customer7.setDob("19/11/1999");
		customer7.setAdharNo("6763127845327890");
		customer7.setPanNo("JJPFG4532");
		customer7.setBank(bank2);
		customer7.setAtmCard(atmCard7);
		customer7.setAccount(account7);
		
		customer8.setCustomerId("88888899999");
		customer8.setCustomerName("Anisha Patil");
		customer8.setMobileNo("8464833044");
		customer8.setEmailId("anisha@gmail.com");
		customer8.setGender("Female");
		customer8.setDob("11/9/1980");
		customer8.setAdharNo("4663127845327890");
		customer8.setPanNo("EEKFA4532");
		customer8.setBank(bank2);
		customer8.setAtmCard(atmCard8);
		customer8.setAccount(account8);
		
		customer9.setCustomerId("99999900000");
		customer9.setCustomerName("Purva More");
		customer9.setMobileNo("9194833044");
		customer9.setEmailId("purva@gmail.com");
		customer9.setGender("Female");
		customer9.setDob("10/8/1997");
		customer9.setAdharNo("5143127845327890");
		customer9.setPanNo("KKPFP4532");
		customer9.setBank(bank2);
		customer9.setAtmCard(atmCard9);
		customer9.setAccount(account9);
		
		customer10.setCustomerId("22222211111");
		customer10.setCustomerName("Urvi Mote");
		customer10.setMobileNo("8764833044");
		customer10.setEmailId("urvi@gmail.com");
		customer10.setGender("Female");
		customer10.setDob("6/7/1986");
		customer10.setAdharNo("3213127845327890");
		customer10.setPanNo("REPFU4532");
		customer10.setBank(bank2);
		customer10.setAtmCard(atmCard10);
		customer10.setAccount(account10);
		
		atmCard1.setCardNo("1111111111456789");
		atmCard1.setCardPin("1434");
		atmCard1.setCardType("Visa");
		atmCard1.setCardStatus("Active");
		atmCard1.setIssueDate(LocalDate.now().toString());
		atmCard1.setExpireDate("2028-05-01");
		atmCard1.setCvv(133);
		atmCard1.setCustomer(customer1);
		
		atmCard2.setCardNo("2222222222456789");
		atmCard2.setCardPin("2434");
		atmCard2.setCardType("Visa");
		atmCard2.setCardStatus("Active");
		atmCard2.setIssueDate(LocalDate.now().toString());
		atmCard2.setExpireDate("2028-05-01");
		atmCard2.setCvv(233);
		atmCard2.setCustomer(customer2);
		
		atmCard3.setCardNo("3333333333456789");
		atmCard3.setCardPin("3434");
		atmCard3.setCardType("Visa");
		atmCard3.setCardStatus("Active");
		atmCard3.setIssueDate(LocalDate.now().toString());
		atmCard3.setExpireDate("2028-05-01");
		atmCard3.setCvv(333);
		atmCard3.setCustomer(customer3);
		
		atmCard4.setCardNo("4444444444456789");
		atmCard4.setCardPin("4434");
		atmCard4.setCardType("Visa");
		atmCard4.setCardStatus("Active");
		atmCard4.setIssueDate(LocalDate.now().toString());
		atmCard4.setExpireDate("2028-05-01");
		atmCard4.setCvv(433);
		atmCard4.setCustomer(customer4);
		
		atmCard5.setCardNo("5555555555456789");
		atmCard5.setCardPin("5434");
		atmCard5.setCardType("Visa");
		atmCard5.setCardStatus("Active");
		atmCard5.setIssueDate(LocalDate.now().toString());
		atmCard5.setExpireDate("2028-05-01");
		atmCard5.setCvv(533);
		atmCard5.setCustomer(customer5);
		
		atmCard6.setCardNo("6666666666456789");
		atmCard6.setCardPin("6434");
		atmCard6.setCardType("Visa");
		atmCard6.setCardStatus("Active");
		atmCard6.setIssueDate(LocalDate.now().toString());
		atmCard6.setExpireDate("2028-05-01");
		atmCard6.setCvv(633);
		atmCard6.setCustomer(customer6);
		
		atmCard7.setCardNo("7777777777456789");
		atmCard7.setCardPin("7434");
		atmCard7.setCardType("Visa");
		atmCard7.setCardStatus("Active");
		atmCard7.setIssueDate(LocalDate.now().toString());
		atmCard7.setExpireDate("2028-05-01");
		atmCard7.setCvv(733);
		atmCard7.setCustomer(customer7);
		
		atmCard8.setCardNo("8888888888456789");
		atmCard8.setCardPin("8434");
		atmCard8.setCardType("Visa");
		atmCard8.setCardStatus("Active");
		atmCard8.setIssueDate(LocalDate.now().toString());
		atmCard8.setExpireDate("2028-05-01");
		atmCard8.setCvv(833);
		atmCard8.setCustomer(customer8);
		
		atmCard9.setCardNo("9999999999456789");
		atmCard9.setCardPin("9434");
		atmCard9.setCardType("Visa");
		atmCard9.setCardStatus("Active");
		atmCard9.setIssueDate(LocalDate.now().toString());
		atmCard9.setExpireDate("2028-05-01");
		atmCard9.setCvv(933);
		atmCard9.setCustomer(customer9);
		
		atmCard10.setCardNo("1000000000456789");
		atmCard10.setCardPin("1034");
		atmCard10.setCardType("Visa");
		atmCard10.setCardStatus("Active");
		atmCard10.setIssueDate(LocalDate.now().toString());
		atmCard10.setExpireDate("2028-05-01");
		atmCard10.setCvv(103);
		atmCard10.setCustomer(customer10);
		
		List<Customer> List1 = List.of(customer1,customer2,customer3,customer4,customer5);
		List<Customer> List2 = List.of(customer6,customer7,customer8,customer9,customer10);
		
		bank1.setIfscCode("SBIN0007497");
		bank1.setBankName("State Bank Of India");
		bank1.setBranhCode("007497");
		bank1.setCustomer(List1);	
		
		bank2.setIfscCode("MAHB0007477");
		bank2.setBankName("Bank Of Maharashtra");
		bank2.setBranhCode("008897");
		bank2.setCustomer(List2);
		
		EntityManager entityManager = MyConnection.getEntityManagerObject();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		   entityManager.persist(bank1);
		   entityManager.persist(bank2);
		entityTransaction.commit();
		
		System.out.println("Dummy data created");
	}
}
