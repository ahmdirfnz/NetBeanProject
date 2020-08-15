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
public interface Account {
    
    public double checkBalance();
    
    public void withdraw(double newWithDraw) throws BalanceNotSufficientException;
    
    public void deposit(double newDeposit);
    
}
