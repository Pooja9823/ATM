package com.patil.atm.presentation;

import java.util.Scanner;

import com.patil.atm.entity.Customer;
import com.patil.atm.exception.InvalidInputException;
import com.patil.atm.service.AtmCardService;
import com.patil.atm.service.AtmCardServiceImpl;
import com.patil.atm.service.CustomerService;
import com.patil.atm.service.CustomerServiceImpl;
import com.patil.atm.validation.Validation;

public class LoginApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();	
		AtmCardService atmCardService = new AtmCardServiceImpl();
		Scanner scanner = new Scanner(System.in);
		int pinCount = 0;
		Boolean flagCardNo = true;
		Boolean flagCardPin = true;
		while(flagCardNo){
				System.out.print("Enter Card Number: ");
				String cardNo = scanner.next();
				try {
					Validation.checkCardNoLength(cardNo);
					Validation.checkCardNoFormat(cardNo);
					Customer customer = customerService.findCardNo(cardNo);
					if(customer!=null) {
						flagCardNo = false;
						if(customer.getAtmCard().getCardStatus().equals("Blocked")) {
							System.out.println("Your card is blocked. Contact your main branch.");
							System.exit(0);
						} while(flagCardPin){
							    System.out.println();
								System.out.print("Enter Pin Number: ");
								String cardPin = scanner.next();
								System.out.println();
								try {
									Validation.checkCardPinLength(cardPin);
									Validation.checkCardPinFormat(cardPin);
									if(customerService.findCardPinNo(customer.getAtmCard().getCardNo(), cardPin)) {
										flagCardPin = false;
										new App().display(customer);
									}else {
										pinCount++;
										System.out.println("Wrong pin! try again");
										if(pinCount>=3){
											System.out.println("You have entered 3 times wrong pin number. Your card is blocked.");
											atmCardService.updateCardStatus(cardNo, "Blocked");
											System.exit(0);
										}
									}
								}catch(InvalidInputException e) {
									System.out.println(e.getMessage());
								}
							}
						
					}else {
						System.out.println("card number not found");
					}
				}catch(InvalidInputException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
				
		