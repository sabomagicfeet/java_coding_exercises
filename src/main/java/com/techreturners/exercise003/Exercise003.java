package com.techreturners.exercise003;

public class Exercise003 {

    private String[] iceCreamFlavours = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    public String[] getIceCreamFlavours() {
        return iceCreamFlavours;
    }

    public int getIceCreamCode(String iceCreamFlavour) {
        int code = -1;

        for(int i = 0; i < getIceCreamFlavours().length; i++){
            if(iceCreamFlavour.equals( getIceCreamFlavours()[i] )){
                code = i;
            }
        }

        if(code < 0){
            System.out.println("There is no such flavour");
        }

        return code;
    }

    public String[] iceCreamFlavours() {
        return getIceCreamFlavours();
    }

}
