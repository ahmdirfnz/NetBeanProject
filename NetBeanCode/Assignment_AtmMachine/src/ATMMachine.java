/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, author(irfanz) choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
import java.util.*;

public class ATMMachine {

    static Scanner c = new Scanner(System.in);

    public static void main(String[] args) {

        AccountHolder userAccountHolder = new AccountHolder("Ilham Bin Yusof", "771004-14-2345", "Jasin,Melaka", "0123456765");
        ArrayList<Account> userAccounts = new ArrayList<>();
        userAccounts.add(new SavingAccount("8223179", 10000.00, userAccountHolder));
        userAccounts.add(new SavingAccount("4388625", 20000.00, userAccountHolder));
        userAccounts.add(new CurrentAccount("7505295", 30000.00, userAccountHolder));
        BankAccount userBankAccount = new BankAccount(userAccountHolder, userAccounts);
        ATMCard userAtmCard = new ATMCard("70012345678", "12345", userBankAccount);
        BankAccounts userBankAccounts = new BankAccounts();
        userBankAccounts.addATMCard(userAtmCard);

        System.out.println("**Welcome To UteM Auto Teller Machine**");
        System.out.print("Enter ATM Card Number : ");
        String cardNum = c.next();
        System.out.print("Enter PIN Number : ");
        String pinNum = c.next();

        ATMCard atmCard = userBankAccounts.checkATMCard(cardNum, pinNum);

        if (atmCard == null) {
            System.out.println("Either atm card number or pin number is invalid");
            System.exit(0);
        }

        int transaction;

        System.out.println("===============================================");
        System.out.println("Welcome " + atmCard.getBankAccount().getAccountHolder().getName());
        System.out.println("===============================================");
        do {
        System.out.println("Please choose bank account for transaction.");
        
        ArrayList<Account> accounts = atmCard.getBankAccount().getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account instanceof SavingAccount) {
                SavingAccount savingAccount = (SavingAccount) account;
                System.out.printf("[%d] %s\t%s  %.1f\n", i + 1, savingAccount.getAccountNumber(), savingAccount.getType(), savingAccount.checkBalance());
            }
            if (account instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) account;
                System.out.printf("[%d] %s\t%s %.1f\n", i + 1, currentAccount.getAccountNumber(), currentAccount.getType(), currentAccount.checkBalance());
            }
        }
        
        System.out.print("Select account : ");
        int account = c.nextInt();

        do {
            Account selectedAccount = accounts.get(account - 1);

            System.out.println("==========================================");
            System.out.println("Please choose transaction.");
            System.out.println("[1] Check Balance");
            System.out.println("[2] WithDraw");
            System.out.println("[3] Deposit");
            System.out.println("[4] Change Account");
            System.out.println("[5]Personal Details");
            System.out.println("[6]Exit");
            System.out.print("Select transaction : ");
            transaction = c.nextInt();
            System.out.println("============================================");

            switch (transaction) {
                case 1:
                    System.out.println("Your account balance is " + selectedAccount.checkBalance());
                    break;
                    
                case 2:
                    System.out.println("Your account balance is " + selectedAccount.checkBalance());
                    System.out.print("Enter amount to withdraw : ");
                    double amountWithDraw = c.nextDouble();
                    
                    try {
                        selectedAccount.withdraw(amountWithDraw);
                    } catch (BalanceNotSufficientException e) {
                        
                        System.out.println(e.getMessage()); 
                        
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Your account balance is " + selectedAccount.checkBalance());
                    System.out.print("Enter amount to deposit : ");
                    double amountDeposit = c.nextDouble();
                    selectedAccount.deposit(amountDeposit);
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    System.out.println("Account Holder Particular");
                    System.out.println("Name : " + userAccountHolder.getName());
                    System.out.println("IC Number : " + userAccountHolder.getIcNumber());
                    System.out.println("Address : " + userAccountHolder.getAddress());
                    System.out.println("Phone Number : " + userAccountHolder.getPhoneNumber());
                    break;
                case 6:
                    System.out.println("Thank you\nSalam...");
                    System.exit(0);
                   
            }

        } while (transaction != 4);   
        }while(transaction != 6);                
        
        }
    }

