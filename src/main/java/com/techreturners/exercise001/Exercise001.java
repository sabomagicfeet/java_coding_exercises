package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        String firstLetter = String.valueOf(word.charAt(0));
        String uppercaseWord = firstLetter.toUpperCase() + word.substring(1);

        System.out.println(uppercaseWord);

        return uppercaseWord;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String firstNameInitial = String.valueOf(firstName.charAt(0));
        String lastNameInitial = String.valueOf(lastName.charAt(0));
        String initial = firstNameInitial + "." + lastNameInitial;

        System.out.println(initial);

        return initial;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double price = originalPrice + (originalPrice * vatRate / 100);

        BigDecimal bigDecimal = BigDecimal.valueOf(price);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        price = bigDecimal.doubleValue();

        System.out.println(price);

        return price;
    }

    public String reverse(String sentence) {
        // Add your code here
        String reverseSentence = "";

        for(int i = sentence.length() - 1; i >= 0; i--){
            reverseSentence += String.valueOf(sentence.charAt(i));
        }

        System.out.println(reverseSentence);

        return reverseSentence;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;

        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getType() == "Linux"){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

