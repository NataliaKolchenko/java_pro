package org.example;

public class Main {

    public static void main(String[] args) {

//        create new back account

        BankAccount account1 = new BankAccount(new User("Peter", "Müller", new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3)), 500);
//        show first name of the balance
        System.out.println(account1.getOwner().getFirstName());

//        show full name of the balance
        System.out.println(account1.getOwner().getFullName());

//        show full info of the balance
        System.out.println( account1.getOwner().getFullInfo());

//        show balance
        System.out.println(account1.printBalance());

//        add interest to balance + show balance
        account1.addInterest();
        System.out.println(account1.printBalance());

//        deposit money to the balance + show balance
        account1.deposit(10);
        System.out.println(account1.printBalance());

//        withdraw money from the balance + show balance
        account1.withdraw(391.01);
        System.out.println(account1.printBalance());

//        change full name and show new one
        account1.getOwner().updateFullName("Say", "Yes");
        System.out.println("update " + account1.getOwner().getFullName());

//        change user address and show only address
        account1.getOwner().getUserAddress().updateFullAddress("Spain", 100435, "Barcelona", "New Street", 34);
        System.out.println(account1.getOwner().getUserAddress().getFullAddress());


    }
}
