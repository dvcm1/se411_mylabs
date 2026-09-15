package edu.psu.se411;

import edu.psu.se411.exceptions.InsufficientFundsException;
import edu.psu.se411.exceptions.InvalidAgeException;
import edu.psu.se411.wallet.WalletAccount;

public class EX1 {
	 public static void validateAge(int age) throws InvalidAgeException {

	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age: You must be 18 or older.");
	        }

	        System.out.println("Age valid.");
	    }

	    public static void main(String[] args) {

	        try {
	            validateAge(20);
	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	        WalletAccount wallet = new WalletAccount(500.0);

	        try {
	            wallet.withdraw(200.0);
	        } catch (InsufficientFundsException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
