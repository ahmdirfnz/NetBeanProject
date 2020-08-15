/*
 * To change this license header, choose License Headers in Project Properties.
author(irfanz)
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BalanceNotSufficientException extends Exception {
    
    public BalanceNotSufficientException() {
        super();
    }
    
    public BalanceNotSufficientException(String message) {
        super(message);
    } 
}
