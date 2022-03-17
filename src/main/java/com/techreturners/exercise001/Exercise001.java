package com.techreturners.exercise001;

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
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
