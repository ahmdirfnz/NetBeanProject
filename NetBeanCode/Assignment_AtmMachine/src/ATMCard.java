/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file author(irfanz), choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ATMCard {
    
    private String atmNumber;
    private String pinNumber;
    private BankAccount bankAccount;

    public ATMCard(String atmNumber, String pinNumber, BankAccount bankAccount) {
        this.atmNumber = atmNumber;
        this.pinNumber = pinNumber;
        this.bankAccount = bankAccount;
    }
    
    public String getAtmNumber() {
        return atmNumber;
    }
    
    public String getPinNumber() {
        return pinNumber;
    }
    
    public BankAccount getBankAccount() {
        return bankAccount;
    }
    
}
