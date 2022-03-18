package com.techreturners.exercise005;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class Exercise005 {

    public boolean isPangram(String input) {

        HashSet<String> pangramSet = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            if( 'a' <= input.toLowerCase().charAt(i) && input.toLowerCase().charAt(i) <= 'z'){
                pangramSet.add( String.valueOf( input.charAt(i) ).toLowerCase() );
            }
        }

        return pangramSet.size() == 26;
    }

}
