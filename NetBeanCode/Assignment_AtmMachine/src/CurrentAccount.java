/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
author(irfanz)
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CurrentAccount implements Account {

    private String accountNumber;
    private String type = "Current";
    private double balance;
    private double minLimit = 0.00;
    AccountHolder accountHolder;

    public CurrentAccount(String accountNumber, double balance, AccountHolder accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double checkBalance() {
        return balance;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }
 
    public void withdraw(double amountWithDraw) throws BalanceNotSufficientException {
        
        if ((balance > amountWithDraw) && ((balance - amountWithDraw) > minLimit)) {
            
            balance = balance - amountWithDraw;
            System.out.println("Your current account balance : " + balance);
            
        } else {
            throw new BalanceNotSufficientException("Balance not sufficient for withdrawal\nYour current account balance : " + balance);
        }
    }

    public void deposit(double amountWithDeposit) {
        
        balance = balance + amountWithDeposit;
        System.out.println("Your current account balance : " + balance);
        
    }

}
