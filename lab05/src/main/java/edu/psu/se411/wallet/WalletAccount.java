package edu.psu.se411.wallet;

import edu.psu.se411.exceptions.InsufficientFundsException;

public class WalletAccount {

    private double balance;

    public WalletAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds. Current balance: " + balance
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}