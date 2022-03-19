package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return String.valueOf( word.charAt(0) ).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return String.valueOf(firstName.charAt(0)) + "." + String.valueOf(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double price = originalPrice + (originalPrice * vatRate / 100);

        BigDecimal bigDecimal = BigDecimal.valueOf(price);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        price = bigDecimal.doubleValue();

        return price;
    }

    public String reverse(String sentence) {
        String reverseSentence = "";

        for(int i = sentence.length() - 1; i >= 0; i--){
            reverseSentence += String.valueOf(sentence.charAt(i));
        }

        return reverseSentence;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;

        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getType() == "Linux"){
                count++;
            }
        }

        return count;
    }
}

