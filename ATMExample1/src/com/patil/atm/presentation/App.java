package com.patil.atm.presentation;

import java.util.Scanner;

import com.patil.atm.entity.Customer;

public class App {
	 
	public void display(Customer customer) {
		
		 Scanner scanner = new Scanner(System.in); 
		 AtmApp atmApp = new AtmAppImpl();
		 Integer choice = null;
		 
		 System.out.println();
		 System.out.println("Name: "+customer.getCustomerName()+ "       "+
		                     "Account Number: " +customer.getAccount().getAccountNo());
		 System.out.println();
		 
		 do
		 {
			 System.out.println("*****************************************************");
			 System.out.println("            Welcome to ATM System                    ");
			 System.out.println("*****************************************************");
	         System.out.println("Choose 1 for Deposit");
	         System.out.println("Choose 2 for Withdraw");
	         System.out.println("Choose 3 for Check Balance");
	         System.out.println("Choose 4 for Mini Statement");
	         System.out.println("Choose 5 for Change Pin");
	         System.out.println("Choose 6 for EXIT");
	         
	         System.out.print("Choose the operation you want to perform:");
	         
	       //get choice from user
	         choice = scanner.nextInt();
	         System.out.println();
	         
	         switch(choice)
	         {
	         case 1:
	        	 atmApp.deposit(customer);
	        	 break;
	         case 2:
	        	 atmApp.withdraw(customer);
	        	 break;
	         case 3:
	        	 atmApp.showBalance(customer);
	        	 break;
	         case 4:
	        	 atmApp.miniStatement(customer);
	        	 break;
	         case 5:
	        	 atmApp.changeCardPin(customer);
	        	 break;
	         case 6:
	        	 System.exit(0);
	         default:
	        	 System.out.println("Please enter valid choice");
	        	 System.out.println();
	        	 
	         }
		 }while(choice!=6);
		 scanner.close();
	}
}
	