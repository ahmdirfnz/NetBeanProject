/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template author(irfanz) file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;

public class BankAccount {
    
    private ArrayList<Account> accounts;
    private AccountHolder accountHolder;

    public BankAccount(AccountHolder accountholder, ArrayList<Account> accounts) {
       this.accountHolder = accountholder;
       this.accounts = accounts;
    }
    
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    
   
    

}
