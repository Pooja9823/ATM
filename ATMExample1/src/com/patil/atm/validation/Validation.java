package com.patil.atm.validation;

import com.patil.atm.exception.InvalidInputException;

public class Validation {
	
	public static Boolean checkCardNoLength(String cardNo) throws InvalidInputException {
		if(cardNo.length()==16)
			return true;
		else
			throw new InvalidInputException("Card number must be 16 digits");
	}
	
	
	public static Boolean checkCardPinLength(String cardPin) throws InvalidInputException {
		if(cardPin.length()==4)
			return true;
		else
			throw new InvalidInputException("Pin no must be 4 digits");
	}
	
	
	public static Boolean checkCardNoFormat(String cardNo) throws InvalidInputException{
		String cardRejex="[0-9]+";
		if(cardNo.matches(cardRejex))
			return true;
		else
			throw new InvalidInputException("Card number must be digits only");
	}
	
	
	public static Boolean checkCardPinFormat(String cardPin) throws InvalidInputException{
		String cardRejex="[0-9]+";
		if(cardPin.matches(cardRejex))
			return true;
		else
			throw new InvalidInputException("Card pin must be digits only");
	}
	
	

}
