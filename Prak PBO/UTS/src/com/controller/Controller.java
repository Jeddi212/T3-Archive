package com.controller;

import com.model.*;

import java.util.ArrayList;

public class Controller {

    public boolean cekKartu(ArrayList<ATMCard> listCard, String inputs){
        ATMCard tempCard;
        boolean isValid = false;
        for (int i = 0; i < listCard.size(); i++) {
            tempCard = listCard.get(i);
            if (tempCard.getCardNumber().equals(inputs)) {
                isValid = true;
            } else {
                isValid = false;
            }
        }
        return isValid;

    }

}
