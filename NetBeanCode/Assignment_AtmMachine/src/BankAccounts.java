/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates author(irfanz)
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;

public class BankAccounts {

    ArrayList<ATMCard> atmCards = new ArrayList<>();
    HashMap<String, ATMCard> atmCardsMap = new HashMap<>();

    public void addATMCard(ATMCard atmCard) {
        atmCards.add(atmCard);
        atmCardsMap.put(atmCard.getAtmNumber(), atmCard);
    }
    
    public ATMCard checkATMCard(String atmCardNumber, String pinNumber) {
        boolean isValid = false;
        for(ATMCard atmCard : atmCards) {
            if (atmCard.getAtmNumber().equals(atmCardNumber)) {
                if (atmCard.getPinNumber().equals(pinNumber)) {
                    return atmCard;
                }
            }
        }
        return null;
    }
}
