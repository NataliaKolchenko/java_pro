//https://github.com/iksergey/be-java/blob/master/src/seminar02_20240527/code/bankAccountExample/exerciseBankAccount.md
//BankAccount

package org.example;

import static org.example.Constants.*;

public class BankAccount {
    private User owner;
    private double balance;

    public BankAccount(User owner, double balance) {

        if (balance < MIN_BALANCE_VALUE) {
           throw new RuntimeException("We cant' create account");
        } else {
            this.balance = balance;
            this.owner = owner;
        }
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public String printBalance() {
        return BALANCE_OF_ACCOUNT + owner.getFullName() + this.balance;
    }


    public void deposit (double amount) {
        if (amount > MIN_BALANCE_VALUE) {
            this.balance += amount;
        } else {
            throw new RuntimeException("Amount has to more than zero");
//            System.out.println("EXP: Add positive number");
        }
    }

    public void withdraw (double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
//            System.out.println("EXP: Insufficient funds");
            throw new RuntimeException("EXP: Insufficient funds");
        }
    }


    public void addInterest () {
        double rate = BANK_RATE;
        this.balance =this.balance * rate + this.balance;
    }

}