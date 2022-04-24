package com.bridgelabz.Account;

import java.util.Scanner;

class Account {
    private long accountBalance = 67489;

    public long debit(long debitAmount) {
        if(debitAmount <= accountBalance) {
            accountBalance -= debitAmount;
            System.out.println("Your account balance is " + accountBalance);
        } else {
            System.out.println("Debit ammount exceeds account balance");
        }
        return accountBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter the debit ammount: ");
        long debitAmount = sc.nextLong();

        account.debit(debitAmount);
    }
}